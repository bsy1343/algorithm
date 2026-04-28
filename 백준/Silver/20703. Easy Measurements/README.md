# [Silver III] Easy Measurements - 20703

[문제 링크](https://www.acmicpc.net/problem/20703)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 60, 정답: 39, 맞힌 사람: 30, 정답 비율: 60.000%

### 분류

유클리드 호제법, 수학, 정수론

### 문제 설명

<p>Edward was tasked to measure the pumping rate of two water pumps. To do so, he used the pumps to pump water into a water tank and checked how much water was pumped into the tank in a specific time.</p>

<p>He found out that the first pump pumps $a$ liters of water in $b$ seconds, and the second pump pumps $c$ liters of water in $d$ seconds. He also discovered that when both pumps are used at the same time, together they pump $b$ liters of water in $d$ seconds.</p>

<p>Unfortunately, Edward has spilled some water on his records, so now he can&#39;t recover the values $a$ and $c$. However, he remembers that these values were positive integers. Now he wonders how many ways are there to choose the values $a$ and $c$ that are consistent with his measurements.</p>

### 입력

<p>The first line contains an integer $n$ ($1\le n\le1000$) --- the number of test cases.</p>

<p>Each of the next $n$ lines contains two integers $b$ and $d$ ($1\le b,d\le10^9$).</p>

### 출력

<p>For each test case, output a single integer --- the number of ways to choose $a$ and $c$. Output each answer on a separate line.</p>

### 힌트

<p>In the first test case, the possible values are $a=3$, $c=7$; $a=6$, $c=5$; $a=9$, $c=3$; and $a=12$, $c=1$.</p>