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

void percorrer(string s){
	Pilha *p = new Pilha;
	for(int i = 0; i < s.length(); i++){
		if(s[i] == '(' || s[i] == '[' || s[i] == '{'){
			p->push(s[i]);
		}
		if(s[i] == ')' || s[i] == ']' || s[i] == '}'){
			if(p->topo->nome == '(' && s[i] == ')'){
				p->pop();
			}
			if(p->topo->nome == '[' && s[i] == ']'){
				p->pop();
			}
			if(p->topo->nome == '{' && s[i] == '}'){
				p->pop();
			}
		}
	}
	if(p->topo == NULL){
		cout << "Expressao correta";
	} 
	else if(p->topo != NULL){
		cout << "Expressao incorreta";
	}
}

int main(){
	string expression = "(m < (n[8]+p)";
	string expression2 = "m < (n[8]+p)";
	percorrer(expression);
	percorrer(expression2);
	return 0;
	
}