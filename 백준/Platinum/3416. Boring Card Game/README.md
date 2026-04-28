# [Platinum I] Boring Card Game - 3416

[문제 링크](https://www.acmicpc.net/problem/3416)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 219, 정답: 13, 맞힌 사람: 10, 정답 비율: 5.917%

### 분류

중국인의 나머지 정리, 구현, 수학, 정수론

### 문제 설명

<p>The Neal Stephenson&rsquo;s novel Cryptonomicon includes a cryptographic algorithm based on a deck of playing cards. It is emphasized that a proper shuffling is crucial for the cipher security. In this problem, we want to demonstrate the importance of randomness in cryptography by describing a card game that does not employ shuffling and is therefore foreseeable.</p>

<p>The game is a modification of poker, where not only all the cards are visible to everyone, but the players have no influence on the course of the game at all. Pretty boring, isn&rsquo;t it?</p>

<p>A game session is composed of (possibly) many games and is played by N players. For simplicity, we will assume that the players are sitting in a row and are numbered 1 . . . N from left to right. The deck contains exactly 5 &times; N cards numbered 1, 2,... , 5N.</p>

<p>At the beginning of each game, cards are dealt in three dealing rounds. First, two cards are dealt to each player in the left-to-right order. That is, player 1 gets the two top-most cards, then player 2 gets the next 2 cards and so on until the last player N gets his/her cards. In the second round, this step is repeated and every player gets another two cards in the same manner. Finally, each player gets one more card.</p>

<p>The player who receives all the five cards with the smallest numbers (1, 2, 3, 4, 5, not necessarily in this order) is the winner of the whole game session.</p>

<p>If nobody wins, the cards are collected and a new game is started. The cards are collected from the players from right to left and the cards of one player are always collected one-by-one in the reverse order then they were dealt. Each card is placed on top of the deck, another card onto it, and so on. That is, the top of the deck will contain cards of player number 1 and the six top-most cards will be the cards at positions 1, 2, 2N + 1, 2N + 2, 4N + 1, 3 in the original deck.</p>

<p>For example, in the game of two players the initial deck contains ten cards: A, B, C, D, E, F, G, H, I, J. In the first dealing round, player 1 gets the cards A and B, player 2 gets C and D. Then E and F is dealt to player 1, G and H to player 2, then I to player 1, and finally J to player 2. When collecting, the cards of the player 2 go first in the order J, H, G, D, C. Then we continue with player 1&rsquo;s cards I, F, E, B, and A. Since the cards are put onto the deck bottom-top, the final order of the cards after one game is A, B, E, F, I, C, D, G, H, and J.</p>

<p>Write a program that will determine the outcome of a game session so that you can spoil the game to its players.</p>

### 입력

<p>The input contains several game sessions. Each session is described by two lines. The first line contains the number N, 1 &le; N &le; 1000. The second line contains the card numbers 1 . . . 5N in the order from the top of the deck to the bottom. Every two consecutive numbers on this line are separated by a single space. Each number will occur exactly once on that line.</p>

<p>The last decription is followed by a line containing one zero.</p>

### 출력

<p>For each game session, output exactly one line. If no player ever wins, print &ldquo;Neverending game.&rdquo;, otherwise output the sentence &ldquo;Player P wins game number G.&rdquo;, where P is the player number and G is the number of the first game won (the first game is numbered 1). Please note that the result may exceed 2<sup>32</sup> but it will always be less than 2<sup>63</sup>.</p>