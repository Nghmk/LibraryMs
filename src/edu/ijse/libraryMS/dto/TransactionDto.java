/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.libraryMS.dto;

import java.util.ArrayList;

/**
 *
 * @author heman
 */
public class TransactionDto {
    private String transactionId;
    private String userId;
    private String bookId;
    private Long issueDate;
    private Long dueDate;
    
   

    public TransactionDto() {
    }

    public TransactionDto(String transactionId, String userId, String bookId, Long issueDate, Long dueDate) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.bookId = bookId;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    /**
     * @return the transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * @param transactionId the transactionId to set
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the bookId
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    /**
     * @return the issueDate
     */
    public Long getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(Long issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * @return the dueDate
     */
    public Long getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(Long dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "TransactionDto{" + "transactionId=" + transactionId + ", userId=" + userId + ", bookId=" + bookId + ", issueDate=" + issueDate + ", dueDate=" + dueDate + '}';
    }
    
    
    
    
}
