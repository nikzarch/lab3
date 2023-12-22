package lab3.characters;

public final class Julius extends Person {
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