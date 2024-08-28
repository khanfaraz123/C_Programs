#include<stdio.h>
#include<String.h>

int main(){
	
	char str[10];
	int check = 0;
	printf("Enter the String to check: ");
	scanf("%s",&str);
	printf("Entered String is: %s",str);
	int low=0;
	int high = strlen(str)-1;
	printf("\nString Length: %d",high);
	for(int i=0; i<=high/2; i++){
		if(str[low] != str[high]){
			check = 1;
		}
	}
	if(check == 0){
		printf("\nits a Palindrome...");
	}else
		printf("\nits Not a Palindrome...");
}
