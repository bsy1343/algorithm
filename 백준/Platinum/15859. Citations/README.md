# [Platinum IV] Citations - 15859

[문제 링크](https://www.acmicpc.net/problem/15859)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 14, 맞힌 사람: 13, 정답 비율: 56.522%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Grace is going to read a certain scientific book. However, she is very careful about always reading the sources that books refer to, and also the sources of the sources, and so on. It usually ends up being the case that she reads quite a lot more books than just the one she originally intended to read. The librarians are constantly complaining about Grace&rsquo;s excessive borrowing of books, and so she now wants to find an order in which to read the books that minimizes the total borrow time.</p>

<p>There are N books that she eventually will need to read. The books are numbered from 1 to N, and book i takes K<sub>i</sub> minutes to read. Every book i has a citation list containing Fi books. The book Grace originally wants to read has index 1. Before starting with book 1 Grace has already borrowed all N books.</p>

<p>When Grace reads a book she does the following:</p>

<ul>
	<li>First she opens the book and reads the citation list, which takes a minute,</li>
	<li>then she reads all the books that are in the list, in some order of her own choosing,</li>
	<li>thereafter she reads the actual book and returns it to the library, which takes K<sub>i</sub> minutes.</li>
</ul>

<p>You now want to compute the minimum total borrow time for all books, given that Grace reads the books in an optimal order. Books may contain empty citation lists, and every book except book 1 will occur in exactly one citation list. There will be no cycles of citations.</p>

### 입력

<p>The first line contains the integer N (1 &le; N &le; 100000). Then follows N lines, one for each book 1 to N. On each such row there will be a number K<sub>i</sub> (1 &le; K<sub>i</sub> &le; 1000), the number of minutes the book takes to read. Then follows a number F<sub>i</sub> (0 &le; F<sub>i</sub> &lt; N), followed by F<sub>i</sub> numbers, the indices of the books that book i refers to.</p>

### 출력

<p>Output a single positive integer, the minimum total borrow time for all books.</p>

### 힌트

<ul>
	<li>time 1: open book 1</li>
	<li>time 2: open book 2</li>
	<li>time 3: open book 4</li>
	<li>time 4: close book 4 (borrow time 4 minutes)</li>
	<li>time 14: close book 2 (borrow time 14 minutes)</li>
	<li>time 15: open book 3</li>
	<li>time 16: open book 5</li>
	<li>time 17: close book 5 (borrow time 17 minutes)</li>
	<li>time 37: close book 3 (borrow time 37 minutes)</li>
	<li>time 38: close book 1 (borrow time 38 minutes)</li>
</ul>