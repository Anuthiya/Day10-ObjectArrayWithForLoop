package trainingday10OBJECTARRAYwithFORLOOP;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.brand="hp";
		l1.price=10000;
		l1.color="white";
		
		Laptop l2=new Laptop();
		l2.brand="Samsung";
		l2.price=20000;
		l2.color="Black";
		
		Laptop l3=new Laptop();
		l3.brand="lenovo";
		l3.price=30000;
		l3.color="Pink";
		
		Laptop l4 = new Laptop();
		l4.brand="Apple";
		l4.price=40000;
		l4.color="Red";
		
		Laptop l5=new Laptop();
		l5.brand="Asus";
		l5.price=50000;
		l5.color="Silver";
		
		Laptop l6=new Laptop();
		l6.brand="MI";
		l6.price=60000;
		l6.color="Orange";
		
		Laptop l7=new Laptop();
		l7.brand="Onida";
		l7.price=70000;
		l7.color="Voilet";
		
		Laptop l8=new Laptop();
		l8.brand="MSN";
		l8.price=80000;
		l8.color="Lavander";
		
		Laptop l9=new Laptop();
		l9.brand="LG";
		l9.price=90000;
		l9.color="Green";
		
		Laptop l10 = new Laptop();
		l10.brand="Hassee";
		l10.price=100000;
		l10.color="Blue";
		
		Laptop[] a = {l1, l2, l3, l4, l5, l6, l7, l8, l9, l10};
		String b=" ";
		//for(int i=0;i<a.length;i++) {
		//for(int i=0;i<a.length/2;i++)
		//for(int i=a.length/2;i<a.length;i++) {
		//for(int i =0;i<a.length;i++) {
		//for(int i=a.length/2;i<a.length;i++) {
		for(int i=0;i<a.length;i++) {
			b= b.concat(a[i].brand);
			//System.out.println(a[i].brand.toUpperCase()+ " " +a[i].color.toLowerCase());
			//System.out.println(a[i].brand+""+a[i].price+" "+a[i].color);
			//System.out.println(a[i].brand + "  " + a[i].price + " " + a[i].color);
		}
	
	     System.out.println(b);
						
		}
				
	}
