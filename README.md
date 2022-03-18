<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contributing">Contributing</a></li>
  </ol>
</details>





<!-- ABOUT THE PROJECT -->
## About The Project


Welcome to Gatling Performance Testing Accelerator. Gatling is an open-source load- and performance-testing framework based on Scala, Akka and Netty.

<p align="center">
  <img width="500" height="200" src="images/gat.png">
</p>

Gatling is an load testing tool for web applications, REST API, designed for DevOps and Continuous Integration

This project contains the reusable test compoent whcih can be used to test the load testing of web application or REST API.


Here's why:
* Gatling is open source
* Very easy to integrate with Jenkins/CI
* Requires a small amount of ramp-up on Scala (however the Gatling documentation is excellent)
* Command-line based execution (Maven/SBT/Gradle)
* Gatling has good assertion libraries




### Built With



We need following tools/technologies to use all the above features.
* [Gatling](https://gatling.io/)
* [Maven](https://maven.apache.org/)
* [Gradle Maven Plugin](https://gatling.io/docs/current/extensions/maven_plugin/)
* [Scala](https://www.scala-lang.org/)


<!-- GETTING STARTED -->
## Getting Started


These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.


### Installation

1. Clone the repo
   ```sh
   git clone 
   ```
2. Build project
   ```sh
   mvn clean compile
   ```
3. Run the test
   ```sh
   mvn gatling:test -Denv.type=env -Dusers=1 -Dduration=5 -Dgatling.includes=tests.*
   ```




<!-- USAGE EXAMPLES -->
## Usage



This project is specifically designed to perform load testing for web applications and REST API's:



1. Perform load test for given application.
2. Provide Sample test to start the load testing





<!-- CONTRIBUTING -->
## Contributing



Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.



1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

