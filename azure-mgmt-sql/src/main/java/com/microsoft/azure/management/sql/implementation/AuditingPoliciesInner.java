/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in AuditingPolicies.
 */
public final class AuditingPoliciesInner {
    /** The Retrofit service to perform REST calls. */
    private AuditingPoliciesService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of AuditingPoliciesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AuditingPoliciesInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(AuditingPoliciesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for AuditingPolicies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AuditingPoliciesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/auditingPolicies/Default")
        Observable<Response<ResponseBody>> createOrUpdateDatabasePolicy(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Query("api-version") String apiVersion, @Body DatabaseAuditingPolicyInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/auditingPolicies/Default")
        Observable<Response<ResponseBody>> getDatabasePolicy(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/auditingPolicies/Default")
        Observable<Response<ResponseBody>> createOrUpdateServerPolicy(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Body ServerAuditingPolicyInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/auditingPolicies/Default")
        Observable<Response<ResponseBody>> getServerPolicy(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Creates or updates an Azure SQL Database auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @param databaseName The name of the Azure SQL Database for which the auditing policy applies.
     * @param parameters The required parameters for creating or updating a Azure SQL Database auditing policy.
     * @return the DatabaseAuditingPolicyInner object if successful.
     */
    public DatabaseAuditingPolicyInner createOrUpdateDatabasePolicy(String resourceGroupName, String serverName, String databaseName, DatabaseAuditingPolicyInner parameters) {
        return createOrUpdateDatabasePolicyWithServiceResponseAsync(resourceGroupName, serverName, databaseName, parameters).toBlocking().single().getBody();
    }

    /**
     * Creates or updates an Azure SQL Database auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @param databaseName The name of the Azure SQL Database for which the auditing policy applies.
     * @param parameters The required parameters for creating or updating a Azure SQL Database auditing policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DatabaseAuditingPolicyInner> createOrUpdateDatabasePolicyAsync(String resourceGroupName, String serverName, String databaseName, DatabaseAuditingPolicyInner parameters, final ServiceCallback<DatabaseAuditingPolicyInner> serviceCallback) {
        return ServiceCall.create(createOrUpdateDatabasePolicyWithServiceResponseAsync(resourceGroupName, serverName, databaseName, parameters), serviceCallback);
    }

    /**
     * Creates or updates an Azure SQL Database auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @param databaseName The name of the Azure SQL Database for which the auditing policy applies.
     * @param parameters The required parameters for creating or updating a Azure SQL Database auditing policy.
     * @return the observable to the DatabaseAuditingPolicyInner object
     */
    public Observable<DatabaseAuditingPolicyInner> createOrUpdateDatabasePolicyAsync(String resourceGroupName, String serverName, String databaseName, DatabaseAuditingPolicyInner parameters) {
        return createOrUpdateDatabasePolicyWithServiceResponseAsync(resourceGroupName, serverName, databaseName, parameters).map(new Func1<ServiceResponse<DatabaseAuditingPolicyInner>, DatabaseAuditingPolicyInner>() {
            @Override
            public DatabaseAuditingPolicyInner call(ServiceResponse<DatabaseAuditingPolicyInner> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Creates or updates an Azure SQL Database auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @param databaseName The name of the Azure SQL Database for which the auditing policy applies.
     * @param parameters The required parameters for creating or updating a Azure SQL Database auditing policy.
     * @return the observable to the DatabaseAuditingPolicyInner object
     */
    public Observable<ServiceResponse<DatabaseAuditingPolicyInner>> createOrUpdateDatabasePolicyWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName, DatabaseAuditingPolicyInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2014-04-01";
        return service.createOrUpdateDatabasePolicy(this.client.subscriptionId(), resourceGroupName, serverName, databaseName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DatabaseAuditingPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<DatabaseAuditingPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DatabaseAuditingPolicyInner> clientResponse = createOrUpdateDatabasePolicyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DatabaseAuditingPolicyInner> createOrUpdateDatabasePolicyDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<DatabaseAuditingPolicyInner, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DatabaseAuditingPolicyInner>() { }.getType())
                .register(201, new TypeToken<DatabaseAuditingPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns an Azure SQL Database auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @param databaseName The name of the Azure SQL Database for which the auditing policy applies.
     * @return the DatabaseAuditingPolicyInner object if successful.
     */
    public DatabaseAuditingPolicyInner getDatabasePolicy(String resourceGroupName, String serverName, String databaseName) {
        return getDatabasePolicyWithServiceResponseAsync(resourceGroupName, serverName, databaseName).toBlocking().single().getBody();
    }

    /**
     * Returns an Azure SQL Database auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @param databaseName The name of the Azure SQL Database for which the auditing policy applies.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DatabaseAuditingPolicyInner> getDatabasePolicyAsync(String resourceGroupName, String serverName, String databaseName, final ServiceCallback<DatabaseAuditingPolicyInner> serviceCallback) {
        return ServiceCall.create(getDatabasePolicyWithServiceResponseAsync(resourceGroupName, serverName, databaseName), serviceCallback);
    }

    /**
     * Returns an Azure SQL Database auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @param databaseName The name of the Azure SQL Database for which the auditing policy applies.
     * @return the observable to the DatabaseAuditingPolicyInner object
     */
    public Observable<DatabaseAuditingPolicyInner> getDatabasePolicyAsync(String resourceGroupName, String serverName, String databaseName) {
        return getDatabasePolicyWithServiceResponseAsync(resourceGroupName, serverName, databaseName).map(new Func1<ServiceResponse<DatabaseAuditingPolicyInner>, DatabaseAuditingPolicyInner>() {
            @Override
            public DatabaseAuditingPolicyInner call(ServiceResponse<DatabaseAuditingPolicyInner> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Returns an Azure SQL Database auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @param databaseName The name of the Azure SQL Database for which the auditing policy applies.
     * @return the observable to the DatabaseAuditingPolicyInner object
     */
    public Observable<ServiceResponse<DatabaseAuditingPolicyInner>> getDatabasePolicyWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        final String apiVersion = "2014-04-01";
        return service.getDatabasePolicy(this.client.subscriptionId(), resourceGroupName, serverName, databaseName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DatabaseAuditingPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<DatabaseAuditingPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DatabaseAuditingPolicyInner> clientResponse = getDatabasePolicyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DatabaseAuditingPolicyInner> getDatabasePolicyDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<DatabaseAuditingPolicyInner, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DatabaseAuditingPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates or updates an Azure SQL Server auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @param parameters The required parameters for createing or updating a Azure SQL Server auditing policy.
     * @return the ServerAuditingPolicyInner object if successful.
     */
    public ServerAuditingPolicyInner createOrUpdateServerPolicy(String resourceGroupName, String serverName, ServerAuditingPolicyInner parameters) {
        return createOrUpdateServerPolicyWithServiceResponseAsync(resourceGroupName, serverName, parameters).toBlocking().single().getBody();
    }

    /**
     * Creates or updates an Azure SQL Server auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @param parameters The required parameters for createing or updating a Azure SQL Server auditing policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<ServerAuditingPolicyInner> createOrUpdateServerPolicyAsync(String resourceGroupName, String serverName, ServerAuditingPolicyInner parameters, final ServiceCallback<ServerAuditingPolicyInner> serviceCallback) {
        return ServiceCall.create(createOrUpdateServerPolicyWithServiceResponseAsync(resourceGroupName, serverName, parameters), serviceCallback);
    }

    /**
     * Creates or updates an Azure SQL Server auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @param parameters The required parameters for createing or updating a Azure SQL Server auditing policy.
     * @return the observable to the ServerAuditingPolicyInner object
     */
    public Observable<ServerAuditingPolicyInner> createOrUpdateServerPolicyAsync(String resourceGroupName, String serverName, ServerAuditingPolicyInner parameters) {
        return createOrUpdateServerPolicyWithServiceResponseAsync(resourceGroupName, serverName, parameters).map(new Func1<ServiceResponse<ServerAuditingPolicyInner>, ServerAuditingPolicyInner>() {
            @Override
            public ServerAuditingPolicyInner call(ServiceResponse<ServerAuditingPolicyInner> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Creates or updates an Azure SQL Server auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @param parameters The required parameters for createing or updating a Azure SQL Server auditing policy.
     * @return the observable to the ServerAuditingPolicyInner object
     */
    public Observable<ServiceResponse<ServerAuditingPolicyInner>> createOrUpdateServerPolicyWithServiceResponseAsync(String resourceGroupName, String serverName, ServerAuditingPolicyInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2014-04-01";
        return service.createOrUpdateServerPolicy(this.client.subscriptionId(), resourceGroupName, serverName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerAuditingPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<ServerAuditingPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerAuditingPolicyInner> clientResponse = createOrUpdateServerPolicyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerAuditingPolicyInner> createOrUpdateServerPolicyDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<ServerAuditingPolicyInner, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<ServerAuditingPolicyInner>() { }.getType())
                .register(201, new TypeToken<ServerAuditingPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns an Azure SQL Server auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @return the ServerAuditingPolicyInner object if successful.
     */
    public ServerAuditingPolicyInner getServerPolicy(String resourceGroupName, String serverName) {
        return getServerPolicyWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().getBody();
    }

    /**
     * Returns an Azure SQL Server auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<ServerAuditingPolicyInner> getServerPolicyAsync(String resourceGroupName, String serverName, final ServiceCallback<ServerAuditingPolicyInner> serviceCallback) {
        return ServiceCall.create(getServerPolicyWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Returns an Azure SQL Server auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @return the observable to the ServerAuditingPolicyInner object
     */
    public Observable<ServerAuditingPolicyInner> getServerPolicyAsync(String resourceGroupName, String serverName) {
        return getServerPolicyWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<ServerAuditingPolicyInner>, ServerAuditingPolicyInner>() {
            @Override
            public ServerAuditingPolicyInner call(ServiceResponse<ServerAuditingPolicyInner> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Returns an Azure SQL Server auditing policy.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @return the observable to the ServerAuditingPolicyInner object
     */
    public Observable<ServiceResponse<ServerAuditingPolicyInner>> getServerPolicyWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        final String apiVersion = "2014-04-01";
        return service.getServerPolicy(this.client.subscriptionId(), resourceGroupName, serverName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerAuditingPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<ServerAuditingPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerAuditingPolicyInner> clientResponse = getServerPolicyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerAuditingPolicyInner> getServerPolicyDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<ServerAuditingPolicyInner, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<ServerAuditingPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}