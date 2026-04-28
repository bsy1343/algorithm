# [Platinum IV] Rikka with Linker - 18999

[문제 링크](https://www.acmicpc.net/problem/18999)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 9, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>If you have ever compiled C++ projects using the command line, you are familiar with the linker. If you want to use two static libraries <code>liba.a</code> and <code>libb.a</code> while <code>liba.a</code> relies on <code>libb.a</code>, you need to put <code>liba.a</code> before <code>libb.a</code>&nbsp;in your command, for example, &quot;<code>g++ -o my my.cpp liba.a libb.a</code>&quot;.</p>

<p>What if both <code>liba.a</code> and <code>libb.a</code> rely on each other? You need to add their names to the command several times, as in &quot;<code>g++ -o my my.cpp liba.a libb.a liba.a</code>&quot;. Formally, if you want to use two libraries <code>liba.a</code> and <code>libb.a</code> while <code>liba.a</code> relies on <code>libb.a</code>, there must be at least one <code>liba.a</code> in your command which occurs before one of the occurrences of <code>libb.a</code>.</p>

<p>Now, Rikka is working on her C++ project, and there are $n$ static libraries she will use. There are $m$ pairs of dependency relationships. A pair $(i, j)$ means that the $i$-th library relies on the $j$-th library.</p>

<p>You know, a complicated command will never bring happiness. So Rikka wants to simplify the compile command. Specifically, Rikka wants to make the number of the names of static libraries in her compile command as small as possible. Help her find this number.</p>

### 입력

<p>The first line contains a single integer $t$ ($1 \leq t \leq 10^3$), the number of test cases.</p>

<p>The first line of each test case contains two integers $n$ and $m$ ($1 \leq n \leq 18$, $0 \leq m \leq n \cdot (n-1)$).</p>

<p>Then $m$ lines follow, each line contains two integers $a$ and $b$ ($1 \leq a, b \leq n$, $a \neq b$) and describes a dependency relationship: library $a$ relies on library $b$.</p>

<p>It is guaranteed that each dependency relationship will occur at most once, and there are at most $20$ test cases with $n &gt; 12$.</p>

### 출력

<p>For each test case, output a single line with a single integer: the minimum possible number of library names in Rikka&#39;s compile command.</p>