# [Platinum IV] Corrupted Sort - 20234

[문제 링크](https://www.acmicpc.net/problem/20234)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 174, 정답: 54, 맞힌 사람: 42, 정답 비율: 31.111%

### 분류

애드 혹, 정렬

### 문제 설명

<p>Chloe wants to test her sorting skills. She has $n$ cards with distinct integers from $1$ to $n$ written on them. She asks her little brother Connor to first blindfold her and then arrange all cards in a row in some order. Positions of cards are numbered from $1$ to $n$ from left to right.</p>

<p>Chloe doesn&#39;t know the order of the cards, but she wants to sort them, so that the leftmost card has number $1$ and the rightmost card has number $n$ on it. Formally, for each $i$ she wants the card on position $i$ to have number $i$ on it. To achieve the goal, Chloe can ask Connor to do one or more operations.</p>

<p>Each operation can be denoted by two integers $pos_i$ and $pos_j$ ($1 \le pos_i &lt; pos_j \le n$). Connor looks at the cards on positions $pos_i$ and $pos_j$, and if the card on position $pos_i$ has a bigger number than the card on position $pos_j$, he swaps them. Otherwise, he does nothing. Connor also tells Chloe if he swapped the cards or not.</p>

<p>To make the game more interesting, after every $2n$ operations Connor chooses two distinct cards uniformly at random and swaps them without telling anything to Chloe.</p>

<p>If after some of Chloe&#39;s operations all cards become sorted, Chloe wins. Help Chloe to sort all cards using at most $10\ 000$ operations.</p>

### 입력



### 출력



### 힌트

<p>Initial card ordering in the example was $3$ $1$ $2$ (that is, the card on position $1$ had number $3$ on it, the card on position $2$ had number $1$, and the card on position $3$ had number $2$).</p>