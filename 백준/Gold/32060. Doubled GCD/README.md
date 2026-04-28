# [Gold III] Doubled GCD - 32060

[문제 링크](https://www.acmicpc.net/problem/32060)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 46, 맞힌 사람: 45, 정답 비율: 66.176%

### 분류

수학, 자료 구조, 그리디 알고리즘, 정수론, 우선순위 큐

### 문제 설명

<p>There are $N$ cards in a deck, numbered from $1$ to $N$, where card $i$ has a positive integer $A_i$ written on it.</p>

<p>You are to perform $N - 1$ moves with the cards. In each move, you select two cards of your choice from the deck. Let $x$ and $y$ be the integers written on the selected cards, respectively. Remove both selected cards, and insert a new card into the deck with $2 \cdot \gcd(x, y)$ written on it, where $\gcd(x, y)$ is the greatest common divisor of $x$ and $y$. Note that with this one move, there will be one fewer card in the deck (as you remove two cards and insert one new card).</p>

<p>After all $N -1$ moves have been performed, there will be exactly one card remaining. Your goal is to maximize the integer written on the last card; output this integer.</p>

### 입력

<p>Input begins with an integer $N$ ($2 &le; N &le; 100\, 000$) representing the number of cards. The next line contains $N$ integers $A_i$ ($1 &le; A_i &le; 10^9$) representing the number written on card $i$.</p>

### 출력

<p>Output an integer in a single line representing the maximum possible integer written on the last card.</p>