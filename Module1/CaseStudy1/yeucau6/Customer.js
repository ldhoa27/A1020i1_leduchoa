class Customer {
    get fullName() {
        return this.fullName;
    }

    set fullName(value) {
        this.fullName = value;
    }

    get identify() {
        return this.identify;
    }

    set identify(value) {
        this.identify = value;
    }

    get dateOfBirth() {
        return this.dateOfBirth;
    }

    set dateOfBirth(value) {
        this.dateOfBirth = value;
    }

    get email() {
        return this.email;
    }

    set email(value) {
        this.email = value;
    }

    get address() {
        return this.address;
    }

    set address(value) {
        this.address = value;
    }

    get typeOfCustomer() {
        return this.typeOfCustomer;
    }

    set typeOfCustomer(value) {
        this.typeOfCustomer = value;
    }

    get discount() {
        return this.discount;
    }

    set discount(value) {
        this.discount = value;
    }

    get numberOfPeople() {
        return this.numberOfPeople;
    }

    set numberOfPeople(value) {
        this.numberOfPeople = value;
    }

    get rentDays() {
        return this.rentDays;
    }

    set rentDays(value) {
        this.rentDays = value;
    }

    get typeOfService() {
        return this.typeOfService;
    }

    set typeOfService(value) {
        this.typeOfService = value;
    }

    get typeOfRoom() {
        return this.typeOfRoom;
    }

    set typeOfRoom(value) {
        this.typeOfRoom = value;
    }

    constructor(fullName, identify, dateOfBirth, email, address,
                typeOfCustomer, discount, numberOfPeople, rentDays, typeOfService, typeOfRoom) {
        this.fullName = fullName;
        this.identify = identify;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.address = address;
        this.typeOfCustomer = typeOfCustomer;
        this.discount = discount;
        this.numberOfPeople = numberOfPeople;
        this.rentDays = rentDays;
        this.typeOfService = typeOfService;
        this.typeOfRoom = typeOfRoom;
    }

    getTotalBills() {

        let costOfService = 0;
        if (this.typeOfService === "villa") {
            costOfService = 500;
        } else if (this.typeOfService === "house") {
            costOfService = 300;
        } else {
            costOfService = 100;
        }

        return costOfService * this.rentDays * (1 - this.discount / 100);
    }
}