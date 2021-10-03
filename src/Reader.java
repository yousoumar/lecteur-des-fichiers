import java.io.File;
import java.io.FileInputStream;

public abstract class Reader {
	
	protected String file;
	protected String content = "";
	
	public void read(String file) {
		FileInputStream in = null;
		File f = null;
		
		try {
			
			f = new File(file);
			in = new FileInputStream(f);			
			int content;
			while ((content = in.read()) != -1) {
				this.content += (char)content;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (in != null)
					in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public abstract void display();
}
