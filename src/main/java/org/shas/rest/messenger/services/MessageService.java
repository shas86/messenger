package org.shas.rest.messenger.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.shas.rest.messenger.database.Database;
import org.shas.rest.messenger.model.Message;

public class MessageService {
	
	private static Map<Long , Message> messages=Database.getMessages();
	public List<Message> getMessages()
	{
		return new ArrayList<Message>(messages.values());
	}
	public Message getMessage(long id)
	{
		return messages.get(id);
	}
	public Message addMessage(Message message)
	{
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;	
	}
	public Message updateMessage(Message message)
	{
		if (message.getId()<=0)
			return null;
		else
		{
			messages.put(message.getId(), message);
			return message;	
		}
		}
	public Message removeMessage(long id)
	{
		return messages.remove(id);
	}

}
