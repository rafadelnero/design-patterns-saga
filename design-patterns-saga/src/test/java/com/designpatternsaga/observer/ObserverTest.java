package com.designpatternsaga.observer;

import org.junit.Assert;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void observerTest() {
        Subject subject = new MessageStream();

        WhatsAppClient whatsAppClient = new WhatsAppClient(subject);
        SlackClient slackClient = new SlackClient(subject);

        slackClient.addMessage("Another new message!");
        Assert.assertEquals("Another new message! - sent from Slack", subject.getState());

        whatsAppClient.addMessage("Here is a new message!");
        Assert.assertEquals("Here is a new message! - sent from WhatsApp", subject.getState());
    }

}
