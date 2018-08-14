package fr.freetutos.messenger.database;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fr.freetutos.messenger.model.Message;

public class MessageData {

		public static List<Message> messages = new ArrayList<>();
		
		public MessageData() {
		}
		
		static {
			messages.add(new Message(1L, "Salut les amis", new Date(), "yahya"));
			messages.add(new Message(2L, "Ceci est un deuxième message", new Date(), "user1"));
			messages.add(new Message(3L, "Et un autre message", new Date(), "user3"));
		}

		public List<Message> getMessages() {
			return messages;
		}

		public void setMessages(List<Message> messages) {
			MessageData.messages = messages;
		}
}
