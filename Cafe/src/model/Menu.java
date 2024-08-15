package model;

import java.util.List;

/**
 * 이 친구는 menuName에 해당하는 MenuItem을 찾아야하는 책임씨가 있다.
 * Menu가 내부적으로 MenuItem을 관리하고 있어야한다.
 */
public class Menu {
    private List<MenuItem> menuList;

    public Menu(List<MenuItem> menuList) {
        this.menuList = menuList;
    }

    public MenuItem choose(String menuName) {   //MenuItem에 입력받은 이름이 있는지 검사
        for (MenuItem item : menuList) {
            if (item.getMenuName().equals(menuName)) {
                return item;
            }
        }
        return null;
    }
}
