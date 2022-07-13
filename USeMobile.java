package trainingday10OBJECTARRAYwithFORLOOP;

public class USeMobile {
	public static void main(String[] args) {
		String a = args[0];
		String[] b = a.split(",");
		Mobile m1 = new Mobile();
		m1.brand=b[0];
		m1.price= Integer.parseInt(b[1]);
		m1.color = b[2];
		
		Mobile m2 = new Mobile();
		String c = args[1];
		String[] d = c.split(",");
		m2.brand =d[0];
		m2.price=Integer.parseInt(d[1]);
		m2.color=d[2];
		
		Mobile m3 = new Mobile();
		String e = args[2];
		String[] f = e.split(",");
		m3.brand = f[0];
		m3.price = Integer.parseInt(f[1]);
		m3.color = f[2];
		
		Mobile[] g = {m1, m2, m3};
		for(int i=0;i<g.length;i++) {
			System.out.println(g[i].brand+" "+g[i].price+" "+g[i].color);
		}
	}
}


