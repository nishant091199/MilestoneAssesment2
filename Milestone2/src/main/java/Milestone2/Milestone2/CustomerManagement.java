package Milestone2.Milestone2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class CustomerManagement {
	static final public Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		List<Customer> customers=getCustomers();
		while (true) {
			System.out.println("Enter 1 to sort customer in ascending order");
			System.out.println("Enter 2 to update purchase amount");
			int choice=sc.nextInt();
			switch (choice) {
			case 1 : sortAndDisplayCustomers(customers);
			case 2 : updatePurchaseAmount(customers);
			default : System.exit(0);
			}
			}
	}
		private static void updatePurchaseAmount(List<Customer> customers) {
			var id =sc.next();
			try {
				var Customer=customers.stream().filter(e-> e.getId().equalsIgnoreCase(id)).findFirst().get();
				Customer.setPurchaseAmount(sc.nextLong());
				customers.forEach(System.out::println);
				
			}catch (Exception e) {
				System.out.println("invalid id");
			}
		}
			public static void sortAndDisplayCustomers(List<Customer>customers) { 
				customers.sort((a,b)->a.getname().compareTo(b.getname()));
				customers.forEach(System.out::println);
				
	}
	private static List<Customer> getCustomers() {
		List<Customer>customers = new ArrayList<>();
		for (int i=0;i<10;i++) {
			var id=sc.next();
			var name=sc.next();
			var age=sc.nextInt();
			var PurchaseAmount=sc.nextLong();
			customers.add(new Customer(id,name,age,PurchaseAmount));
			}
		return customers;
		}

}
