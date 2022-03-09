package com.patterns.design.BehaviouralDesignPatterns.MediatorPattern;

public interface ChatMediator {

	public void sendMessage(String msg, User user);

	void addUser(User user);
}
