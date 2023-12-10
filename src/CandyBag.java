public class CandyBag extends Thing{
	private Candy[] contents;
	public CandyBag(String name, Candy[] candies){
		super(name);
		this.contents = candies;	
	}
	public void getContents(){
		System.out.print("В " + this.getName() + " конфеты: ");
		for (int i=0;i<this.contents.length;i++){
			System.out.print(this.contents[i].toString() + " ");
		}
		System.out.println();
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