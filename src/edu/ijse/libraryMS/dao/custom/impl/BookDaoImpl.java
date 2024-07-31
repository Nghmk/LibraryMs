/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.libraryMS.dao.custom.impl;

import edu.ijse.libraryMS.dao.CrudUtil;
import edu.ijse.libraryMS.dao.custom.BookDao;
import edu.ijse.libraryMS.entity.BookEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author heman
 */
public class BookDaoImpl implements BookDao{

    @Override
    public boolean create(BookEntity t) throws Exception {
         return CrudUtil.excuteUpdate("INSERT INTO books VALUES(?,?,?,?,?,?,?) ", t.getBookId(),t.getTitle(),t.getAuthor(),t.getPublisher(),t.getGenre(),t.getLanguage(),t.getNumberOfPage());
   }

    @Override
    public boolean update(BookEntity t) throws Exception {
         return CrudUtil.excuteUpdate("UPDATE BOOKS SET Title = ? ,Author = ?, Publisher = ?, Genre = ?, Language = ?, NumberOfPage = ? WHERE BookId = ? ",
               t.getTitle(),t.getAuthor(),t.getPublisher(),t.getGenre(),t.getLanguage(),t.getNumberOfPage());
     }

    @Override
    public boolean delete(String id) throws Exception {
          return CrudUtil.excuteUpdate("DELETE FROM books WHERE BookId = ? ", id);
    }

    @Override
    public BookEntity get(String id) throws Exception {
           ResultSet rst = CrudUtil.excuteQuery("SELECT * FROM books WHERE BookId = ? ", id );
       if(rst.next()){
           BookEntity entity = new BookEntity(rst.getString("BookId"),
                   rst.getString("Title"),
                   rst.getString("Author"),
                   rst.getString("Publisher"),
                   rst.getString("Genre"),
                   rst.getString("Language"),
                   rst.getInt("NumberOfPage"));

           return entity;
       }    
       return null;
    }

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
        ArrayList<BookEntity> bookEntities = new ArrayList<>();
                   ResultSet rst = CrudUtil.excuteQuery("SELECT * FROM books" );
       while(rst.next()){
           BookEntity entity = new BookEntity(rst.getString("BookId"),
                   rst.getString("Title"),
                   rst.getString("Author"),
                   rst.getString("Publisher"),
                   rst.getString("Genre"),
                   rst.getString("Language"),
                   rst.getInt("NumberOfPage"));
       bookEntities.add(entity);
       }
       return bookEntities;
    }
}

