var readline = require('readline');
var askNumber = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
    prompt: 'Veuillez saisir un nombre entier : '
});
askNumber.prompt();
askNumber.on('line', function (line) {
    var d = parseInt(line);
    if (d != undefined) {
        var arg1 = d === 0 ? '0' : d < 0 ? 'négatif' : 'positif';
        var arg2 = d % 2 === 0 ? 'pair' : 'impair';
        console.info('Le nombre saisi est %s et %s.', arg1, arg2);
    }
    else {
        console.log('KO');
    }
});
askNumber.on('close', function () {
    console.info('Au revoir...');
    process.exit(0);
});
