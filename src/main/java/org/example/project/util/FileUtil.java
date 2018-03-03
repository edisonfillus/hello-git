package org.example.project.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil {
	
	private FileUtil(){}
   
    public static String inputStreamtoString(InputStream inputStream) throws IOException {
    	ByteArrayOutputStream result = new ByteArrayOutputStream();
    	byte[] buffer = new byte[1024];
    	int length;
    	while ((length = inputStream.read(buffer)) != -1) {
    	    result.write(buffer, 0, length);
    	}
    	// StandardCharsets.UTF_8.name() > JDK 7
    	return result.toString("UTF-8");
    }
    
    
	
}
