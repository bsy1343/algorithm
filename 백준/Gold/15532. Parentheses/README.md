# [Gold IV] Parentheses - 15532

[문제 링크](https://www.acmicpc.net/problem/15532)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 73, 정답: 42, 맞힌 사람: 40, 정답 비율: 60.606%

### 분류

해 구성하기

### 문제 설명

<p>Dave loves strings consisting only of &lsquo;(&rsquo; and &lsquo;)&rsquo;. Especially, he is interested in balanced strings. Any balanced strings can be constructed using the following rules:</p>

<ul>
	<li>A string &ldquo;()&rdquo; is balanced.</li>
	<li>Concatenation of two balanced strings are balanced.</li>
	<li>If T is a balanced string, concatenation of &lsquo;(&rsquo;, T, and &lsquo;)&rsquo; in this order is balanced. For example, &ldquo;()()&rdquo; and &ldquo;(()())&rdquo; are balanced strings. &ldquo;)(&rdquo; and &ldquo;)()(()&rdquo; are not balanced strings.</li>
</ul>

<p>Dave has a string consisting only of &lsquo;(&rsquo; and &lsquo;)&rsquo;. It satisfies the followings:</p>

<ul>
	<li>You can make it balanced by swapping adjacent characters exactly A times.</li>
	<li>For any non-negative integer B (B &lt; A), you cannot make it balanced by B swaps of adjacent characters.</li>
	<li>It is the shortest of all strings satisfying the above conditions.</li>
</ul>

<p>Your task is to compute Dave&rsquo;s string. If there are multiple candidates, output the minimum in lexicographic order. As is the case with ASCII, &lsquo;(&rsquo; is less than &lsquo;)&rsquo;.</p>

### 입력

<p>The input consists of a single test case, which contains an integer A (1 &le; A &le; 10<sup>9</sup>).</p>

### 출력

<p>Output Dave&rsquo;s string in one line. If there are multiple candidates, output the minimum in lexicographic order.</p>

### 힌트

<p>Sample 1:&nbsp;There are infinitely many strings which can be balanced by only one swap. Dave&rsquo;s string is the shortest of them</p>

<p>Sample 2:&nbsp;String &ldquo;))(()(&rdquo; can be balanced by 4 swaps, but the output should be &ldquo;)())((&rdquo; because it is the minimum in lexicographic order.</p>