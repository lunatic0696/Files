#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
using namespace std;

typedef struct  elemento{
	char letra;
	elemento *prox;
}Elemento;
Elemento *novo,*inicio,*fim;

void mostrar(){
	Elemento *atual;
	atual = inicio;
	while(atual!=NULL){
		cout << atual->letra <<endl;
		atual=atual->prox;
	}
	
}

void addFinal(char letra){
	novo = (Elemento*)malloc(sizeof(Elemento));
	novo->letra = letra;
	novo->prox=NULL;
	if(inicio == NULL){
		inicio = novo;
		fim = novo;
	}
	else{
	fim->prox=novo;
	fim = novo;
	}
}

int main(){
	addFinal('A');
	addFinal('E');
	addFinal('I');
	addFinal('O');
	addFinal('U');
	mostrar();
	return 0;
}