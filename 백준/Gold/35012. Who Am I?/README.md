# [Gold IV] Who Am I? - 35012

[문제 링크](https://www.acmicpc.net/problem/35012)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 12, 맞힌 사람: 10, 정답 비율: 55.556%

### 분류

애드 혹

### 문제 설명

<p><em>This is a run-twice problem.</em></p>

<p>A team of $n$ players is sitting around a large round table in a library and playing a cooperative game. Each player has a card with an integer from $1$ to $n$ glued to their forehead. Players can see each other's numbers but cannot see their own numbers, which they are trying to guess. Since the game takes place in a library where everyone must be quiet, players make their guesses in writing and simultaneously, without communicating with each other. The team wins if at least one player guesses their number correctly.</p>

<p>Your task is to devise a winning strategy for the team. The strategy will be tested in two runs.</p>

<p>During the first run, you will be given the numbers on the cards of all players at the table in clockwise order. After that, you need to select the number of the player who will correctly guess their card.</p>

<p>During the second run, you will be informed of the number of the chosen player, as well as the numbers on the cards that this player can see from their position, from left to right. In response, you have to output the number on the chosen player's card.</p>

### 입력

<p>During both runs, the first line contains a single integer: $0$ if it is the first run, or the number of the player chosen during the first run if it is the second run.</p>

<p>The second line contains an integer $n$: the number of players, or the number of cards visible to the player ($n \leq 2 \cdot 10^5$). The third line contains $n$ integers: the numbers on the cards.</p>

<p>There is at least one player at the table.</p>

### 출력

<p>During the first run, output a single integer: the number of the player who will correctly guess their card.</p>

<p>During the second run, also output a single integer: the guess of that player.</p>