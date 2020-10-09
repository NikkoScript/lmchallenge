package bst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvFile {
	

	public static void main(String[] args)  {
		try {
			read("./src/dummy.csv");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
		}

	}
	
	
	public static void read(String filename) throws FileNotFoundException
	{
		node n=new node();
		File csv=new File(filename);
		Scanner scancsv= new Scanner(csv);
		
		while(scancsv.hasNextLine()) {
			String tmp=scancsv.nextLine();
			tmp=tmp.substring(0,tmp.length()-1);
			System.out.println(tmp);
			
			int t= Integer.parseInt(tmp);
			n.insert(t);
		}
		
		String s[]=new String[n.size()];
		for(int i=0;i<n.size();i++) {
			s[i]="";
		}
		n.display(s, 0);
		int p=0;
		while(s[p]!="") {
			System.out.println(s[p]);
			p++;
		}
		System.out.println("done");
	}
}
