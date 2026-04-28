# [Gold III] Bookshelf - 5881

[문제 링크](https://www.acmicpc.net/problem/5881)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 156, 정답: 107, 맞힌 사람: 84, 정답 비율: 73.684%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>When Farmer John isn&apos;t milking cows, stacking haybales, lining up his cows, or building fences, he enjoys sitting down with a good book.  Over the years, he has collected N books (1 &lt;= N &lt;= 2,000), and he wants to build a new set of bookshelves to hold them all.</p><p>Each book i has a width W(i) and height H(i).  The books need to be added to a set of shelves in order; for example, the first shelf should contain books 1...k for some k, the second shelf should start with book k+1, and so on.  Each shelf can have a total width of at most L (1 &lt;= L &lt;= 1,000,000,000).  The height of a shelf is equal to the height of the tallest book on that shelf, and the height of the entire set of bookshelves is the sum of the heights of all the individual shelves, since they are all stacked vertically.</p><p>Please help FJ compute the minimum possible height for the entire set of bookshelves.</p>

### 입력

<ul><li>Line 1: Two space-separated integers: N and L.</li><li>Lines 2..1+N: Line i+1 contains two space-separated integers: H(i) and W(i).  (1 &lt;= H(i) &lt;= 1,000,000; 1 &lt;= W(i) &lt;= L).</li></ul>

### 출력

<ul><li>Line 1: The minimum possible total height for the set of bookshelves.</li></ul>

### 힌트

<h4>Input Details</h4><p>There are 5 books.  Each shelf can have total width at most 10.</p><h4>Output Details</h4><p>There are 3 shelves, the first containing just book 1 (height 5, width 7), the second containing books 2..4 (height 13, width 9), and the third containing book 5 (height 3, width 8).</p>