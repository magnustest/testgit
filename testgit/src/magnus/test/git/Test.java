package magnus.test.git;

public class Test {

	public static void main(String[] args)
	{
		System.out.println("Tst");
		init();
		Invoice i =new Invoice();
		i.prepareInvoice();
		i.sendInvoice();
	}
	private static void init()
	{
		//Do some initing
		initDb();
		System.out.println("Done initing");
		
	}
	private static void initDb()
	{
		String db="inited";
		
	}
	private static void calc()
	{
		System.out.println("calculated");
		System.out.println("changed");
	}
	
	
}
