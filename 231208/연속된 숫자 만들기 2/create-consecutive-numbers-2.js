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
    arr.sort((a, b) => a - b);
    
    let result;
    if (arr[1] - arr[0] === 1 && arr[2] - arr[1] === 1) result = 0;
    else if (arr[1] - arr[0] === 2 || arr[2] - arr[1] === 2) result = 1;
    else result = 2;

    console.log(result);
    process.exit();
})