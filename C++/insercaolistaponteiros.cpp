#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct lista{
	char letra;
	lista *prox;
}Tlista;

Tlista *novo,*inicio,*anterior,*fim;

void mostrar(){
	Tlista *atual;
	atual = inicio;
	while(atual!=NULL){
		printf("%c",atual->letra);
		atual=atual->prox;
	}
	printf("\n");	
}

void addFinal(char letra){
	novo = (Tlista*)malloc(sizeof(Tlista));
	novo->letra=letra;
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

void furaFila(char letra,int pos){
	int posatual = 1;
	Tlista *atual;
	atual = inicio;
	while(atual!=NULL){
		if (posatual == pos-1){
			novo = (Tlista*)malloc(sizeof(Tlista));
			novo->letra=letra;
			novo->prox = atual->prox;
			atual->prox = novo;
		}
		
	}
}

int main(){
	addFinal('M');
	addFinal('A');
	addFinal('I');
	addFinal('O');
	mostrar();
	furaFila('R',3);
	mostrar();
}