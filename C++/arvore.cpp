#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<iostream>
using namespace std;

class No
{
public:
	int nome;
	No *left;
	No *right;
	No(int n)
	{
		nome = n;
		left = NULL;
		right = NULL;
	}
};

class Arvore
{
	public:
	No *raiz;
	No *pai, *no;

	Arvore()
	{
		raiz = NULL;
		pai = NULL;
		no = NULL;
	}

	int isEmpty(No *raiz)
	{
		return(raiz == NULL);
	}
	void criaNo(int n)
	{
		No *novo = new No(n);
		inserir(raiz, novo);
	}
	void inserir(No *noatual, No *novo)
	{
		if(isEmpty(raiz))
		{
			raiz = novo;
		}
		if(noatual != NULL){
			if(noatual->nome > novo->nome){
				if(noatual->left == NULL) {
					noatual->left = novo;
				}
				else{
					inserir(noatual->left, novo);}
			}else if(noatual->nome < novo->nome){
				if(noatual->right == NULL){
					noatual->right = novo;
				}
				else{
					inserir(noatual->right, novo);
				}
				return;
			}
		}
	}
	void imprime(No *r){
		if(r != NULL){
			cout << "<";
			cout << r->nome;
			imprime(r->left);
			imprime(r->right);
			cout << ">";
		}
	}
	
	void apagar(No *r, int valor){
		if(r != NULL){
			if(r->nome == valor){
				apagarfilhos(r);
			}
			else if(r->nome != valor){
				if(r->left != NULL){
					apagar(r->left, valor);
					}
				if(r->right != NULL){
					apagar(r->right, valor);
				}
			}
		}
		
	}
	void apagarfilhos(No *r){
		if(r != NULL){
			apagarfilhos(r->right);
			apagarfilhos(r->left);
			r = NULL;
			free(r);
		}
	}
};

int main(int argc, char** argv)
{
	Arvore *arvore = new Arvore();
	arvore->criaNo(100);
	arvore->criaNo(120);
	arvore->criaNo(30);
	arvore->criaNo(140);
	arvore->criaNo(420);
	arvore->criaNo(20);
	
	arvore->imprime(arvore->raiz);
	
	arvore->apagar(arvore->raiz, 30);
	arvore->imprime(arvore->raiz);
	return 0;
}