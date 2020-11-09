//design pattern "Factory"
interface Item{
	public void f();
}

class J implements Item{
	public void f(){
		System.out.println("J.f() is called.");
	}
}

class K implements Item{
	public void f(){
		System.out.println("K.f() is called.");
	}
}

class Factory{
	public Item getItem(String itype){
		if(itype==null){
			return null;
		}
		if(itype.equalsIgnoreCase("J")){
			return new J();
		}else if(itype.equalsIgnoreCase("K")){
			return new K();
		}
		return null;
	}
}

class M{
	public static void main(String args[]){
		Factory factory = new Factory();
		
		Item i = factory.getItem("J");
		i.f();
		
		Item j = factory.getItem("K");
		j.f();
	}
}