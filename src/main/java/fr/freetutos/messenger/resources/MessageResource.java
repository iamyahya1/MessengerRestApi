package fr.freetutos.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import fr.freetutos.messenger.model.Message;
import fr.freetutos.messenger.service.MessageService;
import fr.freetutos.messenger.service.MessageServiceImpl;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
public class MessageResource {

	MessageService messageService = new MessageServiceImpl();

	@GET
	public List<Message> getAllMessages() {
		return messageService.getAllMessages();
	}

	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") long id) {
		System.out.println("id = " + id);
		return messageService.getMessage(id);
	}
	

	@POST
	public Message addMessage(Message message) {
		return messageService.createMessage(message);
	}

}
