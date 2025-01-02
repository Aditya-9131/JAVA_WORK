package javamidsem.java;

public class 2201012 {
    
}
Design and develop a mini inventory management system as described below.
Class hierarchy 1: “User” is class and it has two subclasses “SuperUser” and “NormalUser”.
Class hierarchy 2: “Item” is a class and it has two subclasses “Consumables” and “NonConsumables”.
There are two more classes “Sell” and “Return”.
The data members of the classes are as follows.
User (name, dateOfBirth, Address, PAN)
SuperUser (SuperUserID, password, dateOfJoining, salary, permissibleOperations)
NormalUser (userID, dateOfJoining, salary, dutyHourPerDay)
Item (itemCode, price, AvailableQty)
Consumables (dateOfExpiry)
NonConsumables (returnCount)
Sell (dateOfSell, itemCode, quantity, totalAmount)
Return (dateOfReturn, itemCode, quantity, returnAmount)
In order to distinguish between consumable items and non-consumable items, the item code for
consumable items should be even numbers (0, 2, 4 ....) and item code for the non-consumable items should
be odd numbers (1, 3, 5.....). Hence, make appropriate arrangements in the constructors of Consumables
and NonConsumables to check if the item code is valid or not.
Make arraylists to contain the following types of objects in the systems 1) Item 2) Sell 3) Return
System supports following operations:
For SuperUser Class:
i) addNewStock (item): This will add a new item to the system [3]
ii) deleteStock ( itemcode): This will delete an existing item (represented by itemcode) from the system.
Before deleting, it should ensure that available quantity is nonzero. [5]
iii) modifyStock ( itemcode): This will update an item details (it may be price or availableQty). Item is
identified by itemcode. The new data should be taken from the user. [3]