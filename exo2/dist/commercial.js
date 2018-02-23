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
var Commercial = /** @class */ (function (_super) {
    __extends(Commercial, _super);
    function Commercial(firstname, lastname, age, hireYear, turnover) {
        var _this = _super.call(this, firstname, lastname, age, hireYear) || this;
        _this.turnover = turnover;
        return _this;
    }
    Commercial.prototype.calculateSalary = function () {
        return this.turnover * 20 / 100;
    };
    return Commercial;
}(employee_1.Employee));
exports.Commercial = Commercial;
