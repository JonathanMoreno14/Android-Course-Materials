# Setting up Firebase for Android 

This is an updated version for setting up Firebase for Android

### Create a project


Go to the [Firebase](https://firebase.google.com/) website and login

From there **GO TO CONSOLE** and click on **Add project**

![1](https://user-images.githubusercontent.com/11635523/40329147-457a94d8-5d0e-11e8-8e12-89fbf61f7ab3.png)

From here you will add a Project name

![2](https://user-images.githubusercontent.com/11635523/40329148-459229ea-5d0e-11e8-962c-9b2738b2cbe8.png)

Then you will click on **CREATE PROJECT**

![3](https://user-images.githubusercontent.com/11635523/40329149-45a64c18-5d0e-11e8-9745-2f86129e3d60.png)

Then the project will be created

![4](https://user-images.githubusercontent.com/11635523/40329150-45bcc77c-5d0e-11e8-871b-3b19c4772463.png)

Once your project is ready click on **CONTINUE**

![5](https://user-images.githubusercontent.com/11635523/40329151-45d411ac-5d0e-11e8-8054-be637323bc24.png)

This is the main screen that will show

![6](https://user-images.githubusercontent.com/11635523/40329152-45eb1140-5d0e-11e8-8f48-671b2d52f0ff.png)

You will select one of the following, we will you select Android

![7](https://user-images.githubusercontent.com/11635523/40329153-4602ccea-5d0e-11e8-881c-959d321e6feb.png)


### Adding Firebase to your Android application


You will register your application on this screen

![8](https://user-images.githubusercontent.com/11635523/40329154-461a127e-5d0e-11e8-885e-18a621e6242b.png)

Add your Android package name

![9](https://user-images.githubusercontent.com/11635523/40329155-46388ff6-5d0e-11e8-8fb1-e4131c2c3644.png)

You can find you package name in your **app/build.gradle(Module:app)** within **applicationId**

<img width="606" alt="10" src="https://user-images.githubusercontent.com/11635523/40329158-466506ee-5d0e-11e8-99f9-5821aaca35f9.png">

You will register the package name

![11](https://user-images.githubusercontent.com/11635523/40329159-469259fa-5d0e-11e8-8296-eb2b4f2cfb24.png)

The App nickname and the Debug SHA-1 are optional

![12](https://user-images.githubusercontent.com/11635523/40329160-46a5dcaa-5d0e-11e8-908a-dc7e44a2a112.png)

Finally you register the application by clicking **REGISTER APP**

![13](https://user-images.githubusercontent.com/11635523/40329161-46c76938-5d0e-11e8-86bc-6863f28d6847.png)

### Configuring your application


You will download the config file **google-services.json** and add it to your **YourAppName/app**

![14](https://user-images.githubusercontent.com/11635523/40329162-46f51e78-5d0e-11e8-90d0-e9ffda2d6513.png)

Then you click on **NEXT**

![15](https://user-images.githubusercontent.com/11635523/40329163-470bf3be-5d0e-11e8-8241-d8c5bb9f725e.png)

You will add the Firebase SDK

![16](https://user-images.githubusercontent.com/11635523/40329164-472b9dcc-5d0e-11e8-8534-f8bb13d5f08f.png)

Example: You will add the classpath will be added in your **build.gradle(Module:app)**

<img width="1059" alt="17" src="https://user-images.githubusercontent.com/11635523/40329165-47436920-5d0e-11e8-86b4-8f7e349d2430.png">

Once the SDK is added you will click on **NEXT**

You can skip the verification but if you want, but if you would like to verify you will need to run your application

![18](https://user-images.githubusercontent.com/11635523/40329166-475ab53a-5d0e-11e8-9cbc-ca97f810ad27.png)

If you run your application and it's verified you will receive prompt stating you have added Firebase to your app

Finally you will click on **CONTINUE TO CONSOLE**

![19](https://user-images.githubusercontent.com/11635523/40329167-477e540e-5d0e-11e8-94a0-c129ec8ffc24.png)

After the configuration this screen will show

![20](https://user-images.githubusercontent.com/11635523/40329168-47a3dea4-5d0e-11e8-9455-bbbc64824014.png)

***

# Common Errors with setting up Firebase

#### Common Error 1

When adding the **google-services.json** file one of the most common mistakes is adding it the file outside the **app** folder

Error:
> **File google-services.json is missing. The Google Services Plugin cannot function without it.**

<img width="232" alt="commonr error 1" src="https://user-images.githubusercontent.com/11635523/40331999-f41acffe-5d17-11e8-9bc8-bdba6d1d1567.png">

You will need to add it to your **app/...**

<img width="304" alt="common error 2" src="https://user-images.githubusercontent.com/11635523/40331998-f4038920-5d17-11e8-9084-5d8f50e068f6.png">


For more information [Stackoverflow](https://stackoverflow.com/questions/33866061/error-file-google-services-json-is-missing-from-module-root-folder-the-google )

#### Common Error 2

After you have added the  **complie 'com.google.firebase:firebase-core:15.0.2'** in your **build.gradle(Module:app)** and you **sync** the gradle you will have a compile error:
> **WARNING: Configuration 'compile'is obsolete and has been replaced with 'implementation' and 'api'.**

<img width="977" alt="common error v2- 1" src="https://user-images.githubusercontent.com/11635523/40332258-18f648de-5d19-11e8-8062-fd66fcf01741.png">

<img width="1342" alt="common eror v2-2" src="https://user-images.githubusercontent.com/11635523/40332257-18db8c42-5d19-11e8-89a2-18546c569b12.png">

All you will need to do is change **compile** to **implementation**

<img width="552" alt="common error v2-3" src="https://user-images.githubusercontent.com/11635523/40332259-19132a62-5d19-11e8-8d6e-154af7f06ee0.png">

For more information [GitHub Community Forum](https://github.community/t5/Project-Development-Help-and/Android-Studio-3-1-0-Configuration-compile-is-obsolete-and-has/td-p/5393)

For additional information [Android Developer](https://developer.android.com/studio/build/gradle-plugin-3-0-0-migration)

***

# Setting up Firebase Authentication for Android

[Set up Firebase Authentication for Android](https://firebase.google.com/docs/auth/android/start/)

