var letters = "abcdefgh";

letters_to_index = (location) =>{
    for (let i = 0; i < letters.length; i++) {
        if (location[0] === letters[i]) {
            return i;
        }
    }
};

black_or_white = (location) =>{
    var position = letters_to_index(location);
    if (position % 2 === 0 && parseInt(location[1]) % 2 ===0){
        return "white";
    }
    else if (position % 2 === 0 && parseInt(location[1]) % 2 !==0){
        return "black";
    }
    else if (position % 2 !== 0 && parseInt(location[1]) % 2 !==0){
        return "white";
    }
    else return "black";
};



var input = require('readline');
var prompts = input.createInterface(process.stdin,process.stdout);

prompts.question("Enter chess location: ",(location) =>{
    console.log(black_or_white(location));
    process.exit();
});