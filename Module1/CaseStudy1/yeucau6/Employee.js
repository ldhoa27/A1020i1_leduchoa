class Employee {
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

    get position() {
        return this.position;
    }

    set position(value) {
        this.position = value;
    }

    get salary() {
        return this.salary;
    }

    set salary(value) {
        this.salary = value;
    }

    constructor(fullName, identify, dateOfBirth, email, address, position, salary) {
        this.fullName = fullName;
        this.identify = identify;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.address = address;
        this.position = position;
        this.salary = salary;
    }

    getTotalSalary() {
        let subsidize = 0;
        if (this.position === "manager") {
            subsidize = 500;
        } else if (this.position === "sale") {
            subsidize = 300;
        } else if (this.position === "marketing") {
            subsidize = 200;
        }

        return this.salary + subsidize;
    }
}