package com.patterns.design.BehaviouralDesignPatterns.IteratorDesignPattern;

//collection whose iterator needs to be created
public interface ChannelCollection {

    void addChannel(Channel c);
    void removeChannel(Channel c);
    ChannelIterator iterator(ChannelTypeEnum type);  // method to create iterator
}
