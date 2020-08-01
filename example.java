package com.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class example {
	public void SortFileNames() {
			File fileDir = new File("C:\\Project");
			if(fileDir.isDirectory()){
				List<String> listFile = Arrays.asList(fileDir.list());
				System.out.println("Listing files unsorted");
				for(String s:listFile){
					System.out.println(s);
				}
				Collections.sort(listFile);
				System.out.println("---------------------------------------");
				System.out.println("Sorting by filename in ascending order");
				for(String s:listFile){
					System.out.println(s);
				}
				System.out.println("---------------------------------------");
				System.out.println("Sorting by filename in descending order");
				Collections.sort(listFile,Collections.reverseOrder());
				for(String s:listFile){
				System.out.println(s);
				}

			}
			else{
				System.out.println(fileDir.getAbsolutePath() + " is not a directory");
			}

		}

	public void addFiles() {
		//get name of file
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the name of the file ");
			String fname=sc.next();
			fname="C:\\Project\\"+fname+".txt";
			System.out.println("Name of the file "+fname);
			File myFile=new File(fname);
//			FileOutputStream is=new FileOutputStream("C:\\Project"+fname);
			boolean flag=myFile.createNewFile();
			System.out.println(flag);
			if(flag) {
				
				System.out.println("File created Successfully!");
				//w.close();
				}
			
			else {
				System.out.println("File already present.\n");
		}
			}
		catch(Exception e) {
			System.out.println("Problem in creating file");
		}
	}
	
public void deleteFiles() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the name of the File you wish to delete");
	String fname=sc.next(); 
	String fileName="C:\\Project\\"+fname+".txt";
	try
    { 
		boolean isexists = Files.deleteIfExists(Paths.get(fileName));
		System.out.println("isexists"+isexists);
        if(isexists)
        	System.out.println("Deleted Successfully.");
    } 
    catch(NoSuchFileException e) 
    { 
        System.out.println("No such user exists"); 
    } 
    catch(DirectoryNotEmptyException e) 
    { 
        System.out.println("File is not empty."); 
    } 
    catch(FileSystemException e) 
    { 
    	System.out.println("Cannot delete the file, because it is being used.");
    	//e.printStackTrace();
       // System.out.println("Invalid permissions."); 
    } 
	catch(Exception e) {
		e.printStackTrace();
	}
}
public void SearchFile() { 
	System.out.println("enter the name of the file you wish to  search");
	String name;
	Scanner scan=new Scanner(System.in);
	name = scan.next();
	name= name+".txt";
	System.out.println(name+ "you have entered the name");
	      File dir = new File("C:\\Project\\");
	      FileFilter filter = new FileFilter() {
	        @Override
	    	  public boolean accept (File dir) { 
	            return dir.isFile();
	         } 
	      }; 
	      File[] children = dir.listFiles(filter);
          int test=0;
	      if (children == null) {
	         System.out.println("Either file does not exist or is not a file"); 
	      } else { 
	         for (int i = 0; i< children.length; i++) {
	            File filename = children[i];
	            String x = filename.getName();
	            if(x.equals(name)) {
	            test=1;
	            System.out.println("file found");
	            System.out.println(filename);
	            break;
	            }
	            	            
	         } 
	         if(test==0) {
		            test=1;
		            System.out.println("file not found");
		            }
	      } 
	   } 
	}
