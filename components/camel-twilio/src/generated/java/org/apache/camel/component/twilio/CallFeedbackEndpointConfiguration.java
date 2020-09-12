
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.call.Feedback}.
 */
@ApiParams(apiName = "call-feedback", description = "",
           apiMethods = {@ApiMethod(methodName = "creator"), @ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "updater")})
@UriParams
@Configurer
public final class CallFeedbackEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = "creator,fetcher,updater", description = "The unique sid that identifies this account")
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = "creator,fetcher,updater", description = "The call sid that uniquely identifies the call")
    private String pathCallSid;
    @UriParam
    @ApiParam(apiMethods = "creator,updater", description = "The call quality expressed as an integer from 1 to 5")
    private Integer qualityScore;

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

    public Integer getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(Integer qualityScore) {
        this.qualityScore = qualityScore;
    }
}
