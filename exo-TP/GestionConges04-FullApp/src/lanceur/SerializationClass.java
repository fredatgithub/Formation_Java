package lanceur;
 import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializationClass{

	private File fichier;
	private ObjectOutputStream output=null;
	private ObjectInputStream input=null;
	
	public SerializationClass(String fichier){
		this.fichier=new File(fichier);
	}
	
	public Object getData() throws Exception{
		if (input==null) input=new ObjectInputStream(new FileInputStream(this.fichier));
	return input.readObject();
	}
	
	public void sendData(Object o) throws Exception {
		if (output==null)
			output = new ObjectOutputStream(new FileOutputStream(this.fichier));
		output.writeObject(o);
		
	}
	
	public void closeStream() throws Exception {
		this.input.close();
		this.output.close();
		this.fichier=null;
	}
}
