#include <iostream>
#include <chrono>

using namespace std;

void SelectSort(int [], int);
void Swap(int arr[], int i, int minIndex);

int main()
{
    int arr[10] = {0, 5, 4, 2, 3, 6, 1, 9, 7, 8};
    int size = sizeof(arr) / sizeof(arr[0]);

    SelectSort(arr, size);

    return 0;
}

void SelectSort(int arr[], int size)
{
    for(int i = 0; i<size; i++)
    {
        int minIndex = i;
        for(int j = i; j < size; j++)
        {
            if(arr[j] < arr[minIndex])
            {
                minIndex = j;
            }
        }

        Swap(arr, i, minIndex);

        cout << "Iteration no. " << i << endl;
        for(int i = 0; i < size; i++)
        {
            cout << arr[i] << " ";
        }
        cout << endl << endl;
    }
}

void Swap(int arr[], int i, int minIndex)
{
    int temp = arr[minIndex];
    arr[minIndex] = arr[i];
    arr[i] = temp;
}