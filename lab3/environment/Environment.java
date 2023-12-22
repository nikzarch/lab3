package environment;

public class Environment {
    private DayTime daytime;

    public void changeTime(DayTime time) {
        System.out.println(time.toString());
        this.daytime = time;
    }

    public void sound(String sound) {
        System.out.println( "Звучал " + sound );
    }
	public void sound(String sound, Thing thing) {
        System.out.println("В " + thing.getName() + " звучал " + sound);
    }

    public void getDayTime() {
        System.out.println(this.daytime.toString());
    }
}