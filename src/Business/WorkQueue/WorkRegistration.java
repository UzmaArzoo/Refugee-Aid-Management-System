/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author hp
 */
public class WorkRegistration {
   
    private UUID Refugeeid;
    private String country;
    private UserAccount Unoregister;
    private UserAccount Unosender;
    private UserAccount embassyreceiver;
    private UserAccount embassysender;
    private UserAccount embassychecker;
    private UserAccount officer;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String filename;
    private String image_path;

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }
     
    
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public UUID getRefugeeid() {
        return Refugeeid;
    }

    public void setRefugeeid(UUID Refugeeid) {
        this.Refugeeid = Refugeeid;
    }
    
    

    public UserAccount getUnoregister() {
        return Unoregister;
    }

    public void setUnoregister(UserAccount Unoregister) {
        this.Unoregister = Unoregister;
    }

    public UserAccount getOfficer() {
        return officer;
    }

    public void setOfficer(UserAccount officer) {
        this.officer = officer;
    }
     
    
    public UserAccount getEmbassychecker() {
        return embassychecker;
    }

    public void setEmbassychecker(UserAccount embassychecker) {
        this.embassychecker = embassychecker;
    }

    public UserAccount getUnosender() {
        return Unosender;
    }

    public void setUnosender(UserAccount Unosender) {
        this.Unosender = Unosender;
    }

    public UserAccount getEmbassyreceiver() {
        return embassyreceiver;
    }

    public void setEmbassyreceiver(UserAccount embassyreceiver) {
        this.embassyreceiver = embassyreceiver;
    }

    public UserAccount getEmbassysender() {
        return embassysender;
    }

    public void setEmbassysender(UserAccount embassysender) {
        this.embassysender = embassysender;
    }

 
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
   
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    @Override
    public String toString(){
        return this.Refugeeid.toString();
    }
    
}
