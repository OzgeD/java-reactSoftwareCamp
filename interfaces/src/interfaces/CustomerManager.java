package interfaces;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println("M�steri eklendi " + customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("M�steri silindi " + customer.getFirstName());
	}

}
