# [Gold V] Ski race - 26234

[문제 링크](https://www.acmicpc.net/problem/26234)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 86, 정답: 30, 맞힌 사람: 22, 정답 비율: 33.846%

### 분류

수학, 정렬, 정수론

### 문제 설명

<p>Winter has come to the town of $N$, and it&#39;s time for the first cross-country skiing race. This year, participants registered through the Internet --- they entered their data, and each picked a number which had not yet been picked by other skiers. Due to the high number of participants, the organizers decided to split the race into several starts. To pick the lucky skiers for the first start, they&#39;ve come up with a simple rule --- the skier with the number $X$ comes to the start if no other skier&#39;s number is divisible by $X$.</p>

<p>Help the organizers write a program to define the numbers of those who will start first.</p>

### 입력

<p>The first line of the input file contains an integer $K$ --- the number of registered participants ($1 \leq K \leq 10^5$). The second line contains $K$ space-separated integers $A_i$ --- the numbers chosen by the participants at the registration ($1\leq A_i\leq 10^7$). All the numbers $A_i$ are distinct.</p>

### 출력

<p>The output file must contain a single line containing the numbers of all participants starting first, in the ascending order. Numbers must be space-separated.</p>