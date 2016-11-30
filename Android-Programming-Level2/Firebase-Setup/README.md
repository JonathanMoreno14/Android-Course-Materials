## Firebase Set Up

Sign in to [Firebase.google.com](https://firebase.google.com/)

![firebase_screencast 1](https://cloud.githubusercontent.com/assets/11635523/20766095/a623264e-b6fa-11e6-80d8-406fecaab836.JPG)

Select *Get Started For Free*

![firebase_screencast 2](https://cloud.githubusercontent.com/assets/11635523/20766094/a622d1ee-b6fa-11e6-87bd-08976885d39e.JPG)

Then select *Create new Project*

![firebase_screencast 3](https://cloud.githubusercontent.com/assets/11635523/20766096/a626d884-b6fa-11e6-94b7-b5558184b737.JPG)

Create a proejct name for yout firebase project

![firebase_screencast 4](https://cloud.githubusercontent.com/assets/11635523/20766093/a62222a8-b6fa-11e6-9b62-00e57ed2de97.JPG)

Once you create your project select the platform you will be using. We will select **Add Firebase to your Android app**

![firebase_screencast 5](https://cloud.githubusercontent.com/assets/11635523/20766155/e7822392-b6fa-11e6-8d1c-4b076a77f2ab.JPG)

Next you will need to add you **Package name** You can find the package name via your **AndroidManifext.xml** file. From there you have the option to add an App nickname and a **SHA-1 certificate** There are many ways to obtain your **SHA-1**

![firebase_screencast 6](https://cloud.githubusercontent.com/assets/11635523/20766156/e7881b4e-b6fa-11e6-816c-4f566a84ce47.JPG)

Furthermore, you will need to add a **google-services.json** file in your Android app module root directory. 

![firebase_screencast 7](https://cloud.githubusercontent.com/assets/11635523/20766158/e7888192-b6fa-11e6-95fe-7b0c6dc0e1b2.JPG)

Lastly, we will add Firebase to your Android app. You will add **classpath 'com.google.gms:google-services:3.0.0'** in your **Project-level build.gradle** and in your **App-level build.gradle**  you add apply plugin: **'com.google.gms.google-services'**


![firebase_screencast 8](https://cloud.githubusercontent.com/assets/11635523/20766157/e78834d0-b6fa-11e6-8a9d-134860e6d5ae.JPG)

---

Example **Authentication**

You select Authentication

![firebase_screencast 9](https://cloud.githubusercontent.com/assets/11635523/20766154/e76ffc76-b6fa-11e6-9e18-6df5fd0230ce.JPG)

Then you **enable** EmailPassword within the sing providers

![firebase_screencast 10](https://cloud.githubusercontent.com/assets/11635523/20766268/5c32c4da-b6fb-11e6-8645-8ca127e0898f.JPG)


![auth 1 empty](https://cloud.githubusercontent.com/assets/11635523/20766479/440a075a-b6fc-11e6-8374-ee3fbce74f47.JPG)

From there you add the dependencies, permissions take a look at [Android-FirebaseAuthDemo-Signup](https://github.com/JonathanMoreno14/Android-FirebaseAuthDemo-Signup)

---

![firebase_screencast 11](https://cloud.githubusercontent.com/assets/11635523/20766269/5c41f1a8-b6fb-11e6-8a0d-ebc9a3abace3.JPG)
