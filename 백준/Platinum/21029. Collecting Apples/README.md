# [Platinum III] Collecting Apples - 21029

[문제 링크](https://www.acmicpc.net/problem/21029)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 42, 정답: 19, 맞힌 사람: 17, 정답 비율: 42.500%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Santi is playing a game with a grid of $R$ rows (from top to bottom) and $C$ columns (from left to right). The cell at the $i$<sup>th</sup> row and the $j$<sup>th</sup> column is denoted by cell $(i, j)$. There are $A_{i,j}$ apples on the $(i, j)$ cell.</p>

<p>Santi&rsquo;s character, Nano, is initially on the $(1, 1)$ cell and would like to move to the $(R, C)$ cell. On each turn, Nano can only move one cell to the bottom or one cell to the right so that it is closer to the goal. Nano&rsquo;s path to the goal can be represented as a string containing $R + C - 2$ characters, where $R - 1$ of those characters are &lsquo;<code>D</code>&rsquo; and $C - 1$ of those characters are &lsquo;<code>R</code>&rsquo;. This means that Nano moves one cell to the bottom on the $i$<sup>th</sup> turn if the $i$<sup>th</sup> character is &lsquo;<code>D</code>&rsquo; and Nano moves one cell to the right on the $i$<sup>th</sup> turn if the $i$<sup>th</sup> character is &lsquo;<code>R</code>&rsquo;.</p>

<p>Two paths are different if the string representation is different. We know that there are $R+C-2 \choose R-1$ different paths. A path $X$ is better than path $Y$ if either the following is true:</p>

<ul>
	<li>Path&nbsp;$X$ collects more apples than $Y$. The number of apples that Nano collect in his path is the total number of apples in the cells passed by the path, including the $(1, 1)$ cell and the&nbsp;$(R, C)$ cell.</li>
	<li>Path $X$ collects the same number of apples than $Y$, and the string representation of $X$ is lexicographically smaller than the string representation of $Y$.</li>
</ul>

<p>Finding the best path is too boring for Santi, so she would like to find the $K$<sup>th</sup> best path instead. In other words, she would like to find a path $X$ such that there are $K - 1$ paths that are better than $X$, and there are ${R+C-2 \choose R-1} - K$&nbsp;paths that are worse than $X$.</p>

<p>For example, let $R = 2$, $C = 3$, $K = 3$, $A_{1,1..3} = \{1, 2, 3\}$, and $A_{2,1..3} = \{2, 2, 3\}$. Therefore, there are three different paths to the goal, sorted in the decreasing wellness order.</p>

<ol>
	<li>Path represented by string <code>RRD</code>. This path collects $1 + 2 + 3 + 3 = 9$ apples.</li>
	<li>Path represented by string <code>DRR</code>. This path collects $1 + 2 + 2 + 3 = 8$ apples.</li>
	<li>Path represented by string <code>RDR</code>. This path collects $1 + 2 + 2 + 3 = 8$ apples.</li>
</ol>

<p>Therefore, the $3$<sup>rd</sup> best path is the path represented by string <code>RDR</code>.</p>

### 입력

<p>Input begins with a line containing three integers: $R$ $C$ $K$ ($2&nbsp;\le R, C \le 30; 1 \le&nbsp;K \le {R+C-2 \choose R-1}$) representing the number of rows, the number of columns, and the index of the path that Santi would like to find, respectively. The next $R$ lines, each contains $C$ integers representing the number of apples on each cell. The&nbsp;$j$<sup>th</sup> integer on the $i$<sup>th</sup> line is $A_{i,j}$ ($0 \le A_{i,j} \le 200$).</p>

### 출력

<p>Output in a line a string representing the $K$<sup>th</sup> best path to the goal.</p>