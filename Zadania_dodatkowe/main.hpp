#ifndef main_hpp
#define main_hpp
#include <iostream>
using namespace std;


class Osoby{
   protected:
       int age;
       string name;
       string surname;

   public:
       void setage( int x );
       int getage();
       void setname( string x );
       string getname();
       void setsurname( string x );
       string getsurname();
       Osoby(int x1, string x2, string x3);
};
#endif