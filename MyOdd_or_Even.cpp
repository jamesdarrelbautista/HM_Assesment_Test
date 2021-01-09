#include <iostream>
#include <string>
using namespace std;

string odd_or_even(int num){
    if(num%2==0)
        return "even";
    else
        return "odd";
}

int main(){

    int num;
    cout << "Enter number: ";
    cin  >> num;

    string answer = odd_or_even(num);
    cout << answer;
}
