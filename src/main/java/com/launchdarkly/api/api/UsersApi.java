/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.4
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.api;

import com.launchdarkly.api.ApiCallback;
import com.launchdarkly.api.ApiClient;
import com.launchdarkly.api.ApiException;
import com.launchdarkly.api.ApiResponse;
import com.launchdarkly.api.Configuration;
import com.launchdarkly.api.Pair;
import com.launchdarkly.api.ProgressRequestBody;
import com.launchdarkly.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;
import com.launchdarkly.api.model.User;
import com.launchdarkly.api.model.Users;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteUser
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteUserCall(String projectKey, String environmentKey, String userKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{projectKey}/{environmentKey}/{userKey}"
            .replaceAll("\\{" + "projectKey" + "\\}", apiClient.escapeString(projectKey.toString()))
            .replaceAll("\\{" + "environmentKey" + "\\}", apiClient.escapeString(environmentKey.toString()))
            .replaceAll("\\{" + "userKey" + "\\}", apiClient.escapeString(userKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Token" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteUserValidateBeforeCall(String projectKey, String environmentKey, String userKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new ApiException("Missing the required parameter 'projectKey' when calling deleteUser(Async)");
        }
        
        // verify the required parameter 'environmentKey' is set
        if (environmentKey == null) {
            throw new ApiException("Missing the required parameter 'environmentKey' when calling deleteUser(Async)");
        }
        
        // verify the required parameter 'userKey' is set
        if (userKey == null) {
            throw new ApiException("Missing the required parameter 'userKey' when calling deleteUser(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteUserCall(projectKey, environmentKey, userKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a user by ID.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteUser(String projectKey, String environmentKey, String userKey) throws ApiException {
        deleteUserWithHttpInfo(projectKey, environmentKey, userKey);
    }

    /**
     * Delete a user by ID.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteUserWithHttpInfo(String projectKey, String environmentKey, String userKey) throws ApiException {
        com.squareup.okhttp.Call call = deleteUserValidateBeforeCall(projectKey, environmentKey, userKey, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a user by ID. (asynchronously)
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUserAsync(String projectKey, String environmentKey, String userKey, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteUserValidateBeforeCall(projectKey, environmentKey, userKey, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getSearchUsers
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param q Search query. (optional)
     * @param limit Pagination limit. (optional)
     * @param offset Specifies the first item to return in the collection. (optional)
     * @param after A timestamp filter, expressed as a Unix epoch time in milliseconds. All entries returned will have occured after this timestamp. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSearchUsersCall(String projectKey, String environmentKey, String q, Integer limit, Integer offset, BigDecimal after, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user-search/{projectKey}/{environmentKey}"
            .replaceAll("\\{" + "projectKey" + "\\}", apiClient.escapeString(projectKey.toString()))
            .replaceAll("\\{" + "environmentKey" + "\\}", apiClient.escapeString(environmentKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (after != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("after", after));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSearchUsersValidateBeforeCall(String projectKey, String environmentKey, String q, Integer limit, Integer offset, BigDecimal after, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new ApiException("Missing the required parameter 'projectKey' when calling getSearchUsers(Async)");
        }
        
        // verify the required parameter 'environmentKey' is set
        if (environmentKey == null) {
            throw new ApiException("Missing the required parameter 'environmentKey' when calling getSearchUsers(Async)");
        }
        

        com.squareup.okhttp.Call call = getSearchUsersCall(projectKey, environmentKey, q, limit, offset, after, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search users in LaunchDarkly based on their last active date, or a search query. It should not be used to enumerate all users in LaunchDarkly-- use the List users API resource.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param q Search query. (optional)
     * @param limit Pagination limit. (optional)
     * @param offset Specifies the first item to return in the collection. (optional)
     * @param after A timestamp filter, expressed as a Unix epoch time in milliseconds. All entries returned will have occured after this timestamp. (optional)
     * @return Users
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Users getSearchUsers(String projectKey, String environmentKey, String q, Integer limit, Integer offset, BigDecimal after) throws ApiException {
        ApiResponse<Users> resp = getSearchUsersWithHttpInfo(projectKey, environmentKey, q, limit, offset, after);
        return resp.getData();
    }

    /**
     * Search users in LaunchDarkly based on their last active date, or a search query. It should not be used to enumerate all users in LaunchDarkly-- use the List users API resource.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param q Search query. (optional)
     * @param limit Pagination limit. (optional)
     * @param offset Specifies the first item to return in the collection. (optional)
     * @param after A timestamp filter, expressed as a Unix epoch time in milliseconds. All entries returned will have occured after this timestamp. (optional)
     * @return ApiResponse&lt;Users&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Users> getSearchUsersWithHttpInfo(String projectKey, String environmentKey, String q, Integer limit, Integer offset, BigDecimal after) throws ApiException {
        com.squareup.okhttp.Call call = getSearchUsersValidateBeforeCall(projectKey, environmentKey, q, limit, offset, after, null, null);
        Type localVarReturnType = new TypeToken<Users>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search users in LaunchDarkly based on their last active date, or a search query. It should not be used to enumerate all users in LaunchDarkly-- use the List users API resource. (asynchronously)
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param q Search query. (optional)
     * @param limit Pagination limit. (optional)
     * @param offset Specifies the first item to return in the collection. (optional)
     * @param after A timestamp filter, expressed as a Unix epoch time in milliseconds. All entries returned will have occured after this timestamp. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSearchUsersAsync(String projectKey, String environmentKey, String q, Integer limit, Integer offset, BigDecimal after, final ApiCallback<Users> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSearchUsersValidateBeforeCall(projectKey, environmentKey, q, limit, offset, after, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Users>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUser
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserCall(String projectKey, String environmentKey, String userKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{projectKey}/{environmentKey}/{userKey}"
            .replaceAll("\\{" + "projectKey" + "\\}", apiClient.escapeString(projectKey.toString()))
            .replaceAll("\\{" + "environmentKey" + "\\}", apiClient.escapeString(environmentKey.toString()))
            .replaceAll("\\{" + "userKey" + "\\}", apiClient.escapeString(userKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUserValidateBeforeCall(String projectKey, String environmentKey, String userKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new ApiException("Missing the required parameter 'projectKey' when calling getUser(Async)");
        }
        
        // verify the required parameter 'environmentKey' is set
        if (environmentKey == null) {
            throw new ApiException("Missing the required parameter 'environmentKey' when calling getUser(Async)");
        }
        
        // verify the required parameter 'userKey' is set
        if (userKey == null) {
            throw new ApiException("Missing the required parameter 'userKey' when calling getUser(Async)");
        }
        

        com.squareup.okhttp.Call call = getUserCall(projectKey, environmentKey, userKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a user by key.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @return User
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public User getUser(String projectKey, String environmentKey, String userKey) throws ApiException {
        ApiResponse<User> resp = getUserWithHttpInfo(projectKey, environmentKey, userKey);
        return resp.getData();
    }

    /**
     * Get a user by key.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @return ApiResponse&lt;User&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<User> getUserWithHttpInfo(String projectKey, String environmentKey, String userKey) throws ApiException {
        com.squareup.okhttp.Call call = getUserValidateBeforeCall(projectKey, environmentKey, userKey, null, null);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a user by key. (asynchronously)
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param userKey The user&#39;s key. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserAsync(String projectKey, String environmentKey, String userKey, final ApiCallback<User> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getUserValidateBeforeCall(projectKey, environmentKey, userKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsers
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param limit Pagination limit. (optional)
     * @param h This parameter is required when following \&quot;next\&quot; links. (optional)
     * @param scrollId This parameter is required when following \&quot;next\&quot; links. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUsersCall(String projectKey, String environmentKey, Integer limit, String h, String scrollId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{projectKey}/{environmentKey}"
            .replaceAll("\\{" + "projectKey" + "\\}", apiClient.escapeString(projectKey.toString()))
            .replaceAll("\\{" + "environmentKey" + "\\}", apiClient.escapeString(environmentKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (h != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("h", h));
        if (scrollId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("scrollId", scrollId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUsersValidateBeforeCall(String projectKey, String environmentKey, Integer limit, String h, String scrollId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new ApiException("Missing the required parameter 'projectKey' when calling getUsers(Async)");
        }
        
        // verify the required parameter 'environmentKey' is set
        if (environmentKey == null) {
            throw new ApiException("Missing the required parameter 'environmentKey' when calling getUsers(Async)");
        }
        

        com.squareup.okhttp.Call call = getUsersCall(projectKey, environmentKey, limit, h, scrollId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List all users in the environment. Includes the total count of users. In each page, there will be up to &#39;limit&#39; users returned (default 20). This is useful for exporting all users in the system for further analysis. Paginated collections will include a next link containing a URL with the next set of elements in the collection.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param limit Pagination limit. (optional)
     * @param h This parameter is required when following \&quot;next\&quot; links. (optional)
     * @param scrollId This parameter is required when following \&quot;next\&quot; links. (optional)
     * @return Users
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Users getUsers(String projectKey, String environmentKey, Integer limit, String h, String scrollId) throws ApiException {
        ApiResponse<Users> resp = getUsersWithHttpInfo(projectKey, environmentKey, limit, h, scrollId);
        return resp.getData();
    }

    /**
     * List all users in the environment. Includes the total count of users. In each page, there will be up to &#39;limit&#39; users returned (default 20). This is useful for exporting all users in the system for further analysis. Paginated collections will include a next link containing a URL with the next set of elements in the collection.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param limit Pagination limit. (optional)
     * @param h This parameter is required when following \&quot;next\&quot; links. (optional)
     * @param scrollId This parameter is required when following \&quot;next\&quot; links. (optional)
     * @return ApiResponse&lt;Users&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Users> getUsersWithHttpInfo(String projectKey, String environmentKey, Integer limit, String h, String scrollId) throws ApiException {
        com.squareup.okhttp.Call call = getUsersValidateBeforeCall(projectKey, environmentKey, limit, h, scrollId, null, null);
        Type localVarReturnType = new TypeToken<Users>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all users in the environment. Includes the total count of users. In each page, there will be up to &#39;limit&#39; users returned (default 20). This is useful for exporting all users in the system for further analysis. Paginated collections will include a next link containing a URL with the next set of elements in the collection. (asynchronously)
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key, used to tie together flag configuration and users under one environment so they can be managed together. (required)
     * @param limit Pagination limit. (optional)
     * @param h This parameter is required when following \&quot;next\&quot; links. (optional)
     * @param scrollId This parameter is required when following \&quot;next\&quot; links. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUsersAsync(String projectKey, String environmentKey, Integer limit, String h, String scrollId, final ApiCallback<Users> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getUsersValidateBeforeCall(projectKey, environmentKey, limit, h, scrollId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Users>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
