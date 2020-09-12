
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.conference.Participant}.
 */
@ApiParams(apiName = "conference-participant", description = "",
           apiMethods = {@ApiMethod(methodName = "creator"), @ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "reader"), @ApiMethod(methodName = "updater")})
@UriParams
@Configurer
public final class ConferenceParticipantEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = "creator", description = "The phone number, Client identifier, or username portion of SIP address that made this call.")
    private com.twilio.type.PhoneNumber from;
    @UriParam
    @ApiParam(apiMethods = "creator,deleter,fetcher,reader,updater", description = "The SID of the Account that will create the resource")
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = "deleter,fetcher,updater", description = "The Call SID or URL encoded label of the participant to delete")
    private String pathCallSid;
    @UriParam
    @ApiParam(apiMethods = "creator,deleter,fetcher,reader,updater", description = "The SID of the participant's conference")
    private String pathConferenceSid;
    @UriParam
    @ApiParam(apiMethods = "creator", description = "The phone number, SIP address or Client identifier that received this call.")
    private com.twilio.type.PhoneNumber to;

    public com.twilio.type.PhoneNumber getFrom() {
        return from;
    }

    public void setFrom(com.twilio.type.PhoneNumber from) {
        this.from = from;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathCallSid() {
        return pathCallSid;
    }

    public void setPathCallSid(String pathCallSid) {
        this.pathCallSid = pathCallSid;
    }

    public String getPathConferenceSid() {
        return pathConferenceSid;
    }

    public void setPathConferenceSid(String pathConferenceSid) {
        this.pathConferenceSid = pathConferenceSid;
    }

    public com.twilio.type.PhoneNumber getTo() {
        return to;
    }

    public void setTo(com.twilio.type.PhoneNumber to) {
        this.to = to;
    }
}
