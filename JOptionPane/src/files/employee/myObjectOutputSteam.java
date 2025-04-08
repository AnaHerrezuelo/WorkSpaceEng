package files.employee;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class myObjectOutputSteam extends ObjectOutputStream {

	protected myObjectOutputSteam(FileOutputStream fileOutputS) throws IOException, SecurityException {
		super();
	}

	@Override
	protected void writeStreamHeader() throws IOException{
		
	}	

}//end public class myObjectOutputSteam
