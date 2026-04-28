# [Silver V] Warehouse - 31047

[문제 링크](https://www.acmicpc.net/problem/31047)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 117, 정답: 105, 맞힌 사람: 82, 정답 비율: 87.234%

### 분류

구현, 자료 구조, 정렬, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Elvira is processing shipments for the Christmas season! There are various shipments of toys coming into her warehouse throughout the day, and her boss wants a summary report at the end. Each shipment consists of some number of a single kind of toy.</p>

<p>The summary report is an aggregated list of all the toys that arrived at the warehouse over the day. The boss is most interested in the biggest sellers, so toys should be sorted in decreasing order of count. If the warehouse received the same number of two kinds of toys, sort them in alphabetical order<sup>1</sup>.</p>

### 입력

<p>The first line of input contains the number of test cases, $T$ ($1 \le T \le 100$).</p>

<p>Each test case begins with a line containing an integer, $N$ ($1 \le N \le 100$). This indicates that $N$ shipments are coming in for processing. Each of the next $N$ lines describes a single shipment. The line contains a string and an integer, the name of the toy and how many of that toy are in the given shipment. The name of a toy is a string of at most $10$ lowercase letters (<code>a</code>&ndash;<code>z</code>) and between $1$ and $10$ toys arrive in a given shipment.</p>

### 출력

<p>For each test case, output $K$, the number of unique toys that have arrived in the warehouse.</p>

<p>Then output $K$ lines, each containing the name of a toy and how many of that toy that have arrived, summed up over all the shipments. Output toys in decreasing order of count, breaking ties alphabetically.</p>

### 힌트

<p><b>Footnotes</b></p>

<ol>
	<li>To determine which of two strings comes first in alphabetical order, their first letters are compared. If they differ, then the string whose first letter comes earlier in the alphabet comes before the other string. If the first letters are the same, then the second letters are compared, and so on. If a position is reached where one string has no more letters to compare while the other does, then the shorter string is deemed to come first in alphabetical order.</li>
</ol>