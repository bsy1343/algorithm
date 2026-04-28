# [Gold I] Optimal Truck - 23856

[문제 링크](https://www.acmicpc.net/problem/23856)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 17, 정답: 15, 맞힌 사람: 15, 정답 비율: 88.235%

### 분류

정렬, 이분 탐색, 누적 합, 런타임 전의 전처리, 차분 배열 트릭

### 문제 설명

<p>Peter is going to buy a truck and start a small transportation business. He studied the market and found out that there are $n$ potential customers in his city. There are $m_i$ contract options for the $i$-th client. Each option is specified by two numbers: $w_{ij}$ --- the minimum capacity of the truck, which is required to fulfill the contract, and $c_{ij}$ --- the profit that Peter will receive if he concludes this contract. No more than one contract can be concluded with each client.</p>

<p>Now Peter is thinking which truck is better to buy in order to get the profit he needs. He has $q$ options. In the $i$-th option, Peter wants his profit to be at least $x_i$. Help him, for each of the options, find the minimum capacity of the truck with which you can make such a profit.</p>

### 입력

<p>The first line contains the integer $n$ ($1\le n\le 10^5$).</p>

<p>This is followed by $n$ blocks describing contract options for each of the potential customers. Each such block begins with the number $m_i$, followed by $m_i$ pairs of numbers $w_{ij}, c_{ij}$ ($1\le m_i$, $\sum m_i \le 5 \cdot 10^5$, $1\le w_{ij}, c_{ij}\le 10^9$).</p>

<p>Next comes the number $q$ ($1\le q\le 10^5$). This is followed by the $q$ numbers $x_i$ ($1\le x_i\le 10^9$).</p>

### 출력

<p>Print $q$ numbers, the minimum carrying capacity of the truck, with which you can get the required profit, for each of the options. If it is impossible to get the required profit, print $-1$ for the corresponding option.</p>