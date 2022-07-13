package trainingday10OBJECTARRAYwithFORLOOP;

public class UseAc {
	public static void main(String[] args) {
		Ac a1 = new Ac();
		String a = args[0];
		String[] b = a.split(",");
		a1.brand=b[0];
		a1.price=Integer.parseInt(b[1]);
		a1.isgood=Boolean.parseBoolean(b[2]);
		a1.discount=Integer.parseInt(b[3]);
		
		Ac a2 = new Ac();
		String c = args[1];
		String[] d = c.split(",");
		a2.brand=d[0];
		a2.price=Integer.parseInt(d[1]);
		a2.isgood=Boolean.parseBoolean(d[2]);
		a2.discount=Integer.parseInt(d[3]);
		
		Ac a3 = new Ac();
		String e = args[2];
		String[] f = e.split(",");
		a3.brand=f[0];
		a3.price=Integer.parseInt(f[1]);
		a3.isgood=Boolean.parseBoolean(f[2]);
		a3.discount=Integer.parseInt(f[3]);
		
		Ac[] a4 = {a1, a2,a3};
		int netPrice = 0;
		for(int i=0;i<=a.length();i++) {
			netPrice=a4[i].price-a4[i].discount;
			System.out.println(netPrice);
			System.out.println(a4[i].brand.toUpperCase()+" "+a4[i].price+ " " +a4[i].isgood);
		}
		
	}

}
