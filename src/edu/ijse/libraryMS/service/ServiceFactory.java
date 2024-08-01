/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.libraryMS.service;

import edu.ijse.libraryMS.service.custom.impl.BookServiceImpl;
import edu.ijse.libraryMS.service.custom.impl.MemberServiceImpl;
import edu.ijse.libraryMS.service.custom.impl.TransactionServiceImpl;

/**
 *
 * @author heman
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType serviceType){
        switch (serviceType) {
            case MEMBERS:
                return new MemberServiceImpl();
             case BOOKS:
                return new BookServiceImpl();
             case TRANSACTIONS:
                return new TransactionServiceImpl();
                
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        MEMBERS, BOOKS,TRANSACTIONS
    }
}
