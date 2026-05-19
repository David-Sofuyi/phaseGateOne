const prompt = require("prompt-sync")();

let firstNumber = Number(prompt("Enter first number: "));
let secondNumber = Number(prompt("Enter second number: "));
let thirdNumber = Number(prompt("Enter third number: "));

if (firstNumber > secondNumber && firstNumber > thirdNumber)
    console.log("The largest number is " + firstNumber);

else if (secondNumber > firstNumber && secondNumber > thirdNumber)
    console.log("The largest number is " + secondNumber);

else
    console.log("The largest number is " + thirdNumber);
