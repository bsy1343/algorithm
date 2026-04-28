# [Silver IV] Joseph - 7374

[문제 링크](https://www.acmicpc.net/problem/7374)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 104, 정답: 73, 맞힌 사람: 47, 정답 비율: 66.197%

### 분류

구현, 시뮬레이션, 런타임 전의 전처리

### 문제 설명

<p>The Joseph&rsquo;s problem is notoriously known. For those who are not familiar with the original problem: from among n people, numbered 1, 2, ..., n, standing in circle every m-th is going to be executed and only the life of the last remaining person will be saved. Joseph was smart enough to choose the position of the last remaining person, thus saving his life to give us the message about the incident. For example when n = 6 and m = 5 then the people will be executed in the order 5, 4, 6, 2, 3 and 1 will be saved.</p>

<p>Suppose that there are k good guys and k bad guys. In the circle the first k are good guys and the last k bad guys. You have to determine such minimal m that all the bad guys will be executed before the first good guy.</p>

### 입력

<p>The input file consists of separate lines containing k. The last line in the input file contains &lsquo;0&rsquo;. You can suppose that 0 &lt; k &lt; 14.</p>

### 출력

<p>The output file will consist of separate lines containing m corresponding to k in the input file.</p>