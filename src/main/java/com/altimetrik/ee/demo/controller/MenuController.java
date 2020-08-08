package com.altimetrik.ee.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.ee.demo.entity.Menu;
import com.altimetrik.ee.demo.service.MenuService;

@RequestMapping("/api")
@CrossOrigin
@RestController
public class MenuController {
	
	@Autowired
	MenuService repo;
	
	@RequestMapping(method = RequestMethod.GET,value="/menus-list",produces=MediaType.APPLICATION_JSON_VALUE)  
	public List<Menu> hello() {   
	 
		List<Menu>menuList=(List<Menu>) repo.findAll();
		return menuList;
		
		
		
	 }
	
	@GetMapping("menu/{menu_id}")  
    public List<Menu> allMenuByID(@PathVariable("menu_id") int menu_id,Menu menu) {  
         menu.setMenu_id(menu_id);  
         List<Menu> menuList = new ArrayList<>();
         repo.findById(menu_id).ifPresent(menuList::add);
         return menuList ;
         
          
    }
	
	@PostMapping("update-menu/{menu_id}")  
    public boolean updateMenu(@RequestBody Menu menu,@PathVariable("menu_id") int menu_id) {  
        menu.setMenu_id(menu_id);  
        boolean status=false;  
        try {  
        	repo.save(menu) ;
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    } 
	
	 @PostMapping(value = "save-menu", consumes = "application/json", produces = "application/json")
	    public boolean saveMenu(@RequestBody Menu menu) {  
		 boolean status=false;  
	        try {  
	        	repo.save(menu) ;
	            status=true;  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return status;  
	    } 
	 
	 @DeleteMapping("delete-menu/{menu_id}")  
	    public boolean deleteMenu(@PathVariable("menu_id") int menu_id,Menu menu) {  
		 boolean status=false;  
	        try {  
	        	repo.deleteById(menu_id);
	            status=true;  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return status;     
	    }
}
