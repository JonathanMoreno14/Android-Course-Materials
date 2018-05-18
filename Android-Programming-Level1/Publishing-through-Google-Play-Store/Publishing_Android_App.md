# Publishing Your Android Application

This is an updated version there have been several updates and changes to the Google Developer Console



Using Android Studio on the top center you will click on the **Build** and click on **Generate signed APK**

![1](https://user-images.githubusercontent.com/11635523/40245622-df080d36-5a8b-11e8-92e1-aaa7b582c292.png)

If this is your first time publishing your Android application then you will need to create a **KeyStore** path

*KeyStore is responsible for maintaining cryptographic keys and their owners. -Android Developer API*

You will then need to provide a **key store password**, **key Alias**, and **key password** for your application. The key Alias is a hint for the type of application you are using.


![2](https://user-images.githubusercontent.com/11635523/40245623-df232634-5a8b-11e8-9975-fce5e46fd7a6.png)

You will need to select a path to store the KeyStore

![3](https://user-images.githubusercontent.com/11635523/40245624-df475996-5a8b-11e8-9bb6-7591e58ab98f.png)

In this example, the KeyStore path was added to AndroidStudioProjects folder and created a folder to store the KeyStores


![4](https://user-images.githubusercontent.com/11635523/40245625-df5dffd4-5a8b-11e8-9c98-afded19f9229.png)


Once the path is chosen and the password is selected along with the alias of your choice you click on **OK**

-**Please make sure to save you password for future use if needed  to update the application**

![5](https://user-images.githubusercontent.com/11635523/40245626-df741d46-5a8b-11e8-99e6-62a53ac046c3.png)

Then you click on **Next**


![6](https://user-images.githubusercontent.com/11635523/40245628-df8e25ba-5a8b-11e8-90f7-52b1a166eeba.png)

Google added a new type of signature feature. Here you will select either **V1 (Jar Signature)** or **V2 (Full APK Signature)** for more information you can view the [Android Source](https://source.android.com/security/apksigning/v2) website and [Stackoverflow](https://stackoverflow.com/questions/42648499/difference-between-signature-versions-v1jar-signature-and-v2full-apk-signat).

![7](https://user-images.githubusercontent.com/11635523/40245629-dfaa8dae-5a8b-11e8-985e-0aef18a61d40.png)

From there you will click **Finish** Android Studio will generate the APK.

![8](https://user-images.githubusercontent.com/11635523/40245630-dfc10642-5a8b-11e8-91a6-22104440bfa5.png)


Once the APK has been generated you will need to go to **Google Developer Console** The console is used to upload and distribute your finished Android Applications.

On the upper right corner you will see a **CREATE APPLICATION** button and you will select it.

![9](https://user-images.githubusercontent.com/11635523/40245632-dfd72b0c-5a8b-11e8-8a34-c437dfbe644a.png)

A screen will pop up and ask you to add a title from there you will select **CREATE**

![10](https://user-images.githubusercontent.com/11635523/40245633-dfed4aae-5a8b-11e8-983d-1fb6b4ef1a65.png)

Once the application has been created you will be taken to this screen where you will need to add information about the app. The information will be used to share with the public and those that download your application. **Everything in the left corner can and might be used for your application**. Depending on the type of application you plan to publish  the main sections are **App release** **Store listing** **Content rating** and  **Pricing & distribution**

![11](https://user-images.githubusercontent.com/11635523/40245634-e0093f66-5a8b-11e8-966f-bf4c7c1c128b.png)

To upload your Generated Signed APK you will need to go to **App release** and click on **MANAGE**

![12](https://user-images.githubusercontent.com/11635523/40245635-e01d9312-5a8b-11e8-8de4-d2218723fc6c.png)

Google added another feature  **App signing by Google Play** you can sign up or opt out. For more information [Google Support](https://support.google.com/googleplay/android-developer/answer/7384423?hl=en) and [Securing and Optimizing Your App with Google Play App Signing](https://medium.com/mindorks/securing-and-optimizing-your-app-with-google-play-app-signing-24a3658fd319)

![13](https://user-images.githubusercontent.com/11635523/40245636-e035cf18-5a8b-11e8-9be2-a986559a19cf.png)

Once you select either to sign up or opt out you can then add the Generated Signed APK by uploading the files

![14](https://user-images.githubusercontent.com/11635523/40245637-e04c2402-5a8b-11e8-8235-50d288599e6e.png)

Once it's added...

![15](https://user-images.githubusercontent.com/11635523/40245638-e0657a42-5a8b-11e8-91bb-a23e21f2c39c.png)

One the upper right corner of the Google Developer Console screen you will select **Ready to publish**

![16](https://user-images.githubusercontent.com/11635523/40245639-e079a62a-5a8b-11e8-8fac-008844c31964.png)


![17](https://user-images.githubusercontent.com/11635523/40245640-e08eea6c-5a8b-11e8-8f44-01762875b478.png)

A pop up will show up and it will show you where you can begin working on publishing the application.

![18](https://user-images.githubusercontent.com/11635523/40245641-e0ab1232-5a8b-11e8-8397-eb36f174f82d.png)


In your **Production track** under **App release** you will click on **MANAGE**

![19](https://user-images.githubusercontent.com/11635523/40245642-e0c75f0a-5a8b-11e8-8baf-c95045e9a1b1.png)

The information about your application will be displayed, you can add new release information under **What's new in this release?**. You select **START ROLLOUT TO PRODUCTION** to begin publishing the application.

![20](https://user-images.githubusercontent.com/11635523/40245643-e0dd2de4-5a8b-11e8-88dd-85c096bcb987.png)

A popup will show asking if you would like to continue, select **CONFIRM**

![21](https://user-images.githubusercontent.com/11635523/40245644-e0f297ba-5a8b-11e8-90ef-970a7a875b51.png)

Now your application is pending publication. If everything goes well then your application will be in the Google Play Store

![22](https://user-images.githubusercontent.com/11635523/40245645-e108ae4c-5a8b-11e8-8405-5ddce44256ad.png)



***

# Common Error

If you are a beginner when you generate the APK and try to upload it to the Google Developer Console you might run into this common error. 

##### “com.example is restricted”* when uploading APK to Play Store


![error 1](https://user-images.githubusercontent.com/11635523/40244807-7cdf1066-5a89-11e8-8f52-b8bede81696e.png)

In your **app/build.gradle (Module:App)** is were you will make the change 

![error 2](https://user-images.githubusercontent.com/11635523/40244808-7cfa2f90-5a89-11e8-9629-8da9e71625ac.png)

You will replace **example** with a word you would like to use, organization, business..etc... then you **rebuild the project**

![error 3](https://user-images.githubusercontent.com/11635523/40244809-7d11231c-5a89-11e8-8299-a734d4a1989e.png)


For further reading here is a link to the stackoverflow question *[“com.example is restricted” when uploading APK to Play Store](https://stackoverflow.com/questions/17397195/com-example-is-restricted-when-uploading-apk-to-play-store)*

