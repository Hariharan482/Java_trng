package Assignment9;

import java.io.Serializable;
import java.util.Objects;

public class InvoiceTransDTO implements Serializable, Comparable<InvoiceTransDTO> {
	private int invoiceno;
	private int itemno;
	private int itemqty;

	public InvoiceTransDTO() {

	}

	@Override
	public String toString() {
		return "InvoiceTransDTO [invoiceno=" + invoiceno + ", itemno=" + itemno + ", itemqty=" + itemqty + "]";
	}

	public InvoiceTransDTO(int invoiceno, int itemno, int customerid) {
		this.invoiceno = invoiceno;
		this.itemno = itemno;
		this.itemqty = itemqty;

	}

	public int getInvoiceno() {
		return invoiceno;
	}

	public void setInvoiceno(int invoiceno) {
		this.invoiceno = invoiceno;
	}

	public int getItemno() {
		return itemno;
	}

	public void setItemno(int itemno) {
		this.itemno = itemno;
	}

	public int getItemqty() {
		return itemqty;
	}

	public void setItemqty(int itemqty) {
		this.itemqty = itemqty;
	}

	@Override
	public int hashCode() {
		return Objects.hash(invoiceno, itemno, itemqty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceTransDTO other = (InvoiceTransDTO) obj;
		return Objects.equals(invoiceno, other.invoiceno) && itemno == other.itemno
				&& Objects.equals(itemqty, other.itemqty);
	}

	@Override
	public int compareTo(InvoiceTransDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

}