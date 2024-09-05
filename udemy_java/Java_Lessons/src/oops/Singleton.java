package oops;

class CoffeeMachine
{
    private float coffeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    
    static private CoffeeMachine my=null;
    
    private CoffeeMachine()
    {
        this.coffeQty=1;
        this.milkQty=1;
        this.waterQty=1;
        this.sugarQty=1;
    }
    
    public float getCoffeQty() {
		return coffeQty;
	}

	public void setCoffeQty(float coffeQty) {
		this.coffeQty = coffeQty;
	}

	public float getMilkQty() {
		return milkQty;
	}

	public void setMilkQty(float milkQty) {
		this.milkQty = milkQty;
	}

	public float getWaterQty() {
		return waterQty;
	}

	public void setWaterQty(float waterQty) {
		this.waterQty = waterQty;
	}

	public float getSugarQty() {
		return sugarQty;
	}

	public void setSugarQty(float sugarQty) {
		this.sugarQty = sugarQty;
	}

	public void fillWater(float qty)
    {
        this.waterQty=qty;
    }
    public void fillSugar(float qty)
    {
        sugarQty=qty;
    }
    public float getCoffee()
    {
        return 0.15f;
    }
    
    static CoffeeMachine getInstance()
    {
        if(my==null)
            my=new CoffeeMachine();
        return my;
    }
    
            
}
public class Singleton 
{
    public static void main(String[] args) 
    {
        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        CoffeeMachine m3=CoffeeMachine.getInstance();
        
        System.out.println(m1+" "+m2+" "+m3);
        if(m1==m2 && m1==m3)
            System.out.println("Same");
        
    }   
}