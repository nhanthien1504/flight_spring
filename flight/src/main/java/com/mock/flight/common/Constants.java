package com.mock.flight.common;

public class Constants {

    //Date time format
    public static final String DATE_FORMAT = "yyyy-MM-dd";

    // Constants for JWT
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_JSON = "application/json";
    public static final String CURRENT_SESISSION = "CURRENT_SESISSION";
    public static final String CHECK_AUTH = "CHECK_AUTH";
    // Constants for JWT exception
    public static final String USER_NOT_FOUND = "User not found with user name: ";
    public static final String INVALID_JWT_SIGNATURE = "Invalid JWT signature: {0}";
    public static final String INVALID_JWT_TOKEN = "Invalid JWT token: {0}";
    public static final String JWT_EXPIRED = "JWT token is expired: {0}";
    public static final String JWT_UNSUPPORTED = "JWT token is unsupported: {0}";
    public static final String JWT_CLAIMS_STRING_EMPTY = "JWT claims string is empty: {0}";
    public static final String NOTICE_NOT_EXISTED = "The given notice did not existed in system !";
    public static final String NOTICE_CREATE = "Create new notice ";
    public static final String NOT_FOUND_WITH_NOTICE_ID = "Cannot found notice with id: ";


    // Constants for DataResponse
    public static final String ERROR_CODE_FIELD = "error_code";
    public static final String ERROR_TITLE_FIELD = "title_message";
    public static final String ERROR_MSG_FIELD = "error_message";
    public static final String DATA_FIELD = "data";
    public static final String STATUS_FIELD = "status";
    public static final String SUCCESSFUL = "SUCCESSFUL";
    public static final String SUCCESSFUL_CODE = "200";
    public static final String SUCCESSFUL_MSG = "SUCCESSFUL_MSG";
    public static final String FAILED = "FAILED";
    public static final String FAILED_CODE = "500";
    public static final String FORBIDDEN = "FORBIDDEN";
    public static final String SHOW_MESSAGE = "SHOW_MESSAGE";
    public static final String PERMISSION_DENY = "PERMISSION_DENY";
    public static final String BAD_REQUEST = "BAD_REQUEST";
    public static final String EXISTED_FIELD = "EXISTED_FIELD";
    public static final String SESSION_EXPIRED = "SESSION_EXPIRED";
    public static final String NOT_FOUND = "NOT_FOUND";
    public static final String AUTH_FAILED = "AUTH_FAILED";
    public static final String IS_BLOCKED = "IS_BLOCKED";
    public static final String IS_DUPLICATED = "IS_DUPLICATED";
    public static final String DELETED_SUCCESSFULLY = "Notice deleted successfully !";

    //Constants for authentication
    public static final String USER_EXISTED = "Error: User name is already taken !";
    public static final String EMPTY_USERNAME = "Username cannot null or blank !";
    public static final String EMAIL_EXISTED = "Error: Email is already used !";
    public static final String ROLE_NOT_FOUND = "Error: Role is not found !";
    public static final String REGISTER_SUCCESSFULLY = "User registered successfully";
    public static final String ADMIN_ROLE_INPUT = "admin";
    public static final String MODERATOR_ROLE_INPUT = "mod";
    public static final String USER_ROLE_INPUT = "user";
    public static final String ROLE_NOT_ELIGIBLE = "Roles is not eligible ";
    public static final String USER_DISABLED = "User was disabled";
    public static final String INVALID_CREDENTIALS = "Invalid credentials";

    // Exception handler
    public static final String FILE_ATTACHED_ERROR = "File attached without extension ";
    public static final String FILE_NOT_FOUND = "File not found ";


    //Validation constants
    public static final String CONTENT_EMPTY = "Notice content should not be blank";
    public static final String TITLE_EMPTY = "Notice title should not be blank";
    public static final String EMAIL_EMPTY = "Email should not be blank or empty";
    public static final String INCORRECT_EMAIL_PATTERN = "Incorrect email pattern";

    // Pattern
    public static final String EMAIL_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
}
