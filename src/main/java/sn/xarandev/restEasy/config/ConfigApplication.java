package sn.xarandev.restEasy.config;


import java.util.HashSet;
import java.util.Set;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import sn.xarandev.restEasy.controller.TransactionController;

@ApplicationPath(value = "/")
public class ConfigApplication extends Application{
	
	Set<Object> singletons = new HashSet() ;

	public ConfigApplication() {
		this.singletons.add(new TransactionController()) ;
	}
	
	public Set<Object> getSingletons() {
		return super.getSingletons() ;
	}
	
	
	

}
