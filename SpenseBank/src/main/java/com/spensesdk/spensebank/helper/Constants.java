package com.spensesdk.spensebank.helper;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Constants {

    String REDEEM = "redeem";

    String INVITEE_ID = "invitee_id";

    int TO_CONTEST_DETAIL_RESULT = 1001;

    String CREDENTIAL = "credential";

    String INVITEE_ARRAY = "invitee_array";

    String PHONE_ARRAY = "phone_array";

    String DAILY = "DAILY";
    String ALTERNATE_DAYS = "ALTERNATIVE";
    String WEEKLY = "WEEKLY";
    String MONTHLY = "MONTHLY";

    String USER_ID_V2 = "user_id";
    String LANGUAGE = "language";

    String ENGLISH = "English";
    String ENGLISH_CODE = "en";

    String HINDI = "Hindi";
    String HINDI_CODE = "hi";

    String TAMIL = "Tamil";
    String TAMIL_CODE = "ta";

    String BENGALI = "Bengali";
    String BENGALI_CODE = "bn";

    String MARATHI = "Marathi";
    String MARATHI_CODE = "mr";

    String TELUGU = "Telugu";
    String TELUGU_CODE = "te";

    String YES = "yes";
    String NO = "no";

    String DEFAULT_LANGUAGE = "defaultLanguage";
    String COMPONENT = "component";
    String DATA_TYPE = "dataType";
    String DELIMITER = "delimiter";
    String FLAG = "flag";
    String SEQUENCE = "sequence";

    String CONFIG_CODE = "configCode";
    String CONFIG_VALUE = "configValue";

    String ID = "id";
    String GOAL_ID = "goalId";
    String IS_MANDATORY = "isMandatory";
    String LABEL = "label";
    String LABEL_LANGUAGE_1 = "label1";
    String LABEL_LANGUAGE_2 = "label2";
    String LABEL_LANGUAGE_3 = "label3";
    String LABEL_LANGUAGE_4 = "label4";
    String LABEL_LANGUAGE_5 = "label5";
    String VALUE = "value";
    String COMPONENT_ID = "componentId";
    String EMAIL_ID = "emailId";
    String MAXIMUM_LENGTH = "maximumLength";
    String LANGUAGE_ORDER = "languageOrder";
    String LANGUAGE_DESCRIPTION = "languageDescription";
    String LANGUAGE_COLUMN_SUFFIX = "languageColumnSuffix";
    String LANGUAGE_CONFIG_TABLE = "LanguageConfig";
    String COUNTRY_CONFIG_TABLE = "CountryConfig";
    String MENU_CONFIG_TABLE = "MenuConfig";
    String MENU_COMPONENT_TABLE = "MenuComponent";
    String LIST_COMPONENT_DATA_TABLE = "ListComponentData";

    String MENU_ID = "menuId";
    String MENU_DESCRIPTION = "menuDescription";
    String MENU_NAME = "menuName";
    String MENU_NAME_LANGUAGE_1 = "menuName1";
    String MENU_NAME_LANGUAGE_2 = "menuName2";
    String MENU_NAME_LANGUAGE_3 = "menuName3";
    String MENU_NAME_LANGUAGE_4 = "menuName4";
    String MENU_NAME_LANGUAGE_5 = "menuName5";
    String MINIMUM_LENGTH = "minimumLength";

    String NAME = "name";
    String ACCOUNT_NUMBER = "account_number";
    String PHOTO = "photo";

    String PARENT_ID = "parentId";
    String POST_ADDRESS = "postAddress";
    String RADIO = "Radio";
    //String DATE_COMPONENT = "Date";
    String CHECKBOX = "CheckBox";
    String RADIO_GROUP = "RadioGroup";
    String CHECK_BOX_GROUP = "CheckBoxGroup";

    String REQUEST_PREFIX = "requestPrefix";
    String RESPONSE_ADDRESS = "responseAddress";

    String SPACE_ = "SPACE";
    String HASH = "#";
    String TEXTVIEW = "TextView";
    String EDITTEXT = "EditText";
    String MULTILINE = "MultiLine";
    String TRACKING_TABLE = "Tracking";
    String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    String DATE_FORMAT_PICKER = "dd-MM-yyyy";

    String NOT_APPLICABLE = "NA";

    String ERROR = "ERROR";
    String FAILURE_IN_EXECUTION = "FAILURE";

    String SUBMIT = "Submit";

    String DYNAMIC_NOTIFICATION_ID = "dynamicNotificationId";

    String CLASS_TYPE = "classType";
    String NOTIFICATION_TEXT = "notificationText";
    String HTTP_POST_URL = "httpPostUrl";
    String NOTIFICATION_IMAGE_URL = "notificationImageUrl";
    String ITEM_COMPONENT = "itemComponent";
    String COMMA_SEPARATED_VALUES = "commaSeparatedValues";
    String ITEM_LABEL = "itemLabel";
    String PARAMETER_ORDER = "parameterOrder";
    String NOTIFICATION_PARAMETERS = "notificationParameters";

    String TOTAL_UNREAD_MESSAGES = "totalUnreadMessages";
    String IS_MESSAGE_READ = "isMessageRead";

    String Y = "Y";

    String N = "N";
    String STREE_ARTICLE = "Article";
    String CHAT_FRAGMENT = "Chat Fragment";
    String VIDEO_FRAGMENT = "Video Fragment";
    String IMAGE_FRAGMENT = "Image Fragment";
    String QnA_FRAGMENT = "QnA Fragment";
    String ARTICLE_FRAGMENT = "Article Fragment";
    String OTHER_OPTIONS_FRAGMENT = "Other Options Fragment";
    String STREE_VIDEO = "Video";
    String DIET_PLAN_MODEL_UNDERSTOOD_CLICKED_BY_PATIENT = "dietPlanModelUnderstoodClickedByPatient";
    String FITNESS_PLAN_MODEL_UNDERSTOOD_CLICKED_BY_PATIENT = "fitnessPlanModelUnderstoodClickedByPatient";
    String MONDAY = "Monday";
    String TUESDAY = "Tuesday";
    String WEDNESDAY = "Wednesday";
    String THURSDAY = "Thursday";
    String FRIDAY = "Friday";
    String SATURDAY = "Saturday";
    String SUNDAY = "Sunday";
    String DAY_OF_WEEK = "dayOfWeek";
    String FILE_EXTENSION_JPG = ".jpg";
    String FILE_EXTENSION_JPEG = ".jpeg";
    String FILE_EXTENSION_PNG = ".png";
    String FILE_EXTENSION_GIF = ".gif";
    String FILE_EXTENSION_M4A = ".m4a";
    String FILE_EXTENSION_MP4 = ".mp4";
    String FILE_EXTENSION_3GP = ".3gp";

    String LANGUAGES_ = "languages";
    String APP_LANGUAGE = "appLanguage";

    String PLATFORM_SHARED_PREFERENCE = "platformSharedPreference";
    String USER_IDS = "userIds";
    String CONTRIBUTION = "contribution";
    String FRIENDS = "friends";
    String OLDEST_EVENT_ID = "oldestEventId";
    String OLDEST_EVENT_DATE = "oldestEventDate";
    String NEWEST_EVENT_DATE = "newestEventDate";
    String USER_TYPE = "userType";
    String ATTRIBUTE_CODE = "attributeCode";
    String ATTRIBUTE_KEY_VALUE_ARRAY = "attributeKeyValueArray";
    String USER_TYPE_DESCRIPTION = "userTypeDescription";
    String USER_NAME = "userName";
    String USER_IMAGE_LOCATION = "userImageLocation";
    String HAS_USED_APP_BEFORE = "hasUsedAppBefore";
    String HAS_SIGNED_UP = "hasSignedUp";

    String MESSAGE_FROM_USER_SUPPORT_CHAT_ID = "messageFromSupportChatId";
    String MESSAGE_FROM_USER_ID = "messageFromUserId";
    String MESSAGE_FROM_USER_TYPE = "messageFromUserType";
    String MESSAGE_FROM_USER_NAME = "messageFromUserName";
    String MESSAGE_FROM_USER_IMAGE_LOCATION = "messageFromUserImageLocation";

    String PREGNANCY_WEEK = "pregnancyWeek";

    String APP_VERSION ="appVersion";

    String BLANK = "";
    String BLANK_JSON = "{}";
    String BLANK_JSON_ARRAY = "[]";
    String SPACE = " ";
    String COMMA = ",";
    String DASH = "-";
    String DEFAULT="DEFAULT";

    String MET_STREE_COMPANION = "metStreeCompanion";
    String MET_STREE_FEED = "metStreeFeed";

    String VC_SLOT_ID = "vcSlotId";
    String VC_ROOM_ID = "vcRoomId";
    String PAYMENT_STATUS = "paymentStatus";
    String IS_RESCHEDULED = "isRescheduled";

    String NUMBER_OF_TIMES_USER_ENTERS_THE_APP = "numberOfTimesUserEntersTheApp";
    String TODAY = "today";
    String DATE_TYPE = "dateType";
    String DATE_VALUE = "dateValue";
    String IS_LOGGED_IN = "isLoggedIn";
    String IS_SKIP_LOGGED_IN = "isSkippedLoggedIn";
    String SKIP_USER_WANTS_TO_LOGIN = "skipUserWantsToLogin";
    String SKIP_USER_MESSAGE = "skipUserMessage";
    String COUNTRY_CODE = "countryCode";

    String BENEFICIARY_NAME = "beneficiary_name";
    String ACCOUNT_NO = "account_no";
    String IFSC_CODE = "ifsc_code";
    String IFSC = "ifsc";
    String BANK_NAME = "bank_name";
    String BRANCH_NAME = "branch_name";
    String BANK = "bank";
    String BRANCH = "branch";
    String COUNTRY = "country";
    String MOBILE_NUMBER = "mobileNumber";
    String SMS = "sms";
    String BOOKED_SLOT_ID = "bookedSlotId";
    String TIME_SLOT_ID = "timeSlotId";
    String SLOT_DATE="slotDate";
    String SLOT_TIME = "slotTime";
    String DOCTOR_ID = "doctorId";
    String AUTHENTICATION_MODE = "authenticationMode";
    String UPDATE_PATIENT_ID = "updatePatientId";
    String IS_VERIFIED = "isVerified";

    String CURRENT_DATE = "currentDate";
    String CURRENT_TIME = "currentTime";

    String FACEBOOK = "Facebook";
    String FACEBOOK_ID = "facebookId";

    String GOOGLE = "Google";
    String GOOGLE_ID = "googleId";
    String GOOGLE_ID_TOKEN = "googleIdToken";

    String DIRECTORY_NAME = "directoryName";
    String S3_BUCKET_NAME = "s3BucketName";
    String S3_DIRECTORY_NAME = "s3DirectoryName";

    String AVAILABILITY ="availability";
    String SLOT_END_TIME="slotEndTime";
    String SLOT_START_TIME="slotStartTime";

    String DOCTOR_NAME = "doctorName";
    String DOCTOR_QUALIFICATION = "doctorQualification";
    String DOCTOR_IMAGE_LOCATION = "doctorImageLocation";
    String DOCTOR_ADDRESS = "doctorAddress";
    String DOCTOR_1 = "doctor_1";
    String DOCTOR_2 = "doctor_2";
    String DOCTOR_3 = "doctor_3";
    String DOCTOR_4 = "doctor_4";
    String DOCTOR_5 = "doctor_5";
    String DOCTOR_6 = "doctor_6";
    String DOCTOR_7 = "doctor_7";
    String DOCTOR_8 = "doctor_8";
    String DOCTOR_9 = "doctor_9";
    String DOCTOR_10 = "doctor_10";

    //String SLOT_DATE = "slotDate";
    //String SLOT_START_TIME = "slotStartTime";
    //String SLOT_END_TIME = "slotEndTime";

    String CODE = "code";
    String PATIENT = "patient";
    String USER = "user";
    String PATIENT_ID = "patientId";
    String WEEK = "week";
    String DAY = "day";
    String DAY_IN_WEEK = "dayInWeek";
    String MINIMUM_WEEK = "minimumWeek";
    String MAXIMUM_WEEK = "maximumWeek";
    String IMMUNIZATION = "immunization";
    String ULTRASOUND_AND_SCAN = "ultrasoundAndScan";
    String VISIT = "visit";
    String PATHOLOGY_TEST = "pathologyTest";
    String PHOTO_URL = "photoUrl";                                          // Use only for mapping MySQL column!
    String PARTNER_PHOTO_URL = "partnerPhotoUrl";                           // Use only for mapping MySQL column!
    String ERROR_DATE = "errorDate";
    String ERROR_DESCRIPTION = "errorDescription";
    String FILE_NAME = "fileName";
    String METHOD_NAME = "methodName";
    String LINE_NUMBER_IN_CODE = "lineNumberInCode";
    String SENT_TO_SERVER = "sentToServer";
    String AGE = "age";
    String GENDER = "gender";
    String SALARY = "salary";
    String PROFESSION = "PROFESSION";
    String SEX = "sex";
    String PASSWORD = "password";
    String MODULE_ID = "moduleId";
    String DATE_OF_BIRTH = "dateOfBirth";
    String BLOOD_GROUP = "bloodGroup";
    String HEIGHT = "height";
    String WEIGHT = "weight";
    String DUE_DATE_OR_LMP = "dueDateOrLMP";                                // Use only for mapping MySQL column!
    String DUE_DATE_OR_LMP_VALUE = "dueDateOrLMPValue";                     // Use only for mapping MySQL column!
    String DUE_DATE_CODE = "DD";
    String DUE_DATE_NAME = "Due Date";
    String LMP_CODE = "LMP";
    String LMP_NAME = "LMP";
    String EMERGENCY_CONTACT = "emergencyContact";
    String FROM_QUESTION ="fromQuestion";
    String FROM_QUESTION_ID ="fromQuestionId";
    String FROM_CHAT_INDEX ="fromChatIndex";
    String SEARCH_CRITERIA = "searchCriteria";
    String CATEGORY_IDS = "categoryIds";
    String HAS_USER_BOOKMARKED_QUESTION = "hasUserBookmarkedQuestion";
    String HAS_USER_LIKED_QUESTION = "hasUserLikedQuestion";
    String BOOKMARKED_BY_TYPE = "bookmarkedByType";
    String BOOKMARKED_BY_ID = "bookmarkedById";
    String NUMBER_OF_LIKES = "numberOfLikes";
    String NUMBER_OF_SHARES = "numberOfShares";
    String NUMBER_OF_ANSWERS = "numberOfAnswers";
    String LIKED_BY_TYPE = "likedByType";
    String LIKED_BY_ID = "likedById";

    String STREE_CONFIGURATIONS = "streeConfigurations";

    String MESSAGES = "messages";
    String MESSAGE = "message";
    String COMMENTS_FOR_MESSAGE = "commentsForMessage";
    String MESSAGE_TYPE = "messageType";
    String MESSAGE_SOURCE = "messageSource";
    String MESSAGE_POSITION = "messagePosition";
    String MESSAGE_BY_ID = "messageById";
    String MESSAGE_FROM_ID = "messageFromId";
    String MESSAGE_BY_TYPE = "messageByType";
    String MESSAGE_FROM_TYPE = "messageFromType";
    String MESSAGE_SENDER_DETAILS = "messageSenderDetails";
    String MESSAGE_BY_NAME = "messageByName";
    String MESSAGE_FROM_NAME = "messageFromName";
    String MESSAGE_BY_IMAGE_LOCATION = "messageByImageLocation";
    String MESSAGE_FROM_IMAGE_LOCATION = "messageFromImageLocation";
    String STATUS = "status";
    String LOGIN_SUCCESS = "LOGIN_SUCCESS";
    String SIGNUP_SUCCESS = "SIGNUP_SUCCESS";
    String PENDING = "P";
    String PENDING_FULL = "PENDING";
    String CANCELLED = "C";
    String COMPLETE_CODE = "C";
    String OTP = "otp";
    String ACTIVE = "ACTIVE";
    String INACTIVE = "I";
    String INACTIVE_FULL = "INACTIVE";
    String ATTRIBUTES = "attributes";
    String RULE_ATTRIBUTES = "ruleAttributes";
    String SERIAL = "serial";
    String CUSTOMIZABLE_VALUES = "customizableValue";
    String DEFAULT_VALUE = "defaultValue";
    String ATTRIBUTE_VALUE_TYPE = "attributeValueType";
    String VALID_VALUES = "validValues";

    List<String> BLOOD_GROUPS = Collections.unmodifiableList(
            new ArrayList<String>() {{
                add("A+");
                add("O+");
                add("B+");
                add("AB+");
                add("A-");
                add("O-");
                add("B-");
                add("AB-");
            }}
    );
    List<String> HEIGHTS = Collections.unmodifiableList(
            new ArrayList<String>() {{
                add("4'0\"");
                add("4'1\"");
                add("4'2\"");
                add("4'3\"");
                add("4'4\"");
                add("4'5\"");
                add("4'6\"");
                add("4'7\"");
                add("4'8\"");
                add("4'9\"");
                add("4'10\"");
                add("4'11\"");
                add("4'12\"");
                add("5'0\"");
                add("5'1\"");
                add("5'2\"");
                add("5'3\"");
                add("5'4\"");
                add("5'5\"");
                add("5'6\"");
                add("5'7\"");
                add("5'8\"");
                add("5'9\"");
                add("5'10\"");
                add("5'11\"");
                add("5'12\"");
                add("6'1\"");
                add("6'2\"");
                add("6'3\"");
                add("6'4\"");
                add("6'5\"");
                add("6'6\"");
                add("6'7\"");
                add("6'8\"");
                add("6'9\"");
                add("6'10\"");
                add("6'11\"");
            }}
    );
    List<String> PREGNANCY_WEEK_LIST = Collections.unmodifiableList(
            new ArrayList<String>() {{
                add("Trying to Conceive");
                add("Week 1");
                add("Week 2");
                add("Week 3");
                add("Week 4");
                add("Week 5");
                add("Week 6");
                add("Week 7");
                add("Week 8");
                add("Week 9");
                add("Week 10");
                add("Week 11");
                add("Week 12");
                add("Week 13");
                add("Week 14");
                add("Week 15");
                add("Week 16");
                add("Week 17");
                add("Week 18");
                add("Week 19");
                add("Week 20");
                add("Week 21");
                add("Week 22");
                add("Week 23");
                add("Week 24");
                add("Week 25");
                add("Week 26");
                add("Week 27");
                add("Week 28");
                add("Week 29");
                add("Week 30");
                add("Week 31");
                add("Week 32");
                add("Week 33");
                add("Week 34");
                add("Week 35");
                add("Week 36");
                add("Week 37");
                add("Week 38");
                add("Week 39");
                add("Week 40");
                add("Week 41");
                add("Week 42");
                add("New Mom");


            }}
    );

    String SUCCESS = "Success";
    String SUCCESS_CODE = "S";
    String FAILURE = "Failure";
    String FAILURE_CODE = "F";
    String RESULT = "result";
    String IMAGE_NAME = "imageName";

    Map<String, String> MONTHS = Collections.unmodifiableMap(
            new HashMap<String, String>() {{
                put("01", "JAN");
                put("02", "FEB");
                put("03", "MAR");
                put("04", "APR");
                put("05", "MAY");
                put("06", "JUN");
                put("07", "JUL");
                put("08", "AUG");
                put("09", "SEP");
                put("10", "OCT");
                put("11", "NOV");
                put("12", "DEC");
            }}
    );

    Map<Long, String> SUFFIXES_TO_MAKE_LARGE_NUMBERS_CONCISE = Collections.unmodifiableMap(
            new HashMap<Long, String>() {{
                put(1_000L, "k");
                put(1_000_000L, "m");
                put(1_000_000_000L, "b");
                put(1_000_000_000_000L, "t");
            }}
    );

    Map<String, String> LANGUAGES = Collections.unmodifiableMap(
            new HashMap<String, String>() {{
                put("en", "English");
                put("hi", "Hindi");
            }}
    );

    String[] MONTH_NAMES = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    String SPECIALIZATION_ID = "specializationId";
    String CONDITION_ID = "conditionId";
    String CONDITION_NAME = "conditionName";

    String DIET_PLAN_ID = "dietPlanId";
    String ADDRESS = "address";
    String ADDRESS_ID = "addressId";
    String ADDRESS_NAME = "addressName";

    String USER_CONTRIBUTION = "userContribution";
    String TARGET_AMOUNT = "targetAmount";
    String TARGET_AMOUNT_CURRENCY = "targetAmountCurrency";
    String TARGET_DATE = "targetDate";
    String IS_VISIBLE_TO_FRIENDS = "isVisibleToFriends";
    String SAVING_WITH_FRIENDS = "savingWithFriends";
    String CREATED_BY = "createdBy";
    String CREATED_ON = "createdOn";
    String UPDATED_BY = "updatedBy";
    String UPDATED_BY_TYPE = "updatedByType";
    String GOAL_NAME = "goalName";
    String GOAL_CREATION = "goalCreation";
    String GOAL_DESCRIPTION = "goalDescription";
    String GOAL_IMAGE_LOCATION = "goalImageLocation";
    String RULES = "rules";
    String MEMBERS = "members";
    String GOAL_AMOUNT_REACHED_BY_MEMBERS = "goalAmountReachedByMembers";
    String USER_GOAL_ID = "userGoalId";
    String TRANSACTION_AMOUNT = "transactionAmount";
    String TOTAL_GOAL_AMOUNT = "totalGoalAmount";
    String TRANSACTION_ID = "transactionId";
    String TRANSACTION_CURRENCY = "transactionCurrency";
    String TRANSACTION_FREQUENCY = "transactionFrequency";
    String PAYMENT_MODE_ID = "paymentModeId";
    String TRANSACTION_DATE = "transactionDate";
    String TRANSACTION_STATUS = "transactionStatus";
    String CUSTOMER_ID = "customerId";
    String ONE_TIME_DEPOSIT = "oneTimeDeposit";
    String ONE_TIME_WITHDRAW = "oneTimeWithdraw";
    String WITHDRAWAL_AMOUNT = "withdrawalAmount";
    String ORDER_ID = "orderId";
    String RAZORPAY_TEST_KEY = "rzp_test_Kco4AWJCodstnR";
    String RAZORPAY_PRODUCTION_KEY = "rzp_live_ZVzcbkU6PhRWSF";
    String RESPONSE_FROM_PAYMENT_MODE = "responseFromPaymentMode";
    String RULE_ID = "ruleId";
    String ATTRIBUTE_VALUES = "attributeValues";
    String USER_GOAL_RULE_MAPPING_ID = "userGoalRuleMappingId";
    String RULE_ATTRIBUTE_ID = "ruleAttributeId";
    String THREAD_ID = "_id";
    String THREAD_CREATOR_ID = "threadCreatorId";
    String THREAD_CREATOR_TYPE= "threadCreatorType";
    String THREAD_START_DATE= "threadStartDate";
    String CREATED_BY_TYPE = "createdByType";
    String ADDED_BY = "addedBy";
    String ADDED_BY_TYPE = "addedByType";
    String ADDED_ON = "addedOn";
    String ATTRIBUTES_OF_MEMBER = "attributesOfMember";
    String SIGN_UP_DATE = "signUpDate";
    String LEDGER_ITEMS = "ledgerItems";
    String GOAL_AMOUNT_REACHED = "goalAmountReached";
    String USER_GOAL_AUTO_SAVE_STATUS = "userGoalAutoSaveStatus";

    String REFRESH_DASHBOARD_ACTIVITY = "REFRESH_DASHBOARD_ACTIVITY";

    String REFRESH_DISCOVER_ACTIVITY = "REFRESH_DISCOVER_ACTIVITY";
    String REFRESH_MY_GOAL_ACTIVITY = "REFRESH_MY_GOAL_ACTIVITY";
    String REFRESH_CONTEST_ACTIVITY = "REFRESH_CONTEST_ACTIVITY";
    String SEND_OTP_TO_OTP_ACTIVITY = "SEND_OTP_TO_OTP_ACTIVITY";

    String ZERO_AS_STRING = "0";

    String CONTENT_TYPE = "contentType";
    String SHORT_DESCRIPTION = "shortDescription";
    String DESCRIPTION = "description";
    String WEB_PAGE_LOCATION = "webPageLocation";
    String THUMBNAIL_LOCATION = "thumbnailLocation";
    String IMAGE_LOCATION = "imageLocation";
    String FROM_USER="fromUser";
    String FROM_PARTNER = "fromPartner";
    String VIDEO_THUMBNAIL_LOCATION= "videoThumbnailLocation";
    String DYNAMIC_CHAT = "dynamicChat";
    String MESSAGE_EXTENSION = "messageExtension";
    String CHAT_EXTENSION = "chatExtension";
    String CHAT_EXTENSION_TYPE = "extensionType";
    String PARTNER_MESSAGE = "PARTNER_MESSAGE";
    String PROCESS_MESSAGE = "PROCESS_MESSAGE";
    String IMAGE_HEIGHT = "imageHeight";
    String IMAGE_WIDTH = "imageWidth";
    String PARTNER_IMAGE_LOCATION = "partner_image_location";
    String AUDIO_SOURCE = "audioSource";
    String AUDIO_LOCATION = "audioLocation";
    String MEDIA_DURATION = "mediaDuration";
    String PLAY_PREFIX_OR_SUFFIX_VIDEO = "playPrefixOrSuffixVideo";
    String PREFIX = "prefix";
    String SUFFIX = "suffix";
    String VIDEO_LOCATION = "videoLocation";
    String FINISH_ACTIVITY = "finishActivity";
    String VIDEO_SOURCE = "videoSource";
    String DOCUMENT_TYPE = "documentType";
    String DOCUMENT_NAME_WITH_TYPE = "documentNameWithType";
    String CONTENT_CATEGORY = "contentCategory";
    String CONTENT_SOURCE = "contentSource";
    String CONTENT_NUMBER_OF_LIKES = "contentNumberOfLikes";
    String CONTENT_NUMBER_OF_COMMENTS = "contentNumberOfComments";
    String CONTENT_NUMBER_OF_SHARES = "contentNumberOfShares";
    String AUTHOR_ID = "authorId";
    String AUTHOR_TYPE = "authorType";
    String AUTHOR_DETAILS = "authorDetails";
    String AUTHOR_EXTRA_INFORMATION = "authorExtraInformation";
    String HAS_USER_LIKED_CONTENT = "hasUserLikedContent";
    String HAS_USER_BOOKMARKED_CONTENT = "hasUserBookmarkedContent";
    String CREATED_DATE = "createdDate";

    String HEADING = "heading";
    String BODY = "body";

    String DATE = "date";

    String POST = "post";
    String TITLE = "title";

    String WE_ARE_WORKING_ON_IT_MESSAGE = "We are Working on it. Please Try Again After Some Time";

    String BALANCE = "balance";
    String MAX_REWARD = "max_reward";
    String PENDING_SCRATCH_CARDS = "pending_scratch_cards";
    String DEPOSIT  = "deposit";
    String WITHDRAWAL = "withdrawal";
    String SPEND = "spend";
    String REWARD_BALANCE = "reward_balance";

    String BACHELOR_DEGREE = "bachelorDegree";
    String BACHELOR_DEGREE_CITY = "bachelorDegreeCity";
    String MASTER_DEGREE = "masterDegree";
    String MASTER_DEGREE_CITY = "masterDegreeCity";
    String SPECIALIZATION = "specialization";
    String SPECIALIZATIONS = "specializations";
    String SELECTED_DIET_PLAN = "selectedDietPlan";
    String SELECTED_FITNESS_PLAN = "selectedFitnessPlan";

    String PLATFORM = "platform";
    String ANDROID = "android";
    String FIREBASE_ID = "firebaseId";
    String FIREBASE_ID_UPDATED = "firebaseIdUpdated";

    String DURATION = "duration";
    String DURATION_UNIT = "durationUnit";
    String TYPE = "type";

    String PAN = "pan";

    String PAN_URI_STRING = "pan_uri_string";
    String AADHAAR_URI_FRONT_STRING = "aadhaar_uri_font_string";
    String AADHAAR_URI_BACK_STRING = "aadhaar_uri_back_string";
    String SELFIE_URI_STRING = "selfie_uri_string";

    String AADHAAR_FRONT = "aadhaar_front";

    String AADHAAR = "aadhaar";
    String AADHAAR_BACK = "aadhaar_back";
    String SELFIE = "selfie";

    String PRIMARY = "PRIMARY";
    String BOOSTER = "BOOSTER";
    String CUISINE = "cuisine";
    String PRICE = "price";
    String SLOT_LENGTH_IN_MINUTES = "slotLengthInMinutes";
    String CURRENCY = "currency";
    String AMOUNT = "amount";
    String MATURITY_AMOUNT = "maturity_amount";
    String TEXT = "text";
    String FIXED_DAILY_SLOTS = "fixed_daily_slots";
    String IMAGE = "image";
    String IMAGE_1 = "image1";
    String IMAGE_2 = "image2";
    String IMAGE_3 = "image3";
    String IMAGE_4 = "image4";
    String THEME = "theme";
    String CONTACT = "contact";
    String EMAIL = "email";

    String RAZORPAY_PRE_FILL = "prefill";
    String CONTEST = "contest";

    String IS_HOSPITAL = "isHospital";
    String IF_TO_SHOW_ALL_HOSPITAL_PATIENTS_TO_ITS_DOCTORS = "showHospitalPatientsToAllDoctors";
    String SHOW_HOSPITAL_PATIENTS_TO_ALL_DOCTORS = "showHospitalPatientsToAllDoctors";
    String SEND_NOTIFICATION = "sendNotification";

    Map<String, String> VISIT_IN_NUMBER_TO_NUMBER_WITH_SUFFIX_EN = Collections.unmodifiableMap(
            new HashMap<String, String>() {{
                put("1", "1st");
                put("2", "2nd");
                put("3", "3rd");
                put("4", "4th");
                put("5", "5th");
                put("6", "6th");
                put("7", "7th");
                put("8", "8th");
                put("9", "9th");
                put("10", "10th");
                put("11", "11th");
                put("12", "12th");
                put("13", "13th");
                put("14", "14th");
                put("15", "15th");
                put("16", "16th");
                put("17", "17th");
                put("18", "18th");
                put("19", "19th");
                put("20", "20th");
                put("21", "21st");
                put("22", "22nd");
                put("23", "23rd");
                put("24", "24th");
                put("25", "25th");
            }}
    );

    Map<String, String> VISIT_IN_NUMBER_TO_NUMBER_WITH_SUFFIX_HI = Collections.unmodifiableMap(
            new HashMap<String, String>() {{
                put("1", "1st");
                put("2", "2nd");
                put("3", "3rd");
                put("4", "4th");
                put("5", "5th");
                put("6", "6th");
                put("7", "7th");
                put("8", "8th");
                put("9", "9th");
                put("10", "10th");
                put("11", "11th");
                put("12", "12th");
                put("13", "13th");
                put("14", "14th");
                put("15", "15th");
                put("16", "16th");
                put("17", "17th");
                put("18", "18th");
                put("19", "19th");
                put("20", "20th");
                put("21", "21st");
                put("22", "22nd");
                put("23", "23rd");
                put("24", "24th");
                put("25", "25th");
            }}
    );

    Map<String, String> FREQUENCY_TO_RULE_NAME_MAPPING = Collections.unmodifiableMap(
            new HashMap<String, String>() {{
                put(DAILY, EVERY_DAY);
                put(ALTERNATE_DAYS, EVERY_OTHER_DAY);
                put(WEEKLY, EVERY_WEEK);
                put(MONTHLY, EVERY_MONTH);
            }}
    );

    String EVERY_DAY = "daily";
    String EVERY_OTHER_DAY = "every other day";
    String EVERY_WEEK = "weekly";
    String EVERY_MONTH = "monthly";

    Map<String, String> FREQUENCY_TO_RULE_NAME_MAPPING_FOR_GOAL_CARD = Collections.unmodifiableMap(
            new HashMap<String, String>() {{
                put(DAILY, "day");
                put(ALTERNATE_DAYS, "alt day");
                put(WEEKLY, "week");
                put(MONTHLY, "month");
            }}
    );

    String REVIEW_APP_DIALOG = "ReviewAppDialog";
    String FROM_NOTIFICATION = "fromNotification";
    String PARAMETERS_FROM_NOTIFICATION = "parameters";
    String PARAMETERS = "parameters";
    String PARAMETERS_TO_SEND_TO_API = "parametersToSendToApi";
    String NOTIFICATION_TITLE = "title";
    String NOTIFICATION_BODY = "body";
    String NOTIFICATION = "notification";
    String NOTIFICATION_DISABLED = "NOTIFICATION_DISABLED";
    String NOTIFICATION_ENABLED = "NOTIFICATION_ENABLED";
    String NOTIFICATION_RECEIVED = "NOTIFICATION_RECEIVED";
    String NOTIFICATION_CLICKED = "NOTIFICATION_CLICKED";
    String OTP_CHECK = "OTP_CHECK";
    String SIGN_IN_SUCCESS = "SIGN_IN_SUCCESS";
    String SIGN_IN_FAILED_OTP_INCORRECT = "SIGN_IN_FAILED_OTP_INCORRECT";
    String SIGN_IN_FAILED_VERIFY_FAILED = "SIGN_IN_FAILED_VERIFY_FAILED";
    String SIGN_IN_FAILED_TOO_MANY_REQUESTS = "SIGN_IN_FAILED_TOO_MANY_REQUESTS";
    String SIGN_IN_FAILED_INVALID_CREDENTIALS = "SIGN_IN_FAILED_INVALID_CREDENTIALS";
    String SIGN_IN_FAILED_OTP_NULL = "SIGN_IN_FAILED_OTP_NULL";
    String SIGN_IN_FAILED = "SIGN_IN_FAILED";
    String CODE_SENT = "CODE_SENT";
    String PLATFORM_NOTIFICATION_DEFAULT_TAG = "PLATFORM_NOTIFICATION_DEFAULT_TAG";
    String PLATFORM_NOTIFICATION_SUPPORT_CHAT_TAG = "PLATFORM_NOTIFICATION_SUPPORT_CHAT_TAG";

    String UPGRADE = "upgrade";
    String ACTIVITY = "activity";
    String FRAGMENT = "fragment";
    String GO_TO_ACTIVITY = "goToActivity";
    String IMAGE_URL = "imageUrl";
    String EXTERNAL_APPLICATION = "externalApplication";
    String EXTERNAL_APPLICATION_URL = "externalApplicationUrl";

    //String YOUTUBE_API_KEY = "AIzaSyBbKfA9roeb3u4-FLTfHz1npM1eNWa1EO4";//"AIzaSyB2SrYMb-4YbN6mPcsuBZw6Y3ADh30xloo";

    String CHAT_ID = "chatId";
    String CHAT_DESCRIPTION = "chatDescription";
    String CONTEST_RULES = "contest_rules";
    String DETAILS = "details";
    String SUPPORT_CHAT_ID = "supportChatId";
    String LAST_MESSAGE = "lastMessage";
    String LAST_MESSAGE_TIME = "lastMessageTime";
    String PATIENT_NAME = "patientName";
    String PATIENT_IMAGE_LOCATION = "patientImageLocation";
    String MESSAGE_DATE = "messageDate";
    String FROM_DOCTOR = "fromDoctor";
    String CHATS = "chats";
    String IS_LAST_MESSAGE_FROM_PATIENT = "isLastMessageFromPatient";
    String IS_LAST_MESSAGE_FROM_USER = "isLastMessageFromUser";
    String IS_LAST_MESSAGE_FROM_PARTY = "isLastMessageFromParty";

    String PLATFORM_AWS_ID = "207188866367";
    String PLATFORM_COGNITO_IDENTITY_POOL = "ap-south-1:821ecab5-8198-459b-b0df-705badbe9a7d";
    /*
    String STREE_AWS_ID = "509087838237";
    String STREE_COGNITO_IDENTITY_POOL = "ap-south-1:9f1f9e21-dd62-480b-9aef-887015b9ee30";
    */

    String FORWARD_SLASH = "/";
    String PROFILE_PHOTO_DIRECTORY_IN_DEVICE = "profilePhoto";
    String CHAT_DIRECTORY_IN_DEVICE = "chat";
    String PATIENT_CONSULTATION_DIRECTORY_IN_DEVICE = "patientConsultation";
    String MEDIA_DOWNLOADS = "mediaDownloads";

    String CATEGORY_ID = "categoryId";
    String CATEGORY_NAME = "categoryName";

    String CATEGORY_NAMES = "categoryNames";

    String SEND = "send";
    String SOURCE = "source";
    String LOCATION = "location";

    String LONGITUDE = "longitude";
    String LATITUDE = "latitude";
    String PLACE_ID = "placeId";
    String PLACE_NAME = "placeName";
    String PLACE_ADDRESS = "placeAddress";
    String PLACE_RATING = "placeRating";
    String PLACE_RATINGS_TOTAL = "placeRatingsTotal";

    String QUESTION = "question";
    String QUESTION_ID = "questionId";
    String QUESTION_ID_IN_MONGO_DB = "questionIdInMongoDB";
    String ANSWERS = "answers";
    String ANSWER = "answer";
    String ANSWER_POSITION = "answerPosition";
    String ANSWERED_BY_ID = "answeredById";
    String ANSWERED_BY_TYPE = "answeredByType";
    String ANSWERED_BY_NAME = "answeredByName";
    String ANSWERED_BY_IMAGE_LOCATION = "answeredByImageLocation";
    String ANSWER_DATE="answerDate";
    String ANONYMOUS = "anonymous";
    String ASKED_BY_TYPE="askedByType";
    String ASKED_BY_ID="askedById";
    String ASKED_BY_DETAILS = "askedByDetails";
    String PARENT = "parent";
    String PARENT_UPDATED = "parentUpdated";
    String MOMMY = "mommy";
    String DADDY = "daddy";
    String DADDY_OR_MOMMY = "daddyOrMommy";

    String ANSWER_ID = "answerId";
    String PROCESS_ID = "processId";
    String PROCESS_CODE = "processCode";
    String NEXT_PROCESS_ID = "nextProcessId";
    String NEXT_QUESTION_ID = "nextQuestionId";
    String ANSWER_QUERY = "answerQuery";
    String COMMA_SEPARATED_QUERY_ATTRIBUTES = "commaSeparatedQueryAttributes";
    String ANSWER_COMPONENT = "answerComponent";
    String ARE_MULTIPLE_ANSWERS_ALLOWED = "areMultipleAnswersAllowed";

    int WRITE_EXTERNAL_STORAGE_REQUEST = 1701;
    int RECORD_AUDIO_REQUEST = 1702;
    int READ_CONTACTS_REQUEST = 1703;
    String CONSULTATION_ID = "consultationId";

    String SELECTED_DATE = "selectedDate";
    String APPOINTMENT_ID = "appointmentId";
    String EVENT_START_DATE = "eventStartDate";
    String EVENT_START_TIME = "eventStartTime";
    String EVENT_END_DATE = "eventEndDate";
    String EVENT_END_TIME = "eventEndTime";

    String MONDAY_OPEN = "mondayOpen";
    String MONDAY_START_TIME = "mondayStartTime";
    String MONDAY_END_TIME = "mondayEndTime";
    String TUESDAY_OPEN = "tuesdayOpen";
    String TUESDAY_START_TIME = "tuesdayStartTime";
    String TUESDAY_END_TIME = "tuesdayEndTime";
    String WEDNESDAY_OPEN = "wednesdayOpen";
    String WEDNESDAY_START_TIME = "wednesdayStartTime";
    String WEDNESDAY_END_TIME = "wednesdayEndTime";
    String THURSDAY_OPEN = "thursdayOpen";
    String THURSDAY_START_TIME = "thursdayStartTime";
    String THURSDAY_END_TIME = "thursdayEndTime";
    String FRIDAY_OPEN = "fridayOpen";
    String FRIDAY_START_TIME = "fridayStartTime";
    String FRIDAY_END_TIME = "fridayEndTime";
    String SATURDAY_OPEN = "saturdayOpen";
    String SATURDAY_START_TIME = "saturdayStartTime";
    String SATURDAY_END_TIME = "saturdayEndTime";
    String SUNDAY_OPEN = "sundayOpen";
    String SUNDAY_START_TIME = "sundayStartTime";
    String SUNDAY_END_TIME = "sundayEndTime";

    String FEES = "fees";
    String PHONE_NUMBER = "phoneNumber";
    String PHONE = "phone";
    String PHONE_COUNTRY_CODE = "phone_country_code";
    String ASSISTANT_ID = "assistantId";
    String CLINIC_ID = "clinicId";
    String CLINIC_NAME = "clinicName";
    String CLINICS = "clinics";
    String CLINIC_PHOTOS = "clinicPhotos";

    String DOCTOR = "doctor";
    String UNDERSCORE = "_";
    String VIDEO_CONFERENCE_CODE = "VC";
    String SELECTED_CATEGORIES_FOR_QUESTIONS = "selectedCategoriesForQuestions";
    String SELECTED_WEEKS_FOR_QUESTIONS = "selectedWeeksForQuestions";
    String HAS_GIVEN_DATA_ON_SIGNUP = "hasGivenDataOnSignup";

    String ID_OF_CURRENTLY_PLAYING_AUDIO_FEED = "idOfCurrentlyPlayingAudioFeed";
    String FIRST_TIME_OPEN = "firstTimeOpen";
    String BIOMETRIC_ENABLED = "biometric_enabled";
    String KYC_NAME = "kyc_name";
    String KYC_DOB = "kyc_dob";
    String KYC_GENDER = "kyc_gender";

    String INVESTOR_TOKEN = "investor_token";
    String INVESTOR_ID = "investor_id";
    String INVESTOR_TASK_ID = "investor_task_id";

    Map<String, Class> USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE = Collections.unmodifiableMap(
            new HashMap<String, Class>() {{

                put(SUPPORT_CHAT_ID, String.class);

                put(LOGGED_IN_USER, String.class);
                put(TEMPORARY_USER, String.class);

                put(IMAGE, String.class);

                put(INVESTOR_TOKEN, String.class);
                put(INVESTOR_ID, String.class);
                put(INVESTOR_TASK_ID, String.class);


                put(ID, String.class);
                put(PARTNER_USER_ID, String.class);
                put(TYPE, String.class);
                put(USER_TYPE, String.class);

                put(GOAL_COUNT,Integer.class);
                put(SIGN_UP_DATE, String.class);

                put(HAS_USED_APP_BEFORE, Boolean.class);
                put(HAS_SIGN_UP_DIALOG_SHOWN_IN_THIS_SESSION, Boolean.class);
                put(IS_SUPPORT_CHAT_ADMIN, Boolean.class);
                put(IS_SKIP_LOGGED_IN, Boolean.class);
                put(HAS_SIGNED_UP, Boolean.class);
                put(ONBOARDING_DONE, String.class);
                put(IS_LOGGED_IN, String.class);
                put(HAS_GIVEN_DATA_ON_SIGNUP, String.class);
                put(STATUS, String.class);
                put(FIRST_TIME_OPEN, Boolean.class);
                put(BIOMETRIC_ENABLED, String.class);

                put(PAN, String.class);
                put(AADHAAR, String.class);
                put(KYC_NAME, String.class);
                put(KYC_GENDER, String.class);
                put(KYC_DOB, String.class);

                put(NAME, String.class);
                put(PARTNER_USER_NAME, String.class);
                put(PARTNER_IMAGE_LOCATION, String.class);
                put(PHOTO, String.class);
                put(EMAIL, String.class);
                put(USER_IMAGE_LOCATION, String.class);
                put(GENDER, String.class);
                put(AGE, String.class);
                put(DATE_OF_BIRTH, String.class);
                put(WEIGHT, String.class);
                put(HEIGHT, String.class);
                put(BLOOD_GROUP, String.class);
                put(SALARY, String.class);
                put(ADDRESS, String.class);
                put(LATITUDE, String.class);
                put(LONGITUDE, String.class);
                put(LOCATION, String.class);
                put(CITY, String.class);
                put(STATE, String.class);
                put(PIN_CODE, String.class);

                put(AUTHENTICATION_MODE, String.class);
                put(COUNTRY_CODE, String.class);
                put(MOBILE_NUMBER, String.class);
                put(EMAIL_ID, String.class);
                put(GOOGLE_ID, String.class);
                put(GOOGLE_ID_TOKEN, String.class);
                put(FACEBOOK_ID, String.class);
                put(PASSWORD, String.class);
                put(EMERGENCY_CONTACT, String.class);

                put(FIREBASE_ID, String.class);
                put(FIREBASE_ID_UPDATED, String.class);
                put(APP_LANGUAGE, String.class);
                put(APP_VERSION, String.class);

                put(STREE_CONFIGURATIONS, Set.class);
                put(FEED_TYPES, Set.class);
                put(PROMOTION_VIDEOS, Set.class);
                put(USER_PROFILE_ATTRIBUTE_SET, Set.class);

                put(SELECTED_CATEGORIES_FOR_QUESTIONS, String.class);
                put(SELECTED_WEEKS_FOR_QUESTIONS, String.class);
                put(ID_OF_CURRENTLY_PLAYING_AUDIO_FEED, Integer.class);

                put(TODAY, String.class);
                put(NUMBER_OF_TIMES_USER_ENTERS_THE_APP, Integer.class);
                put(CONDITION_ID, String.class);

                put(DATE_TYPE, String.class);
                put(DATE_VALUE, String.class);

                put(PARENT, String.class);
                put(PARENT_UPDATED, String.class);

                put(DOCTOR_1, String.class);
                put(DOCTOR_2, String.class);
                put(DOCTOR_3, String.class);
                put(DOCTOR_4, String.class);
                put(DOCTOR_5, String.class);
                put(DOCTOR_6, String.class);
                put(DOCTOR_7, String.class);
                put(DOCTOR_8, String.class);
                put(DOCTOR_9, String.class);
                put(DOCTOR_10, String.class);

                put(PARTNER_ID, String.class);
                put(PARTNER_NAME, String.class);
                put(PARTNER_EMAIL_ID, String.class);
                put(PARTNER_COUNTRY_CODE, String.class);
                put(PARTNER_MOBILE_NUMBER, String.class);
                put(PARTNER_IMAGE_LOCATION, String.class);

                put(NUMBER_OF_GLASSES_FILLED_BY_USER, Integer.class);
                put(SELECTED_FITNESS_PLAN, String.class);
                put(SELECTED_DIET_PLAN, String.class);
                put(DIET_PLAN_ID_SELECTED_BY_USER, Integer.class);

                put(MET_STREE_COMPANION, String.class);
                put(MET_STREE_FEED, String.class);
                put(DIET_PLAN_MODEL_UNDERSTOOD_CLICKED_BY_PATIENT, Boolean.class);
                put(FITNESS_PLAN_MODEL_UNDERSTOOD_CLICKED_BY_PATIENT, Boolean.class);

                put(SKIP_USER_WANTS_TO_LOGIN, String.class);

                put(PAYEE_ID, String.class);

                put(CREATE_PAYEE, Boolean.class);
            }}
    );

    String CONTENT_ID = "contentId";
    String COMMENT = "comment";
    String COMMENT_TYPE = "commentType";
    String COMMENT_SOURCE = "commentSource";
    String COMMENT_ID = "commentId";
    String COMMENT_BY = "commentBy";
    String COMMENTER_DETAILS = "commenterDetails";
    String COMMENT_BY_NAME = "commentByName";
    String COMMENT_BY_IMAGE_LOCATION = "commentByImageLocation";
    String COMMENT_DATE = "commentDate";
    String TYPE_OF_USER = "typeOfUser";
    String GROUP_GOAL = "groupGoal";

    String FILE_VIEWER = "fileViewer";
    String GALLERY = "gallery";
    String CAMERA = "camera";
    String AUDIO = "audio";
    String VIDEO_CAMERA = "videoCamera";
    String CONSULTATION = "consultation";

    String COLON = ":";

    String UPLOAD_TIME = "uploadTime";

    String CONSTRUCTOR_ARGUMENTS = "constructorArguments";
    String LAYOUT_NAME = "layoutName";
    String MEDIA = "media";
    String PROMO = "promo";
    String WIDTH = "width";
    String CLASS_NAME = "className";

    String DELIMITER_FOR_ANYTHING_IN_FEED = "##########";
    String FEED = "feed";
    String FEED_CLASS = "feedClass";
    String FEED_TYPE = "feedType";
    String FEED_TYPES = "feedTypes";
    String PROMOTION_VIDEOS = "promotionVideos";
    String VERTICAL_LEVEL = "verticalLevel";
    String HORIZONTAL_LEVEL = "horizontalLevel";
    String IS_FEED_CLICKABLE = "isFeedClickable";
    String ON_CLICK_ACTIVITY = "onClickActivity";
    String ACTIVITY_EXTRAS_JSON_STRING = "activityExtrasJsonString";

    String IS_LIVE = "isLive";
    String CONTENT_TYPE_VIDEO = "V";
    String CONTENT_TYPE_ARTICLE = "AR";
    String SOURCE_AWS = "AWS";
    String SOURCE_YOUTUBE = "YouTube";
    String KEY = "key";

    String ROW_TYPE = "rowType";
    String LIVE_DATE = "liveDate";
    String LIVE_START_TIME = "liveStartTime";
    String LIVE_END_TIME = "liveEndTime";
    String IS_SUBSCRIBED = "isSubscribed";
    String VIDEO_ID ="videoId";
    String VIDEO_TITLE ="videoTitle";
    String FILE_TYPE ="fileType";
    String IS_FREE =  "isFree";
    String FREE_SECONDS = "freeSeconds";

    String DISH = "dish";
    String DISH_ID ="dishId";
    String DISH_NAME = "dishName";
    String TIME_OF_DAY = "timeOfDay";
    String DIET_PREFIX = "dietPrefix";
    String DIET_SUFFIX = "dietSuffix";
    String DISH_IMAGE_LOCATION = "dishImageLocation";
    String DISH_DESCRIPTION = "dishDescription";
    String DISH_RECIPE_VIDEO = "dishRecipeVideo";
    String CREATOR_DETAILS = "creatorDetails";
    String CREATED_BY_ID = "createdById";
    String FITNESS_PLAN_ID ="fitnessPlanId";
    String FITNESS_PLAN ="fitnessPlan";
    String DIET_CENTERS = "dietCenters";
    String DIETICIAN_ID  ="dieticianId";
    String CURRENT_ITEM = "currentItem";
    String PUBLISHED_BY = "publishedBy";
    String NUMBER_OF_GLASSES_FILLED_BY_USER = "numberOfGlassesFilledByPatient";
    String DIET_PLAN_ID_SELECTED_BY_USER = "dietPlanIdSelectedByPatient";

    String ACTOR_ID = "actorId";
    String ACTOR_TYPE = "actorType";
    String ACTOR_NAME = "actorName";
    String ACTOR_IMAGE_LOCATION = "actorImageLocation";

    String OTHER_PARTY_ID = "otherPartyId";
    String OTHER_PARTY_NAME = "otherPartyName";
    String OTHER_PARTY_IMAGE_LOCATION = "otherPartyImageLocation";
    String OTHER_PARTY_TYPE="otherPartyType";

    String FROM_PATIENT = "fromPatient";
    String FAMILY_NAME = "familyName";
    String FAMILY_MEMBER_NAME = "familyMemberName";
    String FAMILY_MEMBER_COUNTRY_CODE = "familyMemberCountryCode";
    String FAMILY_MEMBER_MOBILE_NUMBER = "familyMemberMobileNumber";
    String FAMILY_MEMBER_IMAGE_LOCATION = "familyMemberImageLocation";

    String ONBOARDING_DONE = "onBoardingDone";

    String API_NAME = "apiName";
    String API_NAME_TO_GET_DATA = "apiNameToGetData";
    String API_NAME_TO_PUT_DATA = "apiNameToPutData";
    String API_NAME_TO_PUT_SUB_DATA = "apiNameToPutSubData";
    String DOCTOR_CODE = "D";
    String ASSISTANT_CODE = "DA";
    String FAMILY_CODE = "UF";
    String PARTNER_CODE = "UP";
    String DIETICIAN_CODE = "DT";
    String FITNESS_TRAINER_CODE = "FT";
    String BRAND_CODE = "B";
    String GROUP_CODE = "G";
    String PATIENT_CODE = "P";
    String USER_CODE = "U";
    String STREE_SUPPORT_CODE = "AS";

    String BRACKET_OPEN = "(";
    String BRACKET_CLOSE = ")";
    String SQUARE_BRACKET_OPEN = "[";
    String SQUARE_BRACKET_CLOSE = "]";

    String BOOKMARK_BY = "bookmarkBy";

    String REPLIES_FOR_COMMENT = "repliesForComment";
    String REPLY_ID = "replyId";
    String REPLY = "reply";
    String REPLY_BY = "replyBy";
    String REPLY_DATE = "replyDate";
    String REPLIER_DETAILS = "replierDetails";
    String EDUCATION_DETAILS = "educationDetails";
    String EXTRA_INFORMATION= "extraInformation";
    String PROFILE_INFORMATION = "profileInformation";
    String NUMBER_OF_RECOMMENDATIONS= "numberOfRecommendations";
    String DIET_PLAN_SUBSCRIPTIONS = "dietPlanSubscriptions";
    String DIET_PLAN_NAME="dietPlanName";
    String DIET_PLAN_DESCRIPTION="dietPlanDescription";
    String DIET_PLAN_TYPE ="dietPlanType";
    String DIET_PLAN_CUISINE = "dietPlanCuisine";
    String DIET_PLAN_SUBSCRIPTION_ID = "dietPlanSubscriptionId";

    String NEW_LINE = "\n";

    String PARTY_ID = "partyId";

    String PARTNER_DETAILS = "partnerDetails";
    String PARTNER_ID = "partnerId";
    String PARTNER_TYPE = "partnerType";
    String PARTNER_SALUTATION = "partnerSalutation";
    String PARTNER_TYPE_DESCRIPTION = "partnerTypeDescription";
    String PARTNER_NAME = "partnerName";
    String PARTNER_EMAIL_ID = "partnerEmailId";
    String PARTNER_COUNTRY_CODE = "partnerCountryCode";
    String PARTNER_MOBILE_NUMBER = "partner_mobile_number";
    String PARTNER_EXTRA_INFORMATION = "partnerExtraInformation";

    String ORDER_TO_SHOW_ON_SCREEN = "orderToShowOnScreen";
    String COUNT = "count";
    String GOAL_COUNT = "goal_count";
    String UNIT = "unit";
    String VIDEO_GROUP = "VideoGroup";
    String VIDEO_GROUP_DETAILS = "videoGroupDetails";
    String VIDEO = "Video";
    String VIDEO_CODE = "V";
    String VIDEO_GROUP_ID = "videoGroupId";
    String VIDEO_GROUP_NAME = "videoGroupName";
    String VIDEO_GROUP_SHORT_DESCRIPTION = "videoGroupShortDescription";
    String VIDEO_GROUP_DESCRIPTION = "videoGroupDescription";
    String VIDEO_GROUP_PRICE = "videoGroupPrice";
    String VIDEO_GROUP_UNIT = "videoGroupUnit";
    String VIDEO_GROUP_CREATED_BY_DETAILS = "videoGroupCreatedByDetails";
    String VIDEO_GROUP_CREATED_BY_TYPE = "videoGroupCreatedByType";
    String VIDEO_GROUP_CREATED_BY_ID = "videoGroupCreatedById";
    String VIDEO_GROUP_IMAGE_LOCATION = "videoGroupImageLocation";
    String VIDEO_GROUP_NUMBER_OF_LIKES = "videoGroupNumberOfLikes";
    String VIDEO_GROUP_CATEGORY_ID = "videoGroupCategoryId";
    String VIDEO_GROUP_CATEGORY_NAME = "videoGroupCategoryName";
    String VIDEO_GROUP_IS_FREE = "videoGroupIsFree";
    String VIDEO_GROUP_IS_LIKED = "videoGroupIsLiked";
    String VIDEO_GROUP_IS_SUBSCRIBED = "videoGroupIsSubscribed";
    String CREATED_BY_DETAILS = "createdByDetails";
    String _ID = "_id";
    String COMMENTS = "comments";
    String IS_COMMENT_URL = "isCommentUrl";
    String COMMENT_BY_TYPE = "commentByType";
    String COMMENT_BY_ID = "commentById";
    String REPLIES = "replies";
    String IS_REPLY_URL = "isReplyUrl";
    String REPLY_BY_TYPE = "replyByType";
    String REPLY_BY_ID = "replyById";
    String REPLY_BY_NAME = "replyByName";
    String REPLY_BY_IMAGE_LOCATION = "replyByImageLocation";
    String MONGO_DOCUMENT_ID = "mongoDocumentId";
    String VIDEO_GROUP_MONGO_DOCUMENT_ID = "videoGroupMongoDocumentId";
    String COMMENT_NUMBER = "commentNumber";
    String IS_LIKED = "isLiked";
    String IS_LIKE = "isLike";
    String LIKE_BY = "likeBy";
    String LIKE_BY_TYPE = "likeByType";
    String LIKE_BY_ID = "likeById";

    String IS_ADDED = "isAdded";

    String SPENSE = "SPENSE";

    String SELECT = "select";
    String SELECTED_WEEKS = "selectedWeeks";
    String FROM_SUPPORT = "fromSupport";

    String START = "start";
    String START_DATE = "startDate";
    String START_TIME = "startTime";
    String BEGIN_DATE = "beginDate";
    String BEGIN_TIME = "beginTime";
    String END = "end";
    String END_DATE = "endDate";
    String END_TIME = "endTime";

    String RULE = "rule";

    String HAS_COME_FROM_GOAL_CREATION_FLOW = "has_come_from_goal_creation_flow";

    String EVENT_TYPE = "eventType";
    String EVENT_DESCRIPTION = "eventDescription";
    String EVENT_LANGUAGE = "eventLanguage";

    String PRESENTER_ID = "presenterId";
    String PRESENTER_TYPE = "presenterType";
    String PRESENTER_DETAILS = "presenterDetails";
    String PRESENTER_INFORMATION = "presenterInformation";
    String IS_MULTI_AUDIENCE = "isMultiAudience";

    String MONTH = "month";
    //String DATE = "date";

    String RESPONSE = "response";

    String NOTIFICATION_ID = "notificationId";
    String NOTIFICATION_TAG = "notificationTag";

    String ORDER = "order";

    String DOT = ".";

    String URL = "url";

    String NO__ = "No";
    String YES__ = "Yes";

    String STATE = "state";
    String CITY = "city";
    String PIN_CODE = "pinCode";

    String AUTHOR_IMAGE_LOCATION = "authorImageLocation";

    String PAYMENT_ID = "paymentId";
    String PAYMENT_AMOUNT = "paymentAmount";
    String PAYMENT_CURRENCY = "paymentCurrency";

    String SERVICE_SUBSCRIPTION = "serviceSubscription";

    String ACTIVITY_OR_FRAGMENT_NAME="activityOrFragmentName";

    String FEED_ID="feedId";

    String SQLITE_USER_GOAL_DYNAMIC_CONVERSATIONS_TABLE_ID = "dynamicChatId";

    String NOTIFICATION_DATE= "notificationDate";

    String APPLICATION ="application";
    String YOUTUBE ="YOUTUBE";

    String GET_CHATS_FROM_SERVER = "getChatsFromServer";

    String SCREEN_ID = "screenId";
    String SCREEN_TITLE = "screenTitle";
    int SCREEN_ID_CHAT_SCREEN = 0;
    String SCREEN_TITLE_CHAT_SCREEN = "Barkha";

    int SEND_IMAGE_FROM_GALLERY = 10001;
    int SEND_IMAGE_FROM_CAMERA = 10002;
    int SEND_VIDEO_FROM_GALLERY = 10003;
    int SEND_VIDEO_FROM_CAMERA = 10004;
    int SEND_DOCUMENT_FROM_DEVICE = 10005;

    int STREE_CHATS_CAMERA = 9887;
    int STREE_CHATS_GALLERY = 9888;
    int STREE_CHATS_AUDIO = 9889;
    int STREE_CHATS_CAMERA_FOR_VIDEO = 9890;
    int STREE_CHATS_FILE_VIEWER_FOR_DOCUMENT = 9892;

    String IS_SUPPORT_CHAT_ADMIN = "isSupportChatAdmin";

    String FEED_IMAGE_LOCATION = "feedImageLocation";
    String FEED_AUDIO_SOURCE = "feedAudioSource";
    String FEED_AUDIO_LOCATION = "feedAudioLocation";
    String FEED_VIDEO_SOURCE = "feedVideoSource";
    String FEED_VIDEO_LOCATION = "feedVideoLocation";
    String DELIVERED = "delivered";

    String STRING = "String";
    String BOOLEAN = "Boolean";
    String INTEGER = "Integer";
    String FLOAT = "Float";
    String LONG = "Long";
    String STRING_SET = "StringSet";
    String DOUBLE = "Double";

    String IS_AUDIO_PLAYING = "isAudioPlaying";
    String AUDIO_PLAYER_INSTANCE = "audioPlayerInstance";
    String IS_ANSWER_CHECKED = "isAnswerChecked";
    String IS_CHECKED = "isChecked";

    String VERIFICATION_ID = "verificationId";
    String TOKEN = "token";

    String VERIFICATION_IN_PROGRESS = "verification_in_progress";

    int STATE_INITIALIZED = 1;
    int STATE_CODE_SENT = 2;
    int STATE_VERIFY_FAILED = 3;
    int STATE_VERIFY_SUCCESS = 4;
    int STATE_SIGN_IN_FAILED = 5;
    int STATE_SIGN_IN_SUCCESS = 6;

    String ATTRIBUTE_ID = "attributeId";
    String ATTRIBUTE_VALUE = "attributeValue";

    String hh_colon_mm_space_aa = "hh:mm aa";
    String HH_colon_mm = "HH:mm";
    String dd_hyphen_MMM = "dd-MMM";
    String dd_slash_MM_slash_yyyy = "dd/MM/yyyy";
    String dd_hyphen_MM_hyphen_yyyy = "dd-MM-yyyy";
    String dd_hyphen_MMM_hyphen_yyyy = "dd-MMM-yyyy";
    String dd_space_MMM_space_yy_space_hh_colon_mm_space_aa = "dd MMM yy hh:mm aa";
    String dd_space_MMM_comma_space_yyyy = "dd MMM, yyyy";
    String dd_space_MMM_space_yyyy = "dd MMM yyyy";
    String dd_space_MMM_space_yy = "dd MMM yy";
    String MMMM_space_yyyy = "MMMM yyyy";
    String MMM_space_yyyy = "MMM yyyy";
    String MMM_comma_space_yyyy = "MMM, yyyy";
    String MMMM_space_dd_comma_space_yyyy = "MMMM dd, yyyy";
    String yyyy_hyphen_MM_hyphen_dd = "yyyy-MM-dd";
    String dd_hyphen_MMM_space_hh_colon_mm_space_aa = "dd-MMM hh:mm aa";
    String dd_hyphen_MMM_hyphen_yyyy_space_hh_colon_mm_space_aa = "dd-MMM-yyyy hh:mm aa";
    String yyyy_hyphen_MM_hyphen_dd_space_HH_colon_mm_colon_ss = "yyyy-MM-dd HH:mm:ss";
    String yyyy_hyphen_MM_hyphen_dd_quote_T_quote_HH_colon_mm_colon_sss_quote_Z_quote = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    String yyyy_MM_dd_HH_mm_ss = "yyyy_MM_dd_HH_mm_ss";
    String dd_hyphen_MMMM_hyphen_yyyy = "dd-MMMM-yyyy";
    String dd_space_MMMM_space_yyyy = "dd MMMM yyyy";
    String DD = "dd";
    String MM = "MM";

    String MMM = "MMM";
    String YYYY = "yyyy";
    String EEE_space_MMM_space_dd_space_HH_colon_mm_colon_ss_space_Z_space_yyyy = "EEE MMM dd HH:mm:ss Z yyyy";

    String THUMBNAIL = "thumbnail";
    String THUMBNAIL_BACKGROUND = "thumbnail_background";

    int SENT_MESSAGE = 0;
    int RECEIVED_MESSAGE = 1;
    int SENT_DOCUMENT_MESSAGE = 2;
    int RECEIVED_DOCUMENT_MESSAGE = 3;
    int SENT_IMAGE_MESSAGE = 4;
    int RECEIVED_IMAGE_MESSAGE = 5;
    int SENT_AUDIO_MESSAGE = 6;
    int RECEIVED_AUDIO_MESSAGE = 7;
    int SENT_VIDEO_MESSAGE = 8;
    int RECEIVED_VIDEO_MESSAGE = 9;
    int SENT_QUESTION_MESSAGE = 10;
    int RECEIVED_QUESTION_MESSAGE = 11;
    int SENT_VIDEO_GROUP_MESSAGE = 12;
    int RECEIVED_VIDEO_GROUP_MESSAGE = 13;
    int SENT_DYNAMIC_CHAT_MESSAGE = 14;
    int RECEIVED_DYNAMIC_CHAT_MESSAGE = 15;
    int SENT_DOCTOR_CHAT_BANNER_MESSAGE = 16;
    int RECEIVED_DOCTOR_CHAT_BANNER_MESSAGE = 17;
    int SENT_STREE_PARTNER_MESSAGE = 18;
    int RECEIVED_STREE_PARTNER_MESSAGE = 19;
    int SENT_PROCESS_CHAT_MESSAGE = 20;
    int RECEIVED_PROCESS_CHAT_MESSAGE = 21;
    int RECEIVED_DOCTOR_VIDEO_CALL_BANNER = 22;

    int SENT_FEED_MESSAGE_300X180_WITH_SQUARE_IMAGE_ON_LEFT_AND_TEXT_IN_CENTER = 601;
    int SENT_FEED_MESSAGE_300X180_WITH_SQUARE_IMAGE_ON_LEFT_AND_TEXT_ON_RIGHT = 602;
    int SENT_FEED_MESSAGE_300X180_WITH_ONLY_TEXT = 603;
    int SENT_FEED_MESSAGE_360X200_AUDIO = 604;
    int SENT_FEED_MESSAGE_360X390_ARTICLE = 605;
    int SENT_FEED_MESSAGE_360X200_WITH_ONLY_TEXT = 606;
    int SENT_FEED_MESSAGE_360X300_ARTICLE = 607;
    int SENT_FEED_MESSAGE_360X300_OPINION_OR_QUESTION = 608;
    int SENT_FEED_MESSAGE_360X200_REMINDER = 609;
    int SENT_FEED_MESSAGE_360X390_VIDEO = 610;
    int SENT_FEED_MESSAGE_360X300_DOC_ANSWERS = 611;
    int SENT_FEED_MESSAGE_360X300_IMAGE = 612;
    int SENT_FEED_MESSAGE_360X300_VIDEO = 613;
    int SENT_FEED_MESSAGE_ARTICLE = 614;
    int SENT_FEED_MESSAGE_AUDIO = 615;
    int SENT_FEED_MESSAGE_VIDEO = 616;
    int SENT_FEED_MESSAGE_BANNER = 617;
    int SENT_FEED_MESSAGE_TEXT = 618;
    int SENT_FEED_MESSAGE_IMAGE = 619;
    int SENT_FEED_MESSAGE_QUESTION_AND_ANSWER = 620;
    int RECEIVED_FEED_MESSAGE_300X180_WITH_SQUARE_IMAGE_ON_LEFT_AND_TEXT_IN_CENTER = 701;
    int RECEIVED_FEED_MESSAGE_300X180_WITH_SQUARE_IMAGE_ON_LEFT_AND_TEXT_ON_RIGHT = 702;
    int RECEIVED_FEED_MESSAGE_300X180_WITH_ONLY_TEXT = 703;
    int RECEIVED_FEED_MESSAGE_360X200_AUDIO = 704;
    int RECEIVED_FEED_MESSAGE_360X390_ARTICLE = 705;
    int RECEIVED_FEED_MESSAGE_360X200_WITH_ONLY_TEXT = 706;
    int RECEIVED_FEED_MESSAGE_360X300_ARTICLE = 707;
    int RECEIVED_FEED_MESSAGE_360X300_OPINION_OR_QUESTION = 708;
    int RECEIVED_FEED_MESSAGE_360X200_REMINDER = 709;
    int RECEIVED_FEED_MESSAGE_360X390_VIDEO = 710;
    int RECEIVED_FEED_MESSAGE_360X300_DOC_ANSWERS = 711;
    int RECEIVED_FEED_MESSAGE_360X300_IMAGE = 712;
    int RECEIVED_FEED_MESSAGE_360X300_VIDEO = 713;
    int RECEIVED_FEED_MESSAGE_ARTICLE = 714;
    int RECEIVED_FEED_MESSAGE_AUDIO = 715;
    int RECEIVED_FEED_MESSAGE_VIDEO = 716;
    int RECEIVED_FEED_MESSAGE_BANNER = 717;
    int RECEIVED_FEED_MESSAGE_TEXT = 718;
    int RECEIVED_FEED_MESSAGE_IMAGE = 719;
    int RECEIVED_FEED_MESSAGE_QUESTION_AND_ANSWER = 720;

    String HAS_SIGN_UP_DIALOG_SHOWN_IN_THIS_SESSION = "hasSignUpDialogShownInThisSession";

    String WORK_ADDRESS_NAME = "workAddressName";
    String WORK_ADDRESS = "workAddress";
    String WORK_ADDRESS_LOCATION = "workAddressLocation";
    String WORK_ADDRESS_LATITUDE = "workAddressLatitude";
    String WORK_ADDRESS_LONGITUDE = "workAddressLongitude";

    String WORK_CITY = "workCity";
    String WORK_STATE = "workState";
    String WORK_PINCODE = "workPinCode";
    String TOTAL_EXPERIENCE = "totalExperience";
    String TOTAL_DAYS_TO_REACH_GOAL = "totalDaysTOReachGoal";
    String NUMBER_OF_DELIVERIES_MANAGED = "numberOfDeliveriesManaged";

    String HTTP_URL_PREFIX = "http://";
    String HTTPS_URL_PREFIX = "https://";
    String DEFAULT_PLATFORM_DELIMITER = "##########";

    String USER_PROFILE_ATTRIBUTE_SET = "userProfileAttributeSet";

    String FROM_QnA = "fromQnA";

    String IS_PARTNER_WILLING_TO_CHAT_WITH_USER = "isPartnerWillingToChatWithUser";
    String IS_PARTNER_WILLING_TO_TELE_CONSULT_USER = "isPartnerWillingToTeleConsultUser";

    String SPECIALITY_ID = "specialityId";
    String SPECIALITY_CODE = "specialityCode";
    String SPECIALITY_NAME = "specialityName";
    String SPECIALITY_TITLE = "specialityTitle";

    String DEFAULT_PLATFORM_PROCESS_LAYOUT = "defaultPlatformProcess";
    String USER_ANSWER_IDS = "userAnswerIds";
    String COMMA_SEPARATED_IDS = "commaSeparatedIds";
    String COMMA_SEPARATED_ANSWER_IDS = "commaSeparatedAnswerIds";
    String COMMA_SEPARATED_CATEGORY_IDS = "commaSeparatedCategoryIds";
    String COMMA_SEPARATED_CATEGORY_NAMES = "commaSeparatedCategoryNames";
    String COMMA_SEPARATED_PARTNER_IDS_ASSIGNED_TO = "commaSeparatedPartnerIdsAssignedTo";
    String MONGO_DB_ID = "_id";
    String MESSAGE_ID = "messageId";

    double DELHI_LATITUDE = 28.644800;
    double DELHI_LONGITUDE = 77.216721;

    String FROM_MESSAGE = "fromMessage";

    String SCREEN_TO_OPEN = "screenToOpen";
    String EVENT_ID = "eventId";
    String NEXT_EVENT_ID = "nextEventId";

    String PLATFORM_ACTIVITY = "platformActivity";

    String RECYCLER__POSITION__LEVEL__1 = "recyclerPositionLevel1";
    String RECYCLER__POSITION__LEVEL__2 = "recyclerPositionLevel2";
    String ACTIVITY__FROM__LEVEL__1 = "activityFromLevel1";
    String FRAGMENT__FROM__LEVEL__1 = "fragmentFromLevel1";
    String ACTIVITY__FROM__LEVEL__2 = "activityFromLevel2";
    String FRAGMENT__FROM__LEVEL__2 = "fragmentFromLevel2";
    String FRAGMENT_NAME = "fragmentName";
    String RECYCLER_POSITION = "recyclerPosition";
    String BACK = "back";


    Map<String, Object> FRAGMENT_NAMES = Collections.unmodifiableMap(
            new HashMap<String, Object>() {{

            }}
    );

    Map<String, Object> FRAGMENT_ACTIVITY_NAMES = Collections.unmodifiableMap(
            new HashMap<String, Object>() {{

            }}
    );

    Map<String, String> PLATFORM_ACTIVITY_SCREEN_TO_OPEN_TO_CLASS_NAME = Collections.unmodifiableMap(
            new HashMap<String, String>() {{

            }}
    );

    Map<String, Object> PLATFORM_ACTIVITY_SCREEN_TO_OPEN_TO_CLASS = Collections.unmodifiableMap(
            new HashMap<String, Object>() {{

            }}
    );

    String START_ACTIVITY_FOR_RESULT = "startActivityForResult";
    int START_ACTIVITY_FOR_RESULT_REQUEST = 900;

    String EXPLANATION = "explanation";
    String EXPLANATION_VIDEO_LOCATION = "explanationVideoLocation";
    String FREQUENCY = "frequency";

    String FAMILY_MEMBER_ID = "familyMemberId";

    String SYNC_FLAG = "syncFlag";

    String SPECIFIC_PAGE_URL = "specificPageUrl";

    Set<String> IMAGE_TYPES = Collections.unmodifiableSet(
            new HashSet<String>() {{
                add("jpeg");
                add("jpg");
                add("tiff");
                add("tif");
                add("png");
                add("gif");
            }}
    );

    Set<String> VIDEO_TYPES = Collections.unmodifiableSet(
            new HashSet<String>() {{
                add("mp4");
                add("m3u8");
            }}
    );

    Map<String, Object> ATTRIBUTES_TO_REMOVE_FROM_SHARED_PREFERENCES_ON_LOGOUT = Collections.unmodifiableMap(
            new HashMap<String, Object>() {{
                put(IS_LOGGED_IN, N);
            }}
    );

    List<String> ATTRIBUTES_TO_NOT_REMOVE_FROM_SHARED_PREFERENCES_ON_LOGOUT = Collections.unmodifiableList(
            new ArrayList<String>() {{
                add(IS_SKIP_LOGGED_IN);
                add(APP_LANGUAGE);
                add(ONBOARDING_DONE);
            }}
    );

    String ENGLISH_ = "English";
    String HINDI_ = "हिंदी";
    String TAMIL_ = "தமிழ்";
    String BENGALI_ = "বাঙালি";
    String MARATHI_ = "मराठी";
    String TELUGU_ = "తెలుగు";

    String YES_HINDI = "हाँ";

    String SELECTED_PRESCRIPTION = "selectedPrescription";
    String SELECTED_PRESCRIPTION_OBJECT = "selectedPrescriptionObject";
    String PRESCRIPTION_DATE = "prescriptionDate";
    String PRESCRIPTION_NAME = "prescriptionName";

    String SELECTED_DOCTOR = "selectedDoctor";
    String SELECTED_DOCTOR_UPDATED_IN_SERVER = "selectedDoctorUpdatedInServer";
    String DOCTOR_EXTRA_INFORMATION = "doctorExtraInformation";
    String DOCTOR_NUMBER_OF_CLINICS = "doctorNumberOfClinics";
    String DOCTOR_LATITUDE = "doctorLatitude";
    String DOCTOR_LONGITUDE = "doctorLongitude";
    String DOCTOR_CHAT_ID = "doctorChatId";

    String MEDICINE = "medicine";
    String DOSAGE = "dosage";
    String TIME = "time";
    String DAYS = "days";

    String PATIENT_IDS = "patientIds";
    String FAILURE_VALUE = "-1";
    String IS_MODULE = "isModule";
    String SELF_OR_PARTNER = "selfOrPartner";
    String RECEIVED_ON = "receivedOn";
    String LAST_ALARM_TIME = "lastAlarmTime";
    String MAXIMUM_NOTIFICATION_ID = "maximumNotificationId";
    String REGISTER = "Register";
    String ERROR_MESSAGE = "Please Try Again Later. Apologies for the Inconvenience.";
    String NOTIFICATION_EXTRA_TEXT = "extraText";
    String NOTIFICATION_IMAGES = "images";
    String NOTIFICATION_VIDEOS = "videos";
    String HAS_DOCTOR_APPROVED = "hasDoctorApproved";
    String REQUEST_DATE = "requestDate";
    String SIGN_UP = "signUp";
    String SIGN_UP_SUCCESSFUL = "SIGN_UP_SUCCESSFUL";
    String SIGN_UP_UNSUCCESSFUL = "SIGN_UP_UNSUCCESSFUL";
    String EXISTING_USER = "existingUser";
    String SHOW_TO_DOCTORS_PATIENTS_ONLY = "showToDoctorsPatientsOnly";
    String IS_INTERNAL = "isInternal";
    String OWNER_NAME = "ownerName";
    String SHOW_IN_OTHER_WEEKS = "showInOtherWeeks";
    String SHOW_IN_OTHER_LANGUAGES = "showInOtherLanguages";
    String FROM_SCREEN = "fromScreen";
    String FROM_SCREEN_CLASS = "fromScreenClass";
    String IS_REGISTERED = "isRegistered";
    String PATIENT_OBJECT = "patientObject";
    String ACTIVITY_TO_CALL = "activityToCall";
    String ACTIVITY_TO_CALL_ON_SKIP = "activityToCallOnSkip";
    String QUESTION_CATEGORY= "questionCategory";
    String ASKED_BY_NAME = "askedByName";
    String ASKED_BY_IMAGE_LOCATION = "askedByImageLocation";
    String LIKES = "likes";
    String SHARES = "shares";
    String VIDEO_LINK = "videoLink";
    String PREGNANCY_DAY = "PregnancyDay";
    String LIKED_BY = "likedBy";
    String SHARED_USING = "sharedUsing";
    String SHARED_BY = "sharedBy";
    String CONSULTATIONS = "consultations";
    String APPOINTMENTS = "appointments";
    String PRESENTER_NAME = "presenterName";
    String PRESENTER_IMAGE_LOCATION = "presenterImageLocation";
    String CURRENT_WEEK = "currentWeek";
    String CURRENT_MONTH = "currentMonth";
    String CONDITION_ID_PREGNANCY_IN_DB = "1";
    String CONDITION_ID_GYNAECOLOGY_IN_DB = "9";
    String SELECTED_EXTRA_INFORMATION_FOR_CONDITION = "extraInformationForCondition";
    String SELECTED_EXTRA_INFORMATION_IDS_FOR_CONDITION = "extraInformationIdsForCondition";
    String MEASUREMENT_INTERVAL = "measurementInterval";
    String MINIMUM_SAFE_VALUE = "minimumSafeValue";
    String MAXIMUM_SAFE_VALUE = "maximumSafeValue";
    String MEASUREMENT_UNIT = "measurementUnit";
    String IS_RANGE_IMPACTED_BY_OTHER_FACTORS = "isRangeImpactedByOtherFactors";
    String VITAL_SIGN_ID = "vitalSignId";
    String MOBILE_NUMBER_CONFIRMED = "mobileNumberConfirmed";
    String UPDATED_ON = "updatedOn";
    String FRAGMENT_CODE = "fragmentCode";
    String CONTENT = "content";
    String EXCERPT = "excerpt";
    String ATTACHMENTS = "attachments";
    String QUALIFICATION = "qualification";
    String PREVIOUS_ACTIVITY = "previousActivity";
    String SMALL_PROFILE_PHOTO_LOADED_FROM_SERVER = "smallProfilePhotoLoadedFromServer";
    String SMALL_PARTNER_PHOTO_LOADED_FROM_SERVER = "smallPartnerPhotoLoadedFromServer";
    String PARTNER_THUMBNAIL_UPLOAD_COMPLETED = "partnerThumbnailUploadComplete";
    String SELF_THUMBNAIL_UPLOAD_COMPLETED = "selfThumbnailUploadComplete";
    String PARTNER = "partner";
    String AT_STREE_CHAT = "@stree.chat";
    String NOT_REGISTERED_YET = "notRegisteredYet";

    String DOSAGE_ = "Dosage";

    String CLEAR_ = "Clear";
    String DONE_ = "Done";
    String UPLOADING = "Uploading";

    String LOW = "Low";

    String MEDIUM = "Medium";
    String MEDIUM_HINDI = "मध्यम";

    String HIGH = "High";
    String HIGH_HINDI = "उच्च";

    String PERMISSION_NECESSARY = "Permission Necessary";
    String EXTERNAL_STORAGE_PERMISSION_NECESSARY = "External Storage Permission is Necessary";

    String DAYS_WHEN_DATE_UPDATED = "daysWhenDateUpdated";
    String DATE_UPDATED_DATE = "dateUpdatedDate";
    String NUMBER_OF_CHILDREN = "numberOfBabies";
    String PREGNANCY_TERM = "pregnancyTerm";

    String CONDITIONS_TABLE = "Conditions";
    String DIET_PLANS_TABLE = "DietPlans";
    String NOTIFICATIONS_TABLE = "Notifications";
    //String SMS_TABLE = "SmsTable";
    String SMS_TABLE = "SmsDetails";

    String PENDING_CONFIRMATION_CODE = "PC";
    String PENDING_CONFIRMATION = "PENDING CONFIRMATION";
    String NEW_CODE = "N";
    String NEW = "NEW";

    String SYMPTOMS_OR_WARNING_SIGNS = "symptomsOrWarningSigns";
    String SYMPTOMS = "symptoms";
    String SYMPTOM_ID = "symptomId";
    String SYMPTOM_INTENSITY = "Symptom Intensity";
    String SYMPTOMS_ACTIONS = "symptomsActions";
    int[] COMMON_SYMPTOMS_COLORS = {
            Color.rgb(152,251,152),
            Color.rgb(238,221,130),
            Color.rgb(205,92,92)
    };
    String WARNING_SIGNS = "warningSigns";
    String WARNING_SIGN_ID = "warningSignId";
    String WARNING_SIGN_INTENSITY = "Warning Sign Intensity";
    String WARNING_SIGNS_ACTIONS = "warningSignsActions";
    int[] WARNING_SIGNS_COLORS = {
            Color.rgb(152,251,152),
            Color.rgb(205,92,92)
    };

    String MEASUREMENT_DATE = "measurementDate";
    String BLOOD_PRESSURE = "bloodPressure";
    String SYSTOLIC_VALUE = "systolicValue";
    String SYSTOLIC_UNIT = "systolicUnit";
    String DIASTOLIC_VALUE = "diastolicValue";
    String DIASTOLIC_UNIT = "diastolicUnit";
    String PULSE_RATE = "pulseRate";
    String PULSE_RATE_VALUE = "pulseRateValue";
    String PULSE_RATE_UNIT = "pulseRateUnit";
    String TEMPERATURE = "temperature";
    String TEMPERATURE_VALUE = "temperatureValue";
    String TEMPERATURE_UNIT = "temperatureUnit";
    String WEIGHT_VALUE = "weightValue";
    String WEIGHT_UNIT = "weightUnit";

    String MORNING = "Morning";
    String AFTERNOON = "Afternoon";
    String NIGHT = "Night";

    String LOCALITY = "locality";

    String AUTHOR = "author";
    String AUTHOR_NAME = "authorName";
    String SHOW_TO_AUTHORS_PATIENTS_ONLY = "showToAuthorsPatientsOnly";

    String BOOKMARK = "streeTag";
    String FB_TAG = "fbTag";
    //String TWITTER_TAG = "twitterTag";

    String PRODUCT_TYPE = "productType";
    String DIET = "DIET";
    String PRODUCT_ID = "product_id";

    Map<String, String> VISIT_IN_NUMBER_TO_STRING_EN = Collections.unmodifiableMap(
            new HashMap<String, String>() {{
                put("1", "First");
                put("2", "Second");
                put("3", "Third");
                put("4", "Fourth");
                put("5", "Fifth");
                put("6", "Sixth");
                put("7", "Seventh");
                put("8", "Eighth");
                put("9", "Ninth");
                put("10", "Tenth");
                put("11", "Eleventh");
                put("12", "Twelfth");
                put("13", "Thirteenth");
                put("14", "Fourteenth");
                put("15", "Fifteenth");
                put("16", "Sixteenth");
                put("17", "Seventeenth");
                put("18", "Eighteenth");
                put("19", "Nineteenth");
                put("20", "Twentieth");
                put("21", "Twenty-First");
                put("22", "Twenty-Second");
                put("23", "Twenty-Third");
                put("24", "Twenty-Fourth");
                put("25", "Twenty-Fifth");
            }}
    );
    Map<String, String> VISIT_IN_NUMBER_TO_STRING_HI = Collections.unmodifiableMap(
            new HashMap<String, String>() {{
                put("1", "पहला");
                put("2", "दूसरा");
                put("3", "तीसरा");
                put("4", "चौथा");
                put("5", "पांचवां");
                put("6", "छठा");
                put("7", "सातवाँ");
                put("8", "आठवाँ");
                put("9", "नौवां");
                put("10", "दसवां");
                put("11", "ग्यारहवाँ");
                put("12", "बारहवां");
                put("13", "तेरहवां");
                put("14", "चौदहवां");
                put("15", "पंद्रहवां");
                put("16", "सोलहवां");
                put("17", "सत्रहवाँ");
                put("18", "अठारहवाँ");
                put("19", "उन्नीसवां");
                put("20", "बीसवीं");
                put("21", "इक्कीसवीं");
                put("22", "बाईस्वीं");
                put("23", "तेईसवीं");
                put("24", "चौबीस्वी");
                put("25", "पच्चीस्वी");
            }}
    );

    String VIBRATE_ON_ALARM = "vibrate_on_alarm";
    String REMINDER_TIME = "reminder_time";
    String ALARM_TIME = "alarm_time";
    String DEFAULT_REMINDER_TIME = "6";
    String DEFAULT_ALARM_TIME = "2";
    String DEFAULT_HOUR_VALUE = "12";
    //String STATIC_LOCK_NAME = "com.techsapiens.common.service.StreeNotificationService.Static";
    //String LOCAL_LOCK_NAME = "com.techsapiens.common.service.StreeNotificationService.Local";
    //String ALARM_EXTRA = "com.techsapiens.common.service.TaskAlarm";
    int REPEATING_ALARM = 1;
    int PROCRASTINATOR_ALARM = 2;

    String EXTRA_TASK = "com.techsapiens.common.service.task.TASK";
    String EXTRA_TASK_ID = "com.techsapiens.common.service.task.TASK_ID";

    String[] PRIORITY_LABELS = {"Trivial", "Normal", "Urgent"};
    String[] REPEAT_LABELS = {"minutes", "hours", "days", "weeks", "months", "years"};
    int TRIVIAL = 0;
    int NORMAL = 1;
    int URGENT = 2;

    int MINUTES_ = 0;
    int HOURS_ = 1;
    int DAYS_ = 2;
    int WEEKS_ = 3;
    int MONTHS_ = 4;
    int YEARS_ = 5;

    String FITNESS_PLAN_NAME = "fitnessPlanName";
    String FITNESS_PLAN_DATE = "fitnessPlanDate";
    String FITNESS_PLAN_DESCRIPTION = "fitnessPlanDescription";
    String EXERCISE_DESCRIPTION = "exerciseDescription";
    String EXERCISE_IMAGE_LOCATION = "exerciseImageLocation";
    String EXERCISE_YOUTUBE_LOCATION = "exerciseYoutubeLocation";

    String EARLY_MORNING = "earlyMorning";
    String BREAKFAST = "breakfast";
    String MID_MORNING = "midMorning";
    String LUNCH = "lunch";
    String EVENING_SNACKS = "eveningSnacks";
    String DINNER = "dinner";
    String BED_TIME = "bedTime";
    String MANDATORY_INTAKE = "mandatoryIntake";
    String DIET_ID = "dietId";
    String DIET_PLAN = "dietPlan";
    String DIET_PLAN_DURATION = "dietPlanDuration";
    String DIET_PLAN_DURATION_UNIT = "dietPlanDurationUnit";
    String DIET_PLAN_IMAGE_1 = "dietPlanImage1";
    String DIET_PLAN_IMAGE_2 = "dietPlanImage2";
    String DIET_PLAN_IMAGE_3 = "dietPlanImage3";
    String DIET_PLAN_IMAGE_4 = "dietPlanImage4";
    String DIET_PLAN_CREATED_BY_ID = "dietPlanCreatedById";
    String DIET_PLAN_CREATED_BY_TYPE = "dietPlanCreatedByType";
    String DISH_RECIPE_URL = "dishRecipeUrl";
    String DISH_MAJOR_CONSTITUENTS = "dishMajorConstituents";
    String DISH_RECIPE_BODY = "dishRecipeBody";

    int SCREEN_ID_Q_AND_A_SCREEN = 1;
    String SCREEN_TITLE_Q_AND_A_SCREEN = "Question-Answer";
    int SCREEN_ID_FEED_SCREEN = 2;
    String SCREEN_TITLE_FEED_SCREEN = "Articles";
    int SCREEN_ID_VIDEOS_SCREEN = 3;
    String SCREEN_TITLE_VIDEOS_SCREEN = "Videos";

    int STREE_CHATS_GALLERY_FOR_VIDEO = 9891;

    String LANGUAGE_DIALOG_TAG = "languageDialog";

    String ATTRIBUTE_NAME = "attributeName";
    String ATTRIBUTE_KEY_NAME = "NAME";
    String ATTRIBUTE_KEY_PHOTO = "PHOTO";
    String ATTRIBUTE_KEY_AGE = "AGE";
    String ATTRIBUTE_KEY_EMAIL = "EMAIL";
    String ATTRIBUTE_KEY_GENDER = "GENDER";
    String ATTRIBUTE_KEY_SALARY = "SALARY";

    String HH_colon_mm_colon_ss = "HH:mm:ss";
    String dd_space_MMM = "dd MMM";
    String dd_hyphen_MMM_hyphen_yyyy_HH_colon_mm_colon_ss = "dd-MMM-yyyy HH:mm:ss";
    String yyyy_dash ="yyyy-MM-ddTHH:mm:ss.SSS";

    String NUMBER_OF_FREE_CHATS_WITH_USER_PER_DAY = "numberOfFreeChatsWithUserPerDay";
    String PRICE_FOR_CHAT_FOR_ONE_DAY = "priceForChatForOneDay";
    String PRICE_FOR_TELE_CONSULTATION = "priceForTeleConsultation";

    String SUBSCRIPTION_ID = "subscriptionId";
    String SERVICE_ID = "serviceId";
    String SERVICE_CODE = "serviceCode";
    String SERVICE_NAME = "serviceName";
    String SERVICE_DESCRIPTION = "serviceDescription";
    String SERVICE_IMAGE = "serviceImage";
    String SERVICE_LABEL = "serviceLabel";
    String SERVICE_HELP_TEXT = "serviceHelpText";
    String BENEFITS_DESCRIPTION = "benefitsDescription";
    String TNC_DESCRIPTION = "tncDescription";
    String ATTRIBUTES_JSON = "attributesJson";

    String RECIPIENT_ID = "recipientId";
    String RECIPIENT_TYPE = "recipientType";
    String RECIPIENT_NAME = "recipientName";
    String RECIPIENT_IMAGE_LOCATION = "recipientImageLocation";

    String USER_TYPE_ID = "userTypeId";
    String USER_TYPE_NAME = "userTypeName";
    String USER_TYPE_CODE = "userTypeCode";

    String COMMA_SEPARATED_USER_TYPE_IDS = "commaSeparatedUserTypeIds";
    String COMMA_SEPARATED_USER_IDS = "commaSeparatedUserIds";

    String CHAT_MESSAGE = "chatMessage";

    String SELECTED_USER_TYPE = "selectedUserType";

    String GOOGLE_ANALYTICS_ID = "id";
    String GOOGLE_ANALYTICS_START_TIME = "startTime";
    String GOOGLE_ANALYTICS_END_TIME = "endTime";
    String GOOGLE_ANALYTICS_HAS_REACHED_BOTTOM_OF_SCREEN = "hasReachedBottomOfScreen";
    String GOOGLE_ANALYTICS_FEED_NAME = "feedName";
    String GOOGLE_ANALYTICS_EVENT_TYPE_ARTICLE = "articleFeed";
    String GOOGLE_ANALYTICS_EVENT_TYPE_VIDEO = "videoFeed";
    String VIDEO_TOTAL_TIME = "videoTotalTime";
    String VIDEO_END_TIME = "videoEndTime";
    String GOOGLE_ANALYTICS_TIMES_ATTACHMENT_USED = "timesAttachmentUsed";

    String SELECTED_MENU = "selectedMenu";

    String RESULT_REASON = "resultReason";
    String ENTER_PASSWORD = "ENTER PASSWORD";
    String SIGNUP_SUCCESSFUL = "SIGNUP SUCCESSFUL";
    String LOGIN_SUCCESSFUL = "LOGIN SUCCESSFUL";
    String PENDING_VERIFICATION = "PENDING VERIFICATION";
    String VERIFICATION_REQUEST_CANCELLED = "VERIFICATION REQUEST CANCELLED";
    String NOT_ACTIVE = "NOT ACTIVE";
    String SIGNUP_UNSUCCESSFUL = "SIGNUP UNSUCCESSFUL";
    String WRONG_PASSWORD = "WRONG PASSWORD";

    String LOGGED_IN_USER = "loggedInUser";
    String TEMPORARY_USER = "temporaryUser";

    String CHAT_FROM_ID = "chatFromId";
    String CHAT_FROM_TYPE = "chatFromType";

    String DOCUMENT = "document";
    String QUESTION_SERIAL = "questionSerial";

    String SHOW_COUNTRY_CODE_PICKER = "showCountryCodePicker";

    String SHOW_TOOLBAR = "showToolbar";

    String NUMBER_OF_UNREAD_MESSAGES = "numberOfUnreadMessages";

    String MESSAGE_DETAILS = "messageDetails";
    String MESSAGE_FROM_DETAILS = "messageFromDetails";

    String DEFAULT_CURRENCY = "INR";
    String TRANSACTIONS_SPENSE_EMAIL_ID = "transactions@spense.money";

    String UAN = "uan";
    String DOB = "dob";
    String LAST_CONTRIBUTION = "lastContribution";
    String EPF_BALANCE = "epfBalance";
    String LAST_UPDATED_DATE = "lastUpdatedDate";
    String PROJECTED_EPF = "projectedEpf";
    String RETIREMENT_DATE = "retirementDate";
    String EPF_API_DATA = "epfApiData";
    String EMPLOYEE_TOTAL = "employeeTotal";
    String EMPLOYER_TOTAL = "employerTotal";
    String GOAL_LABEL = "GOAL";
    String GOAL_LABEL_TO_EDIT = "GOAL_TO_EDIT";
    String RULE_LABEL = "RULE";
    String RULE_BREAKUP_COLOR = "RULE_BREAKUP_COLOR";
    String RULE_BREAKUP_COLOR_FADED = "RULE_BREAKUP_COLOR";
    String CARD_COLOUR_INDEX = "cardColourIndex";
    String PENDING_RECEIVED_GOAL_INVITATION = "PENDING_RECEIVED_GOAL_INVITATION";
    String ZERO_GOALS = "ZERO_GOALS";
    String ACCEPTED_SENT_GOAL_INVITATION = "ACCEPTED_SENT_GOAL_INVITATION";
    String ZERO_GOAL_RULES = "ZERO_GOAL_RULES";
    String GOAL_INVITATION = "GOAL_INVITATION";
    String GOAL_INVITATION_ACCEPTANCE = "GOAL_INVITATION_ACCEPTANCE";
    String GOAL_INVITATION_REJECTION = "GOAL_INVITATION_REJECTION";
    String NEW_NOTIFICATION = "N";
    String READ_NOTIFICATION = "R";
    String INACTIVE_NOTIFICATION = "I";
    String NOTIFICATION_TYPE_MESSAGE = "MESSAGE";
    boolean IS_UPDATE_TYPE_IMMEDIATE = false;
    String CREATE_GOAL_FLOW = "CreateGoalFlow";

    String HAS_INVITATION_BEEN_ACCEPTED = "hasInvitationBeenAccepted";
    String REJECT_CODE = "R";
    String PAUSE_CODE = "P";
    String RESUME_CODE = "R";
    String UTC_TIMEZONE_CODE = "UTC";

    String DATA = "data";
    String FIXED = "FIXED";
    String VARIABLE = "VARIABLE";
    String RUPEE_SYMBOL = "₹";
    String MANDATE_VALUE = "MANDATE_VALUE";

    int TRY_SPENSE_GOAL_ID = 14;

    String GENERIC_TIMELINE = "generic_timeline";
    String GENERIC_TIMELINE_WITH_IMAGE = "generic_timeline_with_Image";
    String GENERIC_TIMELINE_WITH_FOCUS = "generic_timeline_with_FOCUS";
    String LEFT_CHAT = "LEFT_CHAT";
    String RIGHT_CHAT = "RIGHT_CHAT";
    String IS_INVITATION = "is_invitation";

    String GOAL_MILESTONE = "GoalMilestone";
    String GOAL_TRANSACTION = "GoalTransaction";

    int CHAT_ITEM_GOAL_MILESTONE = 601;
    int CHAT_ITEM_GOAL_TRANSACTION = 602;
    int CHAT_ITEM_TEXT_SENT = 603;
    int CHAT_ITEM_TEXT_RECEIVED = 604;

    int GOAL_CHAT_ITEM_2_MEMBERS = 701;
    int GOAL_CHAT_ITEM_3_MEMBERS = 702;
    int GOAL_CHAT_ITEM_MORE_THAN_3_MEMBERS = 703;

    String PLATFORM_CHANNEL_1_ID = "platform_channel_1";
    String PLATFORM_CHANNEL_1_NAME = "Spense Notifications 1";

    String DEFAULT_COUNTRY_CODE = "+91";
    String SPENSE_BUSINESS_WHATSAPP_NO = "8073700288";
    String DEFAULT_TRANSACTION_EMAIL_ID = "transaction@spense.money";
    String DEFAULT_USER_NAME = "Spense User";
    String DEFAULT_ADMIN_NAME = "Spense Admin";

    Map<String, String> DEFAULT_RULE_EXECUTION_FREQUENCIES = Collections.unmodifiableMap(
            new HashMap<String, String>() {{
                put("EVERY_DAY", "Daily");
                put("ALTERNATE_DAY", "Every other day");
                put("EVERY_WEEK", "Weekly");
            }}
    );

    String AMOUNT_TO_SAVE_IN_EACH_EXECUTION_OF_RULE = "amountToSaveInEachExecutionOfRule";

    String HAS_COME_FROM_SCREEN_SHAKE = "hasComeFromScreenShake";
    String SHAKE_SCREENSHOT = "shakeScreenshot";

    String GOAL_PAUSED_CODE = "P";

    String FROM_MY_GOAL_ACTIVITY = "fromMyGoalActivity";
    String TO_INVITE_MEMBER_SCREEN_FROM_MY_GOAL_ACTIVITY = "goingToInviteMemberScreenFromMyGoalActivity";
    String TO_INVITE_MEMBER_SCREEN_FROM_CONTEST_ACTIVITY = "goingToInviteMemberScreenFromContestActivity";
    int TO_INVITE_MEMBER_SCREEN_FROM_MY_GOAL_ACTIVITY_RESULT = 999990;
    int TO_MAIN_ACTIVITY_RESULT = 999989;
    int GOING_BACK_TO_PREVIOUS_SCREEN_WITH_USER_GOAL_ID_RESULT = 999988;
    String GOING_FROM_CREATE_GOAL_ACTIVITY_TO_RULE_LIST_ACTIVITY = "GOING_FROM_CREATE_GOAL_ACTIVITY_TO_RULE_LIST_ACTIVITY";
    String EDIT_GOAL_INTENT = "EDIT_GOAL_INTENT";

    String TOTAL_MONEY_SAVED_BY_USER_FOR_GOAL = "totalMoneySavedByUserForGoal";
    String TOTAL_MONEY_SAVED_BY_USER_ACROSS_ALL_GOALS_IN_SPENSE = "totalMoneySavedByUserAcrossAllGoalsInSpense";
    String TOTAL_MONEY_SAVED_BY_USER_FOR_A_GOAL_OR_ACROSS_ALL_GOALS_IN_SPENSE = "totalMoneySavedByUserForGoal";

    String AMOUNT_FOR_MANUAL_DEPOSIT = "amountForManualDeposit";

    Map<String, String> PRIMITIVE_TYPE_TO_CLASS_MAPPING = Collections.unmodifiableMap(
            new HashMap<String, String>() {{
                put("int", "java.lang.Integer");
                put("float", "java.lang.Float");
                put("long", "java.lang.Long");
                put("double", "java.lang.Double");
                put("boolean", "java.lang.Boolean");
            }}
    );

    String IS_EXIT_GOAL_INTENT = "isExitGoalIntent";
    String PAUSE_SAVING_FROM_DATE = "pauseSavingFromDate";
    String PAUSE_SAVING_TO_DATE = "pauseSavingToDate";
    String SHOW_WEB_VIEW = "SHOW_WEB_VIEW";
    String EXTRA_PARAMETERS = "extraParameters";

    String ACCEPT_GOAL_INVITE_ACTIVITY = "AcceptGoalInviteActivity";
    String ACTIVE_RULES_ACTIVITY = "ActiveRulesActivity";
    String ADD_FRIEND_ACTIVITY = "AddFriendActivity";
    String ASK_CONTACT_PERMISSION_ACTIVITY = "AskContactPermissionActivity";
    String AUTO_DEPOSIT_LIST_ACTIVITY = "AutoDepositListActivity";
    String AUTO_SAVE_ACTIVITY = "AutoSaveActivity";
    String AUTO_SAVE_SELECTION_ACTIVITY = "AutoSaveSelectionActivity";
    String CREATE_GOAL_ACTIVITY = "CreateGoalActivityV2";
    String CONTEST_LEADERBOARD_ACTIVITY = "ContestLeaderboardActivity";
    String EDIT_GOAL_ACTIVITY = "EditGoalActivity";
    String EDIT_PROFILE_ACTIVITY = "EditProfileActivity";
    String EPF_ACTIVITY = "EPFActivity";
    String EPF_DETAILS_ACTIVITY = "EPFDetailsActivity";
    String EPF_EMPLOYER_CONTRIBUTIONS_ACTIVITY = "EPFEmployerContributionsActivity";
    String EPF_INPUT_ACTIVITY = "EPFInputActivity";
    String EPF_LAST_CONTRIBUTIONS_ACTIVITY = "EPFLastContributionsActivity";
    String EPF_OTP_ACTIVITY = "EPFOTPActivity";
    String EPF_REFRESH_ACTIVITY = "EPFRefreshActivity";
    String FAQ_ACTIVITY = "FAQActivity";
    String FEED_COMMENTS_ACTIVITY = "FeedCommentsActivity";
    String FEED_COMMENT_REPLIES_ACTIVITY = "FeedCommentRepliesActivity";
    String FINANCIAL_ANALYTICS_ACTIVITY = "FinancialAnalyticsActivity";
    String FIXED_DEPOSIT_ACTIVITY = "FixedDepositListActivity";
    String FULL_SCREEN_IMAGE_VIEW_ACTIVITY = "FullScreenImageViewActivity";
    String GROUP_CHAT_ACTIVITY = "GroupChatActivity";

    String GOAL_CREATION_APOLOGY_ACTIVITY = "GoalCreationApologyActivity";
    String INPUT_REFERRAL_CODE_ACTIVITY = "InputReferralCodeActivity";
    String MAIN_ACTIVITY = "MainActivity";
    String MANDATE_LIST_ACTIVITY = "MandateListActivity";
    String MY_GOAL_ACTIVITY = "MyGoalActivityV2";
    String NOTIFICATION_ACTIVITY = "NotificationActivity";
    String ONBOARDING_ACTIVITY = "OnboardingActivity";
    String ONBOARDING_STORIES_ACTIVITY = "OnboardingStoriesActivity";
    String OTP_ACTIVITY = "OtpActivity";
    String PAST_TRANSACTIONS_ACTIVITY = "PastTransactionsActivity";
    String PAYTM_TEST_ACTIVITY = "PaytmTestActivity";
    String PLATFORM_OTP_VERIFICATION_ACTIVITY = "PlatformOTPVerificationActivity";
    String PLATFORM_TO_USER_SUPPORT_CHAT_NOTIFICATION = "SupportChatActivity";
    String PROFILE_DETAILS_ACTIVITY = "ProfileDetailsActivity";
    String REFERRAL_LANDING_ACTIVITY = "ReferralLandingActivity";
    String REWARDS_RECORD_ACTIVITY = "RewardsRecordActivity";
    String RULE_LIST_ACTIVITY = "RuleListActivityV2";
    String CONTEST_DETAIL_ACTIVITY = "ContestDetailActivity";
    String SCRATCH_CARD_ACTIVITY = "ScratchCardActivity";
    String SCRATCH_CARD_LIST_ACTIVITY = "ScratchCardListActivity";
    String SELECT_GOAL_TYPE_ACTIVITY = "SelectGoalTypeActivity";
    String SELECT_RULE_BREAKUP_ACTIVITY = "SelectedRuleBreakupActivity";
    String SET_UPI_MANDATE_ACTIVITY = "SetUpiMandateActivity";
    String SIGN_IN_ACTIVITY = "SignInActivity";
    String SIGN_UP_ACTIVITY = "SignUpActivity";
    String SIGN_UP_ACTIVITY_NEW = "SignUpActivityNew";
    String SIGN_UP_INFO_ACTIVITY = "UserInfoActivity";
    String SPLIT_GOAL_TARGET_ACTIVITY = "SplitGoalTargetActivityV2";

    String SPLASH_SCREEN_ACTIVITY = "SplashScreenActivity";
    String SUPPORT_CHAT_ACTIVITY = "SupportChatActivity";
    String SUPPORT_TO_USER_CHAT_NOTIFICATION = "supportToUserChatNotification";
    String TRACK_FINANCES_ACTIVITY = "TrackFinancesActivity";
    String TRANSACTION_DEPOSIT_ACTIVITY = "TransactionDepositActivity";
    String TRANSACTION_STATUS_ACTIVITY = "TransactionStatusActivity";
    String TRANSACTION_WITHDRAW_ACTIVITY = "TransactionWithdrawActivity";
    String UPDATE_UPI_MANDATE_ACTIVITY = "UpdateUpiMandateActivity";
    String USER_GOAL_CONVERSATION_NOTIFICATION = "userGoalConversation";
    String USER_GOAL_CONVERSATION_NOTIFICATION_UNREAD_MESSAGES = "userGoalConversationUnreadMessages";
    String USER_GOAL_LEDGER_LIST_ACTIVITY = "UserGoalLedgerListActivityV2";
    String VIDEO_FEED_WITH_HLS_PLAYER_ACTIVITY = "VideoFeedWithHLSPlayerActivity";
    String VIDEO_FEED_WITH_YOU_TUBE_PLAYER_ACTIVITY = "VideoFeedWithYouTubePlayerActivity";
    String WEB_VIEW_ACTIVITY = "WebViewActivity";
    String CONTEST_LANDING_ACTIVITY = "ContestLandingActivity";
    String SPENSE_FORTUNE_ACTIVITY = "SpenseFortuneActivity";
    String CONTEST_REDEEM_ACTIVITY = "ContestRedeemActivity";
    String CONTEST_VOUCHER_ACTIVITY = "ContestVoucherActivity";
    String CONTEST_VOUCHER_LIST_ACTIVITY = "ContestVoucherListActivity";
    String PLAY_ACTIVITY = "PlayActivity";

    /*Map<String, Object> ACTIVITY_NAMES = Collections.unmodifiableMap(
            new HashMap<String, Object>() {{
                put(ADD_FRIEND_ACTIVITY, AddFriendActivity.class);
                put(ASK_CONTACT_PERMISSION_ACTIVITY, AskContactPermissionActivity.class);
                put(CONTEST_DETAIL_ACTIVITY, ContestDetailActivity.class);
                put(CONTEST_LANDING_ACTIVITY, ContestLandingActivity.class);
                put(CONTEST_LEADERBOARD_ACTIVITY, ContestLeaderboardActivity.class);
                put(CONTEST_REDEEM_ACTIVITY, ContestRedeemActivity.class);
                put(CONTEST_VOUCHER_ACTIVITY, ContestVoucherActivity.class);
                put(CONTEST_VOUCHER_LIST_ACTIVITY, ContestVoucherListActivity.class);
                put(PLAY_ACTIVITY, PlayActivity.class);
                put(TRANSACTION_DEPOSIT_ACTIVITY, TransactionDepositActivity.class);
                put(TRANSACTION_STATUS_ACTIVITY, TransactionStatusActivity.class);
                put(TRANSACTION_WITHDRAW_ACTIVITY, TransactionWithdrawActivity.class);
                put(SCRATCH_CARD_ACTIVITY, ScratchCardActivity.class);
                put(SCRATCH_CARD_LIST_ACTIVITY, ScratchCardListActivity.class);
            }}
    );*/

    String IS_GROUP_GOAL = "isGroupGoal";
    String USER_ID = "user_id";
    String PARTNER_USER_ID = "partner_user_id";
    String USER_GOAL_ID_V2 = "user_goal_id";
    String TRANSACTION_ID_V2 = "transaction_id";
    String CUSTOMER_ID_V2 = "customer_id";
    String ORDER_ID_V2 = "order_id";
    String RECURRING = "recurring";
    String RULE_FREQUENCY = "rule_frequency";
    String TEMPLATE = "template";
    String DROPDOWN = "dropdown";
    String BRAND = "brand";
    String TRANSACTION_TYPE = "transactionType";
    String TRANSACTION_VALUE = "transactionValue";
    String TRANSACTION_DEFAULT = "transactionDefault";
    String TRANSACTION_LIMIT = "transactionLimit";
    String TO_RAZORPAY_SDK = "toRazorpaySdk";
    String CURRENT = "current";
    String MIN = "min";

    String HOME_FRAGMENT = "homeFragment";
    String SAVE_FRAGMENT = "saveFragment";
    String PLAY_FRAGMENT = "playFragment";
    String INVEST_FRAGMENT = "investFragment";
    String DISCOVER_FRAGMENT = "discoverFragment";
    String GOAL_CHAT_LIST_FRAGMENT = "goalChatListFragment";

    String PREFILL_TARGET_AMOUNT = "prefillTargetAmount";
    String PREFILL_TARGET_DATE = "prefillTargetDate";
    String GROUP_GOAL_INTEREST = "groupGoalInterest";
    String SOLO_GOAL_INTEREST = "soloGoalInterest";
    String GROUP = "group";
    String INDIVIDUAL = "individual";
    String INTEREST = "interest";
    String INFO = "info";
    String HAS_CONTACT_PERMISSION_BEEN_ASKED = "hasContactPermissionBeenAsked";
    String HAS_SMS_PERMISSION_BEEN_ASKED = "hasSmsPermissionBeenAsked";
    String JOINED = "joined";
    String CONTEST_RANK = "contest_rank";
    String CONTEST_WINDOW = "contest_window";
    String IMAGES = "images";
    String VIDEOS = "videos";
    String MAX_STREAK = "max_streak";
    String HAS_CONTEST_STARTED = "hasContestStarted";

    String FACEBOOK_FORTUNE_VIEW = "fb_fortune_view";
    String FACEBOOK_APP_LAUNCH = "fb_app_launch";
    String FACEBOOK_SIGNUP_SUCCESS = "fb_signup_success";
    String FACEBOOK_PROFILE_CREATED = "fb_profile_created";
    String FACEBOOK_DISCOVER_VIEW = "fb_discover_view";
    String FACEBOOK_CHALLENGE_VIEW = "fb_challenge_view";
    String FACEBOOK_CHALLENGE_REGISTERED = "fb_challenge_registered";
    String FACEBOOK_CHALLENGE_REJECTED = "fb_challenge_rejected";
    String FACEBOOK_FORTUNE_REGISTERED = "fb_fortune_registered";
    String FACEBOOK_GOAL_CREATED = "fb_goal_created";
    String FACEBOOK_BOOSTER_RULE_ADDED = "fb_booster_rule_added";
    String FACEBOOK_RULE_ADDED = "fb_rule_added";
    String FACEBOOK_AUTO_SAVE_SUCCESS = "fb_auto_save_success";
    String FACEBOOK_AUTO_SAVE_FAILURE = "fb_auto_save_failure";
    String FACEBOOK_MANUAL_DEPOSIT_SUCCESS = "fb_manual_deposit_success";
    String FACEBOOK_MANUAL_DEPOSIT_FAILURE = "fb_manual_deposit_failure";

    String ALL_UPPERCASE = "allUpperCase";
    String TITLE_CASE = "titleCase";
    String ALL_LOWERCASE = "allLowerCase";

    String INVITE_TEMPLATE = "invite_template";
    String INVITE_IMAGE = "invite_image";

    String PAGE_NAME = "pageName";
    String REFERRAL_LEDGER_ID = "referral_ledger_id";
    String REFERRAL_CODE = "referralCode";
    String DANGER = "danger";
    String AVAILABLE_BALANCE ="availableBalance";
    String SCRATCH_REFERRER = "SCRATCH_REFERRER";
    String SCRATCH_REFEREE = "SCRATCH_REFEREE";
    String REFEREE_ID = "referee_id";
    String PAYTM_CALLBACK_URL = "https://securegw.paytm.in/theia/paytmCallback?ORDER_ID=";
    String PROVIDER = "provider";

    String PRIZE_BRACKETS = "prize_brackets";

    String BRACKET_DESCRIPTION = "bracket_description";
    String PRIZE_DESCRIPTION = "prize_description";
    String WINNER_INFO = "winner_info";
    String WINNER_NAME = "winner_name";
    String PRIZE_NAME = "prize_name";
    String CONTEST_ID = "contest_id";
    String SOURCE_ID = "source_id";
    String SOURCE_TYPE = "source_type";
    String SOURCE_NAME = "source_name";
    String USER_UPI_ID = "user_upi_id";
    String REDEEM_COUNT = "redeem_count";
    String IS_WINNER = "is_winner";
    String WINNER = "winner";
    String LIST_PRICE = "list_price";
    String SAVINGS = "savings";
    String REWARDS = "rewards";
    String CARD = "card";
    String INVENTORY_ID = "inventory_id";
    String LOGO = "logo";
    String TERMS = "terms";
    String GPAY = "gpay";
    String PAYTM = "paytm";
    String CRED = "cred";
    String PHONEPE = "phonepe";
    String VPA = "vpa";
    String LEDGER_ID = "ledger_id";
    String REWARD_LEDGER_ID = "rewward_ledger_id";
    String PURPOSE = "purpose";
    String QR_ID = "qrId";
    String EXPIRY = "expiry";
    String GPAY_PACKAGE_NAME = "com.google.android.apps.nbu.paisa.user";
    String PAYTM_PACKAGE_NAME = "net.one97.paytm";
    String PHONEPE_PACKAGE_NAME = "com.phonepe.app";
    String CRED_PACKAGE_NAME = "com.dreamplug.androidapp";
    String CREATE_PAYEE = "create_payee";
    String TO_CREATE_PAYEE = "to_create_payee";
    String PAYEE_DETAILS = "payee_details";
    String PAYEE_ID = "payee_id";
    String PAYEEID = "payeeId";
    String DEVICE_ID = "device_id";

    String PARTNER_USER_NAME = "partner_user_name";

    String REFRESH_PLAY_FRAGMENT = "REFRESH_PLAY_FRAGMENT";

    String PRODUCT_MEDIA = "product_media";
    String INVITER_ATTRIBUTES = "inviter_attributes";
    String ACCEPTED = "ACCEPTED";
    String DECLINED = "DECLINED";
    String CLICK_EVENT = "click_event";
    String NAVIGATION_EVENT = "navigation_event";
    String PAGE_VIEW_EVENT = "page_view_event";
    String CALL_TO_ACTION = "call_to_action";
    String FILL_TRANSFER = "FILL_TRANSFER";
    String TRANSFER = "TRANSFER";
    String REDEEM_TYPE = "redeem_type";
    String REDEEM_AMOUNT = "redeem_amount";
    String PRODUCT_NAME = "product_name";
    String VAINKO = "vainko";
    String VAINKO_TYPE = "vainko_type";
    String CURRENT_DAY = "CURRENT_DAY";
    String TILL_DATE = "TILL_DATE";
    String HAS_VAINKO = "has_vainko";
    String PAYWALL = "paywall";
    String ENABLED = "enabled";
    String PAYWALL_AMOUNT = "paywall_amount";
    String REWARD = "reward";
    String CONTEST_JOIN = "contest_join";
    String CONTEST_JOIN_REWARD = "contest_join_reward";
    String CONTEST_REFERRAL = "contest_referral";
    String CONTEST_DEPOSIT = "contest_deposit";
    String MAX = "max";
    String SLUG = "slug";
    String NOTIFICATION_REDIRECT = "notification_redirect";
}

