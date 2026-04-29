# [Platinum II] Draw Your Deck - 35443

[문제 링크](https://www.acmicpc.net/problem/35443)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 14, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>You are playing a single-player game with a deck of cards. The deck has $N$ cards, each with an integer between $0$ and $K$ written on it. You shuffle the deck and draw a card, which forms your starting hand. You then play the game by repeatedly choosing and discarding a card from your hand. Each time you do so, you draw as many cards from the top of the deck into your hand as the integer written on the card you just discarded. (If there are not enough cards left in the deck, you draw them all.) You win if you draw all of the cards from the deck and you lose if you run out of cards in your hand when there are still cards left in the deck.  Given the contents of the deck, and assuming that all possible shuffles of the deck are equally likely and that you play optimally, what is the probability you win the game?</p>

### 입력

<p>The first line of input contains two space-separated integers $N$ and $K$, where $N$ $(1 \leq N \leq 1\,500)$ is the number of cards in the deck and $K$ $(0 \leq K \leq 3)$ is the largest integer written on any of the cards.</p>

<p>The second line contains $K+1$ space-separated integers $a_i$ $(0 \leq a_i \leq N)$, starting at $i=0$: the number of cards in the deck with the integer $i$ written on them. It is guaranteed that $a_K &gt; 0$ and that the sum of all of the $a_i$ is $N$.</p>

### 출력

<p>Print a real number: the probability that you win if you play optimally. Your answer will be accepted if it differs from the judge solution by an absolute error of at most $10^{-6}$.</p>