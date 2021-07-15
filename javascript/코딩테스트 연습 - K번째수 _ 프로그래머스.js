function solution(array, commands) {
    var answer = [];
    for(let c of commands){
        let arr = array.slice(c[0]-1, c[1])
        arr.sort(function(a, b){
            return a - b
        })
        answer.push(arr[c[2]-1])
    }
    return answer;
}