# [Gold V] Choose Your Own Arithmetic - 6772

[문제 링크](https://www.acmicpc.net/problem/6772)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 88, 정답: 29, 맞힌 사람: 25, 정답 비율: 31.250%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 백트래킹

### 문제 설명

<p>In Waterloo, you probably have seen some geese. How can you see geese with your calculator? Start with 6, add 7, multiply by 6, multiply by 8, add 7, multiply by 8, and multiply by 7, giving 35336. Then if you flip your calculator upside down, it says gEESE:</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/6772/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-03-24%20%EC%98%A4%ED%9B%84%201.17.23.png" style="height:92px; width:556px" /></p>

<p>You want to write a program to help automatically build tricks of this type. However, your calculator has a lot of broken buttons: the only mathematical operators that work are + and &times;, and only a few of the digits work. Your goal is to figure out whether your half-broken calculator can achieve a given target value, using single-digit inputs and a fixed number of operations.</p>

<p>Note: the calculator performs the operations as soon as they are entered, rather than following any rules for order of operations (see Sample Input 2).</p>

### 입력

<p>The first line of input is W, the exact number of operations you must use. W will be an integer between 0 and 6. The second line of input is 1 &le; D &le; 10, the number of working digit keys. On each of the D following lines, a working digit is given; these values are distinct integers from 0 to 9. Finally, an integer 1 &le; V &le; 5 is given, the number of target values; on each of the following V lines there is an integer between 0 and 5000000 (inclusive) giving a target value which you&rsquo;d like to achieve on your calculator.</p>

### 출력

<p>The output consists of V lines corresponding to the target values; each line contains &ldquo;Y&rdquo; if that target value can be achieved, and &ldquo;N&rdquo; if it cannot be achieved, using exactly W operations with the D given digits.</p>

<p>Precisely, a target value T can be achieved if, starting with one of the D digits, and then by adding or multiplying exactly W times by one of the digits, you end up with T. Digits can be re-used, and you do not need to use all of the digits. You cannot enter multi-digit numbers.</p>