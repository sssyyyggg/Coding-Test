function solution(arr) {
    
    let answer = [];
    for( let i = 0; i < arr.length; i++){
        for(let k = 0; k < arr[i]; k++){
            answer.push(arr[i]);
        }
    }
    
    return answer;
}