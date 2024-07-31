/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.libraryMS.service.custom.impl;

import edu.ijse.libraryMS.dao.DaoFactory;
import edu.ijse.libraryMS.dao.custom.BookDao;
import edu.ijse.libraryMS.dto.BookDto;
import edu.ijse.libraryMS.entity.BookEntity;
import edu.ijse.libraryMS.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author heman
 */
public class BookServiceImpl implements BookService{
    private BookDao bookDao = (BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOKS);

    @Override
    public String save(BookDto bookDto) throws Exception {
       BookEntity entity = getBookEntity(bookDto);
        return bookDao.create(entity)?"Success" : "Fail";
     }

    @Override
    public String update(BookDto bookDto) throws Exception {
       BookEntity entity = getBookEntity(bookDto);
        return bookDao.update(entity)? "Success" : "Fail";
     }

    @Override
    public String delete(String bookId) throws Exception {
        return bookDao.delete(bookId)?"Success" : "Fail";
     }

    @Override
    public BookDto get(String bookId) throws Exception {
             BookEntity entity = bookDao.get(bookId);
         if(entity != null){
             return getBookDto(entity);
    }
    return null;
}

    @Override
    public ArrayList<BookDto> getAll() throws Exception {
            ArrayList<BookEntity> bookEntities = bookDao.getAll();
        if(bookEntities != null && ! bookEntities.isEmpty()){
            ArrayList<BookDto> bookDtos = new ArrayList<>();
            
            for (BookEntity bookEntity : bookEntities) {
                bookDtos.add(getBookDto(bookEntity));  
            }
            return bookDtos; 
        }
    return null;
}

    private BookEntity getBookEntity(BookDto bookDto) {
      return new BookEntity(
              bookDto.getBookId(),
              bookDto.getTitle(),
              bookDto.getAuthor(),
              bookDto.getPublisher(),
              bookDto.getGenre(),
              bookDto.getLanguage(),
              bookDto.getNumberOfPage());
    }

    private BookDto getBookDto(BookEntity entity) {
      return new BookDto(
             entity.getBookId(),
             entity.getTitle(),
             entity.getAuthor(),
             entity.getPublisher(),
             entity.getGenre(),
             entity.getLanguage(),
             entity.getNumberOfPage());
    }
}

