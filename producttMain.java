import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

class productt implements Comparable<productt>{
	int pid;
	String pname;
	int price;
    int barcode=123456; 
	
	productt(){}

	public productt(int pid, String pname, int price, int barcode) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
        this.barcode=barcode;

	}
	
	Scanner sc = new Scanner(System.in);
	
	public boolean equal(Object o)
	{
		if(o instanceof productt) {
			productt p = (productt) o;
			return this.pid == p.pid && this.pname.equals(p.pname) && this.price==p.price;
		}
		return false;
	}
	
	public void addproductt(ArrayList<productt> parr) {
        System.out.println("enter barcode");
        barcode= sc.nextInt(); 
        try {
            if (barcode==barcode)
            System.out.println("Enter pid ");
		    pid = sc.nextInt();
		    System.out.println("Enter productt name");
		    pname = sc.next();
		    System.out.println("Enter price");
		    price = sc.nextInt();
            
        }
         catch (Exception ex) {
            System.out.println("Invalid barcode not able to proceed further" +ex);
         }
       
         productt p1 = new productt(pid,pname,price, barcode);
		
		if(parr.contains(p1)) {
			System.out.println("productt exist already");
		}
	
		int flag=0;
		
		for(productt p : parr) {
			if(p.pid == pid) {
				flag =1;
				System.out.println("productt id exists already");
			}
		}
		
		if(flag==0) {
			if(parr.contains(p1) == false) {
				if(parr.size()<5) {
					parr.add(p1);
					System.out.println("productt added successfully");
				}
				else {
					System.out.println("5 elements already present");
				}
			}
		}
		
		
		
	}
	
	public void display(ArrayList<productt> parr) {
		for(productt p :parr) {
			System.out.println(p.pid+" "+p.pname+" "+p.price);
		}
	}
	
	public void removeproductt(ArrayList<productt> parr)
	{
		System.out.println("enter pid");
		int prodid = sc.nextInt();
		System.out.println("enter pname");
		String prodname = sc.next();
		System.out.println("enter price");
		int prodprice = sc.nextInt();
		
		productt prod = new productt(prodid,prodname,prodprice,barcode);
		
		int flag=0;
		Iterator<productt> itr = parr.iterator();
		while(itr.hasNext()) {
			
			productt p3 = itr.next();
			if(p3.pid == prodid && p3.pname.equals(prodname) && p3.price == prodprice) {
				flag =1;
				itr.remove();
				System.out.println("productt removed");
				break;
			}
		}
		if(flag==0) {
			System.out.println("productt not found");
		}
	}
	
	public void sorted(ArrayList<productt> parr) {
		Collections.sort(parr);
		System.out.println("PID\tproducttName\tPrice");
		for(productt p:parr)
		{
			System.out.println(p.pid+"  "+p.pname+"  "+p.price);
		}
	}

	@Override
	public int compareTo(productt o) {
		if(this.pid>o.pid) {
			return 1;
		}
		else if(this.pid < o.pid) {
			return -1;
		}
		return 0;
	}
	
}
public class producttMain
{
	public static void main(String[] args) {
		
		ArrayList<productt> arr = new ArrayList<>();
		productt p = new productt();
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		do 
		{
			System.out.println("1.add 2.remove 3.display 4.sort 5.exit");
			System.out.println("enter choice");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				p.addproductt(arr);
				break;
				
			case 2:
				p.removeproductt(arr);
				break;
				
			case 3:
				p.display(arr);
				break;
				
			case 4:
				p.sorted(arr);
			}
		}while(ch!=5);
	}
}