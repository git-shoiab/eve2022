package refpack;

import java.lang.reflect.Field;

//https://fluvid.com/videos/detail/8EL-9T-R-KFdv1qVZ#.Yke1FAoTh8c.link
//https://fluvid.com/videos/detail/_LkeEcqk51u3_7pX7#.YlD1E-q_t1s.link
public class GenericsDemo {
	public static void main(String[] args) {
		PaintBrush<Water> brush=WaterContainer.getBrush();
	//	brush.setItem(new Water());
				
		Water water=(Water)brush.getItem();
		
		System.out.println(water);
		
		PaintBrush<Paint> brush2=PaintContainer.getBrush();
		System.out.println(brush2.getItem());
		//brush2.setItem(new RedPaint());
	}
}

class PaintContainer {
	public static PaintBrush<Paint> getBrush() {
		try {
		PaintBrush<Paint>  brush=new PaintBrush<>();
		Class c=brush.getClass();
		Field field=c.getDeclaredField("item");
		field.setAccessible(true);
		Inject in=(Inject)field.getAnnotation(Inject.class);
		if(in!=null) {
			String classname=in.className();
			Paint paint=(Paint)Class.forName(classname).newInstance();
			brush.setItem(paint);
		}
		return brush;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

class WaterContainer{
	public static PaintBrush<Water> getBrush() {
		try {
			PaintBrush<Water>  brush=new PaintBrush<>();
			Class c=brush.getClass();
			Field field=c.getDeclaredField("item");
			field.setAccessible(true);
			Inject in=(Inject)field.getAnnotation(Inject.class);
			if(in!=null) {
				brush.setItem(new Water());
			}
			return brush;
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
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
	@Inject(className = "annogenericspack.BluePaint")
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}