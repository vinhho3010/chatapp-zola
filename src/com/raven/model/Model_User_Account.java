package com.raven.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Model_User_Account {

    public Model_User_Account() {
        
    }
    
    public void setModel_User_Account(){
        setStatus(false);
        setGender("");
        setUserID(1);
        setImage("");
        //setAvatarPath("");
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
//     public String getDescription() {
//        return Description;
//    }
//
//    public void setDescription(String Description) {
//        this.Description = Description;
//    }
//
//    public String getAvatarPath() {
//        return AvatarPath;
//    }
//
//    public void setAvatarPath(String AvatarPath) {
//        this.AvatarPath = AvatarPath;
//    }

    public Model_User_Account(int userID, String userName, String gender, String image, boolean status) {
        this.userID = userID;
        this.userName = userName;
        this.gender = gender;
        this.image = image;
        this.status = status;
        //this.AvatarPath = AvatarPath;
    }

    public Model_User_Account(Object json) {
        JSONObject obj = (JSONObject) json;
        try {
            userID = obj.getInt("userID");
            userName = obj.getString("userName");
            gender = obj.getString("gender");
            image = obj.getString("image");
            status = obj.getBoolean("status");
            //AvatarPath = obj.getString("AvatarPath");
        } catch (JSONException e) {
            System.err.println(e);
        }
    }

   

    private int userID;
    private String userName;
    private String gender;
    private String image;
    private boolean status;
   // private String AvatarPath;


}
