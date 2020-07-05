/**
 * LeetCode 811. Subdomain Visit Count
 * 
 * @param {string[]} cpdomains
 * @return {string[]}
 */
var subdomainVisits = function(cpdomains) {
    // 결과값을 담을 Object선언
    var result = {};
    
    cpdomains.forEach(function(str, idx) {
       // 배열에서 숫자와 도메인을 분리
       [count, domain] = str.split(" ");
       // 결과 Object에 해당 도메인을 key값으로 가지는게 없으면 0으로 초기화
        if (!result[domain]) {
            result[domain] = 0;
        }
       // 결과 Object에 해당 도메인을 key값으로 가지는게 있으면 숫자를 더해준다.
       // 해당 숫자는 보기엔 숫자지만 문자열이기에 parseInt를 통해 숫자로 치환해준다.
        result[domain] += parseInt(count);
        
       // 도메인을 "."기준으로 잘라 결과 Object에 해당 key가 존재하는지 체크한다.
       // key가 존재하면 기존값에 더해주고, 존재하지않으면 0으로 초기화 시켜준다.
        while (domain.length > 0) {
            var dotIdx = domain.indexOf(".");
            // 도메인에 "."가 없으면 반복문을 빠져나간다. 해당 조건이 없을 시 무한루프 빠짐
            if (dotIdx === -1) {
                break;
            }
            domain = domain.substring(dotIdx + 1);
            if (!result[domain]) {
                result[domain] = 0;
            }
            result[domain] += parseInt(count);
        }
    });
    
    // Object.key 메소드를 통해 도메인이 있는지 체크하고 
    // map 메소드를 통해 count와 합쳐 원하는 포맷으로 만들어 출력시켜준다.
    return Object.keys(result).map(function(domain) {
       return result[domain] + ' ' + domain; 
    });
};