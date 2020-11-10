//calling properties from outside its class
class Source{
	private int private_state=0; //cannot access from external class
	public int state=0;
	protected int protected_state=0;
	
	public Source(int i, int n){
		if(i==0){this.state = n;}
		else if(i==1){this.protected_state = n;}
	}
}

class Main{
	public static void main(String args[]){
		Source s = new Source(1,3);
		
		System.out.printf("Source.state: %d\n",s.state);
		System.out.printf("Source.protected_state: %d",s.protected_state);
	}
}