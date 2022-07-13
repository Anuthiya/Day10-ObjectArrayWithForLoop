package trainingday10OBJECTARRAYwithFORLOOP;

public class UsePen1 {
	public static void main(String[] args) {
		String a = args[0];
		String[] b = a.split(",");
		Pen p1 = new Pen();
		p1.brand=b[0];
		p1.price= Integer.parseInt(b[1]);
		p1.color = b[2];
		
		Pen p2 = new Pen();
		String c = args[1];
		String[] d = c.split(",");
		p2.brand =d[0];
		p2.price=Integer.parseInt(d[1]);
		p2.color=d[2];
		
		Pen p3 = new Pen();
		String e = args[2];
		String[] f = e.split(",");
		p3.brand = f[0];
		p3.price = Integer.parseInt(f[1]);
		p3.color = f[2];
		
		Pen[] g = {p1, p2, p3};
		for(int i=0;i<g.length;i++) {
			System.out.println(g[i].brand+" "+g[i].price+" "+g[i].color);
		}
	}
}
	
class Pen1 {
	String brand;
	int price;
	String color;

}


