package lab3.environment;

public abstract class Essence {
    protected String name;

    public Essence(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
		if (this.hashCode() != obj.hashCode() || !(obj instanceof Essence)){
            return false;
        }
        if (this == obj){
            return true;
        }
		obj = (Essence) obj;
        if (this.name == obj.getName()) {
            return true;
        }
    }

    public String getName() {
        return this.name;
    }
}