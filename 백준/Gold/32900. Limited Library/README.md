# [Gold III] Limited Library - 32900

[문제 링크](https://www.acmicpc.net/problem/32900)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 70, 정답: 52, 맞힌 사람: 50, 정답 비율: 74.627%

### 분류

그리디 알고리즘, 매개 변수 탐색, 이분 탐색

### 문제 설명

<p>During the summer break, fewer students are dwelling on campus, so this is the perfect time to add new books to the TU Delft library. These new books all have the same width, but they have varying heights. Because all existing bookcases are already full, the management board of the library has decided that they will add a new bookcase to display these new books.</p>

<p>The new bookcase has a number of shelves with varying heights. Each shelf in the bookcase can fit $x$ books. Since there may be some leftover space, the management board would also like to display some art pieces in this bookcase, at most one per shelf. An art piece will only fit on a shelf if there are at most $y$ books next to it, because the art pieces take up the same amount of space as $x-y$ books. As an example, Figure L.1 shows a bookcase where three of the shelves have enough space for an art piece.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32900.%E2%80%85Limited%E2%80%85Library/682098dd.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32900-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 400px; width: 196px;"></p>

<p style="text-align: center;">Figure L.1: Illustration of Sample Input 1. Three shelves can have art pieces in the hatched areas, while still fitting all new books.</p>

<p>The management board wants you to find the largest number of shelves on which you can place an art piece, whilst also being able to fit all the new books on the shelves.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with four integers  $n$, $m$, $x$, and $y$ ($1 \leq n, m \leq 10^5$, $1 \leq y &lt; x \leq 1000$), the number of shelves, the number of books, the number of books that fit on a full shelf, and the number of books that fit on a shelf next to an art piece.</li>
	<li>One line with $n$ integers $a$ ($1 \leq a \leq 10^9$), the heights of the shelves.</li>
	<li>One line with $m$ integers $b$ ($1 \leq b \leq 10^9$), the heights of the books.</li>
</ul>

### 출력

<p>If it is possible to fit all the $m$ books into the $n$ shelves, output the largest number of art pieces you can place. Otherwise, output "<code>impossible</code>".</p>