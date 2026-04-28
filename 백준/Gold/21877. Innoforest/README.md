# [Gold V] Innoforest - 21877

[문제 링크](https://www.acmicpc.net/problem/21877)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

해 구성하기

### 문제 설명

<p>Trees in Innopolis are exceptional, if you water an innotree (Innopolis Tree), it will grow by number of litres you have watered it. In other words if you water innotree of height $h$ by $x$ litres of water then it will have new height of $h + x$.</p>

<p>Innoforest (Innopolis Forest) is a $n \times m$ grid, each cell of the grid contains one innotree. Irrigation system in innoforest contains $n + m$ canals: one for each row and column. The irrigation system in one operation can water all trees along one of canals by the same amount of water.</p>

<p>The mayor of Innopolis wants to transform the innoforest by performing some operations on the irrigation system. For each tree in innoforest you know its current height and the desired height. Your task is to find the sequence of operations that transforms the innoforest to the desired shape.</p>

### 입력

<p>First line contains two numbers $n$ and $m$ ($1 \le n, m \le 1000$).</p>

<p>Then $n$ lines follow, each line contains $m$ numbers $a_{i,j}$, current heights of the trees in innoforest ($1 \le a_{i,j} \le 10^9$).</p>

<p>Then $n$ more lines follow, each line contains $m$ numbers $b_{i,j}$, desired heights of the trees ($1 \le b_{i,j} \le 10^9$).</p>

### 출력

<p>The first line should contain the number of operations $k$ ($0 \le k \le 10^6$), then $k$ lines contain the description of operations.</p>

<ul>
	<li>&quot;<code>R r x</code>&quot; The system will water the $r$-th row by $x$ litres. ($1 \le r \le n$, $1 \le x \le 10^9$).</li>
	<li>&quot;<code>C c x</code>&quot; The system will water the $c$-th column by $x$ litres. ($1 \le c \le m$, $1 \le x \le 10^9$).</li>
</ul>

<p>If it is impossible to transform the innoforest to the desired shape, output only one integer <code>-1</code>.</p>

<p>Notice that it is not required to minimize the number of operations, only make sure that it does not exceed $10^6$.</p>