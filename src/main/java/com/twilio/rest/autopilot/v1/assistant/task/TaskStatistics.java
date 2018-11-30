/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.autopilot.v1.assistant.task;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskStatistics extends Resource {
    private static final long serialVersionUID = 52568493998911L;

    /**
     * Create a TaskStatisticsFetcher to execute fetch.
     * 
     * @param pathAssistantSid The unique ID of the Assistant.
     * @param pathTaskSid The unique ID of the Task associated with this Field.
     * @return TaskStatisticsFetcher capable of executing the fetch
     */
    public static TaskStatisticsFetcher fetcher(final String pathAssistantSid, 
                                                final String pathTaskSid) {
        return new TaskStatisticsFetcher(pathAssistantSid, pathTaskSid);
    }

    /**
     * Converts a JSON String into a TaskStatistics object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return TaskStatistics object represented by the provided JSON
     */
    public static TaskStatistics fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, TaskStatistics.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a TaskStatistics object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return TaskStatistics object represented by the provided JSON
     */
    public static TaskStatistics fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, TaskStatistics.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String assistantSid;
    private final String taskSid;
    private final Integer samplesCount;
    private final Integer fieldsCount;
    private final URI url;

    @JsonCreator
    private TaskStatistics(@JsonProperty("account_sid")
                           final String accountSid, 
                           @JsonProperty("assistant_sid")
                           final String assistantSid, 
                           @JsonProperty("task_sid")
                           final String taskSid, 
                           @JsonProperty("samples_count")
                           final Integer samplesCount, 
                           @JsonProperty("fields_count")
                           final Integer fieldsCount, 
                           @JsonProperty("url")
                           final URI url) {
        this.accountSid = accountSid;
        this.assistantSid = assistantSid;
        this.taskSid = taskSid;
        this.samplesCount = samplesCount;
        this.fieldsCount = fieldsCount;
        this.url = url;
    }

    /**
     * Returns The The unique ID of the Account that created this resource..
     * 
     * @return The unique ID of the Account that created this resource.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The unique ID of the Assistant..
     * 
     * @return The unique ID of the Assistant.
     */
    public final String getAssistantSid() {
        return this.assistantSid;
    }

    /**
     * Returns The The unique ID of the Task associated with this Field..
     * 
     * @return The unique ID of the Task associated with this Field.
     */
    public final String getTaskSid() {
        return this.taskSid;
    }

    /**
     * Returns The The total number of Samples associated with this Task..
     * 
     * @return The total number of Samples associated with this Task.
     */
    public final Integer getSamplesCount() {
        return this.samplesCount;
    }

    /**
     * Returns The The total number of Fields associated with this Task..
     * 
     * @return The total number of Fields associated with this Task.
     */
    public final Integer getFieldsCount() {
        return this.fieldsCount;
    }

    /**
     * Returns The The url.
     * 
     * @return The url
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

        TaskStatistics other = (TaskStatistics) o;

        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(assistantSid, other.assistantSid) && 
               Objects.equals(taskSid, other.taskSid) && 
               Objects.equals(samplesCount, other.samplesCount) && 
               Objects.equals(fieldsCount, other.fieldsCount) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            assistantSid,
                            taskSid,
                            samplesCount,
                            fieldsCount,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("assistantSid", assistantSid)
                          .add("taskSid", taskSid)
                          .add("samplesCount", samplesCount)
                          .add("fieldsCount", fieldsCount)
                          .add("url", url)
                          .toString();
    }
}