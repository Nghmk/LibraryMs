/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.libraryMS.service.custom.impl;

import edu.ijse.libraryMS.dao.DaoFactory;
import edu.ijse.libraryMS.dao.custom.TransactionDao;
import edu.ijse.libraryMS.dto.TransactionDto;
import edu.ijse.libraryMS.entity.TransactionEntity;
import edu.ijse.libraryMS.service.custom.TransactionService;
import java.util.ArrayList;

/**
 *
 * @author heman
 */
public class TransactionServiceImpl implements TransactionService{
 private TransactionDao transactionDao = (TransactionDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.TRANSACTIONS);
    @Override
    public String add(TransactionDto transactionDto) throws Exception {
     TransactionEntity entity = getTransactionEntity(transactionDto);
        return transactionDao.create(entity)?"Success" : "Fail"; }

    @Override
    public TransactionDto get(String transactionId) throws Exception {
                 TransactionEntity entity = transactionDao.get(transactionId);
         if(entity != null){
             return getTransactionDto(entity);
    }
    return null;
}

    @Override
    public ArrayList<TransactionDto> getAll() throws Exception {
                 ArrayList<TransactionEntity> transactionEntities = transactionDao.getAll();
        if(transactionEntities != null && ! transactionEntities.isEmpty()){
            ArrayList<TransactionDto> transactionDtos = new ArrayList<>();
            
            for (TransactionEntity transactionEntity : transactionEntities) {
                transactionDtos.add(getTransactionDto(transactionEntity));  
            }
            return transactionDtos; 
        }
    return null;
}

    private TransactionDto getTransactionDto(TransactionEntity entity) {
        return new TransactionDto(
             entity.getTransactionId(),
             entity.getUserId(),
             entity.getBookId(),
             entity.getIssueDate(),
             entity.getDueDate());
    }

    private TransactionEntity getTransactionEntity(TransactionDto transactionDto) {
     return new TransactionEntity(
                transactionDto.getTransactionId(),
                transactionDto.getUserId(),
                transactionDto.getBookId(),
                transactionDto.getIssueDate(),
                transactionDto.getDueDate());
    }

    @Override
    public String update(TransactionDto transactionDto) throws Exception {
         TransactionEntity entity = getTransactionEntity(transactionDto);
        return transactionDao.update(entity)? "Success" : "Fail";
     }

    @Override
    public String delete(String TransactionId) throws Exception {
        return transactionDao.delete(TransactionId)?"Success" : "Fail";
     }
}