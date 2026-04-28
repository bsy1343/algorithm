# [Gold IV] Drying - 3632

[문제 링크](https://www.acmicpc.net/problem/3632)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 196, 정답: 55, 맞힌 사람: 46, 정답 비율: 27.219%

### 분류

이분 탐색, 매개 변수 탐색

### 문제 설명

<p>It is very hard to wash and especially to dry clothes in winter. But Jane is a very smart girl. She is not afraid of this boring process. Jane has decided to use a radiator to make drying faster. But the radiator is small, so it can hold only one thing at a time.</p>

<p>Jane wants to perform drying in the minimal possible time. She asked you to write a program that will calculate the minimal time for a given set of clothes.</p>

<p>There are $n$ clothes Jane has just washed. Each of them took $a_i$ water during washing. Every minute the amount of water contained in each thing decreases by one (of course, only if the thing is not completely dry yet). When amount of water contained becomes zero the cloth becomes dry and is ready to be packed.</p>

<p>Every minute Jane can select one thing to dry on the radiator. The radiator is very hot, so the amount of water in this thing decreases by $k$ this minute (but not less than zero --- if the thing contains less than $k$ water, the resulting amount of water will be zero).</p>

<p>The task is to minimize the total time of drying by means of using the radiator effectively. The drying process ends when all the clothes are dry.</p>

### 입력

<p>The first line contains a single integer $n$ ($1\le n\le 100\,000$). The second line contains $a_i$ separated by spaces ($1\le a_i\le 10^9$). The third line contains $k$ ($1\le k\le 10^9$).</p>

### 출력

<p>Output a single integer --- the minimal possible number of minutes required to dry all clothes.</p>