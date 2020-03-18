/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account.sip;

import com.twilio.base.Updater;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.net.URI;

public class DomainUpdater extends Updater<Domain> {
    private String pathAccountSid;
    private final String pathSid;
    private String friendlyName;
    private HttpMethod voiceFallbackMethod;
    private URI voiceFallbackUrl;
    private HttpMethod voiceMethod;
    private HttpMethod voiceStatusCallbackMethod;
    private URI voiceStatusCallbackUrl;
    private URI voiceUrl;
    private Boolean sipRegistration;
    private String domainName;
    private Boolean emergencyCallingEnabled;

    /**
     * Construct a new DomainUpdater.
     *
     * @param pathSid The unique string that identifies the resource
     */
    public DomainUpdater(final String pathSid) {
        this.pathSid = pathSid;
    }

    /**
     * Construct a new DomainUpdater.
     *
     * @param pathAccountSid The SID of the Account that created the resource to
     *                       update
     * @param pathSid The unique string that identifies the resource
     */
    public DomainUpdater(final String pathAccountSid,
                         final String pathSid) {
        this.pathAccountSid = pathAccountSid;
        this.pathSid = pathSid;
    }

    /**
     * A descriptive string that you created to describe the resource. It can be up
     * to 64 characters long..
     *
     * @param friendlyName A string to describe the resource
     * @return this
     */
    public DomainUpdater setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * The HTTP method we should use to call `voice_fallback_url`. Can be: `GET` or
     * `POST`..
     *
     * @param voiceFallbackMethod The HTTP method used with voice_fallback_url
     * @return this
     */
    public DomainUpdater setVoiceFallbackMethod(final HttpMethod voiceFallbackMethod) {
        this.voiceFallbackMethod = voiceFallbackMethod;
        return this;
    }

    /**
     * The URL that we should call when an error occurs while retrieving or
     * executing the TwiML requested by `voice_url`..
     *
     * @param voiceFallbackUrl The URL we should call when an error occurs in
     *                         executing TwiML
     * @return this
     */
    public DomainUpdater setVoiceFallbackUrl(final URI voiceFallbackUrl) {
        this.voiceFallbackUrl = voiceFallbackUrl;
        return this;
    }

    /**
     * The URL that we should call when an error occurs while retrieving or
     * executing the TwiML requested by `voice_url`..
     *
     * @param voiceFallbackUrl The URL we should call when an error occurs in
     *                         executing TwiML
     * @return this
     */
    public DomainUpdater setVoiceFallbackUrl(final String voiceFallbackUrl) {
        return setVoiceFallbackUrl(Promoter.uriFromString(voiceFallbackUrl));
    }

    /**
     * The HTTP method we should use to call `voice_url`.
     *
     * @param voiceMethod The HTTP method we should use with voice_url
     * @return this
     */
    public DomainUpdater setVoiceMethod(final HttpMethod voiceMethod) {
        this.voiceMethod = voiceMethod;
        return this;
    }

    /**
     * The HTTP method we should use to call `voice_status_callback_url`. Can be:
     * `GET` or `POST`..
     *
     * @param voiceStatusCallbackMethod The HTTP method we should use to call
     *                                  voice_status_callback_url
     * @return this
     */
    public DomainUpdater setVoiceStatusCallbackMethod(final HttpMethod voiceStatusCallbackMethod) {
        this.voiceStatusCallbackMethod = voiceStatusCallbackMethod;
        return this;
    }

    /**
     * The URL that we should call to pass status parameters (such as call ended) to
     * your application..
     *
     * @param voiceStatusCallbackUrl The URL that we should call to pass status
     *                               updates
     * @return this
     */
    public DomainUpdater setVoiceStatusCallbackUrl(final URI voiceStatusCallbackUrl) {
        this.voiceStatusCallbackUrl = voiceStatusCallbackUrl;
        return this;
    }

    /**
     * The URL that we should call to pass status parameters (such as call ended) to
     * your application..
     *
     * @param voiceStatusCallbackUrl The URL that we should call to pass status
     *                               updates
     * @return this
     */
    public DomainUpdater setVoiceStatusCallbackUrl(final String voiceStatusCallbackUrl) {
        return setVoiceStatusCallbackUrl(Promoter.uriFromString(voiceStatusCallbackUrl));
    }

    /**
     * The URL we should call when the domain receives a call..
     *
     * @param voiceUrl The URL we should call when receiving a call
     * @return this
     */
    public DomainUpdater setVoiceUrl(final URI voiceUrl) {
        this.voiceUrl = voiceUrl;
        return this;
    }

    /**
     * The URL we should call when the domain receives a call..
     *
     * @param voiceUrl The URL we should call when receiving a call
     * @return this
     */
    public DomainUpdater setVoiceUrl(final String voiceUrl) {
        return setVoiceUrl(Promoter.uriFromString(voiceUrl));
    }

    /**
     * Whether to allow SIP Endpoints to register with the domain to receive calls.
     * Can be `true` or `false`. `true` allows SIP Endpoints to register with the
     * domain to receive calls, `false` does not..
     *
     * @param sipRegistration Whether SIP registration is allowed
     * @return this
     */
    public DomainUpdater setSipRegistration(final Boolean sipRegistration) {
        this.sipRegistration = sipRegistration;
        return this;
    }

    /**
     * The unique address you reserve on Twilio to which you route your SIP traffic.
     * Domain names can contain letters, digits, and "-"..
     *
     * @param domainName The unique address on Twilio to route SIP traffic
     * @return this
     */
    public DomainUpdater setDomainName(final String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Whether emergency calling is enabled for the domain. If enabled, allows
     * emergency calls on the domain from phone numbers with validated addresses..
     *
     * @param emergencyCallingEnabled Whether emergency calling is enabled for the
     *                                domain.
     * @return this
     */
    public DomainUpdater setEmergencyCallingEnabled(final Boolean emergencyCallingEnabled) {
        this.emergencyCallingEnabled = emergencyCallingEnabled;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Updated Domain
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Domain update(final TwilioRestClient client) {
        this.pathAccountSid = this.pathAccountSid == null ? client.getAccountSid() : this.pathAccountSid;
        Request request = new Request(
            HttpMethod.POST,
            Domains.API.toString(),
            "/2010-04-01/Accounts/" + this.pathAccountSid + "/SIP/Domains/" + this.pathSid + ".json",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Domain update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }

            throw new ApiException(
                restException.getMessage(),
                restException.getCode(),
                restException.getMoreInfo(),
                restException.getStatus(),
                null
            );
        }

        return Domain.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }

        if (voiceFallbackMethod != null) {
            request.addPostParam("VoiceFallbackMethod", voiceFallbackMethod.toString());
        }

        if (voiceFallbackUrl != null) {
            request.addPostParam("VoiceFallbackUrl", voiceFallbackUrl.toString());
        }

        if (voiceMethod != null) {
            request.addPostParam("VoiceMethod", voiceMethod.toString());
        }

        if (voiceStatusCallbackMethod != null) {
            request.addPostParam("VoiceStatusCallbackMethod", voiceStatusCallbackMethod.toString());
        }

        if (voiceStatusCallbackUrl != null) {
            request.addPostParam("VoiceStatusCallbackUrl", voiceStatusCallbackUrl.toString());
        }

        if (voiceUrl != null) {
            request.addPostParam("VoiceUrl", voiceUrl.toString());
        }

        if (sipRegistration != null) {
            request.addPostParam("SipRegistration", sipRegistration.toString());
        }

        if (domainName != null) {
            request.addPostParam("DomainName", domainName);
        }

        if (emergencyCallingEnabled != null) {
            request.addPostParam("EmergencyCallingEnabled", emergencyCallingEnabled.toString());
        }
    }
}