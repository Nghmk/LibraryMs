/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.libraryMS.dao.custom.impl;

import edu.ijse.libraryMS.dao.CrudUtil;
import edu.ijse.libraryMS.dao.custom.TransactionDao;
import edu.ijse.libraryMS.entity.TransactionEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author heman
 */
public class TransactionDaoImpl implements TransactionDao{

    @Override
    public boolean create(TransactionEntity t) throws Exception {
               return CrudUtil.excuteUpdate("INSERT INTO Transactions VALUES(?,?,?,?,?,?,?) ", t.getTransactionId(),t.getUserId(),t.getBookId(),t.getIssueDate(),t.getDueDate());
  
    }
    

    @Override
    public boolean update(TransactionEntity t) throws Exception {
        return CrudUtil.excuteUpdate("UPDATE TRANSACTIONS SET UserID = ? ,BookId = ?, IssueDate = ?, DueDate = ? WHERE TransactionId = ? ",
               t.getUserId(),t.getBookId(),t.getIssueDate(),t.getDueDate(),t.getTransactionId());
     }

    @Override
    public boolean delete(String id) throws Exception {
           return CrudUtil.excuteUpdate("DELETE FROM transactions WHERE TransactionId = ? ", id);
    }

    @Override
    public TransactionEntity get(String id) throws Exception {
           ResultSet  rst = CrudUtil.excuteQuery("SELECT * FROM transactions WHERE TransactionId = ? ", id );
       if(rst.next()){
           TransactionEntity entity = new TransactionEntity(rst.getString("TransactionId"),
                   rst.getString("UserId"),
                   rst.getString("BookId"),
                   rst.getLong("IssueDate"),
                   rst.getLong("DueDate"));
       

           return entity;
       }    
       return null;
    }

    @Override
    public ArrayList<TransactionEntity> getAll() throws Exception {
       ArrayList<TransactionEntity> transactionEntities = new ArrayList<>();
                   ResultSet rst = CrudUtil.excuteQuery("SELECT * FROM Transactions" );
       while(rst.next()){
           TransactionEntity entity = new TransactionEntity(rst.getString("TransactionId"),
                   rst.getString("UserId"),
                   rst.getString("BookId"),
                   rst.getLong("IssueDate"),
                   rst.getLong("DueDate"));
           
       transactionEntities.add(entity);
       }
       return transactionEntities;
  
    }
}
