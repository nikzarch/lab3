package environment;

public class Environment {
    private String name;
    private DayTime daytime;
    public Environment(String name){
        this.name = name;
    }
    public void changeTime(DayTime time) {
        System.out.println(time.toString());
        this.daytime = time;
    }

    public void sound(String sound) {
        System.out.println("В " + this.name + " звучал " + sound);
    }

    public void getDayTime() {
        System.out.println(this.daytime.toString());
    }

    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return this.name;
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
        return this.name == environment.getName();
    }
}