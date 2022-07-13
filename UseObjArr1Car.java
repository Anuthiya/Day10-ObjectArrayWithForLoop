package trainingday10OBJECTARRAYwithFORLOOP;

public class UseObjArr1Car {
	public static void main(String[] args) {
		ObjArr1Car c1 = new ObjArr1Car();
		c1.brand = "Innova";
		c1.price = 100000;
		c1.color = "Blue";
		c1.discount = 10000;
		ObjArr1Car c2 = new ObjArr1Car();
		c2.brand = "Audi";
		c2.price= 200000;
		c2.color = "Red";
		c2.discount = 20000;
		
		ObjArr1Car c3 = new ObjArr1Car();
		c3.brand = "Suzuki";
		c3.price=300000;
		c3.color="Whilte";
		c3.discount = 30000;
		
		
		ObjArr1Car[] a = {c1, c2, c3};
		int netPrice =0;
		
		for(int i=0;i<a.length;i++) {
			//count = count + a[i].price;
			netPrice=a[i].price-a[i].discount;
			
		}
			//System.out.println(a[i].brand+" "+a[i].price+" "+a[i].color);
			//System.out.println(a[i].brand);
			System.out.println("NETPRICE = " +netPrice);
		}
		
	}

		
	


