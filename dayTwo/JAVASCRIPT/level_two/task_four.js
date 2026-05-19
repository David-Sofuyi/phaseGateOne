const prompt = require("prompt-sync")();

let firstNumber = Number(prompt("Enter first number: "));
let secondNumber = Number(prompt("Enter second number: "));

if (firstNumber > secondNumber)
    console.log("The largest number is " + firstNumber);
else
    console.log("The largest number is " + secondNumber);
