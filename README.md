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
>* LocationTracker
```
Represents Interface for tracking the location of the vehicle
```
#### Methods
```
  + startTracking() - method to start tracking the location of the vehicle
  + stopTracking() - method to stop tracking the location of the vehicle
  + getCurrentLocation() - method to get the current location of the vehicle
  + setDestination(destination: String) - method to set the destination of the vehicle
  + getRoute() - method to get the route of the vehicle
  + displayMap() - method to display the map of the vehicle
```
>* DockingStation
```
Represents a docking station in the system. It is assumed that each docking station has a QRcode attached to it.
```
#### Attributes
```
    - stationLocation - location of the station
    - vehiclesDocked - list of vehicles docked at the station
    - stationUsageHistory - list of trips the station has been used for
    - VehicleLocations - list of vehicles and their locations
    - stationCapacity - capacity of the station
    - stationMaintenanceStatus - Maintenance status of the station
    - stationSecurityStatus - Security status of the station
```
#### Methods
```
    + dockVehicle() - method to dock a vehicle at the station
    + undockVehicle() - method to undock a vehicle from the station
    + newDockingStation() - method to create a new docking station
    + updateVehicleLocatiodatan(VehicleID: String, location: String) - method to update the location of the vehicle
    + updateVehicleStatus(VehicleID: String, status: String) - method to update the status of the vehicle
    + logData(data: String): - method to log 
```
>* Transaction
```
Represents a transaction in the system . 
```
#### Attributes
```
    - transactionDate - Date of the transaction
    - transactionAmount - Amount of the transaction
    - transactionType - Type of the transaction
    - transactionStatus - Status of the transaction
    - transactionRemarks - Remarks of the transaction
    - transactionBy - User who made the transaction
    - transactionFor - Vehicle for which the transaction was made
```
#### Methods
```
    + makeTransaction() - method to make a transaction
    + updateWallet() - method to update the wallet
```
>* Trip
```
Represents a trip in the system . 
```
#### Attributes
```
    - tripStart - Start time of the trip
    - tripEnd - End time of the trip
    - tripStartLocation - DockingStation from which the trip started
    - tripEndLocation - DockingStation at which the trip ended
    - tripDistance - Distance of the trip
    - tripAmount - Amount of the trip
    - tripTransaction  - Transaction of the trip
    - tripStatus - Status of the trip
    - tripRemarks - Remarks associated with the trip
    - tripByUserID - UserID of the user who took the trip
    - tripForVehicleID - VehicleID of the vehicle for which the trip was taken
    - tripFine - Fine associated with the trip
    - Rating - Rating of the trip
```
#### Methods
```
    + newTrip() - method to create a new trip
    + updateTrip() - method to update the trip
    + deleteTrip() - method to cancel the trip
    + startTrip() - method to start the trip
    + endTrip() - method to end the trip
    + calculateTripAmount() - method to calculate the amount of the trip
    + updateVehicle() - method to update the vehicle associated with the trip
```
>* Rating 
```
Represents a rating in the system .
```
#### Attributes
```
    - Stars - Stars associated with the rating
    - Feedback - Feedback associated with the rating
```
#### Methods
```
    + giveRating() - method to give rating
    + giveFeedback() - method to give feedback
```
>* SupportManagement
```
Represents a support management in the system . 
```
#### Attributes
```
    + ticketID - ID of the ticket
    - description - Description of the ticket
    - tags - Tags associated with the ticket
    - assignedTo - Technician to whom the ticket is assigned
    - raisedByUserID - UserID of the user who raised the ticket
```
#### Methods
```
    - raiseTicket() - method to raise a ticket
    - closeIssue() - method to close the ticket
    - submitFeedback() - method to submit feedback
    - updateTicket() - method to update the ticket
```
>* Wallet 
```
Represents a wallet in the system . 
```
#### Attributes
```
    + walletID - ID of the wallet
    - walletUserID - UserID of the user who owns the wallet
    - walletBalance - Balance of the wallet
    - walletTransactions - Transactions associated with the wallet
```
#### Methods
```
    + addMoney() - method to add money to the wallet
    + deductMoney() - method to deduct money from the wallet
```
>* UPIApp
```
Represents UPI Interface in the system . 
```
#### Methods
```
  + openUPIApp() - method to open the UPI app
  + proceedWithUPI() - method to pay with UPI
```
>* MobileApp
```
Represents Mobile App in the system . 
```
#### Attributes
```
  - appVersion - version of the app
  - deviceOS - OS of the device
```
#### Methods
```
  + login() -  method to login to the app
  + logout() - method to logout of the app
  + register() - method to register to the app
  + openMobileApp() - method to open the mobile app
  + proceedWithMobileApp() - method to pay with mobile app
  + payWithWallet() - method to pay with wallet
  + showDocumentations() - method to show documentations
  + updateProfile() - method to update profile
  + displayFAQs() - method to display FAQs
  + viewNotifications() - method to view notifications
  + accessSupport() - method to access support
  + checkInbox() - method to check inbox
  + setPreferences() - method to set preferences
  + planRoute(destination: String) - method to plan route
  + viewPromotions() - method to view promotions
  + shareTripDetails() - method to share trip details
  + rateApp() - method to rate the app
  + toggleNotifications(enable: boolean) - method to toggle notifications
  + viewHistory() - method to view history
  + inviteFriends() - method to invite friends
  + redeemRewards() -  method to redeem rewards
  + reportIssue() - method to report an issue
```
>* VerificationManager
```
Represents Verification Manager in the system . It assists in verifying the user 
```
#### Methods
```
    + verifyUser() - method to verify the user
    + sendVerificationCode() - method to send verification code
    + verifyVerificationCode() - method to verify verification code
    + verifyID() - method to verify ID
```
>* SalaryDeduction
```
Represents interface for salary deduction in the system . 
```
#### Methods
```
  + deductFromSalary() - method to deduct from salary
```
>* FeeDeduction
```
Represents interface for fee deduction in the system . 
```
#### Methods
```
  + addToFees() - method to add due money to fee
```

#### Associations in the UML Class Diagram
1. **User "1" -- "0..*" Trip : Goes On >**
   - *Relationship Type:* Aggregation (Composition)
   - *Cardinality:* One user can have multiple trips (0 or more).
   - *Role Names:* User (1), Trip (0 or more)
   - *Description:* Each user can have zero or more trips, and a trip is associated with exactly one user.

2. **Trip "0..*" o-- "1..*" DockingStation : Starts/Ends At**
   - *Relationship Type:* Association
   - *Cardinality:* One trip starts and ends at one docking station; one docking station can be the start and end for multiple trips.
   - *Role Names:* Trip (0 or more), DockingStation (1 or more)
   - *Description:* A trip has a starting and ending docking station, and a docking station can be associated with multiple trips.

3. **Vehicle "1" -- "0..*" Trip : Used In >**
   - *Relationship Type:* Aggregation (Composition)
   - *Cardinality:* One vehicle can be used in multiple trips (0 or more).
   - *Role Names:* Vehicle (1), Trip (0 or more)
   - *Description:* Each vehicle can be used in zero or more trips, and a trip is associated with exactly one vehicle.

4. **Trip "1" o-- "1" Transaction : Associated With >**
   - *Relationship Type:* Association
   - *Cardinality:* One trip is associated with exactly one transaction, and one transaction is associated with exactly one trip.
   - *Role Names:* Trip (1), Transaction (1)
   - *Description:* A trip is associated with a transaction, indicating the financial aspect of the trip.

5. **User "1" -- "0..*" Transaction : Makes >**
   - *Relationship Type:* Aggregation (Composition)
   - *Cardinality:* One user can make multiple transactions (0 or more).
   - *Role Names:* User (1), Transaction (0 or more)
   - *Description:* Each user can make zero or more transactions, and a transaction is associated with exactly one user.

6. **DockingStation "0..*" o-- "0..*" Vehicle : Contains**
   - *Relationship Type:* Association
   - *Cardinality:* A docking station can contain zero or more vehicles, and a vehicle can be contained in zero or more docking stations.
   - *Role Names:* DockingStation (0 or more), Vehicle (0 or more)
   - *Description:* A docking station can have multiple vehicles, and a vehicle may be present in multiple docking stations.

7. **User "1" -- "1" Wallet : Owns >**
   - *Relationship Type:* Association
   - *Cardinality:* One user owns exactly one wallet, and one wallet is owned by exactly one user.
   - *Role Names:* User (1), Wallet (1)
   - *Description:* Each user owns a single wallet, representing the financial account associated with that user.

8. **Trip "1" *-- "0..1" Rating : has**
   - *Relationship Type:* Aggregation (Composition)
   - *Cardinality:* One trip has zero or one ratings, and one rating is associated with exactly one trip.
   - *Role Names:* Trip (1), Rating (0 or 1)
   - *Description:* Each trip can have zero or one associated ratings, and a rating is linked to exactly one trip.

9. **User "1" -- "0..*" SupportManagement : Raises**
   - *Relationship Type:* Association
   - *Cardinality:* One user can raise zero or more support tickets, and each support ticket is raised by exactly one user.
   - *Role Names:* User (1), SupportManagement (0 or more)
   - *Description:* A user can raise zero or more support tickets for assistance.

10. **User "0..*" -- "0..*" MobileApp : Uses**
    - *Relationship Type:* Association
    - *Cardinality:* Users (0 or more) can use zero or more mobile apps.
    - *Role Names:* User (0 or more), MobileApp (0 or more)
    - *Description:* Users may use zero or more mobile apps, and a mobile app can be used by multiple users.

11. **Wallet "1" *-- "0..*" Transaction : Initiates**
    - *Relationship Type:* Aggregation (Composition)
    - *Cardinality:* One wallet initiates zero or more transactions.
    - *Role Names:* Wallet (1), Transaction (0 or more)
    - *Description:* Each wallet can initiate zero or more transactions, and a transaction is associated with exactly one wallet.

12. **User "0..*" -- "0..*" Vehicle : Rides >**
    - *Relationship Type:* Association
    - *Cardinality:* Users (0 or more) can ride zero or more vehicles.
    - *Role Names:* User (0 or more), Vehicle (0 or more)
    - *Description:* Users may ride zero or more vehicles, and a vehicle can be ridden by multiple users.

13. **User "0..*" -- "0..*" DockingStation : Visits >**
    - *Relationship Type:* Association
    - *Cardinality:* Users (0 or more) can visit zero or more docking stations.
    - *Role Names:* User (0 or more), DockingStation (0 or more)
    - *Description:* Users may visit zero or more docking stations, and a docking station may be visited by multiple users.

14. **User "1" -- "0..*" Rating : Gives >**
    - *Relationship Type:* Association
    - *Cardinality:* One user can give zero or more ratings.
    - *Role Names:* User (1), Rating (0 or more)
    - *Description:* A user can give zero or more ratings for various entities.

15. **VerificationManager "1" -- "0..*" User : Verifies >**
    - *Relationship Type:* Association
    - *Cardinality:* One verification manager verifies zero or more users.
    - *Role Names:* VerificationManager (1), User (0 or more)
    - *Description:* A verification manager verifies the identity of zero or more users.
