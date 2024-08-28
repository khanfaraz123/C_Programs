#include<stdio.h>

int main(){
	int n;
swt:	printf("Enter the choice: and For the EXIT Press '5'\n1.Bubble Short\n2.Selection Short\n");
	scanf("%d",&n);
	switch(n){
		case 1:{
				int a[10],i,j,r,temp;
b:				printf("enter the range of an array upto 10: ");
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
					printf("\n");
						goto swt;
				}else {
					printf("please enter a valid range:\n");
					goto b;
				}
			break;
		}
		case 2:{
				int a[10],i,j,r,temp;
a:				printf("enter the range of an array upto 10: ");
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
						printf("\n");
						goto swt;
				}else {
					printf("please enter a valid range:\n");
					goto a;
				}
			break;
		}
		case 5:{
			printf("Exited.....");
			break;
		}
		default:{
			printf("Please Enter the valid choice:\n\n");
			goto swt;
		}
	}
}
