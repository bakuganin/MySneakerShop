/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Objects;

/**
 *
 * @author user
 */

public class Consumers {
    private String Name;
    private String LastName;
    private String Phone;
    private Integer Purse;

    public Consumers() {
    }

    public Consumers(String Name, String LastName, String Phone, Integer Purse) {
        this.Name = Name;
        this.LastName = LastName;
        this.Phone = Phone;
        this.Purse = Purse;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public Integer getPurse() {
        return Purse;
    }

    public void setPurse(Integer Purse) {
        this.Purse = Purse;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.Name);
        hash = 19 * hash + Objects.hashCode(this.LastName);
        hash = 19 * hash + Objects.hashCode(this.Phone);
        hash = 19 * hash + Objects.hashCode(this.Purse);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Consumers other = (Consumers) obj;
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.LastName, other.LastName)) {
            return false;
        }
        if (!Objects.equals(this.Phone, other.Phone)) {
            return false;
        }
        if (!Objects.equals(this.Purse, other.Purse)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Consumers{" 
                + "Name=" + Name 
                + ", LastName=" + LastName 
                + ", Phone=" + Phone 
                + ", Purse=" + Purse 
                + '}';
    }
}
