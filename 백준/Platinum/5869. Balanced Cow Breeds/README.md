# [Platinum V] Balanced Cow Breeds - 5869

[문제 링크](https://www.acmicpc.net/problem/5869)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 122, 정답: 74, 맞힌 사람: 59, 정답 비율: 61.458%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Farmer John usually brands his cows with a circular mark, but his branding iron is broken, so he instead must settle for branding each cow with a mark in the shape of a parenthesis -- (. He has two breeds of cows on his farm: Holsteins and Guernseys. He brands each of his cows with a parenthesis-shaped mark. Depending on which direction the cow is facing, this might look like either a left parenthesis or a right parenthesis.</p>

<p>FJ&#39;s N cows are all standing in a row, each facing an arbitrary direction, so the marks on the cows look like a string of parentheses of length N. Looking at this lineup, FJ sees a remarkable pattern: if he scans from left to right through just the Holsteins (in the order they appear in the sequence), this gives a balanced string of parentheses; moreover, the same is true for the Guernseys! To see if this is truly a rare event, please help FJ compute the number of possible ways he could assign breeds to his N cows so that this property holds.</p>

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
	<li>Line 1: A string of parentheses of length N (1 &lt;= N &lt;= 1000).</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer, specifying the number of ways FJ can assign breeds to cows so that the Holsteins form a balanced subsequence of parentheses, and likewise for the Guernseys. Since the answer might be a very large number, please print the remainder of this number when divided by 2012 (i.e., print the number mod 2012). Breed assignments involving only one breed type are valid.</li>
</ul>

### 힌트

<h4>Output Details</h4>

<p>The following breed assignments work:</p>

<pre>
(())
HHHH

(())
GGGG

(())
HGGH

(())
GHHG

(())
HGHG

(())
GHGH
</pre>