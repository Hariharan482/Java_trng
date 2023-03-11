package Assignment9;

import java.io.Serializable;
import java.util.Objects;

public class InvoiceMasterDTO implements Serializable, Comparable<InvoiceMasterDTO> {
	private int invoiceno;
	private String invoicedate;
	private int customerid;

	public InvoiceMasterDTO() {

	}

	@Override
	public String toString() {
		return "InvoiceMasterDTO [invoiceno=" + invoiceno + ", invoicedate=" + invoicedate + ", customerid="
				+ customerid + "]";
	}

	public InvoiceMasterDTO(int invoiceno, String invoicedate, int customerid) {
		this.invoiceno = invoiceno;
		this.invoicedate = invoicedate;
		this.customerid = customerid;

	}

	public int getInvoiceno() {
		return invoiceno;
	}

	public void setInvoiceno(int invoiceno) {
		this.invoiceno = invoiceno;
	}

	public String getInvoicedate() {
		return invoicedate;
	}

	public void setInvoicedate(String invoicedate) {
		this.invoicedate = invoicedate;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	@Override
	public int compareTo(InvoiceMasterDTO o) {
		// TODO Auto-generated method stub
		return invoicedate.compareTo(o.invoicedate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(invoiceno, invoicedate, customerid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceMasterDTO other = (InvoiceMasterDTO) obj;
		return Objects.equals(invoiceno, other.invoiceno) && invoicedate == other.invoicedate
				&& Objects.equals(customerid, other.customerid);
	}

}