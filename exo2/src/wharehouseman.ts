import { Employee } from './employee';

export class Wharehouseman extends Employee {
	hours: number;
	constructor(firstname: string, lastname: string,
		age: number, hireYear: string, hours: number) {
		super(firstname, lastname, age, hireYear);
		this.hours = hours;
	}

	calculateSalary(): number {
		return this.hours * 65;
	}
}

export class WharehousemanWithRisk extends Wharehouseman {
	calculateSalary(): number {
		return super.calculateSalary() + 200;
	}
}