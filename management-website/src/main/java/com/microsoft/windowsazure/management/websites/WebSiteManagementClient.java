/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.websites;

import com.microsoft.windowsazure.core.FilterableService;
import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.credentials.SubscriptionCloudCredentials;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.websites.models.WebSiteOperationStatusResponse;
import java.io.IOException;
import java.net.URI;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
* The Windows Azure Web Sites management API provides a RESTful set of web
* services that interact with Windows Azure Web Sites service to manage your
* web sites. The API has entities that capture the relationship between an end
* user and the Windows Azure Web Sites service.  (see
* http://msdn.microsoft.com/en-us/library/windowsazure/dn166981.aspx for more
* information)
*/
public interface WebSiteManagementClient extends FilterableService<WebSiteManagementClient> {
    /**
    * The URI used as the base for all Service Management requests.
    * @return The BaseUri value.
    */
    URI getBaseUri();
    
    /**
    * When you create a Windows Azure subscription, it is uniquely identified
    * by a subscription ID. The subscription ID forms part of the URI for
    * every call that you make to the Service Management API.  The Windows
    * Azure Service ManagementAPI use mutual authentication of management
    * certificates over SSL to ensure that a request made to the service is
    * secure.  No anonymous requests are allowed.
    * @return The Credentials value.
    */
    SubscriptionCloudCredentials getCredentials();
    
    /**
    * Operations for managing the server farm in a web space.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn194277.aspx for
    * more information)
    * @return The ServerFarmsOperations value.
    */
    ServerFarmOperations getServerFarmsOperations();
    
    /**
    * Operations for managing the web sites in a web space.
    * @return The WebSitesOperations value.
    */
    WebSiteOperations getWebSitesOperations();
    
    /**
    * Operations for managing web spaces beneath your subscription.
    * @return The WebSpacesOperations value.
    */
    WebSpaceOperations getWebSpacesOperations();
    
    /**
    * The Get Operation Status operation returns the status of thespecified
    * operation. After calling a long-running operation, you can call Get
    * Operation Status to determine whether the operation has succeeded,
    * failed, timed out, or is still in progress.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460783.aspx for
    * more information)
    *
    * @param webSpaceName Required. The name of the webspace for the website
    * where the operation was targeted.
    * @param siteName Required. The name of the site where the operation was
    * targeted.
    * @param operationId Required. The operation ID for the operation you wish
    * to track. The operation ID is returned in the Id field in the body of
    * the response for long-running operations.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The response body contains the status of the specified
    * long-running operation, indicating whether it has succeeded, is
    * inprogress, has time dout, or has failed. Note that this status is
    * distinct from the HTTP status code returned for the Get Operation Status
    * operation itself.  If the long-running operation failed, the response
    * body includes error information regarding the failure.
    */
    WebSiteOperationStatusResponse getOperationStatus(String webSpaceName, String siteName, String operationId) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * The Get Operation Status operation returns the status of thespecified
    * operation. After calling a long-running operation, you can call Get
    * Operation Status to determine whether the operation has succeeded,
    * failed, timed out, or is still in progress.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460783.aspx for
    * more information)
    *
    * @param webSpaceName Required. The name of the webspace for the website
    * where the operation was targeted.
    * @param siteName Required. The name of the site where the operation was
    * targeted.
    * @param operationId Required. The operation ID for the operation you wish
    * to track. The operation ID is returned in the Id field in the body of
    * the response for long-running operations.
    * @return The response body contains the status of the specified
    * long-running operation, indicating whether it has succeeded, is
    * inprogress, has time dout, or has failed. Note that this status is
    * distinct from the HTTP status code returned for the Get Operation Status
    * operation itself.  If the long-running operation failed, the response
    * body includes error information regarding the failure.
    */
    Future<WebSiteOperationStatusResponse> getOperationStatusAsync(String webSpaceName, String siteName, String operationId);
    
    /**
    * Register your subscription to use Windows Azure Web Sites.
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse registerSubscription() throws IOException, ServiceException;
    
    /**
    * Register your subscription to use Windows Azure Web Sites.
    *
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> registerSubscriptionAsync();
    
    /**
    * Unregister your subscription to use Windows Azure Web Sites.
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse unregisterSubscription() throws IOException, ServiceException;
    
    /**
    * Unregister your subscription to use Windows Azure Web Sites.
    *
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> unregisterSubscriptionAsync();
}
