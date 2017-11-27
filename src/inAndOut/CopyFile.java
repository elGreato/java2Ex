package inAndOut;

import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
    	/*  File file = new File(".");
    	  for(String fileNames : file.list()) System.out.println(fileNames);*/
    	  
         in = new FileInputStream("src/inAndOut/input.txt");
         out = new FileOutputStream("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}

/*
 * Listing Directories
You can use list( ) method provided by File object to list down all the files and directories available in a directory as follows −

Example

import java.io.File;
public class ReadDir {

   public static void main(String[] args) {
      File file = null;
      String[] paths;
  
      try {      
         // create new file object
         file = new File("/tmp");

         // array of files and directory
         paths = file.list();

         // for each name in the path array
         for(String path:paths) {
            // prints filename and directory name
            System.out.println(path);
         }
      } catch (Exception e) {
         // if any error occurs
         e.printStackTrace();
      }
   }
}
This will produce the following result based on the directories and files available in your /tmp directory −

Output

test1.txt
test2.txt
ReadDir.java
ReadDir.class
 */
