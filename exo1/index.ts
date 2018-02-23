const readline = require('readline');

const askNumber = readline.createInterface({
	input: process.stdin,
	output: process.stdout,
	prompt: 'Veuillez saisir un nombre entier : '
});

const quit = () => {
	console.info('Au revoir...');
	process.exit(0);
}

askNumber.prompt();
askNumber.on('line', (line: string) => {
	if (line.match(/\d+/)) {
		let d: number = parseInt(line);
		let arg1: string = d === 0 ? '0' : d < 0 ? 'négatif' : 'positif';
		let arg2: string = d % 2 === 0 ? 'pair' : 'impair';
		console.info('Le nombre saisi est %s et %s.', arg1, arg2);
	} else if (line === 'exit') {
		quit();
	} else {
		console.warn('Le nombre saisi est invalide, veuillez recommencer.');
	}
	askNumber.prompt();
});
askNumber.on('close', () => {
	quit();
});