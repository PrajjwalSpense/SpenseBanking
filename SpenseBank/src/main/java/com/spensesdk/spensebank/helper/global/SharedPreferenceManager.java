package com.spensesdk.spensebank.helper.global;


import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;


import com.spensesdk.spensebank.helper.Constants;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SharedPreferenceManager implements Constants {

    private SharedPreferences sharedPreferences;

    public SharedPreferenceManager() {
    }

    public SharedPreferenceManager(Context context) {
        setSharedPreferenceManager(context.getSharedPreferences(PLATFORM_SHARED_PREFERENCE, Context.MODE_PRIVATE));
    }

    public void setSharedPreferenceManager(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    private void addToSharedPreferences(String propertyName, String propertyValue) {
        if (USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE.containsKey(propertyName)) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(propertyName, propertyValue);
            editor.apply();
        } else {
            System.out.println("The property '"+propertyName+"' is not present in 'USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE'");
        }
    }

    public void addDetailToSharedPreferencesList(Map<String, Object> values) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        for (String key: values.keySet()) {
            try {
                if (USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE.containsKey(key) || (getAllElementsInUserProfileAttributeSet() != null && getAllElementsInUserProfileAttributeSet().contains(key))) {
                    if(values.get(key) == null) {
                        editor.remove(key);
                    } else {
                        if (values.get(key) instanceof Set) {
                            //noinspection unchecked
                            editor.putStringSet(key, (Set<String>) values.get(key));
                        } else if (values.get(key) instanceof String) {
                            editor.putString(key, (String) values.get(key));
                        } else if (values.get(key) instanceof Boolean) {
                            editor.putBoolean(key, (boolean) values.get(key));
                        } else if (values.get(key) instanceof Integer) {
                            editor.putInt(key, (int) values.get(key));
                        } else if (values.get(key) instanceof Float) {
                            editor.putFloat(key, (float) values.get(key));
                        } else if (values.get(key) instanceof Long) {
                            editor.putLong(key, (long) values.get(key));
                        }
                    }
                } else {
                    throw new Exception("The property '"+key+"' is not present in 'USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE'");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        editor.apply();
    }

    public void addDetailToSharedPreferences(String propertyName, Object propertyValue) {
        try {
            if (USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE.containsKey(propertyName) || (getAllElementsInUserProfileAttributeSet() != null && getAllElementsInUserProfileAttributeSet().contains(propertyName))) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if(propertyValue == null) {
                    editor.remove(propertyName);
                } else {
                    if(USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE.get(propertyName) == String.class) {
                        editor.putString(propertyName, propertyValue.toString());
                    } else {
                        if (propertyValue instanceof Set) {
                            //noinspection unchecked
                            editor.putStringSet(propertyName, (Set<String>) propertyValue);
                        } else if (propertyValue instanceof String) {
                            editor.putString(propertyName, (String) propertyValue);
                        } else if (propertyValue instanceof Boolean) {
                            editor.putBoolean(propertyName, (Boolean) propertyValue);
                        } else if (propertyValue instanceof Integer) {
                            editor.putInt(propertyName, (Integer) propertyValue);
                        } else if (propertyValue instanceof Float) {
                            editor.putFloat(propertyName, (Float) propertyValue);
                        } else if (propertyValue instanceof Long) {
                            editor.putLong(propertyName, (Long) propertyValue);
                        }
                    }
                }
                editor.apply();
            } else {
                throw new Exception("The property '"+propertyName+"' is not present in 'USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE'");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object get(String propertyName, Object defaultValue) {
        try {
            if (USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE.containsKey(propertyName) || (getAllElementsInUserProfileAttributeSet() != null && getAllElementsInUserProfileAttributeSet().contains(propertyName))) {
                if (USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE.get(propertyName) == String.class) {
                    return sharedPreferences.getString(propertyName, (String) defaultValue);
                } else if (USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE.get(propertyName) == Integer.class) {
                    return sharedPreferences.getInt(propertyName, (Integer) defaultValue);
                } else if (USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE.get(propertyName) == Boolean.class) {
                    return sharedPreferences.getBoolean(propertyName, (Boolean) defaultValue);
                } else if (USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE.get(propertyName) == Long.class) {
                    return sharedPreferences.getLong(propertyName, (Long) defaultValue);
                } else if (USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE.get(propertyName) == Float.class) {
                    return sharedPreferences.getFloat(propertyName, (Float) defaultValue);
                } else if (USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE.get(propertyName) == Set.class) {
                    //noinspection unchecked
                    return sharedPreferences.getStringSet(propertyName, (Set<String>) defaultValue);
                } else {
                    throw new Exception("Data type incorrect for property");
                }
            } else {
                throw new Exception("The property '"+propertyName+"' is not present in 'USER_DETAIL_KEYS_AND_VALUE_TYPE_IN_SHARED_PREFERENCE'");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return defaultValue;
        }
    }

    public Set<String> getAllElementsInUserProfileAttributeSet() {
        return sharedPreferences.getStringSet(USER_PROFILE_ATTRIBUTE_SET, null);
    }

    public void emptySharedPreferences() {
        String onBoardingDone = sharedPreferences.getString(ONBOARDING_DONE, BLANK);
        String appLanguage = sharedPreferences.getString(APP_LANGUAGE, BLANK);
        String firebaseId = sharedPreferences.getString(FIREBASE_ID, BLANK);

        sharedPreferences.edit().clear().apply();

        sharedPreferences.edit().putString(ONBOARDING_DONE, onBoardingDone).apply();
        sharedPreferences.edit().putString(APP_LANGUAGE, appLanguage).apply();
        sharedPreferences.edit().putString(FIREBASE_ID, firebaseId).apply();
    }

    public void clearSharedPreferencesWhenSigningOut() {
        sharedPreferences.edit().putString(IS_LOGGED_IN, N).apply();
    }

    public void removeSpecificValueFromSharedPreferences(String propertyName) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(propertyName);
        editor.apply();
        //sharedPreferences.edit().remove(propertyName).apply();
    }

    public void removeSpecifiedList(List<String> propertyName) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        for(int i=0;i<propertyName.size();i++) {
            editor.remove(propertyName.get(i));
        }
        editor.apply();
    }

    public int getIntegerUserId() {
        return Integer.parseInt(sharedPreferences.getString(PARTNER_USER_ID, sharedPreferences.getString(ID, "0")));
    }

    public String getUserId() {
        return sharedPreferences.getString(PARTNER_USER_ID, sharedPreferences.getString(ID, BLANK));
    }

    public void setUserId(String userId) {
        addToSharedPreferences(ID, userId);
        addToSharedPreferences(PARTNER_USER_ID, userId);
    }

    public String getUserType() {
        return sharedPreferences.getString(USER_TYPE, sharedPreferences.getString(TYPE, USER_CODE));
    }

    public void setUserType(String userType) {
        addToSharedPreferences(TYPE, userType);
        addToSharedPreferences(USER_TYPE, userType);
    }

    public String getUserName() {
        return sharedPreferences.getString(PARTNER_USER_NAME, sharedPreferences.getString(NAME, BLANK));
    }

    public void setUserName(String userName) {
        addToSharedPreferences(NAME, userName);
        addToSharedPreferences(PARTNER_USER_NAME, userName);
    }

    public String getUserImageLocation() {
        return sharedPreferences.getString(USER_IMAGE_LOCATION, sharedPreferences.getString(IMAGE_LOCATION, BLANK));
    }

    public void setUserImageLocation(String userImageLocation) {
        addToSharedPreferences(IMAGE_LOCATION, userImageLocation);
        addToSharedPreferences(USER_IMAGE_LOCATION, userImageLocation);
    }

    @NonNull
    public String toString() {
        return sharedPreferences.toString();
    }

    public Object getPropertyInSharedPreferences(Context context, String key, String valueType) {
        if(sharedPreferences == null) {
            System.out.println("SharedPreferences object is NULL. Kindly check getPropertyInSharedPreferences() in SharedPreferenceManager.java");
            return null;
        }
        if (valueType.equalsIgnoreCase(STRING)) {
            return sharedPreferences.getString(key, BLANK);
        } else if (valueType.equalsIgnoreCase(BOOLEAN)) {
            return sharedPreferences.getBoolean(key, false);
        } else if(valueType.equalsIgnoreCase(INTEGER)) {
            return sharedPreferences.getInt(key, -1);
        } else if(valueType.equalsIgnoreCase(FLOAT)) {
            return sharedPreferences.getFloat(key, -1);
        } else if(valueType.equalsIgnoreCase(LONG)) {
            return sharedPreferences.getLong(key, -1);
        } else if(valueType.equalsIgnoreCase(STRING_SET)) {
            return sharedPreferences.getStringSet(key, null);
        }
        return null;
    }

    public void setPropertyInSharedPreferences(Context context, String key, String valueType, Object value) {
        if (sharedPreferences == null) {
            System.out.println("SharedPreferences object is NULL. Kindly check setPropertyInSharedPreferences() in SharedPreferenceManager.java");
            return;
        }
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if (valueType.equalsIgnoreCase(STRING)) {
            String value_ = (String) value;
            editor.putString(key, value_);
        } else if (valueType.equalsIgnoreCase(BOOLEAN)) {
            boolean value_ = (boolean) value;
            editor.putBoolean(key, value_);
        } else if(valueType.equalsIgnoreCase(INTEGER)) {
            int value_ = (int) value;
            editor.putInt(key, value_);
        } else if(valueType.equalsIgnoreCase(FLOAT)) {
            float value_ = (float) value;
            editor.putFloat(key, value_);
        } else if(valueType.equalsIgnoreCase(LONG)) {
            long value_ = (long) value;
            editor.putLong(key, value_);
        } else if(valueType.equalsIgnoreCase(STRING_SET)) {
            @SuppressWarnings("unchecked")
            Set<String> value_ = (Set<String>) value;
            editor.putStringSet(key, value_);
        }
        editor.apply();
    }

    public boolean isFirstTimeAsking(String permission) {
        return sharedPreferences.getBoolean(permission, true);
    }

    public void firstTimeAsking(String permission, boolean isFirstTime) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(permission, isFirstTime);
        editor.apply();
    }
}
