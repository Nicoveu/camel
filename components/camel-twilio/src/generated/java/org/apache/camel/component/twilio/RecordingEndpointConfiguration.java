
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.Recording}.
 */
@ApiParams(apiName = "recording", description = "",
           apiMethods = {@ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "reader")})
@UriParams
@Configurer
public final class RecordingEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = "deleter,fetcher,reader", description = "The SID of the Account that created the resources to delete")
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = "deleter,fetcher", description = "The unique string that identifies the resource")
    private String pathSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
