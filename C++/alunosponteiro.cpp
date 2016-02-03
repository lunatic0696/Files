#include <stdio.h>
#include <stdlib.h>
typedef struct  elemento{
	int mat;
	char nome[20];
	elemento *prox;
}Elemento;

int main(){
	Elemento *novo;
	novo1 = (Elemento*)malloc(sizeof(Elemento));
	novo1->mat=1;
	strcpy(novo1->nome,"Joao")
	novo1->prox=NULL;
	printf("\nMatricula %d",novo1->mat);
	printf("\nNome %s",novo1->nome);
	printf("\nValor do ponteiro prox = %d",novo1->prox);
	novo2 = (Elemento*)malloc(sizeof(Elemento));
	novo2->mat=1;
	strcpy(novo1->nome,"Marcio")
	novo2->prox=NULL;
	novo1->proximo=novo2
}