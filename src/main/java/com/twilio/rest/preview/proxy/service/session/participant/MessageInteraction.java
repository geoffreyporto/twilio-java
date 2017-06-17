/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.proxy.service.session.participant;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageInteraction extends Resource {
    private static final long serialVersionUID = 205504595065116L;

    public enum Status {
        COMPLETED("completed"),
        IN_PROGRESS("in-progress"),
        FAILED("failed");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Status from a string.
         * @param value string value
         * @return generated Status
         */
        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }

    public enum ResourceStatus {
        QUEUED("queued"),
        SENDING("sending"),
        SENT("sent"),
        FAILED("failed"),
        DELIVERED("delivered"),
        UNDELIVERED("undelivered");

        private final String value;

        private ResourceStatus(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a ResourceStatus from a string.
         * @param value string value
         * @return generated ResourceStatus
         */
        @JsonCreator
        public static ResourceStatus forValue(final String value) {
            return Promoter.enumFromString(value, ResourceStatus.values());
        }
    }

    /**
     * Create a MessageInteractionCreator to execute create.
     * 
     * @param pathServiceSid The service_sid
     * @param pathSessionSid The session_sid
     * @param pathParticipantSid The participant_sid
     * @param body The body of the message. Up to 1600 characters long.
     * @return MessageInteractionCreator capable of executing the create
     */
    public static MessageInteractionCreator creator(final String pathServiceSid, 
                                                    final String pathSessionSid, 
                                                    final String pathParticipantSid, 
                                                    final String body) {
        return new MessageInteractionCreator(pathServiceSid, pathSessionSid, pathParticipantSid, body);
    }

    /**
     * Create a MessageInteractionCreator to execute create.
     * 
     * @param pathServiceSid The service_sid
     * @param pathSessionSid The session_sid
     * @param pathParticipantSid The participant_sid
     * @param mediaUrl The url of an image or video.
     * @return MessageInteractionCreator capable of executing the create
     */
    public static MessageInteractionCreator creator(final String pathServiceSid, 
                                                    final String pathSessionSid, 
                                                    final String pathParticipantSid, 
                                                    final List<URI> mediaUrl) {
        return new MessageInteractionCreator(pathServiceSid, pathSessionSid, pathParticipantSid, mediaUrl);
    }

    /**
     * Create a MessageInteractionFetcher to execute fetch.
     * 
     * @param pathServiceSid Service Sid.
     * @param pathSessionSid Session Sid.
     * @param pathParticipantSid Participant Sid.
     * @param pathSid A string that uniquely identifies this Interaction.
     * @return MessageInteractionFetcher capable of executing the fetch
     */
    public static MessageInteractionFetcher fetcher(final String pathServiceSid, 
                                                    final String pathSessionSid, 
                                                    final String pathParticipantSid, 
                                                    final String pathSid) {
        return new MessageInteractionFetcher(pathServiceSid, pathSessionSid, pathParticipantSid, pathSid);
    }

    /**
     * Create a MessageInteractionReader to execute read.
     * 
     * @param pathServiceSid Service Sid.
     * @param pathSessionSid Session Sid.
     * @param pathParticipantSid Participant Sid.
     * @return MessageInteractionReader capable of executing the read
     */
    public static MessageInteractionReader reader(final String pathServiceSid, 
                                                  final String pathSessionSid, 
                                                  final String pathParticipantSid) {
        return new MessageInteractionReader(pathServiceSid, pathSessionSid, pathParticipantSid);
    }

    /**
     * Converts a JSON String into a MessageInteraction object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return MessageInteraction object represented by the provided JSON
     */
    public static MessageInteraction fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, MessageInteraction.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a MessageInteraction object using the
     * provided ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return MessageInteraction object represented by the provided JSON
     */
    public static MessageInteraction fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, MessageInteraction.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String sessionSid;
    private final String serviceSid;
    private final String accountSid;
    private final String data;
    private final MessageInteraction.Status status;
    private final String participantSid;
    private final String inboundParticipantSid;
    private final String inboundResourceSid;
    private final MessageInteraction.ResourceStatus inboundResourceStatus;
    private final String inboundResourceType;
    private final URI inboundResourceUrl;
    private final String outboundParticipantSid;
    private final String outboundResourceSid;
    private final MessageInteraction.ResourceStatus outboundResourceStatus;
    private final String outboundResourceType;
    private final URI outboundResourceUrl;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private MessageInteraction(@JsonProperty("sid")
                               final String sid, 
                               @JsonProperty("session_sid")
                               final String sessionSid, 
                               @JsonProperty("service_sid")
                               final String serviceSid, 
                               @JsonProperty("account_sid")
                               final String accountSid, 
                               @JsonProperty("data")
                               final String data, 
                               @JsonProperty("status")
                               final MessageInteraction.Status status, 
                               @JsonProperty("participant_sid")
                               final String participantSid, 
                               @JsonProperty("inbound_participant_sid")
                               final String inboundParticipantSid, 
                               @JsonProperty("inbound_resource_sid")
                               final String inboundResourceSid, 
                               @JsonProperty("inbound_resource_status")
                               final MessageInteraction.ResourceStatus inboundResourceStatus, 
                               @JsonProperty("inbound_resource_type")
                               final String inboundResourceType, 
                               @JsonProperty("inbound_resource_url")
                               final URI inboundResourceUrl, 
                               @JsonProperty("outbound_participant_sid")
                               final String outboundParticipantSid, 
                               @JsonProperty("outbound_resource_sid")
                               final String outboundResourceSid, 
                               @JsonProperty("outbound_resource_status")
                               final MessageInteraction.ResourceStatus outboundResourceStatus, 
                               @JsonProperty("outbound_resource_type")
                               final String outboundResourceType, 
                               @JsonProperty("outbound_resource_url")
                               final URI outboundResourceUrl, 
                               @JsonProperty("date_created")
                               final String dateCreated, 
                               @JsonProperty("date_updated")
                               final String dateUpdated, 
                               @JsonProperty("url")
                               final URI url) {
        this.sid = sid;
        this.sessionSid = sessionSid;
        this.serviceSid = serviceSid;
        this.accountSid = accountSid;
        this.data = data;
        this.status = status;
        this.participantSid = participantSid;
        this.inboundParticipantSid = inboundParticipantSid;
        this.inboundResourceSid = inboundResourceSid;
        this.inboundResourceStatus = inboundResourceStatus;
        this.inboundResourceType = inboundResourceType;
        this.inboundResourceUrl = inboundResourceUrl;
        this.outboundParticipantSid = outboundParticipantSid;
        this.outboundResourceSid = outboundResourceSid;
        this.outboundResourceStatus = outboundResourceStatus;
        this.outboundResourceType = outboundResourceType;
        this.outboundResourceUrl = outboundResourceUrl;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
    }

    /**
     * Returns The A string that uniquely identifies this Interaction..
     * 
     * @return A string that uniquely identifies this Interaction.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The Session Sid..
     * 
     * @return Session Sid.
     */
    public final String getSessionSid() {
        return this.sessionSid;
    }

    /**
     * Returns The Service Sid..
     * 
     * @return Service Sid.
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns The Account Sid..
     * 
     * @return Account Sid.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The What happened in this Interaction..
     * 
     * @return What happened in this Interaction.
     */
    public final String getData() {
        return this.data;
    }

    /**
     * Returns The The Status of this Interaction.
     * 
     * @return The Status of this Interaction
     */
    public final MessageInteraction.Status getStatus() {
        return this.status;
    }

    /**
     * Returns The The participant_sid.
     * 
     * @return The participant_sid
     */
    public final String getParticipantSid() {
        return this.participantSid;
    }

    /**
     * Returns The The inbound_participant_sid.
     * 
     * @return The inbound_participant_sid
     */
    public final String getInboundParticipantSid() {
        return this.inboundParticipantSid;
    }

    /**
     * Returns The The SID of the inbound resource..
     * 
     * @return The SID of the inbound resource.
     */
    public final String getInboundResourceSid() {
        return this.inboundResourceSid;
    }

    /**
     * Returns The The Inbound Resource Status of this Interaction.
     * 
     * @return The Inbound Resource Status of this Interaction
     */
    public final MessageInteraction.ResourceStatus getInboundResourceStatus() {
        return this.inboundResourceStatus;
    }

    /**
     * Returns The The Twilio object type of the inbound resource..
     * 
     * @return The Twilio object type of the inbound resource.
     */
    public final String getInboundResourceType() {
        return this.inboundResourceType;
    }

    /**
     * Returns The The URL of the inbound resource..
     * 
     * @return The URL of the inbound resource.
     */
    public final URI getInboundResourceUrl() {
        return this.inboundResourceUrl;
    }

    /**
     * Returns The The outbound_participant_sid.
     * 
     * @return The outbound_participant_sid
     */
    public final String getOutboundParticipantSid() {
        return this.outboundParticipantSid;
    }

    /**
     * Returns The The SID of the outbound resource..
     * 
     * @return The SID of the outbound resource.
     */
    public final String getOutboundResourceSid() {
        return this.outboundResourceSid;
    }

    /**
     * Returns The The Outbound Resource Status of this Interaction.
     * 
     * @return The Outbound Resource Status of this Interaction
     */
    public final MessageInteraction.ResourceStatus getOutboundResourceStatus() {
        return this.outboundResourceStatus;
    }

    /**
     * Returns The The Twilio object type of the outbound resource..
     * 
     * @return The Twilio object type of the outbound resource.
     */
    public final String getOutboundResourceType() {
        return this.outboundResourceType;
    }

    /**
     * Returns The The URL of the outbound resource..
     * 
     * @return The URL of the outbound resource.
     */
    public final URI getOutboundResourceUrl() {
        return this.outboundResourceUrl;
    }

    /**
     * Returns The The date this Interaction was created.
     * 
     * @return The date this Interaction was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date this Interaction was updated.
     * 
     * @return The date this Interaction was updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The URL of this Interaction..
     * 
     * @return The URL of this Interaction.
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MessageInteraction other = (MessageInteraction) o;

        return Objects.equals(sid, other.sid) && 
               Objects.equals(sessionSid, other.sessionSid) && 
               Objects.equals(serviceSid, other.serviceSid) && 
               Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(data, other.data) && 
               Objects.equals(status, other.status) && 
               Objects.equals(participantSid, other.participantSid) && 
               Objects.equals(inboundParticipantSid, other.inboundParticipantSid) && 
               Objects.equals(inboundResourceSid, other.inboundResourceSid) && 
               Objects.equals(inboundResourceStatus, other.inboundResourceStatus) && 
               Objects.equals(inboundResourceType, other.inboundResourceType) && 
               Objects.equals(inboundResourceUrl, other.inboundResourceUrl) && 
               Objects.equals(outboundParticipantSid, other.outboundParticipantSid) && 
               Objects.equals(outboundResourceSid, other.outboundResourceSid) && 
               Objects.equals(outboundResourceStatus, other.outboundResourceStatus) && 
               Objects.equals(outboundResourceType, other.outboundResourceType) && 
               Objects.equals(outboundResourceUrl, other.outboundResourceUrl) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            sessionSid,
                            serviceSid,
                            accountSid,
                            data,
                            status,
                            participantSid,
                            inboundParticipantSid,
                            inboundResourceSid,
                            inboundResourceStatus,
                            inboundResourceType,
                            inboundResourceUrl,
                            outboundParticipantSid,
                            outboundResourceSid,
                            outboundResourceStatus,
                            outboundResourceType,
                            outboundResourceUrl,
                            dateCreated,
                            dateUpdated,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("sessionSid", sessionSid)
                          .add("serviceSid", serviceSid)
                          .add("accountSid", accountSid)
                          .add("data", data)
                          .add("status", status)
                          .add("participantSid", participantSid)
                          .add("inboundParticipantSid", inboundParticipantSid)
                          .add("inboundResourceSid", inboundResourceSid)
                          .add("inboundResourceStatus", inboundResourceStatus)
                          .add("inboundResourceType", inboundResourceType)
                          .add("inboundResourceUrl", inboundResourceUrl)
                          .add("outboundParticipantSid", outboundParticipantSid)
                          .add("outboundResourceSid", outboundResourceSid)
                          .add("outboundResourceStatus", outboundResourceStatus)
                          .add("outboundResourceType", outboundResourceType)
                          .add("outboundResourceUrl", outboundResourceUrl)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("url", url)
                          .toString();
    }
}