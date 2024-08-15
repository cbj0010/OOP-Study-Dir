import model.MenuItem;

public class Barista {
    //바리스타는 menuItem을 이용해서 커피를 제조한다.
    public Coffee makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }
}
