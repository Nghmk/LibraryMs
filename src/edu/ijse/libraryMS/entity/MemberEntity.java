/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.libraryMS.entity;

/**
 *
 * @author heman
 */
public class MemberEntity {
    private String userId;
    private String userName;
    private String first_Name;
    private String last_Name;
    private String email;
    private String contactNumber;
    private String address;
    private String position;
    private String joinDate;

    public MemberEntity() {
    }

    public MemberEntity(String userId, String userName, String first_Name, String last_Name, String email, String contactNumber, String address, String position, String joinDate) {
        this.userId = userId;
        this.userName = userName;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.address = address;
        this.position = position;
        this.joinDate = joinDate;
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
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the first_Name
     */
    public String getFirst_Name() {
        return first_Name;
    }

    /**
     * @param first_Name the first_Name to set
     */
    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    /**
     * @return the last_Name
     */
    public String getLast_Name() {
        return last_Name;
    }

    /**
     * @param last_Name the last_Name to set
     */
    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the joinDate
     */
    public String getJoinDate() {
        return joinDate;
    }

    /**
     * @param joinDate the joinDate to set
     */
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "MemberEntity{" + "userId=" + userId + ", userName=" + userName + ", first_Name=" + first_Name + ", last_Name=" + last_Name + ", email=" + email + ", contactNumber=" + contactNumber + ", address=" + address + ", position=" + position + ", joinDate=" + joinDate + '}';
    }
    
    
}
