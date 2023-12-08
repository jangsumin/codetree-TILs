const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const arr = [];

rl.on('line', input => {
    input.split(' ').map(el => arr.push(Number(el)));
    rl.close();
});

rl.on('close', () => {
    console.log(Math.min(arr[1] - arr[0], arr[2] - arr[1]) - 1);
    process.exit();
})