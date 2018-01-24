# customannotation
This is an example of how to create custom annotation with spring and use it.

Packages:

1. com.threadminions - Base pacakage, contains main class of Spring boot.
2. com.threadminions.annotations - Package which contains annotation class and its validator class.
3. com.threadminions.model - Model packages, contains model class on which custom annotation is applied.

In this project there are two main classes:

1. SupportedValues - This is an annotation class which is used to set supported values for a particular parameter in a bean class.
2. CustomValidator - This class is used to validate a bean property against SupportedValues annotation.

