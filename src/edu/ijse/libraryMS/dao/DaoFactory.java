/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.libraryMS.dao;

import edu.ijse.libraryMS.dao.custom.impl.BookDaoImpl;
import edu.ijse.libraryMS.dao.custom.impl.MemberDaoImpl;

/**
 *
 * @author heman
 */
public class DaoFactory {
    private static DaoFactory daoFactory;

    
    private DaoFactory(){}
    
    public static DaoFactory getInstance(){
     if(daoFactory == null){
          daoFactory = new DaoFactory();     
     }
     return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes types){
        switch (types) {
            case MEMBERS:
                return new MemberDaoImpl();
            case BOOKS:
                return new BookDaoImpl();
          
            default:
               return null;
        }
 
    }
  
   public enum DaoTypes{
       MEMBERS, BOOKS, PUBLISHER, GENRES, TRANSACTIONS, FINE;
  
   }  
}
