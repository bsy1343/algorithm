# [Gold III] Enumerating Brackets - 15435

[문제 링크](https://www.acmicpc.net/problem/15435)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 16, 맞힌 사람: 10, 정답 비율: 55.556%

### 분류

조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15435/1.png" style="float:right; height:45px; width:150px" />A&nbsp;<em>balanced bracket sequence</em>&nbsp;is a string consisting only of the characters &quot;<code>(</code>&quot; (opening brackets) and &quot;<code>)</code>&quot; (closing brackets) such that each opening bracket has a &quot;matching&quot; closing bracket, and vice versa.&nbsp;For example, &quot;<code>(())()</code>&quot; is a balanced bracket sequence, whereas &quot;<code>(())(()</code>&quot; and &quot;<code>())(()</code>&quot; are not.</p>

<p>Given two bracket sequences&nbsp;<em>A</em>&nbsp;and&nbsp;<em>B</em>&nbsp;of the same length, we say that&nbsp;<em>A</em>&nbsp;is&nbsp;<em>lexicographically smaller than</em>&nbsp;<em>B</em>&nbsp;(and write&nbsp;<em>A &lt; B</em>) if:</p>

<ol>
	<li><em>A</em>&nbsp;and&nbsp;<em>B</em>&nbsp;differ in at least one position, and</li>
	<li><em>A</em>&nbsp;has a &quot;<code>(</code>&quot;, and&nbsp;<em>B</em>&nbsp;has a &quot;<code>)</code>&quot; in the left-most position in which&nbsp;<em>A</em>&nbsp;and&nbsp;<em>B</em>&nbsp;differ</li>
</ol>

<p>For example &quot;<code>(())()</code>&quot; &lt; &quot;<code>()()()</code>&quot; because they first differ in the second position from the left, and the first string has an &quot;<code>(</code>&quot; in that position, whereas the second string has a &quot;<code>)</code>&quot;. For a given length&nbsp;<em>N</em>, the &quot;<em>&lt;</em>&quot; operator defines an&nbsp;<em>ordering</em>&nbsp;on all balanced bracket sequences of length&nbsp;<em>N</em>. For example, the ordering of the sequences of length&nbsp;<em>6</em>&nbsp;is:</p>

<ol>
	<li><code>((()))</code></li>
	<li><code>(()())</code></li>
	<li><code>(())()</code></li>
	<li><code>()(())</code></li>
	<li><code>()()()</code></li>
</ol>

<p>Given a length&nbsp;<em>N</em>&nbsp;and a positive integer&nbsp;<em>M</em>, your task is to find the&nbsp;<em>M<sup>th</sup></em>&nbsp;balanced bracket sequence in the ordering.</p>

### 입력

<p>You will be given an&nbsp;<em>even</em>&nbsp;integer&nbsp;<em>N</em>&nbsp;(<em>2 &le; N &le; 2000</em>), and a positive integer&nbsp;<em>M</em>. It is guaranteed that&nbsp;<em>M</em>&nbsp;will be no more than&nbsp;<em>10<sup>18</sup></em>&nbsp;and no more than the number of balanced bracket sequences of length&nbsp;<em>N</em>&nbsp;(whichever is smaller).</p>

### 출력

<p>Output the&nbsp;<em>M<sup>th</sup></em>&nbsp;balanced bracket sequence of length&nbsp;<em>N</em>, when ordered lexicographically.</p>