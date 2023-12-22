package characters;

import environment.Essence;
import environment.Thing;
import environment.Container;
import interfaces.CanPut;
import interfaces.Seeable;
import interfaces.Takeable;

public final class Kid extends Person implements Seeable, Takeable, CanPut {
    private Container pocket;

    public Kid() {
        super("Малыш");
        this.pocket = new Container("Карман");
    }

    @Override
    public void take(Thing thing) {
        if (this.pocket.getContent() == Container.nothing) {
            this.pocket.add(thing);
            System.out.println(this.getName() + " взял " + thing.getName());
        }else{
            System.out.println("Карман занят");
        }
    }

    public void take(Thing thing, String reason) {
        if (this.pocket.getContent() == Container.nothing) {
            System.out.println(this.getName() + " взял " + thing.getName() + " " + reason);
            this.pocket.add(thing);
        }else{
            System.out.println("Карман занят");
        }

    }
    public void drop(){
        this.pocket.remove();
    }

    public void put(Container container){
        container.add(this.pocket.getContent());
        System.out.println(this.name + " положил " + this.pocket.getContent().getName() + " в " + container.getName());
        this.pocket.remove();
    }
    @Override
    public void see(Essence essence) {
        System.out.println(this.name + " увидел " + essence.getName());
    }

    public Container getPocket(){
        return this.pocket;
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
        if (this.hashCode() != obj.hashCode() || !(obj instanceof Kid)){
            return false;
        }
        if (this == obj){
            return true;
        }
        Kid kid = (Kid) obj;
        return this.name == kid.getName() && this.pocket.getContent() == kid.getPocket().getContent();
    }

}