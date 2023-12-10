public class Person extends Essence  {
	public Person(String name){
		super(name);
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