#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

int v[100];

int fibonacci(int n){
/*	if(n==0 || n==1){
		return n;
	}
	else{
	return v[n-1]+v[n-2];
	} */
	for(int i=1;i==n;i++){
		v[i] = v[i-1]+v[i-2];
		printf("%d",&v[i]);
	}
}

int main(){
	v[0]=1;
	v[1]=1;
	int n;
	scanf("%d",&n);
	printf("%d\n",fibonacci(n));
	main();
	
}