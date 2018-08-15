package fr.freetutos.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import fr.freetutos.messenger.model.Message;
import fr.freetutos.messenger.service.MessageService;
import fr.freetutos.messenger.service.MessageServiceImpl;

@Path("/messages")
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
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
		return messageService.getMessage(id);
	}
	
	@POST
	public Message addMessage(Message message) {
		return messageService.createMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") long id, Message message) {
		return messageService.updateMessage(id ,message);
	}

	@DELETE
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId") long id) {
		messageService.deleteMessage(id);
	}
	
	@Path("/{messageId}/comments")
	public CommentResource getCommentResource() {
		return new CommentResource();
	}
	
}
