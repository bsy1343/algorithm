# [Gold II] Brick towers - 29544

[문제 링크](https://www.acmicpc.net/problem/29544)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 19, 맞힌 사람: 16, 정답 비율: 69.565%

### 분류

자료 구조, 집합과 맵, 누적 합, 해시를 사용한 집합과 맵

### 문제 설명

<p>Young Peter has got a wonderful gift for his birthday --- the whole pack of wooden bricks. He has already made $n$ towers, with heights $a_1$, $a_2$, $\ldots$, $a_n$ bricks, correspondingly.</p>

<p>Peter&#39;s favorite number is $k$, so he likes towers with height exactly $k$ bricks. Peter finds a set of consecutive towers <em>good</em> if their average height is equal to exactly $k$ bricks. He wants to find a good set of towers containing as many consecutive towers as possible.</p>

<p>Help Peter to find the largest good set of towers.</p>

### 입력

<p>The first line of input file contains two integer numbers $n$ and $k$ ($1 \le n \le 100000$; $1 \le k \le 10^9$). The second line of input file contains $n$ integer numbers $a_i$ ($1 \le a_i \le 10^9$) --- heights of the towers.</p>

### 출력

<p>Output two integer numbers $l$ and $m$ --- amount of towers in the largest good set and number of the first tower in this set. Towers are numbered from $1$ in order of appearance in the input file. If there are multiple answers, output any of them. If there is no good set output single number $0$.</p>