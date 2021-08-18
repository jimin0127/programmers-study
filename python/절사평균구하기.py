def myMean(list):
    list.remove(max(list))
    list.remove(min(list))
    return sum(list)/len(list)

if __name__ == '__main__':
    print(myMean([1, 2, 3, 4, 5]))