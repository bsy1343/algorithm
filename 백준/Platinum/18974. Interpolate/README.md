# [Platinum II] Interpolate - 18974

[문제 링크](https://www.acmicpc.net/problem/18974)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 256 MB

### 통계

제출: 16, 정답: 10, 맞힌 사람: 10, 정답 비율: 66.667%

### 분류

비트 집합, 해 구성하기, 수학

### 문제 설명

<p>A <em>Zhegalkin polynomial</em>&nbsp;is a boolean function $f(x_1,\dots,x_n)$ which is represented as follows:</p>

<p>\[f(x_{1},\dots,x_{n}) = \bigoplus_{S \subseteq \{1, 2, \ldots, n\}} a_S \cdot \bigwedge_{i \in S} x_i,\]</p>

<p>where $\oplus$ and $\wedge$ stand for XOR and AND boolean operations respectively, XOR is taken over all subsets of variables, and $a_S \in \{0, 1\}$ for each subset $S$ of $\{1, 2, \ldots, n\}$.</p>

<p>In this task you are given $m$ sets of variable values $({v_i}_{1},\dots,{v_i}_{n})$ and $m$ boolean values $y_i \in \{0, 1\}$. You have to construct a Zhegalkin polynomial with at most $9000$ non-zero terms satisfying $f({v_i}_{1},\dots,{v_i}_{n}) = y_i$ for each $i = 1, 2, \ldots, m$.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ --- the number of variables and the number of given variable values ($1 \leq n, m \leq 2000$).</p>

<p>Each of the following $m$ lines contains a string of $n$ characters $0$ or $1$ representing the $i$-th set of variable values, followed by the integer $y_i$.</p>

<p>It is guaranteed that all sets of variable values are distinct and $y_i=1$ for at least one set.</p>

### 출력

<p>Your polynomial has to contain at most $9000$ terms having $a_S = 1$. For each such term print its corresponding subset $S$ of variables as a string of $n$ characters $0$ or $1$ such that $i$-th character equals $1$ if $i \in S$ and $0$ otherwise. You can output the terms in any order but there should be no repeating subsets.&nbsp;</p>

<p>If there are multiple possible answers, output any of them. If the solution does not exist, output $-1$.&nbsp;</p>

<p>It is guaranteed that if the solution exists, then the solution with at most $9000$ terms $S$ having $a_S = 1$ exists as well.</p>

### 힌트

<p>One of the possible answers to the first sample is $f(x_1,x_2)=1$.</p>

<p>In the second sample $f(x_1,x_2,x_3)=x_1\oplus x_2\oplus x_3$ is one of the possible answers.</p>