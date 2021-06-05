package interfaces;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println("Müsteri eklendi " + customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müsteri silindi " + customer.getFirstName());
	}

}
