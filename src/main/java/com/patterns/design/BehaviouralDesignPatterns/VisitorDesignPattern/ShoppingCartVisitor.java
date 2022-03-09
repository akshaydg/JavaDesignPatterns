package com.patterns.design.BehaviouralDesignPatterns.VisitorDesignPattern;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}
