package example2;

 class developerApp 
 {
	public static void main(String [] args)
	{
		developer d1 ;
		
		d1 = new BackendDev ();
		d1.skills();
		((BackendDev)(d1)).team();
		
		d1 = new FrontendDev();
		d1.skills();
		((FrontendDev)(d1)).team();
	}

 }