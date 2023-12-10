public final class Kid extends Person implements Seeable, Takeable, Droppable{
	private Thing pocket;
	public Kid(){
		super("Малыш");
		this.pocket = new Thing("Ничего");
	}
	@Override
	public void drop(Thing obj1, Thing obj2){
		System.out.println(this.getName()+ " опустил " + obj1.toString() + " в " + obj2.toString());
	}
	@Override
	public void take(Thing thing, String... reason){
		this.pocket = thing;
		System.out.println(reason.length !=1 ? this.getName() + " взял " + thing.getName() : this.getName() + " взял " + thing.getName() + " " + reason[0]);
	}
	@Override
	public void see(Essence essence){
		System.out.println(this.getName() + " увидел " + essence.getName());
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
	public void getPocket(){
		System.out.println("у " + this.getName() + " в кармане " + this.pocket.getName());
	}
}