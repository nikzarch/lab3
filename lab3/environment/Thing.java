package lab3.environment;

import lab3.environment.Essence;
import lab3.interfaces.Containable;
import lab3.interfaces.Layable;

public class Thing extends Essence implements Layable {
	// реализовать отдельный класс контейнер с соответствующими методами	
    public Thing(String name) {
        super(name);
    }

    @Override
    public void lay() {
		// добавить рядом
        System.out.println(this.getName() + " лежит");
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
        if (this.hashCode() != obj.hashCode() || !(obj instanceof Thing)){
            return false;
        }
        if (this == obj){
            return true;
        }
        if (this.name == obj.getName()) {
            return true;
        }
    }
	
    
}