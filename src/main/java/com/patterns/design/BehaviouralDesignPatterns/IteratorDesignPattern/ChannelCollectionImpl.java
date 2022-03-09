package com.patterns.design.BehaviouralDesignPatterns.IteratorDesignPattern;

import java.util.LinkedList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection{

    List<Channel> channelList;

    public ChannelCollectionImpl() {
        this.channelList = new LinkedList<>();
    }

    @Override
    public void addChannel(Channel c) {
        channelList.add(c);
    }

    @Override
    public void removeChannel(Channel c) {
        channelList.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channelList);
    }

    private class ChannelIteratorImpl implements ChannelIterator{

        ChannelTypeEnum type;
        List<Channel> channelList;
        int position;

        public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channelList) {
            this.type = type;
            this.channelList = channelList;
        }

        @Override
        public boolean hasNext() {
            while (position<channelList.size()){
                Channel c= channelList.get(position);
                if(c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)){
                    return true;
                } else {
                    position++;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channelList.get(position);
            position++;
            return c;
        }
    }
}
