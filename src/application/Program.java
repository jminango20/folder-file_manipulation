package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Imprime Folders
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for(File folder: folders) {
			System.out.println(folder);
		}
		
		//Imprime Files
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for(File file:files) {
			System.out.println(file);
		}
		
		
		
		sc.close();

	}

}
