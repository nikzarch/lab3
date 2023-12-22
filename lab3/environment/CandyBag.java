package environment;

public class CandyBag extends Thing {
    private final Candy[] content;

    public CandyBag(String name, Candy[] candies) {
        super(name);
        this.content = candies;
    }

    public CandyBag(String name, Candy[] candies, Environment place) {
        super(name, place);
        this.content = candies;
    }

    public Thing takeCandy(int index) {
        Thing takenCandy = new Thing(content[index].toString());
        this.content[index] = null;
        return takenCandy;
    }

    public void putCandy(Candy candy) {
        boolean wasPut = false;
        for (int i = 0; i < this.content.length; i++) {
            if (this.content[i] != null) {
                this.content[i] = candy;
                System.out.println("Положили " + candy + " в " + this.name);
                wasPut = true;
                break;
            }
        }
        if (!wasPut) {
            System.out.println("В " + this.name + " нет места");
        }
    }

    public Candy[] getContent() {
        return this.content;
    }

    public void printContent() {
        System.out.print("В " + this.getName() + " конфеты: ");
        for (int i = 0; i < this.content.length; i++) {
            System.out.print(this.content[i].toString() + " ");
        }
        System.out.println();
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
        if (this.hashCode() != obj.hashCode() || !(obj instanceof CandyBag candybag)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.name == candybag.getName() && this.content == candybag.getContent();
    }
}