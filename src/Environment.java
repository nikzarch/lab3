public class Environment{
	private DayTime daytime;
	public void changeTime(DayTime time){
		System.out.println(time.toString());
		this.daytime = time;
	}
	public void sound(String sound, Thing... thing){
		System.out.println(thing.length !=1 ? "Звучал " + sound :"В " +thing[0].getName()+ " звучал " + sound );
	}
	public void getDayTime(){
		System.out.println(this.daytime.toString());
	}
}