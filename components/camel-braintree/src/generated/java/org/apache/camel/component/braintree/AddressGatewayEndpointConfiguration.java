
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.braintreegateway.AddressGateway}.
 */
@ApiParams(apiName = "address", description = "Provides methods to create, delete, find, and update Address objects",
           apiMethods = {@ApiMethod(methodName = "create"), @ApiMethod(methodName = "delete"), @ApiMethod(methodName = "find"), @ApiMethod(methodName = "update")})
@UriParams
@Configurer
public final class AddressGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    @ApiParam(apiMethods = "create,delete,find,update", description = "The id of the Customer")
    private String customerId;
    @UriParam
    @ApiParam(apiMethods = "delete,find,update", description = "The id of the Address to delete")
    private String id;
    @UriParam
    @ApiParam(apiMethods = "create,update", description = "The request object")
    private com.braintreegateway.AddressRequest request;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.braintreegateway.AddressRequest getRequest() {
        return request;
    }

    public void setRequest(com.braintreegateway.AddressRequest request) {
        this.request = request;
    }
}
