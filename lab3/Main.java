import characters.Julius;
import characters.Kid;
import environment.*;

public class Main {
    public static void main(String[] args) {
        Julius julius = new Julius();
        Kid kid = new Kid();
        Environment bedroom = new Environment("Спальня");
        Container glass = new Container("Стакан с водой", bedroom);
        Thing jaws = new Thing("Челюсти", bedroom);
        Thing glasses = new Thing("Очки", bedroom);
        Candy[] bag = {Candy.ROTFRONT, Candy.CHUPACHUPS, Candy.KREMKA};
        CandyBag candyBag = new CandyBag("Кулёк с карамельками", bag, 2, bedroom);

        bedroom.sound("грр-пс-пс");
        bedroom.changeTime(DayTime.MORNING);
        julius.sleep();
        glass.lay();
        kid.see(glass);
        kid.take(jaws);
        kid.put(glass);
        glasses.lay();
        candyBag.lay();
        kid.see(candyBag);
        candyBag.printContent();
        kid.take(candyBag, "чтобы отдать Карлсону");
        kid.take(candyBag.takeCandy(0)); // карман будет занят
    }
}
