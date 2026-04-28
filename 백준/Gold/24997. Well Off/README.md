# [Gold II] Well Off - 24997

[문제 링크](https://www.acmicpc.net/problem/24997)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 8, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Thanks to his hard work, John, formerly Johnny, has become a member of the respectable Well Off Club. The club has $n$ members, numbered from $1$ to $n$; the $i$-th club member has a fortune worth $x_i$. These can be arbitrary numbers, including negative ones. The reason for this is that the club membership is for life, i.e., neither impoverishment nor even bankruptcy results in an ousting.</p>

<p>The club members take pleasure in comparing their asset values, but they shun telling the number directly; it is their custom to engage in a conversation that lets them establish that their fortunes $x_i$ and $x_j$ satisfy one of the inequalities $x_i + x_j &gt;0$, $x_i - x_j &gt; 0$, $-x_i + x_j &gt; 0$, or $-x_i - x_j &gt; 0$.</p>

<p>Johnny (over-)heard many such inequalities today at the club, but he suspects that some of the members are lying. Help him determine if all the inequalities could possibly be true, i.e., if they can be simultaneously satisfied by some set of fortunes. Write a program that: reads the inequalities heard by Johnny, determines if they are satisfiable, and prints the answer to the standard output.</p>

### 입력

<p>In the first line of input there are two integers, $n$ and $m$ ($1 \le n \le 100\,000$, $1 \le m \le 500\,000$), separated by a single space. These specify the number of club members and the number of inequalities relating their fortunes, respectively.</p>

<p>Each of the $m$ lines that follow describes one inequality, encoded by a <code>+</code> or <code>-</code> sign, an integer $i$ ($1 \le i \le n$), another <code>+</code> or <code>-</code> sign, and an integer $j$ ($1 \le j \le n$), separated by single spaces. &nbsp;These correspond to the inequality $\pm x_i \pm x_j &gt; 0$ (with the signs as preceding $i$ and $j$ in the description). It might happen that $i=j$.</p>

### 출력

<p>The first and only line of the output should contain a single word: &quot;<code>TAK</code>&quot; if the system of inequalities is satisfiable, and &nbsp;&quot;<code>NIE</code>&quot; otherwise. % (Naturally, these are the Polish words for <em>yes</em> and <em>no</em>.)</p>

### 힌트

<p>In Sample 1, system of inequalities is satisfiable, e.g. by $x_1 = 3$, $x_2 = 2$, $x_3 = 1$.</p>

<p>In Sample 2, system of inequalities is not satisfiable.</p>