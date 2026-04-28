# [Platinum I] Bookshelf Sorting - 23857

[문제 링크](https://www.acmicpc.net/problem/23857)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 12, 맞힌 사람: 12, 정답 비율: 60.000%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>Irma works in a library. Every day she watches visitors take a couple of books from the bookshelf, read them, and put books back in the same places they took them. Usually people mess up the order and swap two books they read. Let&#39;s take a look at one specific bookshelf with $n$ books in some order, numbered from $1$ to $n$ from left to right. The $i$-th visitor takes books from positions $x_i$ and $y_i$ and puts them back on the same positions, but in the wrong order. After the $i$-th visitor, the book that was at $x_i$ is now at position $y_i$ and vice versa.&nbsp;</p>

<p>In the evening, after the library is closed, Irma wants to put all the books back on their places. For each book there is a number $p_i$ --- a position where that book should end up in the end. To rearrange books, Irma can take any book from the shelf and insert it in the beginning or in the end (so it ends up in the first or in the last place on the shelf).</p>

<p>What is the minimum number of moves Irma can do to put all books in order? Answer this question for some initial placement of books, determined by $p_i$, and after each visitor that swapped places of some two books.</p>

### 입력

<p>The first line contains two integers $n$ and $q$ ($2 \le n \le 2 \cdot 10^5$; $0 \le q \le 2 \cdot 10^5$) --- the number of books on the shelf and the number of visitors. The next line contains $n$ distinct integers $p_i$ ($1 \le p_i \le n$), meaning that the book in the $i$-th position must end up in position $p_i$.</p>

<p>Next $q$ lines describe library&#39;s visitors. Each line contains two integers $x_i$, $y_i$ ($1 \le x_i &lt; y_i \le n$), that mean that the $i$-th visitor swapped two books on positions &nbsp;$x_i$ and $y_i$.</p>

### 출력

<p>Print $q + 1$ integers --- the minimum number of moves required to sort all books for the initial order, then for the order the after the first visitor, \ldots, after all $q$ visitors.</p>

### 힌트

<p>The initial order of books is $(5, 1, 2, 4, 3)$. To sort these books out, first, put the book $4$ in the end, then do the same with book $5$. After the first visitor, the bookshelf now looks like $(5, 1, 2, 3, 4)$; it&#39;s enough to just move the book $5$ to the end. After the second visitor the order of books is $(3, 1, 2, 5, 4)$. For this order the minimum number of moves is $3$, there are several ways to achieve the final order in $3$ moves.</p>