package AmazonCenaDostupnost;

public interface Subject {

	public void registerOb(Observer ob);
	public void removeOb(Observer ob);
	public void notifySvimaDostupnost();
	//public void postaviNovuCenu(double UpdPrice);
	public void postaviNovuCenu();
}
