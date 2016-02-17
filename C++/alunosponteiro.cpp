#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct  elemento{
	int mat;
	char nome[20];
	elemento *prox;
}Elemento;
Elemento *novo,*inicio,*fim,*anterior;

void mostrar(){
	Elemento *atual;
	atual = inicio;
	while(atual!=NULL){
		printf("\nMatricula %d",atual->mat);
		printf("\nNome %s",atual->nome);
		atual=atual->prox;
	}
	
}

void busca(int matbusca){
	Elemento *atual;
	atual = inicio;
	bool achou = false;
	printf("\nConsulta aluno pela matricula\n\n");
	printf("\nMatricula: ");
	scanf("%d",&matbusca);
	while(atual != NULL){
		if(atual->mat==matbusca){
			achou = true;
			printf("\n\nMatricula: %d",atual->mat);
			printf("\nNome: %s",atual->nome);
			break;
		}
		atual=atual->prox;
	}	
	if(achou==false){
		printf("Elemento nao encontrado!");
	}	
}

void addFinal(int mat, char nome[23]){
	novo = (Elemento*)malloc(sizeof(Elemento));
	novo->mat=mat;
	strcpy(novo->nome,nome);
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

void addInicio(int mat, char nome[23]){
	novo = (Elemento*)malloc(sizeof(Elemento));
	novo->mat=mat;
	strcpy(novo->nome,nome);
	novo->prox=NULL;
	novo->prox = inicio;
	inicio = novo;
}

void remover(){
	Elemento *atual;
	atual = inicio;
	bool achou = false;
	int matremover = 0;
	printf("\nRemover aluno pela matricula\n\n");
	printf("\nMatricula: ");
	scanf("%d",&matremover);
	while(atual != NULL){
		if(atual->mat==matremover){
			achou = true;
			printf("\n\nAluno ,%d %s removido com sucesso",atual->mat,atual->nome);
			break;
		}
		atual=atual->prox;
	}	
	if(achou==false){
		printf("Elemento nao encontrado!");
	}	
}

void remover2(int matremover){
	Elemento *atual;
	atual = inicio;
	anterior = inicio;
	bool achou = false;
	while(atual != NULL){
		if(atual->mat==matremover){
			achou = true;
			anterior->prox = atual->prox;
			anterior->nome = NULL;
			anterior->mat = NULL;
			printf("\n\nAluno removido com sucesso\n");
			break;
		}
		anterior = atual;
		atual=atual->prox;
	}	
	if(achou==false){
		printf("Elemento nao encontrado!");
	}	
}

int main(){
	Elemento *novo,*inicio,*fim;
	inicio = NULL;
	fim = NULL;
	addFinal(1,"Maria");
	addFinal(2,"Joao");
	addFinal(3,"Fernando");
	addInicio(4,"Fulano");
	mostrar();
	remover2(3);
	mostrar();
	busca(1);
}