package AmazonCenaDostupnost;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pera p=new Pera();
		IPHONE i6=new IPHONE();
		
		i6.setAvailable(false);
		i6.registerOb(p);
		System.out.println("*******");
		i6.setAvailable(true);
		
		//i6.postaviNovuCenu(300);
		i6.postaviNovuCenu();
		
		
	}

}
