function solution(num) {
    var answer = 0;
    let i = 0
    if (num == 1){return 0}
    while(i < 500){
        num = num % 2 == 0? num/2 : num * 3 + 1
        i++;
        if(num == 1) {return i}
    }
    return -1;
}