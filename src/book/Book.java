package book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//annoations

@Path("/book")	//URI
public class Book {
	
	@GET
	@Produces(MediaType.TEXT_HTML)    //XML.JSON
	
	@Path("{name}")   
	public String sayHelloXML(@PathParam("name") String name){
		
		String response="<?xml version='1.0'?>"+
					"<hello>Hello "+name+"</hello";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)    //XML.JSON
	
	public String sayHelloHTML(){
		
		String response="<h1>HEllo HTML</h1>";
		return response;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)		//XML.JSON
	public String sayHelloJSON(){
		String response=null;
		return response;
	}

}
