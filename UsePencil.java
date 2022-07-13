package trainingday10OBJECTARRAYwithFORLOOP;

public class UsePencil {
	public static void main(String[] args) {
		Pencil p1 = new Pencil();
		p1.brand="Natraj";
		p1.price=10;
		p1.color="Black";
		
		Pencil p2 = new Pencil();
		p2.brand="Cello";
		p2.price=20;
		p2.color="White";
		
		Pencil p3=new Pencil();
		p3.brand="Apsara";
		p3.price=30;
		p3.color="Yellow";
		
		
		Pencil[] a = {p1,p2,p3};
		//for(int i =0;i<a.length;i++) {
		//for(int i=0;i<a.length;i++) {
		//for(int i=0;i<a.length;i++) {
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i].brand+" "+a[i].price+" "+a[i].color);
			//System.out.println(a[i].color.toUpperCase());
			//System.out.println(a[i].brand.length());
			System.out.println("Cello ="+a[i].brand.equals("Cello"));
		}
	}

}
