import { Employee } from './employee';

export class Producer extends Employee {
	units: number;
	constructor(firstname: string, lastname: string,
		age: number, hireYear: string, units: number) {
		super(firstname, lastname, age, hireYear);
		this.units = units;
	}

	calculateSalary(): number {
		return this.units * 5;
	}
}

export class ProducerWithRisk extends Producer {
	calculateSalary(): number {
		return super.calculateSalary() + 200;
	}
}