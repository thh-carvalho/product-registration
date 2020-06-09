package entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		totalPrice(price);
		return super.priceTag() +" (Customs Fee: $ "+ customsFee + ")";
	}
	
	public void totalPrice(double priceOut) {
		price = priceOut + customsFee;
	}
	
	
}
