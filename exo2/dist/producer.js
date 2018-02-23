"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
var employee_1 = require("./employee");
var Producer = /** @class */ (function (_super) {
    __extends(Producer, _super);
    function Producer(firstname, lastname, age, hireYear, units) {
        var _this = _super.call(this, firstname, lastname, age, hireYear) || this;
        _this.units = units;
        return _this;
    }
    Producer.prototype.calculateSalary = function () {
        return this.units * 5;
    };
    return Producer;
}(employee_1.Employee));
exports.Producer = Producer;
var ProducerWithRisk = /** @class */ (function (_super) {
    __extends(ProducerWithRisk, _super);
    function ProducerWithRisk() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    ProducerWithRisk.prototype.calculateSalary = function () {
        return _super.prototype.calculateSalary.call(this) + 200;
    };
    return ProducerWithRisk;
}(Producer));
exports.ProducerWithRisk = ProducerWithRisk;
