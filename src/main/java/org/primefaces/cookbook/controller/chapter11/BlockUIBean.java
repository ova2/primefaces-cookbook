package org.primefaces.cookbook.controller.chapter11;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * BlockUIBean
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@ViewScoped
public class BlockUIBean implements Serializable {

	private List<Message> messages;

	@PostConstruct
	private void initialize() {
		if (messages == null) {
			messages = new ArrayList<Message>();

			for (int i = 0; i < 100; i++) {
				Message message = new Message();
				message.setSubject("subject " + i);
				message.setText("text " + i);
				messages.add(message);
			}
		}
	}

	public void doSomething() {
		try {
			// simulate a long running request
			Thread.sleep(1500);
		} catch (Exception e) {
			// ignore
		}
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(final List<Message> messages) {
		this.messages = messages;
	}

	public class Message implements Serializable {

		private String subject;
		private String text;
		private long time;

		public Message() {
			time = System.currentTimeMillis() + (long) (Math.random() * 10);
		}

		public final String getSubject() {
			return subject;
		}

		public final void setSubject(String subject) {
			this.subject = subject;
		}

		public final String getText() {
			return text;
		}

		public final void setText(String text) {
			this.text = text;
		}

		public long getTime() {
			return time;
		}

		public void setTime(long time) {
			this.time = time;
		}
	}
}
