def find(a, n):
    low = 0
    high = len(a) - 1
    while high >= low:
        mid = (low + high) // 2
        if a[mid] == n:
            return mid
        elif a[mid] > n:
            high = mid - 1
        else:
            low = mid + 1
    return -1


print(find([1, 2, 4, 70], 1))
