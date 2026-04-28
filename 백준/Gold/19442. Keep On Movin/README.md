# [Gold IV] Keep On Movin - 19442

[문제 링크](https://www.acmicpc.net/problem/19442)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 53, 정답: 35, 맞힌 사람: 26, 정답 비율: 59.091%

### 분류

수학, 그리디 알고리즘, 문자열, 홀짝성

### 문제 설명

<p>Professor Zhang has $n$ kinds of characters, and the quantity of the $i$-th character is $a_i$. Professor Zhang wants to use all the characters to build several palindromic strings. He also wants to maximize the length of the shortest palindromic string.</p>

<p>For example, let there be $4$ kinds of characters denoted as &#39;<code>a</code>&#39;, &#39;<code>b</code>&#39;, &#39;<code>c</code>&#39;, &#39;<code>d</code>&#39;, and let their quantities be $\{2, 3, 2, 2\}$, respectively. Professor Zhang can build (&quot;<code>acdbbbdca</code>&quot;), or (&quot;<code>abbba</code>&quot; and &quot;<code>cddc</code>&quot;), or (&quot;<code>aca</code>&quot;, &quot;<code>bbb</code>&quot; and &quot;<code>dcd</code>&quot;), or (&quot;<code>acdbdca</code> and &quot;<code>bb</code>&quot;). The first is the optimal solution where the length of the shortest palindromic string is $9$.</p>

<p>Note that a string is called palindromic if it can be read the same way in either direction.</p>

### 입력

<p>There are multiple test cases. The first line of input contains an integer $T$ indicating the number of test cases. For each test case:</p>

<p>The first line contains an integer $n$ ($1 \le n \le 10^5$): the number of kinds of characters. The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($0 \le a_i \le 10^4$).</p>

<p>There are at most $110$ test cases, and the total size of the input is at most $6$ mebibytes.</p>

### 출력

<p>For each test case, output an integer denoting the answer.</p>