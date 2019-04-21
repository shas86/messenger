package org.shas.rest.messenger.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.shas.rest.messenger.database.Database;
import org.shas.rest.messenger.model.Message;
import org.shas.rest.messenger.services.MessageService;

@Path("messages")
public class MessageResource {
	
	
	
	MessageService m=new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getAllmessages()
	{
		return m.getMessages();
	}
	
	}
	
	
	


