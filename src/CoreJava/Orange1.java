package CoreJava;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Orange1
{

public static void main(String[] args) throws IOException {
//	File f1 = new File("xyz.txt");
//	
//	System.out.println(f1.exists());
//	
//	f1.createNewFile();
//	
//	System.out.println(f1.exists());
	
//	File f1 = new File("abcda");
//	
//	System.out.println(f1.exists());
//	
//	f1.mkdir();
//	
//	System.out.println(f1.exists());
//
//File f1 = new File("E:\\","ppq11.txt");
//	
//	
//	
//	
//	f1.createNewFile();
//	
//	System.out.println(f1.exists());
	int count = 0;

//File f1 = new File("E:\\");
//	String[] list = f1.list();
//	
//	for(String s1 : list)
//	{
//		
//		File f = new File(f1,s1);
//		if(f.isFile())
//		{
//		System.out.println(s1);
//		count++;
//	}}
//	
//	System.out.println("Total Count="+count);
//}	
//	FileWriter fw = new FileWriter("abc.txt",true);
//	
//	
//	fw.write("How are you?");
//	
//	fw.write("\nHow are you?");
//	fw.close();
	
	FileReader fr = new FileReader("xyz.txt");
	
	int i = fr.read();
	
	System.out.println(i);
	
//	while(i != -1)
//	{
//		System.out.print((char)i);
//		
//		i = fr.read();
//	}
	
	while(i != -1)
	{
		System.out.print((char)i);
		
		i = fr.read();
	}
	
}
}
