/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.libraryMS.dao.custom.impl;

import edu.ijse.libraryMS.dao.CrudUtil;
import edu.ijse.libraryMS.dao.custom.MemberDao;
import edu.ijse.libraryMS.entity.MemberEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author heman
 */
public class MemberDaoImpl implements MemberDao{

    @Override
    public boolean create(MemberEntity t) throws Exception {
         return CrudUtil.excuteUpdate("INSERT INTO members VALUES(?,?,?,?,?,?,?,?,?) ", t.getUserId(),t.getUserName(),t.getFirst_Name(),t.getLast_Name(),t.getEmail(),t.getContactNumber(),t.getAddress(),t.getPosition(),t.getJoinDate());
    }

    @Override
    public boolean update(MemberEntity t) throws Exception {
        return CrudUtil.excuteUpdate("UPDATE MEMBERS SET UserName =? ,First_Name = ?, Last_Name = ?, Email = ?, ContactNumber = ?, Address = ?, Position = ?, Join_Date = ? WHERE UserId = ? ",
                t.getUserName(),t.getFirst_Name(),t.getLast_Name(),t.getEmail(),t.getContactNumber(),t.getAddress(),t.getPosition(),t.getJoinDate(), t.getUserId() );
    }

    @Override
    public boolean delete(String id) throws Exception {
      return CrudUtil.excuteUpdate("DELETE FROM members WHERE UserId = ? ", id);
    }

    @Override
    public MemberEntity get(String id) throws Exception {
       ResultSet rst = CrudUtil.excuteQuery("SELECT * FROM members WHERE UserId = ? ", id );
       if(rst.next()){
           MemberEntity entity = new MemberEntity(rst.getString("UserId"),
                   rst.getString("UserName"),
                   rst.getString("First_Name"),
                   rst.getString("Last_Name"),
                   rst.getString("Email"),
                   rst.getString("ContactNumber"),
                   rst.getString("Address"),
                   rst.getString("Position"),
                   rst.getString("Join_Date"));
           return entity;
       }    
       return null;
    }
    

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
         ArrayList<MemberEntity> memberEntitys = new ArrayList<>();
         ResultSet rst = CrudUtil.excuteQuery("SELECT * FROM members");
         while(rst.next()){
             MemberEntity entity = new MemberEntity(rst.getString("UserId"),
                   rst.getString("UserName"),
                   rst.getString("First_Name"),
                   rst.getString("Last_Name"),
                   rst.getString("Email"),
                   rst.getString("ContactNumber"),
                   rst.getString("Address"),
                   rst.getString("Position"),
                   rst.getString("Join_Date"));
          memberEntitys.add(entity);
         }
         return memberEntitys;
    }
    
}
