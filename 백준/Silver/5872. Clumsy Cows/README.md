# [Silver I] Clumsy Cows - 5872

[문제 링크](https://www.acmicpc.net/problem/5872)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 234, 정답: 148, 맞힌 사람: 137, 정답 비율: 65.550%

### 분류

자료 구조, 그리디 알고리즘, 스택

### 문제 설명

<p>Bessie the cow is trying to type a balanced string of parentheses into her new laptop, but she is sufficiently clumsy (due to her large hooves) that she keeps mis-typing characters. Please help her by computing the minimum number of characters in the string that one must reverse (e.g., changing a left parenthesis to a right parenthesis, or vice versa) so that the string would become balanced.</p>

<p>There are several ways to define what it means for a string of parentheses to be &quot;balanced&quot;. Perhaps the simplest definition is that there must be the same total number of (&#39;s and )&#39;s, and for any prefix of the string, there must be at least as many (&#39;s as )&#39;s. For example, the following strings are all balanced:</p>

<ul>
	<li>()</li>
	<li>(())</li>
	<li>()(()())</li>
</ul>

<p>while these are not:</p>

<ul>
	<li>)(</li>
	<li>())(</li>
	<li>((())))</li>
</ul>

### 입력

<ul>
	<li>Line 1: A string of parentheses of even length at most 100,000 characters.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer giving the minimum number of parentheses that must be toggled to convert the string into a balanced string.</li>
</ul>

### 힌트

<h4>Output Details</h4>

<p>The last parenthesis must be toggled, and so must one of the two middle right parentheses.</p>

<p>&nbsp;</p>