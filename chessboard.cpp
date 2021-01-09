//IDE: Code::Blocks
#include <iostream>

using namespace std;
string letters = "abcdefgh", input;


int letters_to_index(string input){
    for(int x=0;x<letters.length();x++){
        if(input[0] == letters[x])
            return x;
    }
}

string black_or_white(string input){

    int index = letters_to_index(input);

    if(index%2==0 && input[1]%2!=0)
        return "black";
    else if(index%2==0 && input[1]%2==0)
        return "white";
    else if(index%2!=0 && input[1]%2!=0)
        return "white";
    else if(index%2!=0 && input[1]%2==0)
        return "black";

}

int main(){

    cout << "Enter location in chess: ";
    cin  >> input;

    cout << black_or_white(input);


}
