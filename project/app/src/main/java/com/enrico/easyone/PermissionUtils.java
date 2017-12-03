package com.enrico.easyone;

import android.Manifest;
import android.app.Activity;

/**
 * Created by Enrico on 02/08/2017.
 */

class PermissionUtils {

    static final int CONTACT_REQUEST_CODE = 1;
    static final int CALL_REQUEST_CODE = 2;

    static void requestCallPermission(Activity activity) {
        activity.requestPermissions(new String[]{Manifest.permission.CALL_PHONE}
                , PermissionUtils.CALL_REQUEST_CODE);
    }

    static void requestContactPermission(Activity activity) {

        activity.requestPermissions(new String[]{Manifest.permission.READ_CONTACTS}
                , PermissionUtils.CONTACT_REQUEST_CODE);
    }
}
