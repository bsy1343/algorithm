# [Gold II] (N+1)-legged race - 26457

[문제 링크](https://www.acmicpc.net/problem/26457)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 20, 맞힌 사람: 18, 정답 비율: 69.231%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬, 누적 합

### 문제 설명

<p>You are a teacher of a class of $S$ students. The students are numbered from $1$ to $S$, and the $i$-th student has athletic ability $A_i$ and height $H_i$.</p>

<p>In an upcoming sports day your class is going to compete in a game called ($N+1$)-legged race. In this race $N$ runners of a team line up in a row, connect their legs using ankle straps (more precisely, connect the first runner&#39;s right leg and the second runner&#39;s left leg, the second runner&#39;s right leg and the third runner&#39;s left leg, and so on), and run together toward a goal.</p>

<p>As the teacher of the class you have to choose $N$ students from your class as runners of the race and decide the order of these $N$ runners. Of course, each runner&#39;s athletic ability is one of the key factors of the strength of the team. However, you have noticed that if two adjacent runners have very different heights, it ends up losing the strength of the team. After all, if students of numbers $r_1, \dots , r_N$ line up in this order, the strength of this team is defined as follows.</p>

<ul>
	<li>$\sum_{i=1}^{N}{A_{r_i}} - \sum_{i=1}^{N-1}{\left| H_{r_i} - H_{r_{i+1}}\right|}$</li>
</ul>

<p>Your task is to maximize the strength of the team.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$S$ $N$</p>

<p>$A_1$ $H_1$</p>

<p>$\vdots$</p>

<p>$A_Sv $H_S$</p>
</blockquote>

<p>The first line contains two integers $S$ and $N$ ($2 &le; S &le; 10^5$, $2 &le; N &le; \min{(S, 200)}$), which represent the number of students in your class and the number of students that you have to choose from your class as runners. Each of the next $S$ lines contains two integers $A_i$ and $H_i$ ($1 &le; A_i, H_i &le; 10^9$), which represent the athletic ability and height of the $i$-th student in your class.</p>

### 출력

<p>Print the maximum strength of the team that you can accomplish.</p>