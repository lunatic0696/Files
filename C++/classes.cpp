#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>

using namespace std;

class No{
	public:
		char nome[23];
		int mat;
		No *prox;
		No *ante;
		No(int m,char n[23]){
			mat=m;
			strcpy(nome, n);
			prox=NULL;
			ante=NULL;
		}
};

class Lista{
	public:
		No *inicio;
		No *fim;
		No *inicio2;
		No *fim2;
		
		Lista(){
			inicio = NULL;
			fim = NULL;
		}
		
		void addToFinal(int m, char n[23]){
			No *novo = new No(m,n);
			if(fim==NULL){
				inicio = novo;
				fim = novo;
			}
			else{
				fim->prox = novo;
				fim = novo;
			}
		}
		void mostrar(){
			No *atual;
			atual = inicio;
			while(atual!=NULL){
				printf("\nMatricula %d",atual->mat);
				printf("\nNome %s",atual->nome);
				atual=atual->prox;
				}
		}
		
		void addToInicio(int mat, char nome[23]){
			No *novo = new No(mat,nome);
			novo->mat=mat;
			strcpy(novo->nome,nome);
			novo->prox=NULL;
			novo->prox = inicio;
			inicio = novo;
		}
		
		void addOrd(int m, chat n[23]){
			No *novo = new No(m,n);
			if(inicio==NULL){
				inicio=novo;
				fim=novo;
			}
			else{
				No *atual = inicio;
				No *ant = NULL;
				inte achou = 0
					
				}
			}
		}
};

int main(){
	Lista *lista = new Lista();
	lista->addToFinal(2,"Fulano");
	lista->addToInicio(1,"Beltrano");
	lista->mostrar();
}