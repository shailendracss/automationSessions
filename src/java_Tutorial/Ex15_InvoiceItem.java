package java_Tutorial;

public class Ex15_InvoiceItem {

	private String Id;
	private String Description;
	private int Quantity;
	private double UnitPrice;

	public Ex15_InvoiceItem(String Id, String Description, int Quantity, double UnitPrice) {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return Id;
	}

	public String getDescription() {
		return Description;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}

	private void getTotal() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
