package fr.freetutos.messenger.service;

import java.util.List;

import fr.freetutos.messenger.model.Comment;

public interface CommentService {
	
	Comment createComment(Comment comment, long messageId);
	
	List<Comment> getAllComments(long messageId);


}
