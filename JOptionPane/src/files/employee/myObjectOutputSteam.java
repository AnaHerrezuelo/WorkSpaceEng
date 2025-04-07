package files.employee;


import java.io.IOException;
import java.io.ObjectOutputStream;
//import java.io.IOException;

public class myObjectOutputSteam extends ObjectOutputStream {

	protected myObjectOutputSteam() throws IOException, SecurityException {
		super();
	}

	@Override
	protected void writeStreamHeader() throws IOException{
		
	}	

}//end public class myObjectOutputSteam
