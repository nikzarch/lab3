package environment;

import environment.*;

public class CandyBag extends Container {
    private final Candy[] content;
	// можно брать конфеты 
    public CandyBag(String name, Candy[] candies) {
        super(name,candies.size());
		this.content = candies;
    }
	public Candy takeCandy(int index){
		Candy takenCandy = content[index];
		this.content[index] = null;
		return takenCandy;
	}
	public Candy putCandy(Candy candy){
		int i;
		for (i = 0; i< this.content.size();i++){
			if (this.content[i] != null){
				this.content[i] = candy;
				System.out.println("Положили " + candy + " в " + this.name);
				break;
			}
		}
	}
	@Override
	public Candy[] getContent(){
		return this.name;
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
        if (this.hashCode() != obj.hashCode() || !(obj instanceof CandyBag)){
            return false;
        }
        if (this == obj){
            return true;
        }
		obj = (CandyBag) obj;
        if (this.name == obj.getName() && this.content.equals(obj.getContent())) {
            return true;
        }
    }
}