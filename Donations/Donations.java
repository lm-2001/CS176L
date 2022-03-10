public class Donations {
	
	private double numIndividual;
	private double amtIndividual;
	private double numBusiness;
	private double amtBusiness; 
	private double numOther;
	private double amtOther;
	
	public void processDonation(String cat, double donation) {
		
		if (cat.equals("Individual")) {
			if(donation > 0) {
				numIndividual++;
				amtIndividual = donation + amtIndividual;
		}
		else {
			
			numIndividual--;
			amtIndividual = amtIndividual - donation;
		}
		if (cat.equals("Business")) {
			if(donation > 0) {
				numBusiness++;
				amtBusiness = donation + amtBusiness;
		}
		else {
			numBusiness--;
			amtBusiness = amtBusiness - donation;
		}
		if (cat.equals("Other")) {
			if (donation > 0)
				numOther++;
				amtOther = donation + amtOther;
		}
		else {
			numOther--;
			amtOther = amtOther - donation;
		}
	}}}
	
	public void getStatistics() {
		
		//Individual
		System.out.println("Number of donations for individual: " + numIndividual);
		System.out.println("Total donations for individual: " + amtIndividual);
		System.out.println("");
		
		//Business
		System.out.println("Number of donations for business: " + numBusiness);
		System.out.println("Total donations for business: " + amtBusiness);
		System.out.println("");
		
		//Other
		System.out.println("Number of donations for other: " + numOther);
		System.out.println("Total donations for other: " + amtOther);
		System.out.println("");
	}
	

	
}


