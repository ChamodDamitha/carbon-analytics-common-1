/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.analytics.idp.client.core.utils;

/**
 * IdP Client constants.
 */
public class IdPClientConstants {
    public static final String WSO2_SP_TOKEN_1 = "WSO2_SP_TOKEN_1";
    public static final String WSO2_SP_TOKEN_2 = "WSO2_SP_TOKEN_2";
    public static final String WSO2_SP_REFRESH_TOKEN_1 = "WSO2_SP_REFRESH_TOKEN_1";
    public static final String WSO2_SP_REFRESH_TOKEN_2 = "WSO2_SP_REFRESH_TOKEN_2";

    public static final String PASSWORD_GRANT_TYPE = "password";
    public static final String AUTHORIZATION_CODE_GRANT_TYPE = "authorization_code";
    public static final String REFRESH_GRANT_TYPE = "refresh_token";
    public static final String CLIENT_CREDENTIALS_GRANT_TYPE = "client_credentials";

    public static final String SP_AUTH_NAMESPACE = "auth.configs";
    public static final String ENABLE_INTERCEPTOR = "rest.api.enable.auth";
    public static final String EXCLUDE_INTERCEPTOR = "rest.api.exclude";

    public static final String LOGIN_STATUS = "Status";
    public static final String REDIRECTION_URL = "Redirect_Url";
    public static final String CLIENT_ID = "Client_Id";
    public static final String CALLBACK_URL = "Callback_Url";
    public static final String APP_NAME = "App_Name";
    public static final String ACCESS_TOKEN = "Access_Token";
    public static final String REFRESH_TOKEN = "Refresh_Token";
    public static final String AUTH_USER = "UserName";
    public static final String CREATED_AT = "Created_At";
    public static final String VALIDITY_PERIOD = "Validity_Period";
    public static final String REFRESH_VALIDITY_PERIOD = "Refresh_Validity_Period";
    public static final String REMEMBER_ME = "Remember_Me";


    public static final String USERNAME = "Username";
    public static final String PASSWORD = "Password";
    public static final String GRANT_TYPE = "Grant_Type";
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String COOKIE_HEADER = "Cookie";
    public static final String HTTP_ONLY_COOKIE = "HttpOnly";
    public static final String SECURE_COOKIE = "Secure";
    public static final String EXPIRES_COOKIE = "Expires=";

    public static final String BEARER_PREFIX = "Bearer";
    public static final String BASIC_PREFIX = "Basic";

    public static final String ERROR = "Error";
    public static final String ERROR_DESCRIPTION = "Error_Description";

    public static final String SYSTEM_LOGIN = "system";

    private IdPClientConstants() {
    }

    /**
     * Login status constants.
     */
    public static class LoginStatus {
        public static final String LOGIN_SUCCESS = "success";
        public static final String LOGIN_FAILURE = "failure";
        public static final String LOGIN_REDIRECTION = "redirection";
    }

    /**
     * Error constants.
     */
    public static class Error {
        public static final String GRANT_TYPE_NOT_SUPPORTED = "Grant_Type_Not_Supported";
        public static final String INVALID_CREDENTIALS = "Invalid_Credentials";
        public static final String INTERNAL_SERVER_ERROR = "Internal_Server_Error";
    }


}
