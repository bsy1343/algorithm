# [Gold V] Knjige - 31679

[문제 링크](https://www.acmicpc.net/problem/31679)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 75, 정답: 47, 맞힌 사람: 44, 정답 비율: 61.111%

### 분류

그리디 알고리즘, 누적 합

### 문제 설명

<p>Marko was at the <em>Interliber</em> book fair, and he bought $n$ books. The attraction of the $i$-th book is $k_i$. Marko arranged the books on the shelf according to their attraction values, so the first book from the left is the least attractive, and every next one to the right is more or equally attractive than the previous one.</p>

<p>It has been quite some time since Interliber, but Marko has only now found time to read the books. He will spend a total of $t$ minutes reading.</p>

<p>For each book, he can either read it in its entirety, which takes him $a$ minutes; or read only the content from the covers, which takes him $b$ minutes.</p>

<p>He will start from the leftmost book. After finishing the current book (either entirely or just the content from the covers), he moves on to the next book, which is the first one to the right of the book he just read. Marko&rsquo;s <em>inspiration</em> is equal to the sum of the attraction values of the books he has read in their entirety. What is the maximum value of Marko&rsquo;s <em>inspiration</em> after $t$ minutes?</p>

<p>Note: If Marko starts reading a book but fails to finish it before the end of $t$ minutes, that book does not contribute to his inspiration.</p>

### 입력

<p>The first line contains integers $n$, $t$, $a$ and $b$ ($1 &le; n &le; 2 \cdot 10^5$, $1 &le; t &le; 10^9$, $1 &le; b &lt; a &le; 10^9$), the number of books, the time Marko will spend reading, time required for reading a book and the time required to read the content from the covers.</p>

<p>The second line contains $n$ integers $k_i$ ($1 &le; k_i &le; 10^9$, $k_i &le; k_{i+1}$), the attraction values of books.</p>

### 출력

<p>In the first and only line print Mirko&rsquo;s maximal <em>inspiration</em> after $t$ minutes.</p>