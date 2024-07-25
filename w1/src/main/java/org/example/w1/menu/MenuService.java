package org.example.w1.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public enum MenuService {

    INSTANCE;

    private List<MenuVO> menus;

    MenuService(){
        menus = new ArrayList<MenuVO>();
        IntStream.rangeClosed(0,7).forEach(i->{
            menus.add(new MenuVO(i,"menu"+i,1000*i,"/img/img"+i+".jpg"));
        });
    }
    public List<MenuVO> getMenus(){
        return menus;
    }
    public MenuVO getMenuById(Integer id) {

        for (MenuVO menu : menus) {
            if (menu.getNo() == id) {
                return menu;
            }
        }

        return null;
    }
}
