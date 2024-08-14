package gameSimulation;

public class CustomerManager {
    CustomerService customerService = new CustomerService() {
		
		@Override
		public void verify(Customer customer) {
			System.out.println("gamer verified : " + customer.getFirstName() + customer.getLastName());
			
		}
		
		@Override
		public void update(Customer customer) {
            System.out.println("gamer updated : " + customer.getFirstName() + customer.getLastName());			
		}
		
		@Override
		public void delete(Customer customer) {
			System.out.println("gamer deleted : " + customer.getFirstName() + customer.getLastName());
			
		}
		
		@Override
		public void add(Customer customer) {
			System.out.println("gamer added : " + customer.getFirstName() + customer.getLastName());
			
		}
	};
}
