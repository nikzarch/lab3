package environment;

import interfaces.Containable;

public class Container extends Thing implements Containable {
    static public final Thing nothing = new Thing("ничего");
    private Thing content;

    public Container(String name, Environment place, Thing content) {
        super(name);
        this.content = content;
    }
    public Container(String name, Thing content) {
        super(name);
        this.content = content;
    }
    public Container(String name, Environment place) {
        super(name,place);
        this.content = nothing;
    }
    public Container(String name) {
        super(name);
        this.content = nothing;
    }


    @Override
    public void add(Thing thing) {
        if (this.content != nothing) {
            System.out.println(this.name + " полон");
        } else {
            this.content = thing;
            System.out.println(thing.getName() + " был положен в " + this.getName());
        }
    }

    @Override
    public void remove() {
        this.content = nothing;
    }

    public Thing getContent() {
        return this.content;
    }

    public void printContent() {
        System.out.println(this.content.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() != obj.hashCode() || !(obj instanceof Container )) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Container container = (Container) obj;
        return this.name == container.getName() && this.content == container.getContent();
    }

}
