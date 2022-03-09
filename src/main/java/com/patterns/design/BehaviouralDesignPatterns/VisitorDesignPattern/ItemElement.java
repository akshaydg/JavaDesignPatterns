package com.patterns.design.BehaviouralDesignPatterns.VisitorDesignPattern;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
