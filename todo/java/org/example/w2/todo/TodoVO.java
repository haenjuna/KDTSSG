package org.example.w2.todo;

import lombok.*;
import org.checkerframework.checker.units.qual.A;

import java.sql.Timestamp;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TodoVO {

    private Integer tno;
    private String title;
    private String writer;
    private Timestamp regDate;
    private Timestamp modDate;
    private boolean delFlag;



}
