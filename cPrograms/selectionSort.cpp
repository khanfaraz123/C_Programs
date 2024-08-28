#include<stdio.h>

int main(){
	int a[10],i,j,r,temp;
a:	printf("enter the range of an array upto 10: ");
	scanf("%d",&r);
	if(r<=10){
	printf("enter the Elements of an array: \n");
	for(i=0; i<r; i++){
		printf("Enter %d Element:",i+1);
		scanf("%d",&a[i]);
	}
	// -----------------Selection Sorting----------
	for(i=0; i<r; i++){
		for(j=i+1; j<r; j++){
			if(a[i]>a[j]){
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	printf("Array After Selection Sort....\n");
		for(i=0; i<r; i++){
		printf(" %d\t",a[i]);
		}
	}else {
		printf("please enter a valid range:\n");
		goto a;
	}
}
