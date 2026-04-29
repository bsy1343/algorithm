# [Platinum III] Keep Fighting - 34742

[문제 링크](https://www.acmicpc.net/problem/34742)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 9, 맞힌 사람: 9, 정답 비율: 90.000%

### 분류

구현, 시뮬레이션, 애드 혹

### 문제 설명

<p>Bob is playing a card game where he must defeat a monster. Before the game starts, Bob’s power is set to $P$, the monster’s health is set to $H$, and Bob receives a deck of $N$ cards in his hands.</p>

<p>Each card in the deck belongs to one of the following types:</p>

<ul>
<li>Multiply: a card of this type has a number $X$ written on it. Playing it multiplies Bob’s current power by $X$.</li>
<li>Add: a card of this type also has a number $Y$ written on it. Playing it increases Bob’s current power by $Y$.</li>
<li>Attack: a card of this type allows Bob to attack the monster. Playing it reduces the monster’s current health by Bob’s current power.</li>
</ul>

<p>The game is played in turns. In each turn, Bob must play exactly one card from his hand, after which the card is moved to a discard pile. If Bob has no cards left in his hand at the end of a turn, he retrieves all cards from the discard pile and can use them again in any order.</p>

<p>The monster is beaten as soon as its health reaches $0$ or less. Is it possible for Bob to beat the monster? If so, what is the minimum number of turns required?</p>

### 입력

<p>The first line contains three integers $N$ ($1 ≤ N ≤ 50$), $P$ ($0 ≤ P ≤ 10^9$) and $H$ ($1 ≤ H ≤ 10^9$), indicating respectively the number of cards in the deck, Bob’s initial power and the monster’s initial health.</p>

<p>Each of the next $N$ lines describes a card. The content of the line depends on the type of the card, as follows:</p>

<ul>
<li>Multiply: the line contains the character “<code>*</code>” (asterisk) and an integer $X$ ($1 ≤ X ≤ 10^9$), representing the multiply factor provided by the card.</li>
<li>Add: the line contains the character “<code>+</code>” (plus sign) and an integer $Y$ ($1 ≤ Y ≤ 10^9$), indicating the increment provided by the card.</li>
<li>Attack: the line contains the character “<code>!</code>” (exclamation mark).</li>
</ul>

### 출력

<p>Output a single line with an integer indicating the minimum number of turns required to beat the monster, or the character “<code>*</code>” (asterisk) if it is impossible to beat the monster.</p>