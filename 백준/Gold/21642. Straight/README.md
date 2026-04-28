# [Gold II] Straight - 21642

[문제 링크](https://www.acmicpc.net/problem/21642)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 69, 정답: 23, 맞힌 사람: 21, 정답 비율: 42.857%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>The tournament of generalized poker is going to start! The tournament uses a special deck. It consists of cards that contain integers from $1$ to $n$. Every number has infinitely many occurrences in the deck.</p>

<p>There is only one hand in generalized poker: a straight. A straight is a sequence of $m$ cards that contain consecutive integers: $i, i+1, \ldots, i+m-1$. The rules of poker are the following: each player has $s$ hole cards, and there are $m$ community cards. Each player therefore sees $s+m$ cards and tries to choose $m$ of them so that they formed a straight.</p>

<p>You are watching the tournament, so you can only see community cards. You wonder how many distinct straights are possible with such community cards for some hole cards. Two straights are distinct if they start with different $i$ value.</p>

### 입력

<p>The first line contains three integers $n$, $m$ and $s$ ($1 \le n \le 10^9$, $1 \le s &lt; m \le 10^5$) --- the maximum value of the card, the number of community cards and the number of hole cards.</p>

<p>The second line contains $m$ integers, each from $1$ to $n$ --- community cards values.</p>

### 출력

<p>Output the number of distinct straights that can be potentially obtained by the players.</p>

### 힌트

<p>The first example has the following possible straights: $1$, $2$, $3$, $4$, and $5$.</p>