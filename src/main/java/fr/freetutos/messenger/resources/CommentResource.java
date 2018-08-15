package fr.freetutos.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.freetutos.messenger.model.Comment;
import fr.freetutos.messenger.service.CommentService;
import fr.freetutos.messenger.service.CommentServiceImpl;

@Path("/")
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
public class CommentResource {
	
	private CommentService commentService = new CommentServiceImpl();

	@POST
	public Comment createComment(Comment comment, @PathParam("messageId") long messageId) {
		return commentService.createComment(comment, messageId);
	}
	
	@GET
	public List<Comment> getAllComments(@PathParam("messageId") long messageId){
		return commentService.getAllComments(messageId);
	}
}
