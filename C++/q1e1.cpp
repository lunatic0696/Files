#include <stdio.h>
#include <stdlib.h>
main(){
	int maior=0;
	while(1==1){
		int entrada;
		printf("Insira um valor: ");
		scanf("%d", &entrada);
		if (entrada<0){
			printf("Este numero nao e positivo. O maior numero informado foi: %d", maior);
			break;
		}
		else{
			printf("Seu numero e positivo \n");
			if(entrada>maior){
				maior = entrada;
			}
		}
	}
}
