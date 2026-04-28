# [Gold II] Balanced Tree Path - 31523

[문제 링크](https://www.acmicpc.net/problem/31523)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 80, 정답: 41, 맞힌 사람: 35, 정답 비율: 47.297%

### 분류

자료 구조, 그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 트리, 깊이 우선 탐색, 스택

### 문제 설명

<p>You are given a tree where each node is annotated with a character from <code>()[]{</code>}. A path is a sequence of one or more nodes where no node is repeated and every pair of adjacent nodes is connected with an edge. A path is balanced if the characters at each node, when concatenated, form a balanced string. A string is balanced if it satisfies the following definition:</p>

<ul>
	<li>An empty string is balanced.</li>
	<li>If $s$ is a balanced string, then <code>(</code>$s$<code>)</code>, <code>[</code>$s$<code>]</code>, and <code>{</code>$s$} are balanced strings.</li>
	<li>if $a$ and $b$ are balanced strings, then $ab$ ($a$ concatenated with $b$) is a balanced string.</li>
</ul>

<p>Compute the number of balanced paths over the entire tree.</p>

### 입력

<p>The first line of input contains a single integer $n$ ($2 \le n \le 5 \cdot 10^3$).</p>

<p>The next line contains a string of $n$ characters, where each character is one of <code>()[]\{\</code>}.</p>

<p>Each of the next $n-1$ lines contains two integers, $u$ and $v$ ($1 \le u &lt; v \le n$), indicating that nodes $u$ and $v$ are connected with an edge. It is guaranteed the graph is a tree.</p>

### 출력

<p>Output a single integer, which is the number of balanced paths over the entire tree.</p>