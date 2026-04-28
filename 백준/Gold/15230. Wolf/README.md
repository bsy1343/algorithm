# [Gold III] Wolf - 15230

[문제 링크](https://www.acmicpc.net/problem/15230)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 5, 맞힌 사람: 5, 정답 비율: 33.333%

### 분류

그리디 알고리즘

### 문제 설명

<p>In the card game Wolf (a variant of the famous card games War and Sv&auml;lta r&auml;v), two players both have a set of cards, which together form a normal deck of playing cards. Such a deck contains 52 cards, with each card being a unique combination of one of 4 suits and 13 ranks.</p>

<p>During a turn, each player picks the topmost card from their piles, and shows it. This process is repeated until the two cards have the same suit. Then, the player with the highest rank receives all the cards, which are shuffled into the deck. The turn then ends. The turn also ends if any player, when they are suppoed to pick a card from their pile, has an empty pile. That player will then lose the game. This means that the game can be tied, if the two players both try to pick a new card simultaneously.</p>

<p>Your opponent is currently taking a bathroom break, so you have the opportunity to reshuffle your decks. You cannot exchange any cards, since your opponent knows the set of cards in their deck. Is it possible to reshuffle the deck, so that you win during the next turn?</p>

### 입력

<p>The first line of input contains the number of cards in your hand (0 &le; n &le; 52). Each of the next n lines contains a card specified by a number from 1 to 13 and one of the letters &rsquo;C&rsquo;, &rsquo;D&rsquo;, &rsquo;H&rsquo;, &rsquo;S&rsquo;, separated by a space.</p>

<p>The letter of a card specifies its suit (either clubs, diamonds, hearts or spades, respectively). The number of a card specifies the rank of the card. For simplicity, aces are represented as a 1, and jacks, queens and kings are represented as the numbers 11, 12 and 13. For the purpose of this problem, we consider a rank a to be lower than a rank b if the number of rank a is lower than the number of rank b (meaning aces are of the lowest rank).</p>

### 출력

<p>Output &ldquo;Possible&rdquo; if it is possible to reshuffle the decks, and &ldquo;Impossible&rdquo; if it is not.</p>