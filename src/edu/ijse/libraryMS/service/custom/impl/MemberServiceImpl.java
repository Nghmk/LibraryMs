/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.libraryMS.service.custom.impl;

import edu.ijse.libraryMS.dao.DaoFactory;
import edu.ijse.libraryMS.dao.custom.MemberDao;
import edu.ijse.libraryMS.dto.MemberDto;
import edu.ijse.libraryMS.entity.MemberEntity;
import edu.ijse.libraryMS.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author heman
 */
public class MemberServiceImpl implements MemberService {
    
    private MemberDao memberDao = (MemberDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MEMBERS);
            

    @Override
    public String save(MemberDto memberDto) throws Exception {
        MemberEntity entity = getMemberEntity(memberDto);
        return memberDao.create(entity)? "Success" : "Fail";
     }

    @Override
    public String update(MemberDto memberDto) throws Exception {
        MemberEntity entity = getMemberEntity(memberDto);
        return memberDao.update(entity)? "Success" : "Fail";
     }

    @Override
    public String delete(String userId) throws Exception {
       return memberDao.delete(userId)?"Success" : "Fail";
     }

    @Override
    public MemberDto get(String userId) throws Exception {
         MemberEntity entity = memberDao.get(userId);
         if(entity != null){
             return getMemberDto(entity);
         }
         return null;
    }

    @Override
    public ArrayList<MemberDto> getAll() throws Exception {
        ArrayList<MemberEntity> memberEntitys = memberDao.getAll();
        if(memberEntitys != null && !memberEntitys.isEmpty()){
            ArrayList<MemberDto> memberDtos = new ArrayList<>();
            
            for (MemberEntity memberEntity : memberEntitys) {
                memberDtos.add(getMemberDto(memberEntity));  
            }
            return memberDtos;
        }
        return null;
      }
    
    private MemberEntity getMemberEntity(MemberDto memberDto ){
        return new MemberEntity(
                memberDto.getUserId(),
                memberDto.getUserName(),
                memberDto.getFirst_Name(),
                memberDto.getLast_Name(), 
                memberDto.getEmail(),
                memberDto.getContactNumber(),
                memberDto.getAddress(),
                memberDto.getPosition(), 
                memberDto.getJoinDate());
    }
    
        private MemberDto getMemberDto(MemberEntity entity ){
        return new MemberDto(
                entity.getUserId(),
                entity.getUserName(),
                entity.getFirst_Name(), 
                entity.getLast_Name(),
                entity.getEmail(),
                entity.getContactNumber(),
                entity.getAddress(),
                entity.getPosition(),
                entity.getJoinDate());
            
    }
}
