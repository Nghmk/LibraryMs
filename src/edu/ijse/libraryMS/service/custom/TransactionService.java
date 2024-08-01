/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.libraryMS.service.custom;

import edu.ijse.libraryMS.dto.TransactionDto;
import edu.ijse.libraryMS.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author heman
 */
public interface TransactionService extends SuperService{
   String add  (TransactionDto transactionDto) throws Exception;
   String update (TransactionDto transactionDto)throws Exception;
   String delete (String TransactionId) throws Exception;
   TransactionDto get (String TransactionId) throws Exception;
   ArrayList<TransactionDto> getAll() throws Exception;
    
}
