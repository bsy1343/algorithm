# [Silver I] Refueling Stops - 10515

[문제 링크](https://www.acmicpc.net/problem/10515)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 99, 정답: 39, 맞힌 사람: 35, 정답 비율: 57.377%

### 분류

구현, 그리디 알고리즘, 시뮬레이션

### 문제 설명

<p>John is taking a long drive from Rawalpindi to Karachi along the Indus Highway. His car&rsquo;s full fuel tank holds enough petrol to travel k kilometers. You have a map that gives distances between fuel stations along the route. Let d<sub>1</sub> &lt; d<sub>2</sub> &lt; &hellip; &lt; d<sub>n</sub> be the locations of all the gas stations along the route where d<sub>i</sub> is the distance from Rawalpindi to the fuel station i.</p>

<p>Your goal is to help John decide which petrol stations he should stop at for refueling along the path so that he has to take minimum stops. Assume that he starts with a full tank.</p>

### 입력

<p>The input consists of multiple test cases. The first line of input is the number of test cases N(1&le;N&le;100). Each of the following N lines contain the total distance D from Rawalpindi to Karachi in kilometers (1&le;D&le;10000), the number of kilometers K that his car can travel with a full tank (1&le;K&le;10000), the total number of filling stations S along the route (1&le;S&le;100), followed by S integers representing (distance from Rawalpindi in kilometers) the positions of the filling stations.</p>

### 출력

<p>For each test case, print a single line that saying &ldquo;Case #n:&rdquo; where n is the test case number followed by a space followed by space separated list of petrol pump locations where John should stop for refueling for that test case. If John is going to run out of petrol, say &ldquo;out of petrol&rdquo; for that case.</p>