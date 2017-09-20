# Project Title

Address book is developed for the Reece branch manager to add/remove/delete contacts from address book. Multiple address book can also be maintained.

## Getting Started

Before starting project you need to install 
* Maven 3.5.0
* JDK 1.8

### Prerequisites
Set both the JDK1.8 and Maven 3.5.0 classpath


### Runnig

In order to run the project go to the source folde rin teh command prompt


```
mvn package
```



## Running the tests

mvn package command will run all the test cases with result


## Deployment

mvn package will create the jar file which can be run using java -cp 

## Project Class

#### Domain Classes
* Contact

#### Controller Classes

* AddressBookController
  Contains the implementation of all operation create/delete, get unique contacts, maintain mutiple address book

#### Core Classes

* AddressBook
  Contains the list of contacts and name of address book.
* SimpleAddressBook
  Sub class of AddressBook to create the simple address book by name
  
#### Test Classes

* AddContactTest
* AddressBookAddContactTest
  Test the contact addition
* AddressBookControllerTest
  test the operations defined in the controller
* AddressBookRemoveContactTest
  Test only the remove contacts
* CompareContactTest
  Test comparision of objects using compareTo method defined in the contact class
  
### compareTo()
  Compares two Contacts lexicographically based on the contact name and if the names are equal compares the contact phone numbers.
	 The comparison is based on the Unicode value of each character in the contact name String and contact phone number String.
	 Comparison ignores case considerations.
	  @return 0 if contacts are equal, greater than 0 if this Contact is greater than specified Contact, and less
	  than 0, otherwise.
	  For Example:
	  returns 0 this Contact("carl", "098765") and specified Contact("CARL", "098765")
	  returns greater than 0 this Contact("David", "043214567") and specified Contact("David", "9999999999")
	  returns less than 0 this Contact("Miller", "9999999999") and specified Contact("Miller", "0422435655")
	 

## Authors

* **Farhan Rayani** - *Complete Work* - (https://github.com/farhanrayani)

