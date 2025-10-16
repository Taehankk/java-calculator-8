package calculator;

import java.io.*;
import java.util.*;

public class Application {
	static Set<String> separator;
    public static void main(String[] args) throws Exception {
        // TODO: 프로그램 구현
    	separator = new HashSet<>();
    	separator.add(",");
    	separator.add(":");
    	
    	String number_input = splitCustomSeperator();
    	
    	System.out.println(separator);
    	System.out.println(number_input);
    }
    
    public static String splitCustomSeperator() throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String input = br.readLine();
    	
    	String[] split_input;
    	if(input.startsWith("//") && input.contains("\\n")) {
    		split_input = input.split("\\\\n");
    		
    		input = split_input[0].replace("//", "");
    		
    		separator.add(input);
    		
    		return split_input[1];
    	}
    	
    	return input;
    }
}
