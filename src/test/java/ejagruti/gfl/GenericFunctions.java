package ejagruti.gfl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ejagruti.pfl.Global;

public class GenericFunctions {

	public static String getKeyValue(String KeyName) {
		String Output="";
		
		String Filenames= Global.ORFilePath;
		Properties prop =new Properties();
		FileInputStream file=null;
		try {
			file = new FileInputStream(Filenames);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Output = (String) prop.get(KeyName);
		return Output.trim();
	}
	public static String getKeyValue1(String KeyName) {
	String Output="";
	String Filenames= Global.parameterFilePath;
	Properties prop =new Properties();
	FileInputStream file=null;
	try {
		file=new FileInputStream(Filenames);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		prop.load(file);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Output=(String) prop.get(KeyName);
	return Output.trim();
	
	
}
	
	
	
	
	}

