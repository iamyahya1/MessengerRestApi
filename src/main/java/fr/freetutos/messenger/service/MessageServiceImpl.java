package fr.freetutos.messenger.service;

import java.util.List;

import fr.freetutos.messenger.database.MessageData;
import fr.freetutos.messenger.model.Message;

public class MessageServiceImpl implements MessageService {

	MessageData messageData = new MessageData();

	@Override
	public List<Message> getAllMessages() {
		return messageData.getMessages();
	}

	@Override
	public Message createMessage(Message message) {
		Message newMessage = new Message();

		newMessage.setId(messageData.getMessages().size() + 1);
		newMessage.setAuthor(message.getAuthor());
		newMessage.setCreated(message.getCreated());
		newMessage.setMessage(message.getMessage());

		messageData.getMessages().add(newMessage);

		return newMessage;
	}

	@Override
	public Message updateMessage(long id, Message message) {

		for (Message m : messageData.getMessages()) {
			if (m.getId() == id) {
				m.setAuthor(message.getAuthor());
				m.setCreated(message.getCreated());
				m.setMessage(message.getMessage());
				return m;
			}
		}
		return null;
	}

	@Override
	public void deleteMessage(long id) {
		for (Message m : messageData.getMessages()) {
			if (m.getId() == id) {
				messageData.getMessages().remove(m);
			}
		}

	}

	@Override
	public Message getMessage(long id) {

		for (Message m : messageData.getMessages()) {
			if (m.getId() == id) {
				return m;
			}
		}
		return null;
	}

}
