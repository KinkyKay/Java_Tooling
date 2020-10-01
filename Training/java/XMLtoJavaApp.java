package be.abis.demo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class XMLtoJavaApp {

public static void main(String[] args) {
	List<Person> listOfPersons ;
	try {
		File file = new File("C:\\temp\\SFPD\\PersonList.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Persons.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Persons persons = (Persons) jaxbUnmarshaller.unmarshal(file);
		listOfPersons = persons.getPersons();
		System.out.println("list of persons");
		for (Person p : listOfPersons ) {
			System.out.println(p);
		}
	} catch (JAXBException e) {
		e.printStackTrace();
	}
}

}