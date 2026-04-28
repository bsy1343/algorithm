# [Gold III] Automated Program Analyzer - 25077

[문제 링크](https://www.acmicpc.net/problem/25077)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 131, 정답: 28, 맞힌 사람: 25, 정답 비율: 22.727%

### 분류

값 / 좌표 압축, 자료 구조, 분리 집합

### 문제 설명

<p>Let&nbsp;$x_1, x_2, x_3, \dots$&nbsp;be variables.&nbsp;$n$&nbsp;constraints of form&nbsp;$x_i = x_j$&nbsp;or&nbsp;$x_i \ne x_j$&nbsp;are given. The task asks for whether it is possible to assign values to the variables so that all constraints can be satisfied. For example, if the constraints are&nbsp;$x_1 = x_2, x_2 = x_3, x_3 = x_4, x_1 \ne x_4$, then those constraints cannot be satisfied simultaneously.</p>

### 입력

<p>The first line of the input is an integer&nbsp;$t$&nbsp;representing the number of instances to solve. The instances are independent. For each instance, the first line is an integer&nbsp;$n$&nbsp;representing the number of constraints to be satisfied. In the following&nbsp;$n$&nbsp;lines, each line has three integers&nbsp;$i,j,e$&nbsp;representing an equality/inequality constraint. If&nbsp;$e = 1$, the constraint shall be&nbsp;$x_i = x_j$. If&nbsp;$e = 0$, the constraint shall be&nbsp;$x_i \ne x_j$.</p>

### 출력

<p>The output has&nbsp;$t$&nbsp;lines. The&nbsp;$k$-th line of the output is a string&nbsp;<code>YES</code>&nbsp;or&nbsp;<code>NO</code>. Output&nbsp;<code>YES</code>&nbsp;if the constraints in that instance can be satisfied and&nbsp;<code>NO</code>&nbsp;otherwise.</p>

### 제한

<ul>
	<li>$1 \le n \le 100\,000$</li>
	<li>$1 \le i, j \le 1\,000\,000\,000$</li>
	<li>$1 \le t \le 10$</li>
	<li>$e \in \{0,1\}$</li>
</ul>