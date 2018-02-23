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
var Wharehouseman = /** @class */ (function (_super) {
    __extends(Wharehouseman, _super);
    function Wharehouseman(firstname, lastname, age, hireYear, hours) {
        var _this = _super.call(this, firstname, lastname, age, hireYear) || this;
        _this.hours = hours;
        return _this;
    }
    Wharehouseman.prototype.calculateSalary = function () {
        return this.hours * 65;
    };
    return Wharehouseman;
}(employee_1.Employee));
exports.Wharehouseman = Wharehouseman;
var WharehousemanWithRisk = /** @class */ (function (_super) {
    __extends(WharehousemanWithRisk, _super);
    function WharehousemanWithRisk() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    WharehousemanWithRisk.prototype.calculateSalary = function () {
        return _super.prototype.calculateSalary.call(this) + 200;
    };
    return WharehousemanWithRisk;
}(Wharehouseman));
exports.WharehousemanWithRisk = WharehousemanWithRisk;
