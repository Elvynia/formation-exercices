import { Employee } from './employee';

export class Staff {
	employees: Array<Employee>;

	constructor() {
		this.employees = new Array<Employee>();
	}

	add(employee: Employee) {
		this.employees.push(employee);
	}
	displaySalaries() {
		for (let employee of this.employees) {
			console.log(`Salary for ${employee.name} : ${employee.calculateSalary()} EUR`);
		}
	}
	displayAverageSalary() {
		let sum = this.employees
			.map((employee) => employee.calculateSalary())
			.reduce((prevEmployee, curEmployee) => prevEmployee + curEmployee);
		console.log('Le salaire moyen est de ' + sum / this.employees.length + ' EUR');
	}
}