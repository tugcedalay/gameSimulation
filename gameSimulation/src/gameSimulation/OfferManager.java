package gameSimulation;

public class OfferManager implements OfferService{
       
	@Override
	public void add(Offer offer) {
		System.out.println(offer.getName() + "Offer added");
		
	}

	@Override
	public void delete(Offer offer) {
		System.out.println(offer.getName() + "Offer deleted");
		
	}

	@Override
	public void update(Offer offer) {
		System.out.println(offer.getName() + "Offer updated");
		
	}



}
