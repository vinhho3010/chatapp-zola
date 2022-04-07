package com.raven.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Model_Register {

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Model_Register(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Model_Register(String userName, String password, String gender) {
        this.userName = userName;
        this.password = password;
        this.gender = gender;
    }

    public Model_Register() {
    }

    private String userName;
    private String password;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public JSONObject toJsonObject() {
        try {
            JSONObject json = new JSONObject();
            json.put("userName", userName);
            json.put("password", password);
            json.put("gender", gender);
            return json;
        } catch (JSONException e) {
            return null;
        }
    }
}
