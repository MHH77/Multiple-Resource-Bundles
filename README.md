# Multiple-Resource-Bundles
# UserController

A Spring Boot REST controller demonstrating support for multiple resource bundles.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Usage](#usage)
- [Installation](#installation)
- [Contributing](#contributing)
- [Contact](#contact)

## Overview

This project showcases a basic implementation of a UserController in a Spring Boot application. It provides endpoints for retrieving business and validation messages in both English and Persian languages, utilizing multiple resource bundles.

## Features

- RESTful API endpoints for business and validation messages
- Support for English and Persian languages
- Internationalization support using Spring's MessageSource
- **Multiple Resource Bundles**: The application combines resources from both "validation" and "business" bundles, allowing for flexible message retrieval

## Usage

To use this controller, clone the repository and run the Spring Boot application. Then, you can make HTTP requests to the following endpoints:

### Business Messages

- English: GET `/api/messages/business/en/{key}`
- Persian: GET `/api/messages/business/fa/{key}`
- English(parameters): GET `/api/messages/business/en/{key}/{operationName}/{parameter}`
- Persian(parameters): GET `/api/messages/business/fa/{key}/{operationName}/{parameter}`

### Validation Messages

- English: GET `/api/messages/validation/en/{key}`
- Persian: GET `/api/messages/validation/fa/{key}`
<br>
<br>
* Replace `{key}` with the desired message key.
* Replace `{operationName}` with the operation name.
*  Replace `{parameter}` with the parameter.

## Installation

1. Clone the repository:
git clone [https://github.com/yourusername/usercontroller.git](https://github.com/MHH77/Multiple-Resource-Bundles.git)

3. Navigate to the project directory:
cd usercontroller

4. Build and run the application:
mvn spring-boot:run

## Contributing

Contributions are welcome! Please feel free to submit pull requests or open issues.


## Contact

MohammadHoseinEsfandiari (mesfandiari77@gmail.com)

Project Link: [Multiple-Resource-Bundles](https://github.com/MHH77/Multiple-Resource-Bundles.git)
