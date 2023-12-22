package lab3.characters;

import lab3.environment.Container;
import lab3.environment.Essence;
import lab3.environment.Thing;
import lab3.interfaces.Droppable;
import lab3.interfaces.Seeable;
import lab3.interfaces.Takeable;

public final class Kid extends Person implements Seeable, Takeable, Droppable {
    private final Container pocket;

    public Kid() {
        super("Малыш");
        this.pocket = new Container("Карман", 1);
    }

    @Override
    public void drop(Thing obj1, Thing obj2) {
        obj2.contain(obj1);
        System.out.println(this.getName() + " опустил " + obj1.toString() + " в " + obj2);
    }

    @Override
    public void take(Thing thing) {
        this.pocket.add(thing);
        System.out.println(this.getName() + " взял " + thing.getName());
    }

    public void take(Thing thing, String reason) {
        this.pocket = thing;
        System.out.println(this.getName() + " взял " + thing.getName() + " " + reason);
    }

    @Override
    public void see(Essence essence) {
        System.out.println(this.getName() + " увидел " + essence.getName());
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() != obj.hashCode() || !(obj instanceof Kid)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        obj = obj;
        if (this.name == obj.getName() && this.pocket.equals(obj.pocket)) {
            return true;
        }
    }

    public Container getPocket() {
        return this.pocket;
    }

}