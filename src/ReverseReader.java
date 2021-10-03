
public class ReverseReader extends Reader {

	public ReverseReader(String file) {
		super.file = file;
	}
	
	public void display() {
		super.read(file);
		for(int i=super.content.length()-1; i>= 0; i--) {
			System.out.print(super.content.charAt(i));
		}
		System.out.println("\n");
	}
}
