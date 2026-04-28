# [Gold V] Ordinary Ordinals - 24930

[문제 링크](https://www.acmicpc.net/problem/24930)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 95, 정답: 55, 맞힌 사람: 50, 정답 비율: 57.471%

### 분류

수학, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>Sets, sets, sets. Everything in math is just a set. Even the natural numbers can be represented as sets. For example, we can represent the the number $0$ as the empty set $\{\}$. The number $1$ can be represented as&nbsp;$\{\{\}\}$.</p>

<p>But what about $2$? Consider $\{\{\},\{\{\}\}\}$, the set containing both the empty set and&nbsp;$\{\{\}\}$. This is a nice choice for $2$ for two reasons: we have that $0$ and&nbsp;$1$&nbsp;are&nbsp;<em>elements</em>&nbsp;of&nbsp;$2$&nbsp;and we also have that&nbsp;$0$&nbsp;and&nbsp;$1$&nbsp;are&nbsp;<em>subsets</em>&nbsp;of&nbsp;$2$.</p>

<p>In general, for&nbsp;$N&gt;0$&nbsp;we can represent&nbsp;$N$&nbsp;as the set&nbsp;$\{0,1, \dots ,N-1\}$&nbsp;where we recursively apply the representations for&nbsp;$0,1, \dots ,N-1$. For example:&nbsp;$$\begin{eqnarray*} 3 &amp; = &amp; \{ 0, 1, 2\} \\ &amp; = &amp; \{ \{ \} , \{ 0\} , \{ 0, 1\} \} \\ &amp; = &amp; \{ \{ \} , \{ \{ \} \} , \{ \{ \}, \{ 0\} \} \} \\ &amp; = &amp; \{ \{ \} , \{ \{ \} \} , \{ \{ \} , \{ \{ \} \} \} \} \end{eqnarray*}$$</p>

<p>Thus, for each&nbsp;$0&le;i&lt;N$,&nbsp;$i$&nbsp;is both a member of&nbsp;$N$&nbsp;and a subset of&nbsp;$N$. Another nice feature is the size of the set representing&nbsp;$N$&nbsp;is also&nbsp;$N$. But what is not so nice is the number of characters it takes to write such a set. Given a natural number&nbsp;$N&ge;0$, how many braces and commas are required to write out the set representing&nbsp;$N$&nbsp;in the above manner?</p>

<p>More specifically, let&nbsp;$f(N)$&nbsp;be the number of bracket and comma characters required to write out the set representing&nbsp;$N$. Since&nbsp;$f(N)$&nbsp;can be quite large, your job is to determine&nbsp;$f(N)$&nbsp;modulo some positive integer&nbsp;$M$.</p>

### 입력

<p>Input consists of two integers $N$&nbsp;($0&le;N&lt;2^{63}$) and&nbsp;$M$&nbsp;($1&le;M&lt;2^{31}$) as described above.</p>

### 출력

<p>Display the value of&nbsp;$f(N)$&nbsp;reduced modulo&nbsp;$M$. That is, the remainder that would be left if you divided&nbsp;$f(N)$&nbsp;by&nbsp;$M$.</p>