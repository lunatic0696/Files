#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
using namespace std;


void checkequal(string lista1, string lista2){
	int counter = 0;
	for(int i = 0; i < lista1.length(); i++){
		if(lista1[i] == lista2[i]){
			counter = counter + 1;
		}
	}
	if(counter == lista1.length()){
		cout << "Listas iguais" <<endl;
	}
	else
	{
		cout << "Listas diferentes" <<endl;
	}
	counter = 0;
}

int main(){
	string lista1[10];
	string lista2[10];
	string lista3[10];
	for(int i = 0; i < 10; i++){
		lista1[i] = i;
		lista2[i] = i;
		lista3[i] = i + 5;
	}
	checkequal(*lista1, *lista2);
	checkequal(*lista1, *lista3);
	return 0;
}