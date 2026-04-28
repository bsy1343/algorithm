# [Silver III] Parentheses Order (Small) - 12204

[문제 링크](https://www.acmicpc.net/problem/12204)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 83, 정답: 68, 맞힌 사람: 51, 정답 비율: 83.607%

### 분류

백트래킹, 브루트포스 알고리즘, 자료 구조, 스택

### 문제 설명

<p>An&nbsp;<b>n</b>&nbsp;parentheses sequence consists of&nbsp;<b>n</b>&nbsp;<code>(</code>s and&nbsp;<b>n</b>&nbsp;<code>)</code>s.</p>

<p>A valid parentheses sequence is defined as the following:</p>

<p><i>You can find a way to repeat erasing adjacent pair of parentheses&nbsp;<code>()</code>&nbsp;until it becomes empty.</i></p>

<p>For example,&nbsp;<code>(())</code>&nbsp;is a valid parentheses, you can erase the pair on the 2nd and 3rd position and it becomes&nbsp;<code>()</code>&nbsp;then you can make it empty. <code>)()(</code>&nbsp;is not a valid parentheses, after you erase the pair on the 2nd and 3rd position, it becomes&nbsp;<code>)(</code>&nbsp;and you cannot erase any more.</p>

<p>Now, we have all valid&nbsp;<b>n</b>&nbsp;parentheses sequences. Find the&nbsp;<b>k</b>-th smallest sequence in lexicographical order.</p>

<p>For example, here are all valid 3 parentheses sequences in lexicographical order:</p>

<pre>
((()))
(()())
(())()
()(())
()()()
</pre>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> lines follow. Each line represents a test case consisting of 2 integers, <strong>n</strong> and <strong>k</strong>.</p>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the <strong>k</strong>-th smallest parentheses sequence in all valid <strong>n</strong> parentheses sequences. Output &quot;Doesn&#39;t Exist!&quot; when there are less than <strong>k</strong> different <strong>n</strong> parentheses sequences.</p>

### 제한

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li><span style="line-height:1.6em">1 &le; </span><strong style="line-height:1.6em">n</strong><span style="line-height:1.6em"> &le; 10.</span></li>
	<li>1 &le; <strong>k</strong> &le; 100000.</li>
</ul>