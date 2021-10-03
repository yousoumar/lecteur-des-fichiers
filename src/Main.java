
public class Main {

	public static void main(String[] args){	
		
		Reader nr = new NormalReader("/Users/yousoumar/Sites/lecteur-de-fichier/text.txt");
		nr.display();
		
		Reader rr = new ReverseReader("/Users/yousoumar/Sites/lecteur-de-fichier/text.txt");
		rr.display();
		
		Reader pr = new PalindromeReader("/Users/yousoumar/Sites/lecteur-de-fichier/text.txt");
		pr.display();
		
	}

}
