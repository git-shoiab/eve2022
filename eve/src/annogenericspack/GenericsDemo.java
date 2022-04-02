package annogenericspack;
//https://fluvid.com/videos/detail/8EL-9T-R-KFdv1qVZ#.Yke1FAoTh8c.link
public class GenericsDemo {
	public static void main(String[] args) {
		PaintBrush<Water> brush=WaterContainer.getBrush();
		brush.setItem(new Water());
				
		Water water=(Water)brush.getItem();
		
		System.out.println(water);
		
		PaintBrush<Paint> brush2=PaintContainer.getBrush();
		brush2.setItem(new RedPaint());
	}
}

class PaintContainer {
	public static PaintBrush<Paint> getBrush() {
		PaintBrush<Paint>  brush=new PaintBrush<>();
		brush.setItem(new RedPaint());
		return brush;
	}
}

class WaterContainer{
	public static PaintBrush<Water> getBrush() {
		PaintBrush<Water>  brush=new PaintBrush<>();
		brush.setItem(new Water());
		return brush;	
	}
}
/*class PaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("red colour...");
		}
		else if(i==2) {
			System.out.println("blue colour..");
		}
	}
}*/

abstract class Paint{}
class RedPaint extends Paint{}
class BluePaint extends Paint{}
/*class PaintBrush{
	Paint rp;
	public void doPaint() {
		System.out.println(rp);
	}
}*/
class Water{}
class DryAir{}

/*
 * class PaintBrush{ Object item;
 * 
 * public Object getItem() { return item; }
 * 
 * public void setItem(Object item) { this.item = item; } }
 */
//Generic PaintBrush
class PaintBrush<T>{
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}