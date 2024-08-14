package gameSimulation;

public class Offer implements OfferService {
          private int id;
          private String name;
		public Offer(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public void add(Offer offer) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void delete(Offer offer) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void update(Offer offer) {
			// TODO Auto-generated method stub
			
		}
}
