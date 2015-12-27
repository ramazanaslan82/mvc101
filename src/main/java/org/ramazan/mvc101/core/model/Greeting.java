package org.ramazan.mvc101.core.model;

public class Greeting {

	private long counter;
	private String text;

	public Greeting() {
		super();
	}

	public Greeting(long counter, String text) {
		this.counter = counter;
		this.text = text;
	}

	public long getCounter() {
		return counter;
	}

	public void setCounter(long counter) {
		this.counter = counter;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
