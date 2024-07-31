/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.libraryMS.controller;

import edu.ijse.libraryMS.dto.BookDto;
import edu.ijse.libraryMS.service.ServiceFactory;
import edu.ijse.libraryMS.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author heman
 */
public class BookController {
    
     private BookService bookService = (BookService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOKS);
    
     public String save(BookDto bookDto) throws Exception{
        return bookService.save(bookDto);
    } 
    
    public String update (BookDto bookDto) throws Exception{
       return bookService.update(bookDto);                
    }  
        
    public String delete (String bookId) throws Exception{
       return bookService.delete(bookId);       
    }
    
    public ArrayList<BookDto> getAll() throws Exception{
         return bookService.getAll(); 
    }
    
    public BookDto get (String bookId) throws Exception{
         return bookService.get(bookId);
    }
}
