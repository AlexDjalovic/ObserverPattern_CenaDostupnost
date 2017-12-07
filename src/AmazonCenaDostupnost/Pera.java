package AmazonCenaDostupnost;

public class Pera extends Observer {

public Pera(){
	this.setCustomerName("PERA");
	System.out.println("dobar dan pero");
}
	@Override
	public void updateDostupnost(Product p) {
		// TODO Auto-generated method stub
System.out.println("hELLO "+customerName+", "+p.getProductName()+"je dostupan");
	}
	@Override
	public void updateCenu(Product p) {
		// TODO Auto-generated method stub
		System.out.println(customerName+", nova cena "+p.getProductName()+"je: "+p.getPrice());
	}

}
