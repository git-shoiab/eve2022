package annogenericspack;
//https://fluvid.com/videos/detail/ka7dEhgP81sOo8jnm#.YkcM9yaXSa4.link
public class AnnoDemo {
	public static void main(String[] args) {
		TiffenBox<NonVegFood> box=NonVegCanteenContainer.getBox();
		NonVegFood food=box.getItem();
		System.out.println(food);
		
		TiffenBox<VegFood> box2=VegCanteenContainer.getBox();
		VegFood food2=box2.getItem();
		System.out.println(food2);
		
		TiffenBox<Currency> box3=HawalaContainer.getBox();
		Currency currency=box3.getItem();
		System.out.println(currency);
	}
}

class NonVegCanteenContainer {
	public static TiffenBox<NonVegFood> getBox() {
		TiffenBox<NonVegFood> box=new TiffenBox<>();
		box.setItem(new NonVegFood());
		return box;
	}
}

class VegCanteenContainer {
	public static TiffenBox<VegFood> getBox() {
		TiffenBox<VegFood> box=new TiffenBox<>();
		box.setItem(new VegFood());
		return box;
	}	
}

class HawalaContainer{
	public static TiffenBox<Currency> getBox() {
		TiffenBox<Currency> box=new TiffenBox<>();
		box.setItem(new Currency());
		return box;
	}
}
class TiffenBox<T>{
	//VegFood food; - only vegfood object can be given
	//Food food; - only type of food can be given
	//Object item; - any object can be given, but while reading it may throw classcastexception
	
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}
class Food{}
class NonVegFood extends Food{}
class VegFood extends Food{}
class Currency{}