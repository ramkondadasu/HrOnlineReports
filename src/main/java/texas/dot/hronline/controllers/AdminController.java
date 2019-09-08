package texas.dot.hronline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import texas.dot.hronline.services.ApplnUserService;

//@Controller
public class AdminController {
	
	 private ApplnUserService applnUserwService;
	 
	 @Autowired
	    public void setApplnUserService(ApplnUserService applnUserwService) {
	        this.applnUserwService = applnUserwService;
	    }

}
