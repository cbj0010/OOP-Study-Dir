import model.MenuItem;

public class Coffee {
    private String name;    //커피이름
    private int price;      //커피 가격

    //커피는 자기 자신을 생성하기 위한 생성자 제공
    public Coffee(MenuItem menuName) {
        this.name = menuName.getMenuName();
        this.price = menuName.cost();
    }


}
