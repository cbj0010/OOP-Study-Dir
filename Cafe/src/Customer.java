import model.Menu;
import model.MenuItem;

/**
 * 이 친구는
 */
public class Customer {

    public void order(String menuName, Menu menu, Barista barista) { //"주문하라"라는 요청을 받았을 때
        //내 궁금증은 왜 menuItem을 MenuItem객체로 생성한 것인지
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);

        //나였으면
        //    Menu menu1 = new Menu();     //이렇게 해서
        //   menu1.choose(menuName); //이렇게 보냈을 듯?
    }


}
