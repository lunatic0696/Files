#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct aluno{
	int mat;
	float nota;
	char nome[30];
}Taluno;

Taluno v[5];
int pos=0;

Taluno m[1];

/*void incluir(){
	int resp;
	do{
		Taluno input;
		int i = 0, p = -1;
		if (pos<5){
    		printf("Digite a matricula:");
	        scanf("%d",&input.mat);
     	    printf("Digite o nome:");
    	    fflush(stdin);
			gets(input.nome);
    	    printf("Digite a nota:");
    	    scanf("%f",&input.nota);}
		
		for (i = 0; i < pos; i++){
			if (input.mat < v[i].mat){
				p = i;
				break;}
		}
		
		if (p == -1){
			v[pos] = input;
			pos++;
		}else{
			for (i = pos; i > p; i--){v[i] = v[i-1];}
        	v[p] = input;
			pos++;}
        
		printf("Deseja incluir outro (1-Sim 2-Nao)?");
	    scanf("%d",&resp);
	}while(resp == 1);
}
*/

void incluir(){
	int resp;
	do{
		if (pos<5){
  		printf("Digite a matricula:");
	        scanf("%d",&v[pos].mat);
    	    fflush(stdin);
     	    printf("Digite o nome:");
    	    gets(v[pos].nome);
    	    printf("Digite a nota:");
    	    scanf("%f",&v[pos].nota);
    	    pos++;
		}
		else {
            printf("Vetor Cheio!");
            break;
		}
        printf("Deseja incluir outro (1-Sim 2-Nao)?");
	    scanf("%d",&resp);
	}while (resp==1);
}

void bubblesort(int quant, Taluno* v){
	int i, j;
	int troca;
	for(i=quant-1;i>=1;i--){
		troca = 0;
		for(j=0;j<i;j++){
			if(v[j].mat > v[j+1].mat){
				troca = 1;
				Taluno temp = v[j];
				v[j]=v[j+1];
				v[j+1] = temp;
			}
		}
		if(troca == 0){break;}
	}
}


void mostrar(){
	int i;
	for(i=0;i<pos;i++){
		printf("\n\nMatricula:%d",v[i].mat);
		printf("\nNome:%s",v[i].nome);
		printf("\nNota:%.2f\n",v[i].nota);
	}
}

void maiornota(){
    bool maior;
    int i;
    for(i = 0; i < pos; i++){
        for(int x = 0; x < pos; x++){
            if (v[i].nota > v[x].nota){
                m[1] = v[x];
                v[x] = v[i];
                v[i] = m[1];
            }
        }
    mostrar();
    break;
    }
}


int main(){
	int op;
    do {
    	printf("\n1- Incluir");
    	printf("\n2- Mostrar");
    	printf("\n3- Ver maior nota");
    	printf("\n4- Ver por ordem de matricula");
    	printf("\n0- Sair");
    	printf("\nDigite a opcao:");
    	scanf("%d",&op);
    	switch(op){
    		case 1:incluir(); break;
    		case 2:mostrar(); break;
    		case 3:maiornota(); break;
    		case 4:bubblesort(pos, v); mostrar(); break;
    		case 0: break;
    		default:printf("Opcao invalida!!");
		}

	}while (op!=0);
	
	return 0;
}