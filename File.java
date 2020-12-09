package jav1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//try {
        	FileReader fr=new FileReader("H:\\program.txt");
        		BufferedReader br = new BufferedReader(fr);
        	String url= "";
        	while(null!=(url=br.readLine())) {
        		System.out.println(url);
				
        	try {
           URL u=new URL(url);
           HttpURLConnection hr=(HttpURLConnection)u.openConnection();
           hr.connect();
           int res =hr.getResponseCode();
			 System.out.println(res);
			 FileWriter fw= new FileWriter("H:\\prog.txt");
			 fw.write(url);
			 fw.write("\n");
			// fw.write("code");
			// fw.write(hr.getResponseCode());
			 if(res==200){
           	  fw.write(" file found:200");
           	  }
           	  else 
           	  {
           		  fw.write("File not found:404");
           	  }
			 fw.close();
			 
        		}
        		catch (MalformedURLException e) {
        	}
        
       	
        	
      	
}
        
        	}

}

