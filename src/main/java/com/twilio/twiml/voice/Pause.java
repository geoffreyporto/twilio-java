/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.twilio.twiml.TwiML;

import java.util.HashMap;
import java.util.Map;

/**
 * TwiML wrapper for {@code <Pause>}
 */
public class Pause extends TwiML {
    private final Integer length;

    /**
     * For XML Serialization/Deserialization
     */
    private Pause() {
        this(new Builder());
    }

    /**
     * Create a new {@code <Pause>} element
     */
    private Pause(Builder b) {
        super("Pause", b);
        this.length = b.length;
    }

    /**
     * Attributes to set on the generated XML element
     *
     * @return A Map of attribute keys to values
     */
    protected Map<String, String> getElementAttributes() {
        // Preserve order of attributes
        Map<String, String> attrs = new HashMap<>();

        if (this.getLength() != null) {
            attrs.put("length", this.getLength().toString());
        }

        return attrs;
    }

    /**
     * Length in seconds to pause
     *
     * @return Length in seconds to pause
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Create a new {@code <Pause>} element
     */
    public static class Builder extends TwiML.Builder<Builder> {
        private Integer length;

        /**
         * Length in seconds to pause
         */
        public Builder length(Integer length) {
            this.length = length;
            return this;
        }

        /**
         * Create and return resulting {@code <Pause>} element
         */
        public Pause build() {
            return new Pause(this);
        }
    }
}