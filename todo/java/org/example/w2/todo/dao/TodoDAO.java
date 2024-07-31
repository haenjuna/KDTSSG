package org.example.w2.todo.dao;

import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.example.w2.common.ConnectionUtil;
import org.example.w2.todo.TodoVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public enum TodoDAO {
    INSTANCE;

    TodoDAO() {

    }

    public Integer insert(TodoVO todoVO) throws Exception {

        String sql = "insert into tbl_todo (title, writer)\n" +
                "values (?,?)";

        @Cleanup Connection con = ConnectionUtil.INSTANCE.getDs().getConnection();
        con.setAutoCommit(false);


        @Cleanup PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,todoVO.getTitle());
        ps.setString(2,todoVO.getWriter());

        int count = ps.executeUpdate();

        if (count != 1) {
            throw new Exception("Abnormal insertion");
        }

        ps.close();
        ps = con.prepareStatement("select LAST_INSERT_ID()");

        @Cleanup ResultSet rs = ps.executeQuery();

        rs.next();
        Integer tno = rs.getInt(1);

        log.info("TNO:......" + tno);

        con.commit();
        con.setAutoCommit(true);


        return 0;
    }

    //해당 페이지 넘버에 맞는 내용물을 데이터 베이스에서 가져오기
    public List<TodoVO> list(int page)throws Exception{

        log.info("list");

        int skip = (page - 1) * 10;

        String query = """
            select
                *
            from
                tbl_todo
            where
                delflag = false
            and
                tno > 0
            order by
                tno desc
            limit ?,10
        """;
        @Cleanup Connection con = ConnectionUtil.INSTANCE.getDs().getConnection();
        @Cleanup PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, skip);

        @Cleanup ResultSet rs = ps.executeQuery();

        List<TodoVO> list = new ArrayList<>();

        while (rs.next()) {

            TodoVO vo = TodoVO.builder()
                    .tno(rs.getInt("tno"))
                    .title(rs.getString("title"))
                    .writer(rs.getString("writer"))
                    .regDate(rs.getTimestamp("regdate"))
                    .modDate(rs.getTimestamp("moddate"))
                    .delFlag(rs.getBoolean("delflag"))
                    .build();

            list.add(vo);

        }


        return list;
    }

    //데이터베이스의 데이터 총량
    public int getTotal() throws Exception {
        log.info("getTotal");

        String query ="select count(tno) from tbl_todo where tno > 0 and delflag = false";

        @Cleanup Connection con = ConnectionUtil.INSTANCE.getDs().getConnection();
        @Cleanup PreparedStatement ps = con.prepareStatement(query);
        @Cleanup ResultSet rs = ps.executeQuery();

        rs.next();

        int total = rs.getInt(1);

        return total;
    }

    public Optional<TodoVO> get(int tno) throws Exception {
        final String query = """
                select
                    tno, title,writer,regdate,moddate,delflag
                    from tbl_todo
                    where tno = ?
                """;
        @Cleanup Connection con = ConnectionUtil.INSTANCE.getDs().getConnection();
        @Cleanup PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, tno);
        @Cleanup ResultSet rs = ps.executeQuery();

        if (!rs.next()) {
            return Optional.empty();
        }

        TodoVO vo = TodoVO.builder()
                .tno(rs.getInt("tno"))
                .title(rs.getString("title"))
                .writer(rs.getString("writer"))
                .regDate(rs.getTimestamp("regdate"))
                .modDate(rs.getTimestamp("moddate"))
                .delFlag(rs.getBoolean("delflag"))
                .build();

        return Optional.of(vo);
    }

    public boolean delete(Integer tno) throws Exception {

        String sql="update tbl_todo set moddate = now() , delflag = true\n" +
                "where tno = ?";

        @Cleanup Connection con = ConnectionUtil.INSTANCE.getDs().getConnection();
        @Cleanup PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, tno);

        int count = ps.executeUpdate();

        return count == 1 ? true : false;
    }

    public boolean update(TodoVO todoVO) throws Exception {
        String sql = """
            update tbl_todo
            set title=?,
                writer=?,
                moddate = now()
            where tno = ?""";

        @Cleanup Connection con = ConnectionUtil.INSTANCE.getDs().getConnection();
        @Cleanup PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, todoVO.getTitle());
        ps.setString(2, todoVO.getWriter());
        ps.setInt(3, todoVO.getTno());

        int count = ps.executeUpdate();

        return count == 1 ? true : false;
    }
}