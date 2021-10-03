public class NormalReader extends Reader {
	

	public NormalReader(String file) {
		super.file = file;
	}
	
	public void display() {
		super.read(file);	
		System.out.println(super.content);
		System.out.println();
	}
}
