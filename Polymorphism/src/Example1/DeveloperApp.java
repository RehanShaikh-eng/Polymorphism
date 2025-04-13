package Example1;

public class DeveloperApp {

public static void main(String [] args)
{
	Developer d1;
	
	d1 = new javaDeveloper();
	d1.project();
	d1.skills();
	
	d1 = new WebDeveloper();
	d1.project();
	d1.skills();
	
	d1 = new SqlDeveloper();
	d1.project();
	d1.skills();
}

}
