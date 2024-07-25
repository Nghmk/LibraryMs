/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.libraryMS.service.custom;

import edu.ijse.libraryMS.dto.MemberDto;
import edu.ijse.libraryMS.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author heman
 */
public interface MemberService extends SuperService {
   String save  (MemberDto memberDto) throws Exception;
   String update (MemberDto memberDto)throws Exception;
   String delete (String userId) throws Exception;
   MemberDto get (String userId) throws Exception;
   ArrayList<MemberDto> getAll() throws Exception;
}
