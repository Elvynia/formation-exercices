"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Staff = /** @class */ (function () {
    function Staff() {
        this.employees = new Array();
    }
    Staff.prototype.add = function (employee) {
        this.employees.push(employee);
    };
    Staff.prototype.displaySalaries = function () {
        for (var _i = 0, _a = this.employees; _i < _a.length; _i++) {
            var employee = _a[_i];
            console.log("Salary for " + employee.name + " : " + employee.calculateSalary() + " EUR");
        }
    };
    Staff.prototype.displayAverageSalary = function () {
        var sum = this.employees
            .map(function (employee) { return employee.calculateSalary(); })
            .reduce(function (prevEmployee, curEmployee) { return prevEmployee + curEmployee; });
        console.log('Le salaire moyen est de ' + sum / this.employees.length + ' EUR');
    };
    return Staff;
}());
exports.Staff = Staff;
