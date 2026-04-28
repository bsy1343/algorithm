# [Gold IV] Look Up - 6105

[문제 링크](https://www.acmicpc.net/problem/6105)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 130, 정답: 72, 맞힌 사람: 67, 정답 비율: 61.468%

### 분류

자료 구조, 스택

### 문제 설명

<p>Farmer John&#39;s N (1 &lt;= N &lt;= 100,000) cows, conveniently numbered 1..N, are once again standing in a row. Cow i has height H_i (1 &lt;= H_i &lt;= 1,000,000).</p>

<p>Each cow is looking to her left toward those with higher index numbers. We say that cow i &#39;looks up&#39; to cow j if i &lt; j and H_i &lt; H_j. For each cow i, FJ would like to know the index of the first cow in line looked up to by cow i.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i+1 contains the single integer: H_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..N: Line i contains a single integer representing the smallest index of a cow up to which cow i looks. If no such cow exists, print 0.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>Cows 1 and 2 both look up to cow 3; cows 4 and 5 both look up to cow 6; and cows 3 and 6 do not look up to any cow.</p>

<p>&nbsp;</p>