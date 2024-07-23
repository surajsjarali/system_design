Vechile

int id
String numberPlate
String name
String model
double average
int hourlyRate
int dailyRate
VechileType vechileType
double price
VechileStatus vechileStatus
int storeId		//fk
int noOfSeats
Vechile checkAvailability(String name,Date from,Date to,int storeId)
List<Vechile> fetchAllVechiles(int storeId)

Enum VechileType {CAR,BIKE,BUS;}

Enum VechileStatus {IN_MAINTENANCE,BOOKED,LOST,AVAILABLE}

Store

int id
int storeId
String storeName
List<Vechile> vechiles
Address address
List<Store> getAllStores()

Address

Double latitude 
Double longitude
long pincode
String city

CarRentalSystem

List<Store> stores

User

int id
String name
String drivingLicenceNumber
List<Booking> fetchUserBooking(int userId);

Booking

int bookingId
int paymentId //fk
int vechileId //fk (it can be list also)
int userId //fk
Address pickUp;
Address dropAt;
Date from;
Date to;
BookingStatus bookingStatus;
BookingType bookingType;
Booking fetchBooking(int userId);
Booking bookVechile(int vechileId,int userId);

Enum Currency{INR,USD,AED};

Payment 

int paymentId
PaymentType paymentType
PaymentStatus paymentStatus
double amount
Currency currency
Tax tax

Enum PaymentType {UPI,CASH,CREDIT,DEBIT}

Enum PaymentStatus{COMPLETED,IN_PROGRESS,FAILED}

Enum BookingStatus{SCHEDULED,IN_PROGRESS,CANCELLED,COMPLETED}

BookingType bookingType{HOURLY,DAILY}



======================================================


User 
    int userId;
    int userName;
    int drivingLicense;
Vehicle 
    int vehicleID;
    String numberPlate/vehicleNumber;
    VehicleType vehicleType;
    String companyName;
    String modelName;
    int kmDriven;
    Date manufacturingDate;
    int average;
    int cc;
    int dailyRentalCost;
    int hourlyRentalCost;
    int noOfSeat;Status status;
public enum VehicleType {
    CAR;
public enum Status {
    ACTIVE,
    INACTIVE,in maintenance, lost;
}
Bill 
    Reservation reservation;
    double totalBillAmount;
    boolean isBillPaid;
Location 
    String address;
    int pincode;
    String city;
    String state;
    String country;
PaymentDetails 
    int paymentId;
    int amountPaid;
    Date dateOfPayment;
    boolean isRefundable;
    PaymentMode paymentMode;
public enum ReservationStatus {
    SCHEDULED,
    INPROGRESS,
    COMPLETED,
    CANCELLED;
}
public enum ReservationType {
    HOURLY,
    DAILY;
}
Reservation 
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;


Store 
    int storeId;
    VehicleInventoryManagement inventoryManagement;
    Location storeLocation;
    List<Reservation> reservations = new ArrayList<>();
VehicleInventoryManagement 
    List<Vehicle> vehicles;
VehicleRentalSystem 
    List<Store> storeList;
    List<User> userList;
