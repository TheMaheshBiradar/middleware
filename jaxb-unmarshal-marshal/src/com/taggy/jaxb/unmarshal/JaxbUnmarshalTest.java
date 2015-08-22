package com.taggy.jaxb.unmarshal;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.taggy.jaxb.domain.Book;

public class JaxbUnmarshalTest {
	

    public static void main(String[] args) {

        Book book = new Book("Uncle Bob", "Clean Code", 2005, 32.6);
        book.setId(1L);

        try {
            File outputFile =  new File("newBook.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Book response = (Book) jaxbUnmarshaller.unmarshal(outputFile);
            
            System.out.println("Successfully converted XML to Java\n");
            System.out.println(response.toString());
            
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
