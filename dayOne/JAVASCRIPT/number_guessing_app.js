const prompt = require("prompt-sync")();

secretNum = Math.floor(Math.random() * 100 +1 );

count = 0;

while(true){
    count++;
    guessNum = Number(prompt("guess a number: "));
    
    
    if(guessNum > 100){
        console.log("wrong answer!!!");
    }
    
     if(guessNum > secretNum){
         console.log("higher number");
     } else if(guessNum < secretNum){
         console.log("lower number");
     } else if(secretNum == guessNum){
         console.log("correct!!!");
         break;
     } 
     
     if(count == 5) {
         console.log("maximum tries exceeded");
         console.log(`${count} no of tries. Secret number is ${secretNum}`)
         break;
     }
}
 
