# [Gold II] Card Game - 33133

[문제 링크](https://www.acmicpc.net/problem/33133)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 31, 정답: 9, 맞힌 사람: 6, 정답 비율: 35.294%

### 분류

많은 조건 분기, 수학, 자료 구조, 조합론, 포함 배제의 원리, 해시를 사용한 집합과 맵

### 문제 설명

<p>Vilius and Adomas play a simple card game. They have a deck of $N$ cards. Every card contains a number. Each player draws two random cards from the deck, adds the two numbers on the cards, and the player with the larger sum wins.</p>

<p>Vilius chose a number $C$ and wants to win by exactly $C$ points. In other words, he wants the sum of his cards minus the sum of Adomas's cards to be exactly $C$. How many ways there are for Vilius and Adomas to draw their cards so that Vilius wins by exactly $C$ points?</p>

<p>The same number can be written on multiple cards. Then the case when a player draws one or another of them are considered distinct. The order of the two cards in a player's hand, however, does not matter. For example, if two cards contain the number $1$ and three cards contain the number $2$, there would be six ways for Adomas to draw cards with numbers $1$ and $2$.</p>

### 입력

<p>The first line contains two integers $N$ and $C$ ($4 \le N \le 1\,500$, $0 \le C \le 10^9$), the number of cards in the deck and the desired score difference, respectively. The second line contains $N$ integers $A_1, A_2, \ldots, A_N$ ($0 \le A_i \le 10^9$), the numbers on the cards.</p>

### 출력

<p>Output a single integer: the number of ways the players can draw cards so that Vilius wins by exactly $C$ points.</p>