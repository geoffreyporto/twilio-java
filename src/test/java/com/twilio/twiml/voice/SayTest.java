/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link Say}
 */
public class SayTest {
    @Test
    public void testElementWithParams() {
        Say elem = new Say.Builder("message").voice(Say.Voice.MAN).loop(1).language(Say.Language.DA_DK).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Say language=\"da-DK\" loop=\"1\" voice=\"man\">message</Say>",
            elem.toXml()
        );
    }
}