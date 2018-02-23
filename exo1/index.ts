const readline = require('readline');

const askNumber = readline.createInterface({
	input: process.stdin,
	output: process.stdout,
	prompt: 'Veuillez saisir un nombre entier : '
});

askNumber.prompt();
askNumber.on('line', (line: string) => {
	let d: number = parseInt(line);
	let arg1: string = d === 0 ? '0' : d < 0 ? 'négatif' : 'positif';
	let arg2: string = d % 2 === 0 ? 'pair' : 'impair';
	console.info('Le nombre saisi est %s et %s.', arg1, arg2);
});
askNumber.on('close', () => {
	console.info('Au revoir...');
	process.exit(0);
});