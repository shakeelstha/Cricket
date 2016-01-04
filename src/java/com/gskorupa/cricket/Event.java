/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gskorupa.cricket;

/**
 *
 * @author greg
 */
public class Event {
    
    public static final String LOG_ALL = "LOG_ALL";
    public static final String LOG_FINEST = "LOG_FINEST";
    public static final String LOG_INFO = "LOG_INFO";
    public static final String LOG_WARNING = "LOG_WARNING";
    public static final String LOG_SEVERE = "LOG_SEVERE";
    
    private long id;
    private String category;
    private String type;
    private String origin;
    private String payload;
    
    public Event(String origin, String category, String type, String payload){
        this.origin=origin;
        this.category=category;
        this.type=type;
        this.payload=payload;
    }
    
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(getOrigin()).append(getCategory()).append(":").append(":").append(getType()).append(":").append(getPayload());
        return sb.toString();
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type!=null ? type : "";
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the payload
     */
    public String getPayload() {
        return payload;
    }

    /**
     * @param payload the payload to set
     */
    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category!=null ? category : "";
    }

    /**
     * @param subtype the category to set
     */
    public void setCategory(String subtype) {
        this.category = subtype;
    }
}