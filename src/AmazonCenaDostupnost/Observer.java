package AmazonCenaDostupnost;

public abstract class Observer{
 String customerName;

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public abstract  void updateCenu(Product p);
public abstract void updateDostupnost(Product p);
 
}
