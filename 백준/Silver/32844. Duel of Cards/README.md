# [Silver III] Duel of Cards - 32844

[문제 링크](https://www.acmicpc.net/problem/32844)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 43, 정답: 30, 맞힌 사람: 26, 정답 비율: 74.286%

### 분류

그리디 알고리즘

### 문제 설명

<p>Alice and Bob are playing a card game. There are $2n$ cards uniquely numbered from $1$ to $2n$. The cards are shuffled and dealt to the two players so that each player gets $n$ cards. Each player then arranges the cards they get into a deck in any order that they choose, facing down.</p>

<p>The game has $n$ turns. In each turn, both players reveal the card that is on the top of their deck and compare the numbers on the two cards. The player with the larger card wins and scores one point. This is repeated until all cards in the decks are compared.</p>

<p>After getting her $n$ cards, Alice wonders what is the minimum and maximum number of points she may possibly score in the game.</p>

### 입력

<p>The first line of input contains a single integer $n$ ($1 ≤ n ≤ 1\, 000$), the number of cards that Alice gets.</p>

<p>The next $n$ lines each have a single integer between $1$ and $2n$ (both inclusive) giving a card that is dealt to Alice. It is guaranteed that all those cards are unique.</p>

### 출력

<p>Output two integers, the minimum and maximum number of points Alice may score.</p>