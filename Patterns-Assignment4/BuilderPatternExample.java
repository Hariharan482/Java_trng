package Patterns;

public class BuilderPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer.CustomerBuilder().setName("Steve").setMobileNumber("9876543210")
				.setEmail("Steve@gmail.com").build();
		System.out.println(customer);

	}

}

class Customer {
	private String name;
	private String mobileNumber;
	private String email;

	public Customer(CustomerBuilder customerBuilder) {
		this.name = customerBuilder.name;
		this.email = customerBuilder.email;
		this.mobileNumber = customerBuilder.mobileNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name : " + this.name + "\nMobile : " + this.mobileNumber + "\nMail : " + this.email;
	}

	static class CustomerBuilder {
		private String name;
		private String mobileNumber;
		private String email;

		public CustomerBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public CustomerBuilder setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
			return this;
		}

		public CustomerBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public Customer build() {
			return new Customer(this);
		}
	}
}