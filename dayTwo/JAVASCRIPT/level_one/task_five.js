const prompt = require("prompt-sync")();
const numberOne = Number(prompt("Enter your temperature in Celcius : "));
const toFahrenheit = temperature * 1.8 + 32;
            
console.log("Your temperature in Faherenheit is: " toFahrenheit); 

