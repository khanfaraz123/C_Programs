#include<stdio.h>

int main(){
	int a[10],i,j,r,temp;
b:	printf("enter the range of an array upto 10: ");
	scanf("%d",&r);
	if(r<=10){
	printf("enter the Elements of an array: \n");
	for(i=0; i<r; i++){
		printf("Enter %d Element:",i+1);
		scanf("%d",&a[i]);
	}
	// -----------------Bubble Sorting----------
	for(i=0; i<r-1; i++){
		for(j=0; j<r-i-1; j++){
			if(a[j]>a[j+1]){
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
	}
	printf("Array After Bubble Sort....\n");
	for(i=0; i<r; i++){
		printf(" %d\t",a[i]);
	}
	
	
	}else {
		printf("please enter a valid range:\n");
		goto b;
	}
}
