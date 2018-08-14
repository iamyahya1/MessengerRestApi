package fr.freetutos.messenger.service;

import java.util.List;

import fr.freetutos.messenger.model.Message;

public interface MessageService {

	List<Message> getAllMessages();

	Message getMessage(long id);
	
	Message createMessage(Message message);

	Message updateMessage(Message message);

	void deleteMessage(Message message);

}
