odd_or_even = (number) => {
    if (number % 2 === 0) {
        return "even";
    } else {
        return "odd";
    }
}


var input = require('readline');
var prompts = input.createInterface(process.stdin,process.stdout);

prompts.question("Enter a number:  ",(number) =>{
    console.log(odd_or_even(number));
    process.exit();
});