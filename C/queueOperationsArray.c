//Write a program in C to implement Queue using Array 
// i. Insert 
// ii. Delete 
// iii.Display 
// iv. Exit

#include<stdio.h>

#define MAX 1000

int queue[MAX];

void insertToQueue(int *, int *);
void deletFromQueue(int *, int *);
void displayQueue(int *, int *);

int main(){
    int front, rear;
    front = rear = -1;
    
    int ch;
    
    do
    {
        printf("\n1. Insert\n2. Delete\n3. Display Queue Front\n4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d",&ch);

        switch (ch)
        {
        case 1:
            insertToQueue(&front, &rear);
            break;
        
        case 2:
            deletFromQueue(&front, &rear);
            break;

        case 3:
            displayQueue(&front, &rear);
            break;

        // default:
            // printf("\nStack elements cleared...\nStack memory deleted!\nPress any key to continue...\n");
        }
    } while (ch != 4);
}

void insertToQueue(int *front, int *rear){
    int val;
    
    printf("Enter element: ");
    scanf("%d",&val);
    
    if(*rear == MAX-1)
        printf("Queue Overflow\n");
    else
    {
        if (*rear == -1 || *front == -1)
            *front = *front + 1;
        *rear = *rear + 1;
        queue[*rear] = val;
    }
}

void deletFromQueue(int *front, int *rear){
    if (*front == -1 || *rear == -1)
        printf("Queue Underflow\n");
    else
        *front = *front + 1;

    if (*front > *rear)
        *front = *rear = -1;
}

void displayQueue(int *front, int *rear){
    if (*front == -1)
        printf("Queue Empty\n");
    else
        for (int i = *front; i <= *rear; i++)
            printf("%d ",queue[i]);
}