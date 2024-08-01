/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.libraryMS.controller;

import edu.ijse.libraryMS.dto.TransactionDto;
import edu.ijse.libraryMS.service.ServiceFactory;
import edu.ijse.libraryMS.service.custom.TransactionService;
import java.util.ArrayList;

/**
 *
 * @author heman
 */
public class TransactionController {
     private TransactionService transactionService = (TransactionService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.TRANSACTIONS);
    public String add(TransactionDto transactionDto) throws Exception{
        return transactionService.add(transactionDto);
    } 
     public String update (TransactionDto transactionDto) throws Exception{
       return transactionService.update(transactionDto);                
    } 
        
    public String delete (String transactionId) throws Exception{
       return transactionService.delete(transactionId);       
    }
    
   
    
    public ArrayList<TransactionDto> getAll() throws Exception{
         return transactionService.getAll(); 
    }
    
    public TransactionDto get (String transactionId) throws Exception{
         return transactionService.get(transactionId);
    }
}

