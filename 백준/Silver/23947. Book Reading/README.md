# [Silver III] Book Reading - 23947

[문제 링크](https://www.acmicpc.net/problem/23947)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 86, 정답: 43, 맞힌 사람: 36, 정답 비율: 48.000%

### 분류

수학

### 문제 설명

<p>Supervin is a librarian handling an ancient book with&nbsp;<b>N</b>&nbsp;pages, numbered from 1 to&nbsp;<b>N</b>. Since the book is too old, unfortunately&nbsp;<b>M</b>&nbsp;pages are torn out: page number&nbsp;<b>P<sub>1</sub></b>,&nbsp;<b>P<sub>2</sub></b>, ...,&nbsp;<b>P<sub>M</sub></b>.</p>

<p>Today, there are&nbsp;<b>Q</b>&nbsp;lazy readers who are interested in reading the ancient book. Since they are lazy, each reader will not necessarily read all the pages. Instead, the i-th reader will only read the pages that are numbered multiples of&nbsp;<b>R<sub>i</sub></b>&nbsp;and not torn out. Supervin would like to know the sum of the number of pages read by each reader.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing the three integers&nbsp;<b>N</b>,&nbsp;<b>M</b>, and&nbsp;<b>Q</b>, the number of pages in the book, the number of torn out pages in the book, and the number of readers, respectively. The second line contains&nbsp;<b>M</b>&nbsp;integers, the i-th of which is&nbsp;<b>P<sub>i</sub></b>. The third line contains&nbsp;<b>Q</b>&nbsp;integers, the i-th of which is&nbsp;<b>R<sub>i</sub></b>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the total number of pages that will be read by all readers.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>P<sub>1</sub></b>&nbsp;&lt;&nbsp;<b>P<sub>2</sub></b>&nbsp;&lt; ... &lt;&nbsp;<b>P<sub>M</sub></b>&nbsp;&le;&nbsp;<b>N</b>.</li>
	<li>1 &le;&nbsp;<b>R<sub>i</sub></b>&nbsp;&le;&nbsp;<b>N</b>, for all i.</li>
</ul>

### 힌트

<p>In sample case #1, the first reader will read the pages numbered 2, 4, 6, and 10. Note that the page numbered 8 will not be read since it is torn out. The second reader will read the pages numbered 3, 6, and 9. Therefore, the total number of pages that will be read by all readers is 4 + 3 = 7.</p>

<p>In sample case #2, all pages are torn out so all readers will read 0 pages.</p>

<p>In sample case #3, the first reader will read all the pages other than the six given pages.</p>