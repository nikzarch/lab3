public final class Julius extends Person implements Sleepable{
	public Julius(){
		super("Дядя Юлиус");
	}
	@Override
	public void sleep(){
		System.out.println("Юлиус спит, как ребёнок");
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