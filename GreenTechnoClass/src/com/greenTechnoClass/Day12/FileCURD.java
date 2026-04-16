package com.greenTechnoClass.Day12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCURD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileCURD fc = new FileCURD();
		//fc.CreateFile();
		//fc.writeFile();
		//fc.getFile();
		fc.deleteFile();
		
	}

	public void CreateFile() throws IOException{
		File obj = new File("C:\\Users\\Kalai\\eclipse-workspace\\GreenTechnoClass\\create.txt");
		if(obj.createNewFile()) {
			System.out.println("File Created");
		}
		else {
			System.out.println("Error occured");
		}
	}
	 public void writeFile() throws IOException{
		 FileWriter obj = new FileWriter("C:\\Users\\Kalai\\eclipse-workspace\\GreenTechnoClass\\create.txt");
		 obj.write("This is my first file");
		 obj.close();
	 }
	 public void getFile() throws IOException{
		 File obj = new File("C:\\Users\\Kalai\\eclipse-workspace\\GreenTechnoClass\\create.txt");
		 Scanner sc = new Scanner(obj);
		 if(sc.hasNext()) {
			 String s = sc.nextLine();
			 System.out.println(s);
		 }
		 sc.close();
	 }
	 public void deleteFile() {
		 try {
			 File obj = new File("C:\\Users\\Kalai\\eclipse-workspace\\GreenTechnoClass\\create.txt");
			 obj.delete();
			 System.out.println("File deleted successfully");
		 }
		 catch(Exception e) {
			 System.out.println("Error occured");
		 }
	 }
	 
}
