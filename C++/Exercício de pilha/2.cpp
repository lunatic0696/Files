#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
using namespace std;
class No{
	public:
		char nome;
		No *prox;
		No(char n){
			nome = n;
			prox = NULL;
		}
};

class Pilha{
	public:
		No *topo;
		
		Pilha(){
			topo = NULL;
		}
		 void push(char n){
			 No *novo = new No(n);
			 if(topo == NULL){
				 topo = novo;
			 }
			 else{
				 novo->prox=topo;
				 topo=novo;
			 }
		 }
		 void pop(){
			No *el;
			char nome;
			if(topo != NULL){
				el=topo;
				nome = el->nome;
				topo = topo->prox;
				free(el);
			}
		}
		 void mostrar(){
		 	No *atual = topo;
			 while(atual != NULL){
				 cout << atual->nome <<endl;
				 atual=atual->prox;
			 }
		 }
};

int main(){
	Pilha *p = new Pilha();
	p->push('a');
	p->push('b');
	p->mostrar();
	
	return 0;
	
}