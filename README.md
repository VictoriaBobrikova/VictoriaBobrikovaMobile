# VictoriaBobrikovaMobile ex3
1. To start working you should add your access token to mobile cloud to pom.xml file between these tags <token></token>.
2. To start tests, use this maven command in terminal:
mvn clean test -P

after -P you should write the profile name which test you want to start:
- androidWeb
- iosWeb
- androidNative
- iosNative
For example: mvn clean test -PandroidWeb

Note:

! Before testing, make sure that the device you want to test on is available in cloud. 
If not, provide the id of any available device to appropriate .xml file in "test/resourses" package in row: <parameter name="udid" value=""/>, input in value "".

! If you want to test native application you should firstly install an appropriate app to device under the test in cloud from "main/resourses" folder:
.apk for android or .ipa for ios
