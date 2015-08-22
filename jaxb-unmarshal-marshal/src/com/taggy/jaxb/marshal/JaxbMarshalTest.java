package com.taggy.jaxb.marshal;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.taggy.jaxb.domain.Book;

public class JaxbMarshalTest {

    public static void main(String[] args) {

    	 Book book = new Book("Uncle Bob", "Clean Code", 2005, 32.6);
    	 book.setId(1L);

        try {
            File outputFile =  new File("newBook.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(book, outputFile);
            System.out.println("Successfully converted Java to XML");
            System.out.println("File is stored @ \n"+outputFile.getAbsolutePath());
            

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
