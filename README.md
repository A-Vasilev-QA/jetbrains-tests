# Test automation project for JetBrains main page
<a target="_blank" href="https://jetbrains.com">JetBrains website link</a> <img width="6%" align="left" title="IntelliJ IDEA" src="images/logo/JetBrains.svg">
####

# Tools and technologies
<p align="left">
<img width="4%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="4%" title="Java" src="images/logo/Java.svg">
<img width="4%" title="Selenium" src="images/logo/Selenium.svg">
<img width="4%" title="Selenide" src="images/logo/Selenide.svg">
<img width="4%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="4%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="4%" title="Gradle" src="images/logo/Gradle.svg">
<img width="4%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="4%" title="GitHub" src="images/logo/GitHub.svg">
<img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> 
<img width="4%" title="Allure TestOps" src="images/logo/Allureee.svg">
<img width="4%" title="Jira" src="images/logo/Jira.svg">
</p>

# Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/%s">jenkins.autotests.cloud/job/%s</a>


# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
