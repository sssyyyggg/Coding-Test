function solution(my_string) {
    my_string = my_string.trim();
    
    const answer = my_string.split(' ');
    
    let answer2 = [];
    for(let i = 0; i < answer.length; i++){
        if(answer[i] !== ''){
            answer2.push(answer[i]);
        } else {
            continue;
        }
    }
    
    return answer2;
}