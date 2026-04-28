# [Silver III] Waiter's Problem - 19358

[문제 링크](https://www.acmicpc.net/problem/19358)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 81, 정답: 65, 맞힌 사람: 48, 정답 비율: 85.714%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Cafe Satori hires only experienced waiters, and there is a reason for that. Everyday during lunchtime, at 12:00 noon, a horde of hungry customers enters the cafe and waits to be served. Therefore, the only waiter on duty has his hands full. Fortunately, his heroic work will be rewarded with generous tips.</p>

<p>Each customer is willing to leave a specific amount of tip, provided he is served immediately. For each minute of waiting the tip decreases by one, until it reaches zero.</p>

<p>It takes one minute for the waiter to serve a customer. Solve the waiter&#39;s problem and calculate how much money he can get, provided he serves customers in an optimal order.</p>

### 입력

<p>The first line of input contains the number of test cases $z$ ($1 \leq z \leq 10^9$). The descriptions of the test cases follow.</p>

<p>The first line of each test case contains the number of customers $n$ ($1 \le n \le 100\,000$). The second line contains $n$ non-negative integers not exceeding $10^9$: these are the amounts of tips the customers are willing to give initially.</p>

<p>The total number of customers in all test cases does not exceed $1\,000\,000$.</p>

### 출력

<p>For each test case, output the maximum total amount of tips the waiter can get.</p>