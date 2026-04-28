# [Silver IV] Carpenters' Language - 22531

[문제 링크](https://www.acmicpc.net/problem/22531)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 42, 정답: 30, 맞힌 사람: 24, 정답 비율: 70.588%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>International Carpenters Professionals Company (ICPC) is a top construction company with a lot of expert carpenters. What makes ICPC a top company is their original language.</p>

<p>The syntax of the language is simply given in CFG as follows:</p>

<pre>
S -&gt; SS | (S) | )S( | &epsilon;
</pre>

<p>In other words, a right parenthesis can be closed by a left parenthesis and a left parenthesis can be closed by a right parenthesis in this language.</p>

<p>Alex, a grad student mastering linguistics, decided to study ICPC&#39;s language. As a first step of the study, he needs to judge whether a text is well-formed in the language or not. Then, he asked you, a great programmer, to write a program for the judgement.</p>

<p>Alex&#39;s request is as follows: You have an empty string S in the beginning, and construct longer string by inserting a sequence of &#39;(&#39; or &#39;)&#39; into the string. You will receive $q$ queries, each of which consists of three elements $(p, c, n)$, where $p$ is the position to insert, $n$ is the number of characters to insert and $c$ is either &#39;(&#39; or &#39;)&#39;, the character to insert. For each query, your program should insert $c$ repeated by $n$ times into the $p$-th position of S from the beginning. Also it should output, after performing each insert operation, &quot;Yes&quot; if S is in the language and &quot;No&quot; if S is not in the language.</p>

<p>Please help Alex to support his study, otherwise he will fail to graduate the college.</p>

### 입력

<p>The first line contains one integer $q$ ($1 \leq q \leq 10^5$) indicating the number of queries, follows $q$ lines of three elements, $p_i$, $c_i$, $n_i$, separated by a single space ($1 \leq i \leq q$, $c_i = &#39;(&#39; or &#39;)&#39;$, $0 \leq p_i \leq $ length of S before $i$-th query, $1 \leq n \leq 2^{20}$). It is guaranteed that all the queries in the input are valid.</p>

### 출력

<p>For each query, output &quot;Yes&quot; if S is in the language and &quot;No&quot; if S is not in the language.</p>