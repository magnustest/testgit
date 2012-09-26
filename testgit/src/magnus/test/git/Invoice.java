package magnus.test.git;

public class Invoice {

	private int invoiceID;
	private String name;
	private boolean prepared=false;
	public Invoice()
	{
		invoiceID=0;
		name="";
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void prepareInvoice()
	{
		prepared=true;
		System.out.println("prepared");
	}
	public void sendInvoice()
	{
		if(!prepared)
			System.out.println("Need to prepare invoice before sending");
		else
			System.out.println("SENT!");
		
	}
}
