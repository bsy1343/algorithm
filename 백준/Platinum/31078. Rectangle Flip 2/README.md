# [Platinum II] Rectangle Flip 2 - 31078

[문제 링크](https://www.acmicpc.net/problem/31078)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 2, 맞힌 사람: 2, 정답 비율: 25.000%

### 분류

자료 구조, 연결 리스트

### 문제 설명

<p>Prof. Pang enters a trap room in a dungeon. The room can be represented by an $n$ by $m$ chessboard. We use $(i, j)$ ($1\le i\le n$, $1\le j\le m$) to denote the cell at the $i$-th row and $j$-th column. Every second, the floor of one cell breaks apart (so that Prof. Pang can no longer stand on that cell.) After $nm$ seconds, there will be no cell to stand on and Prof. Pang will fall through to the next (deeper and more dangerous) level.</p>

<p>But Prof. Pang knows that calm is the key to overcome any challenge. So instead of being panic, he calculates the number of rectangles such that every cell in it is intact (i.e., not broken) after every second. (A rectangle represented by four integers $a, b, c$ and $d$ ($1\le a\le b\le n, 1\le c\le d\le m$) includes all cells $(i, j)$ such that $a\le i\le b, c\le j\le d$. There are $ \frac{n(n+1)}{2} \times \frac{m(m+1)}{2}$ rectangles in total.)</p>

### 입력

<p>The first line contains two integers $n$, $m$ ($1\le n, m\le 500$) separated by a single space. </p>

<p>The $(i+1)$-th line contains two integers $a$, $b$ separated by a single space representing that the cell $(a, b)$ breaks apart at the $i$-th second. It is guaranteed that each cell appears exactly once in the input. </p>

### 출력

<p>Output $nm$ lines. The $i$-th line should contain the number of rectangles such that every cell in it is intact after the first $i$ cells break apart.</p>

### 힌트

<p>In the example, after the first second, there are $3$ rectangles of area $1$ and $2$ rectangles of area $2$ that satisfy the constraint. So the first line should contain a $5$. After the second second, only cells in the second column remains intact. The answer should be $3$. After the third second, only one cell remains intact. The answer should be $1$. After the fourth second, all cells broke apart so the answer should be $0$. </p>