# [Platinum I] BinSearch - 24069

[문제 링크](https://www.acmicpc.net/problem/24069)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 17, 맞힌 사람: 11, 정답 비율: 32.353%

### 분류

해 구성하기, 분할 정복, 재귀

### 문제 설명

<pre>
bool binary_search ( int n , int p [] , int target ){
    int left = 1 , right = n ;
    while ( left &lt; right ){
        int mid = ( left + right ) / 2;
        if( p [ mid ] == target )
            return true ;
        else if( p[ mid ] &lt; target )
            left = mid + 1;
        else
            right = mid - 1;
    }
    if( p [ left ] == target ) return true ;
    else return false ;
}</pre>

<p>It is well known that if <code>p</code> happens to be sorted, then this code returns <code>true</code> if and only if <code>target</code> appears within <code>p</code>. On the other hand, this may not be the case if <code>p</code> is not sorted.</p>

<p>You are given a positive integer $n$ and a sequence $b_1, \dots&nbsp;, b_n &isin; \{$<code>true</code>, <code>false</code>$\}$. It is guaranteed that $n = 2^{k} - 1$ for some positive integer $k$. You must generate a permutation $p$ of $\{1, \dots , n\}$ that follows certain conditions. Let $S(p)$ be the number of indices $i \in \{1, \dots , n\}$ for which <code>binary_search(n, p, i)</code> does <strong>not</strong> return $b_i$. You must set $p$ so that $S(p)$ is small (as detailed in the &ldquo;Restrictions&rdquo; section).</p>

<p>Note: a permutation of $\{1, \dots , n\}$ is a sequence of $n$ integers that contains each integer from $1$ to $n$ <em>exactly</em> once.</p>

### 입력

<p>The input contains multiple test cases. The first line of input contains $T$, the number of test cases. The test cases follow.</p>

<p>The first line of a test case contains the integer $n$. The second line of a test case contains a string of length n containing only characters &#39;<code>0</code>&#39; and &#39;<code>1</code>&#39;. These characters are not separated by spaces. If the $i$<sup>th</sup> character is &#39;<code>1</code>&#39;, then $b_i = $<code>true</code>, and if it is &#39;<code>0</code>&#39;, then $b_i = $<code>false</code>.</p>

### 출력

<p>The output data consists of the answers for each of the&nbsp;$T$ test cases. The answer for a particular test case consists of the permutation $p$ generated for that test case.</p>

### 제한

<ul>
	<li>Let $\sum{n}$ be the sum of all values of $n$ in a single input.</li>
	<li>$1 &le; \sum{n} &le; 100\,000$.</li>
	<li>$1 &le; T &le; 7\,000$.</li>
	<li>$n = 2^{k} - 1$ for some $k \in \mathbb{N}$, $k &gt; 0$.</li>
	<li>If $S(p) &le; 1$ for all test cases within a subtask, then you are given $100\%$ of the points for that subtask.</li>
	<li>Otherwise, if $0 &le; S(p) &le; \lceil log_{2}{n} \rceil$ (i.e. $1 &le; 2^{S(p)} &le; n + 1$) for all test cases within a subtask, then you are given $50\%$ of the points for that subtask.</li>
</ul>

### 힌트

<p>Example 1. In the first two test cases of the first example, we have $S(p) = 0$.</p>

<p>In the third test case, we have $S(p) = 1$. This is because <code>binary_search(n, p, 2)</code> returns <code>true</code>, although $b_2 = $<code>false</code>.</p>

<p>In the forth test case, we have $S(p) = 1$. This is because <code>binary_search(n, p, 4)</code> returns <code>true</code>, although $b_4 = $<code>false</code>.</p>

<p>Example 2. We have $S(p) = 0$ for both test cases.</p>