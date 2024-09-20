#include<stdio.h>
#include<conio.h>

int i,range,a[10];
void insert();
void create();
void del();
void print();

int main(){
	int choice;
	create();
a:	printf("\nEnter your choice to perform operations (1-3) : \n1.insert\n2.delete\n3.Exit\n");
	scanf("%d",&choice);
	switch (choice)
	{
		case 1:
			{
				insert();
				goto a;
				break;
			}
		case 2:
			{
				del();
				goto a;
				break;
			}
		case 3:
			{
				printf("Exiting...");
			}
	}
	
}

void create(){
	printf("Enter the size of an Array (1-9) : ");
	scanf("%d",&range);
	printf("Enter Elements  : \n");
	for(i=0; i<range; i++){
		printf("Element at %d place : ",i);
		scanf("%d",&a[i]);
	}
	print();
}
void insert(){
	int integer,location;
	printf("\nEnter the integer to be inserted :");
	scanf("%d",&integer);
	printf("Location of the new integer to be inserted (1-9) :");
	scanf("%d",&location);
	if(location<range){
		for(i=range-1; i>=location-1; i--){
			a[i+1] = a[i];
		}
	}else{
		a[range]=integer;
		}
	a[location-1]=integer;
	printf("Elements are : \n");
	for(i=0; i<=range; i++){
		printf("%d\t",a[i]);
	}
	
}
void del(){
	int integer;
	printf("\nEnter the integer to be deleted :");
	scanf("%d",&integer);
	for(i=0; i<=range; i++){
		if(a[i] == integer)
			continue;
		else
			printf("%d\t",a[i]);
	}
	
}
void print(){
	printf("Elements are : \n");
	for(i=0; i<range; i++){
		printf("%d\t",a[i]);
	}
}
