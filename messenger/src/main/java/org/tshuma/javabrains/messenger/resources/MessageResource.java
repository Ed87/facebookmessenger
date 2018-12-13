package org.tshuma.javabrains.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.tshuma.javabrains.messenger.model.Message;
import org.tshuma.javabrains.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
MessageService messageService = new MessageService ();
	
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @Consumes({ MediaType.APPLICATION_JSON })
   
    public List <Message> getMessages(){
    return messageService.getAllMessages();
    }
    
    /*public List<Message> getMessages(@QueryParam ("year") int year, 
    		@QueryParam ("year") int start,
    		@QueryParam ("year") int size) 
    
    {
	if (year> 0) { 
		
		return messageService.getAllMessagesForYear(year);
	}
	if (start >= 0 && size >= 0 ) {
		return messageService.getAllMessagesPaginated(start, size);
	}
	  return messageService.getAllMessages();
   
    }*/
}
