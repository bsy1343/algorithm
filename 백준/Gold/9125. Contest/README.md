# [Gold IV] Contest - 9125

[문제 링크](https://www.acmicpc.net/problem/9125)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 20, 맞힌 사람: 15, 정답 비율: 88.235%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>You and your team are participating in a programming contest. After reading all problems, you have estimated for each problem how long it will take you to solve it. Your teammates have done exactly the same. Now you want to divide the problems, so that the total number of solved problems will be maximized.</p>

<p>Your team is very organized and each team member always writes down all the details on paper. Therefore the computer never forms a bottleneck. The only constraint is that for each team member, the total time required to solve the problems assigned to him should not exceed the time left in the contest.</p>

### 입력

<p>On the first line an integer t (1 &le; t &le; 100): the number of test cases. Then for each test case:</p>

<ul>
	<li>One line with two integers n (1 &le; n &le; 10) and m ( 1 &le; m &le; 300). The number of problems and the number of minutes left in the contest.</li>
	<li>Three lines with n integers each. Each line describes the solving times for a different team member. The jth integer on the ith line is denoted by s<sub>ij</sub>: either the time in minutes it takes the ith person to solve the jth problem (1 &le; s<sub>ij</sub> &le; 300), or &minus;1 if the person cannot solve this problem.</li>
</ul>

### 출력

<p>For each test case:</p>

<ul>
	<li>One line with the maximum number of problems your team can solve.</li>
</ul>