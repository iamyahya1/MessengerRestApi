package fr.freetutos.messenger.model;

import java.util.Date;

import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "id", "message", "created", "author" })
@JsonbPropertyOrder({ "id", "message", "created", "author" })
public class Message {

	private long id;
	private String message;
	private Date created;
	private String author;

	/**
	 * 
	 */
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param message
	 * @param created
	 * @param author
	 */
	public Message(long id, String message, Date created, String author) {
		this.id = id;
		this.message = message;
		this.created = created;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Message(" + id + ", " + message + ", " + created + ", " + author + ")";
	}
}
