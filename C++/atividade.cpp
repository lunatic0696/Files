#include <stdio.h>
typedef struct aluno{
	int mat;
	float nota;
	char nome[30];
}Taluno;

Taluno v[5];
int pos=0;

Taluno m[1];

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

void mostrar(){
	for(int i=0;i<pos;i++){
		printf("\n\nMatricula:%d",v[i].mat);
		printf("\nNome       :%s",v[i].nome);
		printf("\nNota       :%.2f\n",v[i].nota);
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
main(){
	int op;
    do {
    	printf("\n1- Incluir");
    	printf("\n2- Mostrar");
    	printf("\n3- Ver maior nota");
    	printf("\n0- Sair");
    	printf("\nDigite a opcao:");
    	scanf("%d",&op);
    	switch(op){
    		case 1:incluir(); break;
    		case 2:mostrar(); break;
    		case 3:maiornota(); break;
    		case 0: break;
    		default:printf("Opcao invalida!!");
		}

	} while (op!=0);

   }
