package environment;

import java.util.Objects;

public class Environment {
    private String name;
    private DayTime daytime;
	private String lastsound;
    public Environment(String name){
        this.name = name;
    }
    public void changeTime(DayTime time) {
        System.out.println(time.toString());
        this.daytime = time;
    }
    public DayTime getDayTime(){
        return this.daytime;
    }
    public void sound(String sound) {
        System.out.println("В " + this.name + " звучал " + sound);
		this.lastsound = sound;
    }
	public String getLastSound(){
		return this.lastsound;
	}

    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return this.name + ", время: " + this.daytime.toString() + ", последнее что звучало: " + this.lastsound;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.name.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() != obj.hashCode() || !(obj instanceof Environment)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Environment environment = (Environment) obj;
        return Objects.equals(this.name, environment.getName()) && Objects.equals(this.daytime, environment.getDayTime()) && Objects.equals(this.lastsound, environment.getLastSound());
    }
}