package environment;

import interfaces.Containable;

import java.util.Objects;

public class Container extends Thing implements Containable {
    private Thing content;

    public Container(String name, Environment place, Thing content) {
        super(name,place);
        this.content = content;
    }
    public Container(String name, Thing content) {
        super(name);
        this.content = content;
    }
    public Container(String name, Environment place) {
        super(name,place);
        this.content = null;
    }
    public Container(String name) {
        super(name);
        this.content = null;
    }


    @Override
    public void add(Thing thing) {
        if (this.content != null) {
            System.out.println(this.name + " полон");
        } else {
            this.content = thing;
            System.out.println(thing.getName() + " был положен в " + this.getName());
        }
    }

    @Override
    public void remove() {
        this.content = null;
    }

    public Thing getContent() {
        return this.content;
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
        return Objects.equals(this.name, container.getName()) && Objects.equals(this.content, container.getContent());
    }

}
