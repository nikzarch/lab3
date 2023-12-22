package lab3.characters;

import lab3.environment.Essence;
import lab3.interfaces.Sleepable;

public class Person extends Essence implements Sleepable {
    protected Condition cond;

    public Person(String name) {
        super(name);
        this.cond = Condition.AWAKEN;
    }

    public Condition getCondition() {
        return this.cond;
    }

    @Override
    public void sleep() {
        if (this.cond == Condition.AWAKEN) {
            this.cond = Condition.SLEEPING;
            System.out.println(this.getName() + " засыпает");
        } else {
            System.out.println(this.getName() + " итак спит");
        }
    }

    @Override
    public void wakeup() {
        if (this.cond == Condition.SLEEPING) {
            this.cond = Condition.AWAKEN;
            System.out.println(this.getName() + " проснулся");
        } else {
            System.out.println(this.getName() + " итак не спит");
        }
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
        if (this.hashCode() != obj.hashCode() || !(obj instanceof Person)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        obj = obj;
        if (this.name == obj.getName() && this.cond == obj.getCondition()) {
            return true;
        }
    }
}