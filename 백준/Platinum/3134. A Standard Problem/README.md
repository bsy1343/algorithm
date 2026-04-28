# [Platinum I] A Standard Problem - 3134

[문제 링크](https://www.acmicpc.net/problem/3134)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 12, 맞힌 사람: 9, 정답 비율: 29.032%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리, 분할 정복, 스택, 비트 집합

### 문제 설명

<p>In a super standard problem you are given a table of size NxM, (N rows and M columns), filled only with 0&#39;s and 1&#39;s. In such a super standard problem you are very likely to be asked: what is the biggest rectangle (a rectangle with the maximum possible area) in this table that only contains 0&#39;s?</p>

<p>Fortunately, nobody likes super standard problems. This is why we would modify this super standard problem into a standard one by asking for a maximum rectangle of zeroes, fit between a defined couple of rows: r<sub>1</sub> (upper row) and r<sub>2</sub> (lower row). Parts of the given row boundaries can take part in the solution found, but no element above the upper row or below the lower one is allowed. What is the area of the range found? Write a program standard to answer several questions of that kind for a given table.</p>

### 입력

<p>The first line of the standard input contains the table size: two space separated positive integers N and M. Each of the next N lines contains M space separated numbers (0 or 1). In the next line there is one positive integer Q: the number of boundary couples of rows. The next Q lines contain two space separated positive integers each: an upper and a lower row (r<sub>1</sub>, r<sub>2</sub>) (1 &le; r<sub>1</sub> &le; r<sub>2</sub> &le; N), between which you have to find a solution of the problem.</p>

### 출력

<p>The output consists of Q lines. In each of them you have to output one integer &ndash; the answer of the corresponding input query: the area of the biggest rectangle you can fit between the given row boundaries.</p>

### 제한

<ul>
	<li>1 &le; N, M &le; 1000</li>
	<li>1 &le; Q &le; 10<sup>6</sup></li>
</ul>