package fileIO;
import java.io.*;

class fio {
public static void main(String args[]) throws IOException {
	FileInputStream in = null;
	FileOutputStream out = null;
	
	try {
		in = new FileInputStream("<path of input file>");
		out = new FileOutputStream("<path of output file>");
		
		int c;
		while((c = in.read()) != -1){
			out.write(c);
		}
	}catch (Exception e) {
		System.out.println("Something went wrong.");
	}finally {
		if(in != null){
				in.close();
		}
		if(out != null){
			out.close();
		}
	}
}
}