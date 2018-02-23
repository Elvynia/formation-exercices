import { Commercial } from './commercial';

export class Representant extends Commercial {
	calculateSalary(): number {
		return super.calculateSalary() + 800;
	}
}