export abstract class Employee {
	public get name(): string {
		return `${this.firstname} ${this.lastname}`;
	};

	constructor(public firstname: string,
		public lastname: string,
		public age: number,
		public hireYear: string) {
	}

	abstract calculateSalary(): number;
}