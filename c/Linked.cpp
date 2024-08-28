#include<stdio.h>
#include<stdlib.h>

struct node{
	int Data;
	struct node* link;
};

int main(){
	printf("Linked list Creation:");
	struct node* head = NULL;
	struct node* ptr = NULL;
	head = (struct node*)malloc(sizeof(struct node));
	head->Data = 45;
	head->link = NULL;
	
	
	struct node* current = NULL;
	current = (struct node*)malloc(sizeof(struct node));
	current->Data = 98;
	current->link = NULL;
	head->link = current;

	ptr=head;
	while(ptr != NULL){
		ptr = ptr->link;
		printf("%d\n", *ptr);
	}
	
	printf("\n Created Addresses is : %d -> %d", head->link,current->link);
}
