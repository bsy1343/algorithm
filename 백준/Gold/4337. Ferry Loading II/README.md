# [Gold III] Ferry Loading II - 4337

[문제 링크](https://www.acmicpc.net/problem/4337)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 17, 맞힌 사람: 17, 정답 비율: 73.913%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Before bridges were common, ferries were used to transport cars across rivers. River ferries, unlike their larger cousins, run on a guide line and are powered by the river&#39;s current. Cars drive onto the ferry from one end, the ferry crosses the river, and the cars exit from the other end of the ferry.</p>

<p>There is a ferry across the river that can take n cars across the river in t minutes and return in t minutes. m cars arrive at the ferry terminal by a given schedule. What is the earliest time that all the cars can be transported across the river? What is the minimum number of trips that the operator must make to deliver all cars by that time?</p>

### 입력

<p>The first line of input contains c, the number of test cases. Each test case begins with n, t, m. m lines follow, each giving the arrival time for a car (in minutes since the beginning of the day). The operator can run the ferry whenever he or she wishes, but can take only the cars that have arrived up to that time.</p>

<p>You may assume that 0 &lt; n, t, m &lt; 1440. The arrival times for each test case are in non-decreasing order.</p>

### 출력

<p>For each test case, output a single line with two integers: the time, in minutes since the beginning of the day, when the last car is delivered to the other side of the river, and the minimum number of trips made by the ferry to carry the cars within that time.</p>