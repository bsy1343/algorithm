# [Silver II] Choose your own path - 16021

[문제 링크](https://www.acmicpc.net/problem/16021)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 181, 정답: 94, 맞힌 사람: 79, 정답 비율: 51.974%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>There is a genre of fiction called choose your own adventure books. These books allow the reader to make choices for the characters which alters the outcome of the story.</p>

<p>For example, after reading the first page of a book, the reader may be asked a choice, such as &ldquo;Do you pick up the rock?&rdquo; If the reader answers &ldquo;yes&rdquo;, they are directed to continue reading on page 47, and if they choose &ldquo;no&rdquo;, they are directed to continue reading on page 18. On each of those pages, they have further choices, and so on, throughout the book. Some pages do not have any choices, and thus these are the &ldquo;ending&rdquo; pages of that version of the story. There may be many such ending pages in the book, some of which are good (e.g., the hero finds treasure) and others which are not (e.g., the hero finds a leftover sandwich from 2001).</p>

<p>You are the editor of one of these books, and you must examine two features of the choose your own adventure book:</p>

<ol>
	<li>ensure that every page can be reached &ndash; otherwise, there is no reason to pay to print a page which no one can ever read;</li>
	<li>find the shortest path, so that readers will know what the shortest amount of time they need to finish one version of the story.</li>
</ol>

<p>Given a description of the book, examine these two features.</p>

### 입력

<p>The first line of input contains N (1 &le; N &le; 10000), the number of pages in the book. Each of the next N lines contain an integer M<sub>i</sub> (1 &le; i &le; N; 0 &le; M<sub>i</sub> &le; N), which is the number of different options from page i, followed by M<sub>i</sub> space-separated integers in the range from 1 to N, corresponding to each of the pages to go to next from page i. It will also be the case M<sub>1</sub> + M<sub>2</sub> + &middot; &middot; &middot; + M<sub>N</sub> is at most 10000.</p>

<p>If M<sub>i</sub> = 0, then page i is an ending page (i.e., there are no choices from that page). There will be at least one ending page in the book.</p>

<p>Note that you always begin the book on page 1.</p>

<p>For 4 of the available 15 marks, N &le; 100, Mi &le; 10 for 1 &le; i &le; N.</p>

<p>For an additional 3 of the available 15 marks, the book is guaranteed to have no cycles.</p>

<p>For an additional 4 of the available 15 marks, N &le; 1000, Mi &le; 25 for 1 &le; i &le; N.</p>

### 출력

<p>The output will be two lines. The first line will contain Y if all pages are reachable, and N otherwise.</p>

<p>The last line will contain a non-negative integer K, which is the shortest path a reader can take while reading this book. There will always be a finite shortest path.</p>