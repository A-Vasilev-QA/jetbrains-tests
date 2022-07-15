# Test automation project for JetBrains main page
##### <img width="4%" align="center" title="JetBrains" src="images/logo/JetBrains.svg"><a target="_blank" href="https://jetbrains.com">JetBrains website link</a> 

### Table of contents
- [Tools and technologies](#%EF%B8%8F-tools-and-technologies)
- [Implemented test scenarios](#-implemented-test-scenarios)
- [Jenkins job](#-jenkins-job)
- [Reporting in Allure](#-reporting-in-allure)
- [Integration with Allure TestOps and Jira](#-integration-with-allure-testops-and-jira)
- [Notifications](#-notifications)
- [Video example](#-video-example)

## ⚙️ Tools and technologies
<p align="left">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenium" src="images/logo/Selenium.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg"> 
<img width="6%" title="Allure TestOps" src="images/logo/Allureee.svg">
<img width="6%" title="Jira" src="images/logo/Jira.svg">
</p>

## <img width="4%" align="center" title="JUnit5" src="images/logo/JUnit5.svg"> Implemented test scenarios
- Verify that page title contains header text
- IntelliJ IDEA page can be reached from upper menu and contains correct links
- IntelliJ IDEA download page can be reached from search field and second menu
- IntelliJ IDEA can be found on products page using filters
- PyCharm page can be reached from upper menu and contains correct links
- PyCharm download page can be reached from search field and second menu
- PyCharm can be found on products page using filters

## <img width="4%" align="center" title="Jenkins" src="images/logo/Jenkins.svg"> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/C12-AVasilevQA-JetBrains-Tests/">Job link</a>

### <img width="4%" align="center" title="Gradle" src="images/logo/Gradle.svg"> Usage examples
#### For remote launch it's needed to fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 100.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


#### Run tests with filled remote.properties:
```bash
gradle clean test
```

#### Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

#### Serve report:
```bash
allure serve build/allure-results
```
## <img width="4%" align="center" title="Allure Report" src="images/logo/Allure_Report.svg"> Reporting in Allure

#### After test execution a report is created:

#### Report overview
<img width="800" align="center" title="Allure Report" src="images/screenshots/Allure-report-overview.jpg">

#### Screeen with test suite
<img width="800" align="center" title="Allure Report" src="images/screenshots/Allure-report-suite.jpg">


## <img width="4%" align="center" title="Allure TestOps" src="images/logo/Allureee.svg"> Integration with Allure TestOps and Jira

#### Integration with TMS Allure TestOps and Jira is implemented:

#### Allure TestOps Dashboard
<img width="800" align="center" title="Allure TestOps" src="images/screenshots/Allure-test-ops-dashboard.png">

#### Allure TestOps Suite
<img width="800" align="center" title="Allure TestOps" src="images/screenshots/Allure-test-ops.png">

#### JIRA Task
<img width="800" align="center" title="Jira" src="images/screenshots/Jira.jpg">

## <img width="4%" align="center" title="Telegram" src="images/logo/Telegram.svg"> Notifications 
#### An option to send notifications via email and messengers is implemented
#### For example notifications in Telegram:
<p align="center">
<img width="400" title="Telegram" src="images/screenshots/Telegram.png">  <img width="410" title="Telegram" src="images/screenshots/Telegram-broken.png">
</p>

## <img width="4%" align="center" title="Selenoid" src="images/logo/Selenoid.svg"> Video example
#### There is an option to provide a video for every test executed in suite

#### A video example:
<img align="center" title="Selenoid" src="images/screenshots/Selenoid.gif">

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
