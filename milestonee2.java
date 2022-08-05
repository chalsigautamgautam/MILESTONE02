package testt;

import java.util.*;

class Customer implements Comparable<Customer>{
	
	int cid;
	
	String name;
	
	int amount;
	
	int age;
	
	Customer(int cid,String name,int amount,int age){
		this.cid=cid;
		this.name=name;
		this.amount=amount;
	    this.age=age;
	}
	public void setsalary(int cid ) {
		this.amount = cid;
	}
	public int compareTo(Customer st) {
		if(name==st.name)
			return 0;
		else if(name.compareTo(st.name)>0)
			return 1;
		else
			return -1;
	}
}




public class milestonee2{
	public static void main(String args[]) {
		ArrayList<Customer> al=new ArrayList<Customer>();
		
		al.add(new Customer(101,"Chalsi",900000,25 ));
		al.add(new Customer(106,"Lucky",800000,24 ));
		al.add(new Customer(109,"Namrata",500000,28 ));
		al.add(new Customer(104,"Akbar",30000,29 ));
		al.add(new Customer(103,"Amar",400000,30 ));
		al.add(new Customer(105,"Abhishek",100000,33 ));
		al.add(new Customer(108,"Shreya",95000,26 ));
		al.add(new Customer(110,"Vishakha",450000,43 ));
		al.add(new Customer(102,"Varun",670000,27 ));
		al.add(new Customer(107,"Sid",830000,19 ));
		
		
		int len=al.size();
		Scanner sc= new Scanner(System.in);
		
		
		String whilechoice="go";
		while (whilechoice=="go") {
			
			String avail="False";
			System.out.print("Enter Your Choice");
			System.out.print("1-->Customer Data in Ascending Order. 2->Update Customer Amount.  ");
			System.out.print(" ");
			int a= sc.nextInt();
			
			switch (a) {
				
			    case 1:
				System.out.println("");
				System.out.println("Name in sorted Order.. ");
				Collections.sort(al);
				for(Customer st:al) {
					System.out.println(st.cid+" "+st.name+" "+st.amount+" "+st.age);
				}
					break;
				
			    case 2:
			    	System.out.println("");
			    	System.out.println("Enter Customer id to update Amount..");
			    	
			    	int b=sc.nextInt();
			    	System.out.println("Enter the Amount");
			    	int c=sc.nextInt();
			    	
			    	for (int i=0;i<len;i++) {
			    		if(al.get(i).cid==b) {
			    			al.get(i).setsalary(c);
			    			avail="True";
			    			System.out.println("Update Salary.."+al.get(i).cid+""+al.get(i).amount+""+al.get(i).age);
			    		}
			    	}
			    	if("False".equals(avail)) {
			    		System.out.println("Invalid Customer ID");
			    	}
			    	break;
			    			
			    		}
			    	}
			    	
			    	
			   
			    	

			}
		
	}