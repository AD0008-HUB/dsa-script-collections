# BINARY SEARCH
# This search is performed in a "sorted" list. Searching of key begins from the middle index.
# Element is searched in the left sublist if element at the middle index is greater than the key.
# Element is searched in the right sublist if element at the middle index is lower than the key.
# This is a recursive process.
# Finally, function returns index of element if key is present. Returns '-1' if key is absent.


# Time Complexity
# Average Case: O(logn)
# Best Case: O(1) -> When key is present at the middle index.

def ans(array, x):
    low = 0
    high = 1
    while x > high:
        newLow = high+1
        high = high + (high - (low-1))
        low = newLow

    return binarySearch(array, x, 0, len(array)-1)


def binarySearch(array, x, low, high):

    while low <= high:

        mid = low + (high - low)//2

        if array[mid] == x:
            return mid

        elif array[mid] < x:
            low = mid + 1

        else:
            high = mid - 1

    return -1


array = [3, 4, 5, 6, 7, 8, 9]
x = 6

result = ans(array, x)

print(result)
