# cloudrobotics

Mobile Cloud Robotics as a Service studio model project

OMCRI acronym : Open Mobile Cloud Robotics Interface.

[![Build Status](https://travis-ci.org/omcri/cloudrobotics.svg?branch=master)](https://travis-ci.org/omcri/cloudrobotics)


## Install

First get a working OMCRI-Studio, in your working directory type:

```
git clone https://github.com/omcri/cloudrobotics.git
cd cloudrobotics
mvn clean install -DskipTests -Pbuild.products
```

These commands will build an Eclipse application with occiware extension. The product **OCCI-Studio** will be generated in the folder:
```
cloudrobotics/repositories/omcri.product/target/products/omcri.product/repositories/omcri.product/target/products/omcri.product/
```

Launch the application corresponding to your architecture.

## Testing

In Eclipse:
 * click on the right up icon "Open perspective" and choose **Modeling**
 * select File menu, then New and Project...
 * browse to OCCI Studio, OCCI Extension Project
 * click on Next
 * Enter a Project name and select the Referenced extensions that you need by checking the box.
 * Provide an OCCI extension name (for example myrobot) and an OCCI extension scheme (for example http://omcri.org/cloudrobotics/myrobot#).
 * Click on finish to generate the project.

It will create the modeling scheme. 
