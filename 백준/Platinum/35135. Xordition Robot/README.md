# [Platinum II] Xordition Robot - 35135

[문제 링크](https://www.acmicpc.net/problem/35135)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 6, 맞힌 사람: 6, 정답 비율: 54.545%

### 분류

세그먼트 트리, 자료 구조

### 문제 설명

<p>You have a robot that contains $N$ modules, numbered from $1$ to $N$. Each module accepts an integer and outputs an integer. The output of module $i$ becomes the input of module $i+1$ (for $1 \le i \le N - 1$).</p>

<p>The specification of module $i$ is either:</p>

<ul>
<li><code>+</code> $k$: given an integer $x$ ($0 \leq x &lt; 16$), the module outputs $(x + k) \bmod 16$; or</li>
<li>$x$ $k$: given an integer $x$ ($0 \leq x &lt; 16$), the module outputs $x \oplus k$, where $\oplus$ represents the bitwise XOR operator.</li>
</ul>

<p>There are $Q$ replacements, and the $j$-th is of the form:</p>

<ul>
<li>$i$ $t$ $k$: replace module $i$ to a module with specification $t$ $k$, where $t$ is either <code>+</code> or <code>x</code>.</li>
</ul>

<p>Each time a replacement is done, find the output of module $N$ when module $1$ is given an input $0$.</p>

### 입력

<p>The first line contains two integers $N$ and $Q$ ($1 \leq N, Q \leq 200000$). Each of the next $N$ lines contains a character of either <code>+</code> or <code>x</code> followed by an integer $k$ ($0 \leq k &lt; 16$) representing the module.</p>

<p>The next $Q$ lines contains an integer $i$ ($1 \leq i \leq N$), followed by a character <code>+</code> or <code>x</code>, and finally an integer $k$ ($0 \leq k &lt; 16$), meaning that you have to replace module $i$ to the specified module.</p>

### 출력

<p>Output $Q$ lines, each containing the output of module $N$, after each replacement, when given an input $0$ to module $1$.</p>

### 힌트

<p><em>Explanation of Sample 1:</em> After the first replacement, the modules are: <code>+</code> $3$, <code>+</code> $8$, <code>x</code> $9$, <code>+</code> $15$</p>

<p>The output of module $N$ is then $(((0 + 3) + 8) \oplus 9) + 15)$ is $1$.</p>

<p>After the second replacement, the modules are: <code>x</code> $10$, <code>+</code> $8$, <code>x</code> $9$, <code>+</code> $15$</p>

<p>The output of module $N$ is then $(((0 \oplus 10) + 8) \oplus 9) + 15)$ is $10$.</p>