# [Platinum V] Primitivus - 8067

[문제 링크](https://www.acmicpc.net/problem/8067)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 11, 맞힌 사람: 10, 정답 비율: 47.619%

### 분류

애드 혹, 그래프 이론, 수학

### 문제 설명

<p>A genetic code of the abstract primitivus (Primitivus recurencis) is a series of natural numbers K=(a1,&hellip;,an). A feature of primitivus we call each ordered pair of numbers (l,r), which appears successively in the genetic code, i.e. there exists such i that l=ai, r=ai +1. There are no (p,p) features in a primitivus&#39; genetic code.</p>

<p>Write a program which:</p>

<ul>
	<li>reads the list of the features from the standard input,</li>
	<li>computes the length of the shortest genetic code having given features,</li>
	<li>writes the results to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input one positive integer number n is written. It is the number of different features of the primitivus. In each of the following n lines there is a pair of natural numbers l and r separated by a single space, 1 &le; l &le; 1000, 1 &le; r &le; 1000. A pair (l,r) is one of the primitivus&#39; features. The features do not repeat in the input file.</p>

### 출력

<p>Your program should write, in the first and only line of the standard output, exactly one integer number equal to the length of the shortest genetic code of the primitivus, comprising the features from the input.</p>

### 힌트

<p>All the features from the sample input are written in the following genetic code: (8, 5, 1, 4, 2, 3, 9, 6, 4, 5, 7, 6, 2, 8, 6).</p>