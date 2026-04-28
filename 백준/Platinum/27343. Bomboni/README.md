# [Platinum III] Bomboni - 27343

[문제 링크](https://www.acmicpc.net/problem/27343)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 92, 정답: 31, 맞힌 사람: 18, 정답 비율: 27.692%

### 분류

자료 구조, 다이나믹 프로그래밍, 해시를 사용한 집합과 맵, 수학, 정수론, 집합과 맵

### 문제 설명

<p>Iva is a big fan of candy! In front of her is an $n$ times $n$ field filled with candy and obstacles. Iva is currently in the upper left cell of the field and by moving only down and right she will travel to the lower right cell. The cell Iva is currently in does not contain an obstacle.</p>

<p>In every cell, there is either an obstacle or a piece of candy with a number written on it. Iva will eat all the candy she gets her hands on during her trip (including the candy in the first and last cell) and then multiply all the numbers on them. Iva knows her favourite number is $k$ and she wants the product of the numbers on the candy she has eaten to be divisible by $k$. She wants to know how many such paths there are. Because that number can be huge, she is interested in it modulo $998\,244\,353$.</p>

### 입력

<p>The first line contains two integers $n$ and $k$ ($1 &le; n &le; 500$, $1 &le; k &le; 10^6$), which denote the size of the field and Iva&rsquo;s favourite number.</p>

<p>In each of the next $n$ lines, there are $n$ numbers describing the $i$-th row of the field ($-1 &le; a_{i,j} &le; 10^6$). If $a_{i,j} = -1$, then that cell contains an obstacle, otherwise $1 &le; a_{i,j} &le; 10^6$ and that cell contains a piece of candy with that number.</p>

### 출력

<p>Print a single line with the required number from the task.</p>

### 힌트

<p>Clarification of the second example:</p>

<p>There are three possible paths such that the product is divisible by $6$: $5 &middot; 2 &middot; 3 &middot; 3 &middot; 1, 5 &middot; 2 &middot; 3 &middot; 6 &middot; 1, 5 &middot; 7 &middot; 3 &middot; 6 &middot; 1$.</p>