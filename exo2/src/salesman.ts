import { Commercial } from './commercial';

export class Salesman extends Commercial {
	calculateSalary(): number {
		return super.calculateSalary() + 400;
	}
}