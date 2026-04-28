# [Platinum III] Game X - 18550

[문제 링크](https://www.acmicpc.net/problem/18550)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 13, 맞힌 사람: 13, 정답 비율: 68.421%

### 분류

사칙연산, 이분 탐색, 수학

### 문제 설명

<p>Sometimes one loves board games so much they start inventing their own games. Bob came up with a game with such overcomplicated rules that we will provide only a small portion of them.</p>

<p>Each of the n+ 1 players has a power change card. Card values are positive and negative integers which are unique by absolute values (for example, if there is a card with value &minus;4, there cannot be a card with value 4). There is no card with a value of zero.</p>

<p>One of the players gets a target token, which means that the other n players have to attack them.</p>

<p>Attacking in this game goes like this: two random players simultaneously reveal their power change cards, and the product of their values is added to the target&rsquo;s power value (oh, we forgot to mention that each player has a power value). Since the cards can have both positive and negative values, the product can turn out positive or negative as well, thus the power value could increase or decrease. Of course, the target player wants to increase their power value.</p>

<p>On the new game&rsquo;s test run, Bob got the target token. Given that he invented this game, Bob vaguely remembers there were exactly k possible unordered pairs of players such that their power change card values had positive <strong>sums</strong>, which he learned before he switched the rules from addition to multiplication a long time ago. Could that help with finding the largest possible number of unordered pairs of players that can increase Bob&rsquo;s power value now?</p>

### 입력

<p>The only line of input consists of two space-separated integers n and k (2 &le; n &le; 10<sup>9</sup>, 0 &le; k &le; 10<sup>18</sup>).</p>

### 출력

<p>If the input data is contradictory, which can only mean that Bob misremembered the number and there cannot possibly be exactly k unordered pairs of players with positive card value sums, output &minus;1.</p>

<p>Otherwise, the only line of output should contain an integer which is the largest number of unordered pairs of players that can increase Bob&rsquo;s power value.</p>