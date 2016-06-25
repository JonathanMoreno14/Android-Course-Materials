# AndroidFacebookAPISampleApp


![androidfacebookapisampleapp](https://cloud.githubusercontent.com/assets/11635523/16354074/8c399d00-3a4d-11e6-89f3-b2b817842ef7.gif)


Create a new project on [Facebook Developer console](https://developers.facebook.com/)


**Dependenciess Used**
```xml
  compile 'com.facebook.android:facebook-android-sdk:4.+'
  compile 'com.squareup.picasso:picasso:2.5.2'
```

**facebook_app_id**

You will add the Facebook App Id to your **res/values/strings.xml**

The app id will be given to you once you sign up for Facebook Developer console

```xml
 <string name="facebook_app_id">***************</string>
```




**Permissions Used**
```xml
 <uses-permission android:name="android.permission.INTERNET"/>
```

### AndroidManifest.xml

For Facebooks API you will need to add these on the Manifest file

**Meta Data** and **FacebookActivity**

```xml
   <meta-data android:name="com.facebook.sdk.ApplicationId" android:value="@string/facebook_app_id"/>

  <activity
   android:name="com.facebook.FacebookActivity"              android:configChanges="keyboard|keyboardHidden|screenLayout|screenSize|orientation"
   android:label="@string/app_name"
  android:theme="@android:style/Theme.Translucent.NoTitleBar" />
```

**Addendum**

**printHahKey** method is for Generating  Hash Keys Via **Log.d**

```java
    void printHahKey(){
        try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "androidproject.com.androidfacebookapisampleapp",
                    PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash", Base64.encodeToString(md.digest(), Base64.DEFAULT));

               // tv_keyhash.setText(Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {

        } catch (NoSuchAlgorithmException e) {

        }
    }
```





##### Reference

[Android Warriors](http://www.androidwarriors.com/2016/02/facebook-integration-in-android-studio.html)
