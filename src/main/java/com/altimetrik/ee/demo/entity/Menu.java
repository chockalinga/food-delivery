package com.altimetrik.ee.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  
@Table(name="menu")  
public class Menu {  
	    @Id   
	    private int menu_id;  
	    private String menu_name;  
	    private int menu_price;  
	    private String menu_destination;  
	    public int getStudent_id() {  
	        return menu_id;  
	    }  
	    public void setMenu_id(int menu_id) {  
	        this.menu_id = menu_id;  
	    }  
	    public String getMenu_name() {  
	        return menu_name;  
	    }  
	    public void setMenu_name(String menu_name) {  
	        this.menu_name = menu_name;  
	    }  
	    public int getMenu_price() {  
	        return menu_price;  
	    }  
	    public void setMenu_price(int menu_price) {  
	        this.menu_price = menu_price;  
	    }  
	    public String getMenu_destination() {  
	        return menu_destination;  
	    }  
	    public void setMenu_destination(String menu_destination) {  
	        this.menu_destination = menu_destination;  
	    }  
	  
	      
}