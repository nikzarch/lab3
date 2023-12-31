package environment;

import interfaces.Layable;

import java.util.Objects;

public class Thing extends Essence implements Layable {
    protected Environment place;
    public Thing(String name) {
        super(name);
    }
    public Thing(String name, Environment place) {
        super(name);
        this.place = place;
    }

    public void setPlace(Environment place){
        this.place = place;
    }
    public Environment getPlace(){
        return this.place;
    }
    @Override
    public void lay() {
        if (this.place != null) {
            System.out.println(this.getName() + " лежит в " + this.place.getName());
        }else{
            System.out.println(this.getName() + " лежит " );
        }
    }

    @Override
	public String toString(){
		return this.name + " в месте " + this.place.getName();
	}

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() != obj.hashCode() || !(obj instanceof Thing)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Thing thing = (Thing) obj;
        return Objects.equals(this.name, thing.getName()) && Objects.equals(this.place, thing.getPlace());
    }
}