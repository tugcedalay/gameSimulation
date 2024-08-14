package gameSimulation;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(8, "janet", "jackson", "1", "1234");
		//customer.setFirstName("janet");
		//customer.setLastName("jackson");
		//customer.setId(8);
		//customer.setIdentificationNumber("1234");
		//customer.setIdentity("3");
           
		System.out.println(customer.getFirstName()+" "+customer.getLastName());
		
		
		CustomerManager customerManager = new CustomerManager();
		OfferManager offerManager = new OfferManager();
		Offer offer = new Offer(1, "discount");
		offer.setName("discount");
		
		offerManager.add(offer);
	}

}
