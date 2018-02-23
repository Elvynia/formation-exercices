import { Employee } from './employee';

export class Commercial extends Employee {
	turnover: number;
	constructor(firstname: string, lastname: string,
		age: number, hireYear: string, turnover: number) {
		super(firstname, lastname, age, hireYear);
		this.turnover = turnover;
	}

	calculateSalary(): number {
		return this.turnover * 20 / 100;
	}
}