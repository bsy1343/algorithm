# [Silver IV] Playing 23 - 26210

[문제 링크](https://www.acmicpc.net/problem/26210)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 47, 정답: 22, 맞힌 사람: 20, 정답 비율: 50.000%

### 분류

구현, 그리디 알고리즘, 브루트포스 알고리즘, 시뮬레이션

### 문제 설명

<p>Twenty-three is a simple card game played by kids. Like its name suggests, it is a variation of Blackjack, which is the most widely played game in casinos and gaming sites.</p>

<p>The game uses a deck of 52 cards, with four suits, each suit with 13 cards (ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen and king). Card suits are not relevant. The picture cards (jack, queen and king) are worth ten points, cards with numbers are worth their number in points (for example, the 4 card is worth four points) and the ace is worth one point.</p>

<p>The player who has the most points wins, provided it does not exceed 23. If a player has a number of points greater than 23 we say the player <em>busts</em>.</p>

<p>The game rules are simple: at each game, initially the deck is shuffled, the cards are placed in a stack and each player receives two cards from the stack. All cards are dealt face up (all players see all players&rsquo; cards). The next step, called <em>round</em>, is repeated as long as there are active players: a card is taken from the stack and set on the table face up. This card, called <em>common card</em>, counts to all players. If a player busts, he leaves the game. The winner is the player that in a given round has a total of 23 points (considering their two starting cards plus the common cards), or if the player is the only active player at the end of the round. Note that there can be more than one winner (whose cards add up to 23) and that there may be no winner in a match.</p>

<p>John and Mary are playing twenty-three. The two are the only players in the game, neither of them busted and neither of them has 23 points. Furthermore, the players score is such that the next common card may cause the game to end.</p>

<p>Given John and Mary initial cards and the common cards, determine the lowest possible value of a card that should be taken from the stack in the next round for Mary to win the game.</p>

### 입력

<p>The first line of input contains a single integer $N$ ($1 &le; N &le; 8$), the number of rounds already played. Each card is described by an integer $I$ ($1 &le; I &le; 13$). Note that the picture cards (jack, queen and king) are represented in the input by the values $11$, $12$ and $13$ which is not how many points they are worth. The second line contains two integers, describing the two initial cards for John. The third line contains two integers, describing the two initial cards for Mary. The fourth and last line contains $N$ integers, describing the common cards, in the order they were taken from the stack.</p>

### 출력

<p>Your program should output a single line, containing a single integer, the value of the lowest card that must be taken from the stack in the next round for Mary to win the game, or -1 if Mary cannot win the match in that next round.</p>