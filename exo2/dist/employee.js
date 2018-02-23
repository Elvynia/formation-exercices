"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Employee = /** @class */ (function () {
    function Employee(firstname, lastname, age, hireYear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.hireYear = hireYear;
    }
    Object.defineProperty(Employee.prototype, "name", {
        get: function () {
            return this.firstname + " " + this.lastname;
        },
        enumerable: true,
        configurable: true
    });
    ;
    return Employee;
}());
exports.Employee = Employee;
