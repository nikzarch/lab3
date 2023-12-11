package lab3.characters;

import lab3.Essence;
import lab3.interfaces.Sleepable;

public class Person extends Essence implements Sleepable {
    private Condition cond;

    public Person(String name) {
        super(name);
        this.cond = Condition.AWAKEN;
    }

    @Override
    public void sleep() {
        this.cond = Condition.SLEEPING;
        System.out.println(this.getName() + " спит");
    }

    @Override
    public void wakeup() {
        this.cond = Condition.AWAKEN;
        System.out.println(this.getName() + " проснулся");
    }

    public Condition getCondition() {
        return this.cond;
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
}