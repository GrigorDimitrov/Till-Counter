import java.io.*;
import java.util.*;

public class WriteTest {
	public static void main (String [] a){
	File file = new File("test.txt");

	int finalTotal = 200;
	Date newDate = new Date();
	try(BufferedWriter bw = new BufferedWriter(new FileWriter(new
							File("test.txt")))){


			bw.write("The till count is: " + finalTotal + "Date: " + newDate);

	}catch(IOException e){
		e.printStackTrace();
	}
	} //end main


}//end of class