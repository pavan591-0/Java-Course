package oops;

interface Member{
	void callBackExample();
}

class Shop{
	
	Member mem[] = new Member[1000];
	int count = 0;
	
	void addMember(Member m) {
		mem[count++] = m;
	}
	
	void inviteforSale() {
		for(int i = 0; i < count; i++) {
			mem[i].callBackExample();
		}
	}
	
}

class Customer implements Member{

	String name;
	
	Customer(String name){
		this.name = name;
	}
	
	@Override
	public void callBackExample() {
		System.out.println("Invite for the " + this.name +" new year sale especially for you.");
		System.out.println("I will be attending "+ this.name);
	}
	
	
}

public class CallBack {

	public static void main(String[] args) {
		Shop s = new Shop();
		Customer c1 = new Customer("Ram");
		Customer c2 = new Customer("Sita");
		Customer c3 = new Customer("Hanuman");
		
		s.addMember(c1);
		s.addMember(c2);
		
		s.inviteforSale();
	}

}
