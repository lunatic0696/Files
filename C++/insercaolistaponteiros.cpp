#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct lista{
	char letra;
	lista *prox;
	lista *anterior;
}Tlista;

Tlista *novo,*inicio,*inicio2,*fim,*fim2,*invertido,*temporario,*lista,*proximo,*anterior,*atual;

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
	lista = (Tlista*)malloc(sizeof(Tlista));
	temporario =(Tlista*)malloc(sizeof(Tlista));
	lista->letra=letra;
	lista->prox=NULL;
	if(inicio == NULL){
		inicio = lista;
		temporario = lista;
		fim = lista;
		lista->anterior = temporario;
		inicio->anterior = NULL;
	}
	else{
		temporario = fim;
		fim->prox=lista;
		fim = lista;
		fim->anterior = temporario;
	}
}

void furaFila(char letra,int pos){
	int posatual = 1;
	Tlista *atual;
	atual = inicio;
	novo = (Tlista*)malloc(sizeof(Tlista));
	while(atual!=NULL){
		if (posatual == pos-1){
			novo->letra=letra;
			novo->prox = atual->prox;
			atual->prox = novo;
		}
		else{
			posatual+=1;
			atual = atual->prox;
		}
		
	}
}

void reverter(){
	invertido = (Tlista*)malloc(sizeof(Tlista));
	invertido = fim;
	while(lista->anterior!=NULL){
		if(fim2==NULL){
			fim->anterior = invertido;
			inicio2 = fim;
			
		}
		else{
			
		}
	}
}

void reverter2(){
	anterior = NULL;
	atual = inicio;
	proximo = atual->prox;
	while(atual!=NULL){
		atual->prox=anterior;
		anterior=atual;
		atual=proximo;
		proximo=atual->prox;
	}
}

int main(){
	addFinal('M');
	addFinal('A');
	addFinal('I');
	addFinal('O');
	mostrar();
	reverter2();
	mostrar();
}