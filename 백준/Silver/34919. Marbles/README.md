# [Silver I] Marbles - 34919

[문제 링크](https://www.acmicpc.net/problem/34919)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 17, 정답: 13, 맞힌 사람: 13, 정답 비율: 76.471%

### 분류

순열 사이클 분할, 해 구성하기

### 문제 설명

<p>Busy Beaver lines up $N$ marbles numbered $1$ through $N$, where the $i$-th marble shows a number $p_i \neq i$, and every number from $1$ to $N$ appears exactly once among $p_1, \dots, p_N$ (more formally, $p$ is a permutation over $1, \dots, N$ such that $p_i \neq i$).</p>

<p>He wants to paint the marbles so that each marble $i$ has a different color from marble $p_i$. However, he only has three colors: red, green, and blue. Help him find any valid painting.</p>

### 입력

<p>The first line contains a single integer $T$ ($1 \leq T \leq 10^4$) --- the number of test cases.</p>

<p>The first line of each test case contains one integer $N$ ($2 \le N \le 10^5$) --- the number of marbles.</p>

<p>The second line of each test case contains $N$ integers $p_1, p_2, \dots, p_N$ ($1 \le p_i \le N$; $p_i \ne i$) --- the numbers on the marbles. These numbers form a rearrangement of the numbers $1, \dots, N$ in some order.</p>

<p>The sum of $N$ over all test cases does not exceed $10^5$.</p>

### 출력

<p>For each test case, output a string of length $N$ containing the characters <code>R</code>, <code>G</code>, and <code>B</code>, where the $i$-th character denotes the color (red, green, or blue, respectively) of the $i$-th marble, satisfying the constraints.</p>

<p>If there are multiple possible answers, you can output any of them. We have a proof that under these constraints, an answer always exists.</p>

### 힌트

<p>In the first test case, the coloring <code>GBBGR</code> works as follows:</p>

<ul>
<li>Marble $1$ is colored green and has the number $2$ written on it; marble $2$ is colored blue, and since green is not blue, the constraint is satisfied.</li>
<li>Marble $2$ is colored blue and has the number $1$ written on it; marble $1$ is colored green, and since blue is not green, the constraint is satisfied.</li>
<li>Marble $3$ is colored blue and has the number $5$ written on it; marble $5$ is colored red, and since blue is not red, the constraint is satisfied.</li>
<li>Marble $4$ is colored green and has the number $3$ written on it; marble $3$ is colored blue, and since green is not blue, the constraint is satisfied.</li>
<li>Marble $5$ is colored red and has the number $4$ written on it; marble $4$ is colored green, and since red is not green, the constraint is satisfied.</li>
</ul>