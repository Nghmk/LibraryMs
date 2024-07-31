/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.libraryMS.controller;

import edu.ijse.libraryMS.dto.MemberDto;
import edu.ijse.libraryMS.service.ServiceFactory;
import edu.ijse.libraryMS.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author heman
 */
public class MemberController {
    
    private MemberService memberService = (MemberService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBERS);
    public String save(MemberDto memberDto) throws Exception{
        return memberService.save(memberDto);
    } 
    
    public String update (MemberDto memberDto) throws Exception{
       return memberService.update(memberDto);                
    }  
        
    public String delete (String userId) throws Exception{
       return memberService.delete(userId);       
    }
    
    public ArrayList<MemberDto> getAll() throws Exception{
         return memberService.getAll(); 
    }
    
    public MemberDto get (String userId) throws Exception{
         return memberService.get(userId);
    }
}
