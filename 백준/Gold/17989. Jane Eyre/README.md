# [Gold V] Jane Eyre - 17989

[문제 링크](https://www.acmicpc.net/problem/17989)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 52, 정답: 26, 맞힌 사람: 22, 정답 비율: 51.163%

### 분류

자료 구조, 문자열, 정렬, 파싱, 우선순위 큐

### 문제 설명

<p>Anna wants to read the famous book <em>Jane Eyre</em>, but annoyingly its title is somewhat late in the alphabet. This is a problem, since Anna always reads books in alphabetical order; as soon as she finish reading a book, she immediately begins reading the next book in her possession which comes first according to ASCII-order.</p>

<p>To make matters even worse, Anna often receives new books as presents. Such books go into the pile of Anna&rsquo;s unread books (she will finish the book she is currently reading even if the received book is earlier in the alphabet). If she receives one or more books at the exact same moment as she finishes another book, though, then she will pick her next book among both the books in her existing pile and the newly received books.</p>

<p>Given Anna&rsquo;s pile of unread books and a schedule for at which points in time Anna&rsquo;s friends will give her new books, can you figure out when she will finish reading <em>Jane Eyre</em>? Anna reads at a speed of one page per minute.</p>

### 입력

<p>On the first line are three non-negative integers n, m, and k; here n (0 &le; n &lt; 100 000) indicates the number of unread books in Anna&rsquo;s pile (in addition to <em>Jane Eyre</em>), m (0 &le; m &lt; 100 000) indicates the number of books her friends will give her, and k (1 &le; k &lt; 100 000) indicates the number of pages in <em>Jane Eyre</em>.</p>

<p>The next n lines describe the other unread books in Anna&rsquo;s pile; the i<sup>th</sup> such line contains a string s<sub>i</sub> (1 &le; |s<sub>i</sub>| &le; 20) and a positive integer k<sub>i</sub> (1 &le; k<sub>i</sub> &lt; 100 000) indicating respectively the title of the book and how many pages it contains. The string s<sub>i</sub> will be enclosed in double quotes (&quot;), and consists of a mixture of spaces and alphanumeric ASCII characters.</p>

<p>Finally follows m lines describing the books Anna&rsquo;s friends will give her; the j<sup>th</sup> such line contains a non-negative integer t<sub>j</sub> (0 &le; t<sub>j</sub> &le; 1 000 000 000), a string s<sub>j</sub> (1 &le; |s<sub>j</sub>| &le; 20) and a positive integer k<sub>j</sub> (1 &le; k<sub>j</sub> &lt; 100 000) indicating respectively the time (in minutes from now) Anna will receive the book, the title of the book and how many pages it contains. The string s<sub>j</sub> will be enclosed in double quotes (&quot;), and consists of a mixture of spaces and alphanumeric ASCII characters.</p>

### 출력

<p>A single integer, the minute at which Anna finish reading <em>Jane Eyre</em>.</p>