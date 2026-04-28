# [Gold III] Kernel Scheduler - 30568

[문제 링크](https://www.acmicpc.net/problem/30568)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 34, 맞힌 사람: 29, 정답 비율: 76.316%

### 분류

그래프 이론, 애드 혹, 해 구성하기, 방향 비순환 그래프

### 문제 설명

<p>You are developing the scheduling module for the new operating system. This module takes $n$ tasks to be executed and the dependencies between them and then puts them in a certain order for execution.</p>

<p>More formally, there are $n$ tasks numbered from $1$ to $n$. You are also given $m$ dependencies numbered from $1$ to $m$; $i$-th of them is described by two numbers --- $a_i$ and $b_i$, meaning that the task $a_i$ should be executed before the task $b_i$.</p>

<p>In some cases, there are <em>cyclical dependencies</em> --- situations when according to the dependencies given some task $t_1$ should be executed before $t_2$, $t_2$ before $t_3$, \ldots, and $t_{k-1}$ before $t_k$ and $t_k$ before $t_1$. Cyclical dependencies create a problem for scheduling, so you decided to remove some of the given dependencies in such a way that the resulting set does not contain any cyclical ones.</p>

<p>However, you still need to keep at least $m/2$ original dependencies to preserve some of the original information. You are to write the program performing this task.</p>

### 입력

<ul>
	<li>One line containing the numbers $n$ and $m$ ($2 \le n \le 10^5$, $1 \le m \le 3 \cdot 10^5$).</li>
	<li>$m$ further lines, each containing two numbers $a_i$ and $b_i$ ($1 \le a_i, b_i \le n$, $a_i \ne b_i$), describing the corresponding dependency between two tasks $a_i$ and $b_i$.</li>
</ul>

### 출력

<p>The first line should should contain <code>YES</code> in case the desired subset of dependencies exists, and <code>NO</code> otherwise.</p>

<p>In the <code>YES</code> case second line should contain the number $k$ of the selected dependencies (please note that $k$ should be at least $m/2$) and the third line should contain $k$ numbers --- the ids of the selected dependencies. They are numbered from $1$ to $m$ in the order given in the input.</p>