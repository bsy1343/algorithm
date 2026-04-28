# [Bronze II] Cezar - 14963

[문제 링크](https://www.acmicpc.net/problem/14963)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 581, 정답: 189, 맞힌 사람: 163, 정답 비율: 33.402%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Little Caesar likes card games. Everytime he comes to Zagreb, he plays blackjack, the famous card game, with his friends.</p>

<p>In this game, the player draws cards while the sum of the cards in his hand is less than or equal to 21 or until he says &ldquo;DOSTA&rdquo; (Croatian for &ldquo;STOP&rdquo;). At the beginning of the game, there are 52 cards in the deck, thirteen ranks of each of the four suits. The card ranks are two, three, &hellip;, ten, Jack, Queen, King and Ace. The card values are the following: the cards with numbers on them are worth that number (e.g., &ldquo;nine&rdquo; is 9), the cards with pictures (Jack, Queen, and King) are worth 10, whereas the Ace is worth 11.</p>

<p>Caesar has found himself in an interesting situation. During the game, he already drew N cards whose sum is less than or equal to 21 and is now having second thoughts about drawing one more card or not. Let&rsquo;s assume X is the difference from the sum of the cards so far to 21. Everybody knows that you don&rsquo;t draw a card if the number of the remaining cards in the deck whose value is greater than X is greater than or equal to the number of the remaining cards in the deck whose value is less than or equal to X.</p>

<p>Since Caesar is having a difficult time calculating whether he needs to draw another card or not, he&rsquo;s asking you to do it for him.</p>

### 입력

<p>The first line of input contains the positive integer N (1 &le; N &le; 52), the number of cards Caesar has drawn so far.</p>

<p>Each of the following N lines contains a single positive integer, the value of the i th card Caesar drew.</p>

### 출력

<p>If Caesar should draw another card, output &ldquo;VUCI&rdquo; (Croatian for &ldquo;DRAW&rdquo;), otherwise output &ldquo;DOSTA&rdquo; (Croatian for &ldquo;STOP&rdquo;).</p>

### 힌트

<p>Clarification​ ​of​ ​the​ ​first​ ​test​ ​case:</p>

<p>The sum of the already drawn cards is 15, and the difference X to 21 is 6. The number of cards in the deck with a value greater than 6 is 32 (4 Aces, 4 Kings, 4 Queens, 4 Jacks, 4 tens, 4 nines, 4 eights, and 4 sevens), whereas the number of cards in the deck with a value less than or equal to 6 is 14 (one two, one three, 4 fours, 4 fives, and 4 sixes).</p>