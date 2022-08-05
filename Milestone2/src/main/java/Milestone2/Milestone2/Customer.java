package Milestone2.Milestone2;

public class Customer {
	private String id;
	private String name;
	private int age;
	private long purchaseAmount;
	public Customer(){
	}
	
	public Customer(String id,String name,int age,long purchaseAmount) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.purchaseAmount=purchaseAmount;
		
	}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id=id;
}
public String getname() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age=age;
}
public long getPurchaseAmount() {
	return purchaseAmount;
}
public void setPurchaseAmount(long purchaseAmount) {
	this.purchaseAmount=purchaseAmount;
}
@Override
public String toString() {
	return "Customer{" +
"id='" +id+'\'' +
", name='"+name+'\''+
", age=" +age+
", purchaseAmount="+purchaseAmount +
'}';

}


}
