package main.com.path;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
public class DrlFileUtilNew {
    
    private final String moduleName = "lantone-icss-daguo";
 
    private final String bean_path = "src/main/resources/rules";
    
    //private final String file_name = "Disease.drl";
 
    private final String driverName = "com.mysql.jdbc.Driver";
 
    private final String user = "root";
 
    private final String password = "langtong";
 
  
 
    private void buildfile() throws IOException {
        File folder = new File(bean_path+"/path");
        if ( !folder.exists() ) {
            folder.mkdir();
        }
        System.out.println(folder.getAbsolutePath());
        
        File drlFile = new File(bean_path+"/path","path.txt");
        System.out.println(drlFile.getAbsolutePath());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(drlFile)));
    }
 
    public static void main( String[] args ) {
        try {
              new DrlFileUtilNew().buildfile();
        } catch (Exception e ) {

        }
    }
}
