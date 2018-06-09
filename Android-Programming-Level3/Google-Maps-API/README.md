
# Google Maps API Setup
## Obtain a Google Maps API key

You will need to register your Android application in the **Google Developer Console**

Click on **NEW PROJECT**

![1](https://user-images.githubusercontent.com/11635523/41061003-e2216d5e-6996-11e8-852b-f34b57ce4206.png)

Select **Maps SDK for Android**

![2](https://user-images.githubusercontent.com/11635523/41061002-e20df508-6996-11e8-9534-a6cf6d7365a1.png)

Then you click on **ENABLE**

![3](https://user-images.githubusercontent.com/11635523/41061001-e1f2e678-6996-11e8-8307-f8e8a114cb9e.png)

You will then click on **Create credentials**

![4](https://user-images.githubusercontent.com/11635523/41061000-e1d93a34-6996-11e8-87fe-0c1485742b49.png)

Finally  you will select **API key**

![5](https://user-images.githubusercontent.com/11635523/41061007-e43da5d0-6996-11e8-94a9-2b1c7440e3cd.png)

You have the option of restricting key usage

> To prevent unauthorized use and quota theft, restrict your key. [Learn more](https://support.google.com/googleapi/answer/6310037?hl=en)

In this example we restricted the application to only Android apps

You will add the **Package name** and **SHA-1 certificate fingerprint**

If you auto generate a MapsActivity via Android Studio your SHA-1 certificate can be viewed via your *google_maps_api.xml(debug)* which us located in your **app/res/values/google_maps_api.xml(debug)**

You will need to add your api key in your **app/res/values/google_maps_api.xml(debug)**

```xml

 <string name="google_maps_key" templateMergeStrategy="preserve" translatable="false">YOUR_KEY_HERE</string>

```

In your **build.gradle(Module:app)** you will need to add
```gradle

implementation 'com.google.android.gms:play-services-maps:15.0.1'

```

Then add the following in your **app/manifests/AndroidManifest.xml**

*The AndroidManifest.xml will populate with the needed components needed for using Google Maps if you create a MapsActivity*

```xml

<meta-data
   android:name="com.google.android.geo.API_KEY"
   android:value="@string/google_maps_key" />

```

```java
//with moveCamera() to zoom in to the location
mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(utaCampus, 16.0f));

```


***

# References

[Google Maps Overview](https://developers.google.com/maps/documentation/android-sdk/intro?hl=en_US)

[Google Maps - Get Started](https://developers.google.com/maps/documentation/android-sdk/start)

[Android Guides Setup](https://developers.google.com/android/guides/setup)

