package lab3.environment;

import lab3.Essence;
import lab3.interfaces.Containable;
import lab3.interfaces.Layable;

public class Thing extends Essence implements Layable, Containable {
    private final boolean canContain;
    private Thing content;

    public Thing(String name) {
        super(name);
        this.canContain = false;
    }

    public Thing(String name, boolean canContain) {
        super(name);
        this.canContain = canContain;
    }

    @Override
    public void lay() {
        System.out.println(this.getName() + " лежит");
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
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public void contain(Thing thing) {
        if (this.canContain) {
            this.content = thing;
        } else {
            System.err.println("Объект " + this.getName() + " не может содержать в себе что-либо");
        }
    }

    public void getContent() {
        if (this.canContain) {
            System.out.println("В " + this.getName() + " лежит " + this.content.getName());
        } else {
            System.err.println("Объект " + this.getName() + " не может содержать в себе что-либо");
        }
    }
}