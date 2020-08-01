package com.project;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class main extends example{
	
	public static void main(String[] args) throws Exception {
		
			System.out.println("*********Welcome to LockedMe.com********");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("We welcomes you on behalf of LockedMe.com");
		System.out.println("-----------------------------------------------------------------------");
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name=scan.next();
		//Ask for user details
		main obj=new main();
		
		while(true) {
			System.out.println("***********************");
			System.out.println("------------------------------Menu------------------------------");
			
			System.out.println("1.Sorting the list of files");
			System.out.println("2.Add a file to the application directory");
			System.out.println("3.Delete a file from application directory");
			System.out.println("4.To see if specified file is present in application directory");
			//System.out.println("5.Display contents of specified file");
			//System.out.println("6.To see your account details");
			System.out.println("0.Exit from LockedMe.com");
			System.out.println();
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();

			switch(choice){
			case 1:
				System.out.println("******List of files sorted*****");
				obj.SortFileNames();
				break;
			case 2:
				System.out.println("****Welcome to adding a file page!*****");
				obj.addFiles();
				break;
			case 3:
				System.out.println("****Deleting a file page******* ");
				obj.deleteFiles();
				break;
			case 4:
				System.out.println("******Checking the location of file*****");
				obj.SearchFile();
				break;
			case 0:
				System.out.println("Closing LockedMe.com");
				System.exit(0);
				break;
			default:
				System.out.println("You have given wrong input! \n\nPlease re-enter your choice\n\n");
				
				
			}
		}
	}
}
