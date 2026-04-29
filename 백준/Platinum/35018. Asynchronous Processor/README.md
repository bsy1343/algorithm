# [Platinum I] Asynchronous Processor - 35018

[문제 링크](https://www.acmicpc.net/problem/35018)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 13, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

배낭 문제, 비트 집합

### 문제 설명

<p>You are given a program consisting of $n$ instructions executed by a processor with a single integer register $A$, initially equal to $0$. Each instruction is one of two types:</p>

<ul>
<li>"<code>+ v</code>" --- performs $A := A + v$;</li>
<li>"<code>= v</code>" --- performs $A := v$.</li>
</ul>

<p>The instructions in the program are numbered from $1$ to $n$. Each instruction $i$ initially has timestamp $i$.</p>

<p>Some instructions are marked as <em>asynchronous</em>. If instruction $i$ is asynchronous, its timestamp can be changed to any <strong>real</strong> number greater than $i$.</p>

<p>After all timestamp adjustments, all timestamps must be distinct. The processor then executes the instructions in order of increasing timestamp.</p>

<p>Determine the number of distinct final values of $A$ that can be obtained after all instructions have been executed, considering all possible choices of asynchronous instruction timestamps.</p>

### 입력

<p>The first line contains an integer $n$, denoting the number of instructions in the program ($1 \le n \le 2000$).</p>

<p>The $i$-th of the following $n$ lines describes instruction $i$ and contains three tokens. The first token is either '<code>+</code>' or '<code>=</code>', denoting the type of the instruction. The second token is an integer $v$, denoting the argument of the instruction ($1 \le v \le 500$). Finally, the third token is either "<code>async</code>" if the instruction is marked as asynchronous, or "<code>sync</code>" otherwise.</p>

### 출력

<p>Print the number of distinct final values $A$ can take after executing the program. </p>

### 힌트

<p>In the first test, the program execution starts with instruction $1$ setting $A$ to $1$. Then, instructions $2$ and $3$ are executed in one of the two orders:</p>

<ul>
<li>if "<code>= 2</code>" is executed before "<code>+ 3</code>", $A$ will be equal to $5$;</li>
<li>if "<code>+ 3</code>" is executed before "<code>= 2</code>", $A$ will be equal to $2$.</li>
</ul>

<p>Thus, there are two possible values of $A$ at the end: $5$ and $2$.</p>