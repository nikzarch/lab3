package lab3.environment;

import lab3.interfaces.Containable;
import lab3.environment.*;

public class Container extends Thing implements Containable{
	private final Thing[] content;
	private int size = 0;
	
	public Container(String name,Thing[] content){
		super(name);
		this.content = content;
		this.size = content.size();
	}
	
	public Container(String name,int size){
		super(name);
		this.content = new content[size];
		this.size = size;
	}
	
	@Override
    public void add(Thing thing) {
		int i;
        for (i = 0;i<this.size;i++){
			if (this.content[i] == null){
				this.content[i] = thing;
				break;
			}
		}
			
		if (i > this.size){
			System.out.println(this.getName() + " полон");
		}else{
			System.out.println(thing.getName() + " был положен в " + this.getName);
		}
	}
	public Thing[] getContent() {
        return this.content;
	}
    public void printContent() {
        for (i = 0;i<this.size;i++){
			System.out.print(this.content.getName() + " ");
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
        if (this.hashCode() != obj.hashCode() || !(obj instanceof Container)){
            return false;
        }
        if (this == obj){
            return true;
        }
		obj = (Container) obj;
        if (this.name == obj.getName() && this.content.equals(obj.getContent())) {
            return true;
        }
    }
}