#include<stdlib.h>
#include<stdio.h>

int main(){
	int i=0;
	int j=0;
	int matriz[10][5];
	for(i=0;i<10;i++){
		for(j=0;j<5;j++){
			matriz[i][j]=1; 
		}
	}
	int soma = 0;
	for(i=5;i<10;i++){
		for(j=0;j<5;j++){
			soma=soma+matriz[i][j];
		}
	}
 	printf("\n %d", soma);
}
