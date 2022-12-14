
public class BikePart extends Listing{

	private String partType;

	public BikePart(String id, String name, double price, boolean isAvailable, String partType) {
		super(id, name, price, isAvailable);
		this.partType = partType;
	}

	public String getPartType() {
		return partType;
	}
	
	public String getListing() {
		String listing = super.showListing();
		String output = String.format("%-55s %-15s", listing, partType);
		return output;
	}
}
