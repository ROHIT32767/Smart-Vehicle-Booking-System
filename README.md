# Software Engineering - S24CS6.401
# Assignment - I
```
Gowlapalli Rohit
2021101113
```
# Smart vehicle booking system
## UML Class Diagram [Google Drive Link]()
![Alt Text](out/A1-Class/A1-Class.png)

### Description of the UML Class Diagram
>*  User
```
Represents the user of the system. Student , Teacher and Staff inherit from this class.
```
#### Attributes
```
    - isVerified - to check if the user is verified or not
    - isWalletEnabled - to check if the user has enabled wallet or not
    - isAutoDeductEnabled - to check if the user has enabled auto-deduct or not
    - moneyDue - to check the money due for the user
    - currentVehicleID - the vehicleID of the vehicle the user is currently using
    - tripHistory - the list of trips the user has taken
    - transactionHistory - the list of transactions the user has made
```
#### Methods
```
    +verify() - method to verify the user
    +newUser() - method to create a new user
    +addMoney() - method to add money to the wallet
    +setPaymentMethod() - method to set default payment method
    +uploadVerificationID() - method to upload suitable verification ID
    +getTripHistory() - method to track usage history of the user
```
>* Student
```
Represents a student of IIITH
```
#### Attributes
```
    + rollNo - roll number of the student
    - deductFromFees - to check whether if money should be collected as student fee incase of insufficient balance
    - deductFromWallet - to check whether if money should be deducted from wallet 
```
>* Teacher 
```
Represents a teacher of IIITH
```
#### Attributes
```
    + teacherID - ID of the teacher
    - designation - designation of the teacher
    - deductFromSalary - to check whether if money should be deducted from salary incase of insufficient balance
    - deductFromWallet - to check whether if money should be deducted from wallet
```
>* Staff
```
Represents a staff member of IIITH
```
#### Attributes
```
    + staffID - ID of the staff member
    - designation - designation of the staff member
    - deductFromSalary - to check whether if money should be deducted from salary incase of insufficient balance
    - deductFromWallet - to check whether if money should be deducted from wallet
```
>* Vehicle
```
Represents a vehicle in the system. Bike , Moped and Bicycle inherit from this class. It is assumed that each vehicle has QRcode attached to it.
```
#### Attributes
```
    +vehicleID - License plate number of the vehicle
    -vehicleType - Bike , Moped or Bicycle
    + QRcode - QR code to reserve the vehicle
    # reservedAt - Time at which the vehicle was reserved
    # reservedBy - User who reserved the vehicle
    - isReserved - to check if the vehicle is reserved or not
    - Color - color of the vehicle
    - tyrePressure - tyre pressure of the vehicle
    - usageHistory - list of trips the vehicle has been used for
    
```
#### Methods
```
    +scanQRcode() - method to scan the QR code of the vehicle
    +reserveVehicle() - method to reserve the vehicle
    +returnVehicle() - method to return the vehicle
    +newVehicle() - method to create a new vehicle
```
>* Bike
```
Represents a bike in the system . It is assumed that bike has a fuel tank
```
#### Attributes
``` 
 - fuelStatus - fuel status of the bike in percentage
```
>* Moped
```
Represents a moped in the system . Moped is considered to be electric
```
#### Attributes
``` 
    - batteryPercentage - battery status of the moped in percentage
```
>* Bicycle
```
Represents a bicycle in the system . It is assumed that bicylce has a basket to carry luggage
```
#### Attributes
``` 
    + basketCapacity - capacity of the basket in kg
```


