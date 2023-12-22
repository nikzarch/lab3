package characters;

import environment.Thing;
import interfaces.Sleepable;

public final class Julius extends Person  {
    public Julius() {
        super("Дядя Юлиус");
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
        if (this.hashCode() != obj.hashCode() || !(obj instanceof Julius)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Julius julius = (Julius) obj;
        return this.name == julius.getName() && this.cond == julius.getCondition();
    }
}