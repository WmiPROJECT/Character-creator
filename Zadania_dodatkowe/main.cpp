#include "main.hpp"
#include <string>
#include <iostream>
using namespace std;


void Osoby::setage(int x){
    age=x;
}
int Osoby::getage(){
    return age;
}
void Osoby::setname(string x){
    name=x;
}
string Osoby::getname(){
    return name;
}
void Osoby::setsurname(string x){
    surname=x;
}
string Osoby::getsurname(){
    return surname;
}
Osoby::Osoby(int x1, string x2, string x3){
    age=x1;
    name=x2;
    surname=x3;
}

int main(){
}