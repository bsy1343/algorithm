# [Platinum I] Card Shuffling - 19398

[문제 링크](https://www.acmicpc.net/problem/19398)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 5, 맞힌 사람: 5, 정답 비율: 33.333%

### 분류

(분류 없음)

### 문제 설명

<p>Yuuka has a deck of $n$ cards labeled with $0, 1, 2, \dots, (n - 1)$.</p>

<p>Initially, the cards are placed in the order $p_1, p_2, \dots, p_n$ from top to bottom. In each round, if the top card is labeled with $x$, Yuuka will place it $x$ cards downward, so it becomes the card number $(x + 1)$ in the deck, counting from $1$. The relative order of other cards will not be changed.</p>

<p>How many rounds will pass until the card labeled with $0$ comes to the top?</p>

### 입력

<p>The first line contains an integer $n$ ($1 \leq n \leq 32$).</p>

<p>The second line contains $n$ distinct integers $p_1, p_2, \dots, p_n$ ($0 \leq p_i &lt; n$).</p>

### 출력

<p>Output an integer which denotes the number of rounds. If the card labeled with $0$ never comes to the top, output &quot;<code>-1</code>&quot; instead.</p>