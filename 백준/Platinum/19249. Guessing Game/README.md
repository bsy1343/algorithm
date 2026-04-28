# [Platinum III] Guessing Game - 19249

[문제 링크](https://www.acmicpc.net/problem/19249)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 14, 맞힌 사람: 13, 정답 비율: 40.625%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p><em>Guessing Game</em>&nbsp;is Alice&#39;s favorite game for two players. This game is played with a deck containing a number of cards, each having a sequence of zeroes and ones written on it. The lengths of all sequences on the cards are equal.</p>

<p>In Guessing Game Alice picks at random a card from the deck, and the other player attempts to determine what sequence is written on the card, by asking Alice a series of questions of the form &quot;What is the $i$-th digit of the sequence?&quot;. After each such question Alice answers (truthfully) to the question, and the second player may ask another question, or try to guess the sequence on the card. The second player can only guess once, so if his guess is correct, he wins, otherwise he loses.</p>

<p>Alice challenged you to play the game and win by asking as few questions as possible.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f35f0eab-b2d2-4904-b43c-77842e8728a9/-/preview/" /></p>

<p>Given all the sequences that appear on the cards, find the minimal number of questions needed to uniquely determine the sequence, no matter what card is picked by Alice.</p>

### 입력

<p>The first line of input contains the number of test cases $z$ ($1 \leq z \leq 20$). The descriptions of the test cases follow.</p>

<p>The first line of every test case contains two integers $n, k$ ($1 \leq n \leq 2^k; 1 \leq k \leq 13$), denoting the number of cards and the length of all sequences appearing on the cards respectively. Each of the following $n$ lines contains a string of length $k$ consisting of zeroes and ones, describing the sequence on one card. No two sequences in a test case are equal.&nbsp;</p>

### 출력

<p>For each test case output one integer: the minimal number of questions the second player has to ask to win the game.</p>