package fr.freetutos.messenger.service;

import java.util.Date;
import java.util.List;

import fr.freetutos.messenger.model.Comment;
import fr.freetutos.messenger.model.Message;

public class CommentServiceImpl implements CommentService {

	private MessageService messageService = new MessageServiceImpl();

	@Override
	public Comment createComment(Comment comment, long messageId) {

		Message message = messageService.getMessage(messageId);
		Comment newComment = new Comment();

		newComment.setId(message.getComments().size() + 1);
		newComment.setMessage(comment.getMessage());
		newComment.setAuthor(comment.getAuthor());
		newComment.setCreated(new Date());
		message.getComments().add(newComment);

		return newComment;
	}

	@Override
	public List<Comment> getAllComments(long messageId) {
		Message message =  messageService.getMessage(messageId);
		
		return message.getComments();
	}

}
