package AmazonCenaDostupnost;

import java.util.ArrayList;
import java.util.List;

public  class Product implements Subject {
List<Observer>obs;
protected double price;
private String productName;
private boolean available;
public Product(){
	obs=new ArrayList<Observer>();
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public boolean isAvailable() {
	return available;
}
public void setAvailable(boolean available) {
	this.available = available;
	if(available ==true)this.notifySvimaDostupnost();
	if(available==false){System.out.println(this.getProductName()+" trenutno nema na stanju");}
}
@Override
public void registerOb(Observer ob) {
	// TODO Auto-generated method stub
	obs.add(ob);
	System.out.println("registrovani ste na listu za cekanje");
}
@Override
public void removeOb(Observer ob) {
	// TODO Auto-generated method stub
	obs.remove(ob);
}
@Override
public void notifySvimaDostupnost() {
	// TODO Auto-generated method stub
	for(Observer x:obs){
		x.updateDostupnost(this);
	}
}

public void postaviNovuCenu(){
	double updPrice=1.6*price;
	this.price=updPrice;
	for(Observer y:obs){
		y.updateCenu(this);
	}
}




}
