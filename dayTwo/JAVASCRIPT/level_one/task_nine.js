const prompt = require("prompt-sync")();
const price = Number(prompt("Enter your price : "));
const tax = price * 0.10 
const totalPrice = price + tax ;          
console.log("your total amount with 10% tax inclusive is: " + totalPrice); 

