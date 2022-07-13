package trainingday10OBJECTARRAYwithFORLOOP;

public class USeBag2 {
	public static void main(String[] args) {
		String a = args[0];
		String[] b = a.split(",");
		Bag b1 = new Bag();
		b1.brand = b[0];
		b1.price = Integer.parseInt(b[1]);
		b1.color = b[2];
		
		Bag b2 = new Bag();
		String c = args[1];
		String[] d = c.split(",");
		b2.brand=d[0];
		b2.price=Integer.parseInt(d[1]);
		b2.color=d[2];
		
		Bag b3 = new Bag();
		String e = args[2];
		String[] f = e.split(",");
		b3.brand = f[0];
		b3.price=Integer.parseInt(f[1]);
		b3.color=f[2];
		
		Bag[] g = {b1, b2, b3};
		for(int i=0;i<=a.length();i++) {
			System.out.println(g[i].brand+" "+g[i].price+" "+g[i].color);
		}
		
	}

}


