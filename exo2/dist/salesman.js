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
var commercial_1 = require("./commercial");
var Salesman = /** @class */ (function (_super) {
    __extends(Salesman, _super);
    function Salesman() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Salesman.prototype.calculateSalary = function () {
        return _super.prototype.calculateSalary.call(this) + 400;
    };
    return Salesman;
}(commercial_1.Commercial));
exports.Salesman = Salesman;
