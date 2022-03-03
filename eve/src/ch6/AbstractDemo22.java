package ch6;
//https://fluvid.com/videos/detail/-KRkYhGjmmSEzEOE_#.Yh7cRI6mtks.link
public class AbstractDemo22 {
	public static void main(String[] args) {
		DominoPizza dominos=new IndianDominoPizza();
		dominos.makePizza();
		dominos.collectPayment();
		dominos.deliverPizza();
	}
}

abstract class DominoPizza{
	final private void makeDough() {
		System.out.println("dominos secret of making dough...");
	}
	final private void addIngredients() {
		System.out.println("dominos secret ingredients added...");
	}
	final private void bakePizza() {
		System.out.println("dominos secret baking...");
	}
	final public void makePizza() {//template methods
		System.out.println("pizza domino making started...");
		makeDough();
		addIngredients();
		bakePizza();
		System.out.println("pizza created as per domino standard...");
	}
	public abstract void deliverPizza();
	public abstract void collectPayment();
}

class IndianDominoPizza extends DominoPizza{
	@Override
	public void collectPayment() {
		System.out.println("collect payment as per indian standards....");
	}
	@Override
	public void deliverPizza() {
		System.out.println("deliver pizza as per indian standards......");
	}
	
}