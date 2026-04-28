# [Platinum IV] Edit distance on table - 30375

[문제 링크](https://www.acmicpc.net/problem/30375)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 18, 맞힌 사람: 14, 정답 비율: 53.846%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 0-1 너비 우선 탐색

### 문제 설명

<p>You have a table with $H$ rows and $W$ columns. Each cell of the table contains a letter.</p>

<p>You are going to construct a string by the following steps.</p>

<ul>
	<li>Step 1: Pick up a cell in the table and let $S$ be a string of length $1$ containing the letter in the cell.</li>
	<li>Step 2: Do either
	<ul>
		<li>stop building $S$, or</li>
		<li>select a cell from four cells which shares an edge with the current one. Then, append the letter in the cell to $S$, and move to the cell. Then, repeat step 2.</li>
	</ul>
	</li>
</ul>

<p>You also have a string $T$. Your mission is to minimize the edit distance between $S$ and $T$.</p>

<p>The edit distance (also known as Levenshtein distance) between string $U$ and $V$ is the minimum number of steps required to convert $U$ into $V$ by using the following operations.</p>

<ul>
	<li>Replace a character in $U$ with another one.</li>
	<li>Insert a character into $U$.</li>
	<li>Delete a character from $U$.</li>
</ul>

### 입력

<p>The input consists of a single test case in the following format.</p>

<blockquote>
<p>$H$ $W$</p>

<p>$c_{1,1} c_{1,2} \dots c_{1,W}$</p>

<p>$c_{2,1} c_{2,2} \dots c_{2,W}$</p>

<p>$\vdots$</p>

<p>$c_{H,1} c_{H,2} \dots c_{H,W}$</p>

<p>$T$</p>
</blockquote>

<p>$H$ and $W$ ($2 \le H, W \le 100$) represents the height and the width of the table respectively. $c_{i,j}$ ($1 \le i \le H$, $1 \le j \le W$) is a character in the cell in the $i$-th row and the $j$-th column. $T$ is a non-empty string. The length of $T$ doesn&#39;t exceed $2\,000$. $c_{i,j}$ and $T$ consist of lowercase English letters.</p>

### 출력

<p>Output the minimum possible edit distance between $S$ and $T$ in one line.</p>