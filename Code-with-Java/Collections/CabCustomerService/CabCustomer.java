public class CabCustomer {

	private int custId;
	private String customerName;
	private String pickupLocation;
	private String dropLocation;
	private int distance;
	private String phone;

	public CabCustomer() {

	}

	public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance,
			String phone) {
		this.custId = custId;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phone = phone;
	}

	protected void setCustId(int custId) {
		this.custId = custId;
	}

	protected int getCusId() {
		return custId;
	}

	protected void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	protected String getCustomerName() {
		return customerName;
	}

	protected void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	protected String getPickupLocation() {
		return pickupLocation;
	}

	protected void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	protected String getDropLocation() {
		return dropLocation;
	}

	protected void setDistance(int distance) {
		this.distance = distance;
	}

	protected int getDistance() {
		return distance;
	}

	protected void setPhone(String phone) {
		this.phone = phone;
	}

	protected String getPhone() {
		return phone;
	}

}
