package org.example.project;

import java.io.IOException;

import org.example.project.util.FileUtil;

/**
 * 
 * @author Edison Klafke Fillus
 * Example project to test github
 *
 */
public class App 
{
    public static void main( String[] args ) throws  IOException
    {
        System.out.println( "I'm just testing some commits on github!!" );
        System.out.println( "  \\--->> by the way, it's very cool!!" );
        
        System.out.println( "Hey, hello.txt, say Hello!" );
       
        String filecontent = FileUtil.inputStreamtoString(App.class.getClassLoader().getResourceAsStream("files/hello.txt"));
                
        System.out.println(">>"+filecontent);
       
    }
    
    
}
