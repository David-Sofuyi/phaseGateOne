const prompt = require("prompt-sync")();

let number = Number(prompt("Enter a number: "));

if (number % 2 == 0)
    console.log("It is even");
else
    console.log("It is odd");
