package org.xmlClass;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlTask {
public static void main(String[] args) throws Exception {
	JAXBContext con = JAXBContext.newInstance(Aravind.class);
	Unmarshaller un= con.createUnmarshaller();
	File xmlPath= new File("C:\\Users\\TAMIL TECH\\workspace\\XmlClass\\src\\Aravind.xml");
	Object obj = un.unmarshal(xmlPath);
	Aravind x= (Aravind) obj;
	System.out.println(x.getProductId());
	System.out.println(x.getProductName());
	System.out.println(x.getQty());
	System.out.println(x.getAddress());
	
	
}
}
