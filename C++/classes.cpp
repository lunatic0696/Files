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
				novo->ante = fim;
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
		
		void  mostrarAoContrario(){
			No *atual;
			atual = fim;
			while(atual!=NULL){
				printf("\nMatricula %d",atual->mat);
				printf("\nNome %s",atual->nome);
				atual=atual->ante;
			}
		}
		
		void addOrd(int m, char n[23]){
			No *novo = new No(m,n);
			if(inicio==NULL){
				inicio=novo;
				fim=novo;
			}
			else{
				No *atual;
				atual = inicio;
				while(atual != NULL){
					if(novo->mat<atual->mat || atual->prox == NULL){
						if (atual == inicio){
							novo->prox = inicio;
							inicio->ante = novo;
							inicio=novo;
						}
						else if(atual->prox != NULL){
							novo->prox = atual;
							novo->ante = atual->ante;
							atual->ante->prox = novo;
							atual->ante = novo;
						}
						else{
							novo->ante = fim;
							fim->prox = novo;
							fim = novo;
						}
						break;
					atual=atual->prox;
					}
				}
			}
		}
};

int main(){
	Lista *lista = new Lista();
	lista->addToFinal(3,"Fulano");
	lista->addToInicio(1,"Beltrano");
	lista->addOrd(2,"Beltrano");
	lista->mostrar();
	return 0;
}