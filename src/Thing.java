public class Thing extends Essence implements Layable{
	public Thing(String name){
		super(name);
	}
	@Override
	public void lay(){
		System.out.println(this.getName() + " лежит");
	}
	@Override
	public String toString(){
		return this.getName();
	}
	@Override
	public int hashCode(){
		return super.hashCode() + this.getName().hashCode();
	}
	@Override
	public boolean equals(Object obj){
		return this.hashCode() == obj.hashCode();
	}
	
}