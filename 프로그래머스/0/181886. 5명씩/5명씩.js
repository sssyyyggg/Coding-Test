function solution(names) {
    let answer = [];
    
    for(let i = 0; i < names.length; i++){
        if(i === 0 || i % 5  === 0){
            answer.push(names[i]);
        }
        answer
    }
    return answer;
}