# [Platinum III] Big Picture - 28167

[문제 링크](https://www.acmicpc.net/problem/28167)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 21, 맞힌 사람: 21, 정답 비율: 67.742%

### 분류

조합론, 기댓값의 선형성, 수학, 누적 합, 확률론

### 문제 설명

<p>Grammy has a big picture with $n+1$ rows and $m+1$ columns. Rows are numbered from $1$ to $n+1$ and columns are numbered from $1$ to $m+1$. </p>

<p>Grammy decides to color this picture in a special way. For the $i$-th row, Grammy will color the leftmost $j$ ($1\leq j\leq m$) cells black with probability $p_{i,j}$. For the $j$-th column, Grammy will color the topmost $i$ ($1\leq i\leq n$) cells black with probability $q_{i,j}$. Operations are independent, and a cell could be colored more than once.</p>

<p>Let us define the beauty value as the number of maximal orthogonally connected regions of the same color. Before Grammy finishes her coloring, she wants to know the expected number of regions on the picture. Please calculate the expected beauty value of the picture for her. </p>

<p>Two cells $x$ and $y$ are in the same orthogonally connected region if and only if they satisfy the following constraints: </p>

<ul>
	<li>They have the same color. </li>
	<li>$x$ shares an edge with $y$ or $x$ shares an edge with some cell $z$ while $y$ and $z$ are in the same orthogonally connected region.  </li>
</ul>

### 입력

<p>The first line contains two integers $n$ and $m$ ($1 \leq n,m \leq 1000$), denoting the size of the picture. </p>

<p>Each of the next $n$ lines contains $m$ integers $p_{i,j}$, denoting the probability of painting the leftmost $j$ cells of the $i$-th row black, modulo $998\,244\,353$. It is guaranteed that the sum of the probabilities in each row is $1$. </p>

<p>Each of the next $n$ lines contains $m$ integers $q_{i,j}$, denoting the probability of painting the topmost $i$ cells of the $j$-th column black, modulo $998\,244\,353$. It is guaranteed that the sum of the probabilities in each column is $1$.</p>

### 출력

<p>Output a single integer, denoting the expected beauty value of the picture, modulo $998\,244\,353$. </p>

<p>It can be shown that the answer can be expressed as an irreducible fraction $\frac{x}{y}$, where $x$ and $y$ are integers and $y \not \equiv 0 \pmod {998\,244\,353}$. Output the integer equal to $x\cdot y^{-1}\pmod {998\,244\,353}$. In other words, output such an integer $a$ that $0\leq a &lt; 998\,244\,353$ and $a\cdot y\equiv x\pmod {998\,244\,353}$. </p>

### 힌트

<p>There is only one possible picture in the first example, which is shown as follows. There are $3$ maximal orthogonally connected regions in the picture, so the beauty value of the picture is $3$. </p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/63994518-3049-4e3f-a3a5-b04c0c097a97/-/preview/" style="width: 200px; height: 185px;" /></p>