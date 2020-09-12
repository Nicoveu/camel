
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.Application}.
 */
@ApiParams(apiName = "application", description = "",
           apiMethods = {@ApiMethod(methodName = "creator"), @ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "reader"), @ApiMethod(methodName = "updater")})
@UriParams
@Configurer
public final class ApplicationEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = "creator,deleter,fetcher,reader,updater", description = "The SID of the Account that will create the resource")
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = "deleter,fetcher,updater", description = "The unique string that identifies the resource")
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
