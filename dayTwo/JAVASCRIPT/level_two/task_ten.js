const prompt = require("prompt-sync")();

let number = Number(prompt("Enter a number: "));

if (number % 3 == 0 && number % 5 == 0)
    console.log("It is divisible by 3 and 5");

else
    console.log("It is not divisible by 3 and 5");
