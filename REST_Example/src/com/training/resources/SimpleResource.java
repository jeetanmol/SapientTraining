package com.training.resources;

import java.util.HashMap;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.owlike.genson.Genson;
import com.training.utils.Employee;



@Path("/simple")
public class SimpleResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage(){
		
		return "You have configured REST successfully!!";
	}
		
	@GET
	@Path("/name")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmployee(){
		
		String empRep=null;
		Employee emp = new Employee("Anmol", 1);
		
		Genson serializer = new Genson();
		
		empRep = serializer.serialize(emp);
		return empRep;
	}
	
	
	@POST
	@Path("/add")
	public String addEmployee(@FormParam("id") int empId,@FormParam("name") String empName){
		
		Employee emp =new Employee(empName, empId);
		String message = emp.toString() ;
		return "One Employee with " + message;
	}
	
	@DELETE
	@Path("/delete/{empId}")
	public String deleteEmployee(@javax.ws.rs.PathParam("empId") long empId){
		
		return "One employee with id " + empId+" deleted :(";
	}
	
	
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Response findAllEmployees(@QueryParam("dept") String department){
		
		HashMap<String, Employee> list = new HashMap<String,Employee>();
		list.put("HR", new Employee("Priyanka", 101));
		list.put("IT", new Employee("Ramesh", 102));
		list.put("R&D", new Employee("Reeti", 105));
		
		Employee found = list.get(department);
		
		return Response.status(200).entity(found).build();
	}
}
