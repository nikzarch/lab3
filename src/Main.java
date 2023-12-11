package lab3;

import lab3.characters.Julius;
import lab3.characters.Kid;
import lab3.environment.*;

public class Main {
    public static void main(String[] args) {
        Julius julius = new Julius();
        Kid kid = new Kid();
        Thing bedroom = new Thing("Спальня");
        Environment env = new Environment();
        Thing glass = new Thing("Стакан с водой", true);
        Thing jaws = new Thing("Челюсти");
        Thing glasses = new Thing("Очки");
        Candy[] bag = new Candy[3];
        bag[0] = Candy.ROTFRONT;
        bag[1] = Candy.KREMKA;
        bag[2] = Candy.CHUPACHUPS;
        CandyBag candyBag = new CandyBag("Кулёк с карамельками", bag);

        env.sound("грр-пс-пс", bedroom);
        env.changeTime(DayTime.MORNING);
        julius.sleep();
        glass.lay();
        kid.see(glass);
        kid.take(jaws);
        kid.getPocket();
        kid.drop(jaws, glass);
        glass.getContent();
        glasses.lay();
        kid.see(candyBag);
        candyBag.getContents();
        kid.take(candyBag, "чтобы отдать Карлсону");
        kid.getPocket();
    }
}
