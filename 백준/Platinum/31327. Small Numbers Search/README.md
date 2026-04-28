# [Platinum IV] Small Numbers Search - 31327

[문제 링크](https://www.acmicpc.net/problem/31327)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

자료 구조, 애드 혹, 트리, 이분 탐색, 우선순위 큐, 무작위화

### 문제 설명

<p><em>This is an interactive problem.</em></p>

<p>Jury has a permutation of numbers from $1$ to $n$. Your task is find positions where numbers from $1$ to $k$ are placed. To do this, you can use jury&#39;s program which can compare numbers in any two positions in the permutation.</p>

### 입력

<p>The first line of input contains two integers $n$ and $k$: the order of permutation and the number of positions to find. In all tests except the example, $n = 10\,000$ and $k \le 10$.</p>

<p>Then follow the answers for your requests, one per line. If the first of the two numbers to compare is less than the second one, the line will contain a single character &quot;<code>&lt;</code>&quot;, otherwise, it will contain a single character &quot;<code>&gt;</code>&quot;.</p>

### 출력

<p>If you want to compare numbers on positions $i$ and $j$, you must print one line &quot;<code>?</code> $i$ $j$&quot;. Here, $i$ and $j$ must be different integers between $1$ and $n$. You can request a comparison at most $10\,700$ times.</p>

<p>If you found all positions for all numbers from $1$ to $k$, print &quot;<code>!</code> $pos_1$ $pos_2$ $\dots$ $pos_k$&quot;, and then terminate your program.</p>

<p>To prevent output buffering, after printing each line, consider issuing the command which flushes the buffer. For example, this command may be <code>fflush(stdout)</code> in C or C++, <code>System.out.flush()</code> in Java, <code>flush(output)</code> in Pascal or <code>sys.stdout.flush()</code> in Python.</p>

<p>Also, don&#39;t forget to put a newline at the end of every line of your output.</p>

### 힌트

<p>In the example, the jury&#39;s permutation is <code>1 2 3</code>.</p>