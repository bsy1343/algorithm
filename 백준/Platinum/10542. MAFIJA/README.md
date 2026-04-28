# [Platinum III] MAFIJA - 10542

[문제 링크](https://www.acmicpc.net/problem/10542)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 735, 정답: 182, 맞힌 사람: 144, 정답 비율: 31.718%

### 분류

그래프 이론, 그래프 탐색, 애드 혹, 깊이 우선 탐색

### 문제 설명

<p>Mafia is a social game played frequently by high school competitors in informatics on summer and winter camps and national competitions, usually very late at night, drinking various fruit sodas. This game is not about winning, it&#39;s about los taking part, like in competitions.</p>

<p>To solve this task, you don&#39;t need to know the rules of mafia; all you need to know is that some of the players are &quot;mobsters&quot; and the rest are &quot;civilians&quot;. The mobsters know who is who, but the civilians don&#39;t. The civilians are trying to figure out who the mobsters are during the game.</p>

<p>In the current round of the game, out of N surviving players so far, each one has accused exactly one other player saying that he is the mobster. The civilians were only guessing and the mobsters have accused civilians, pretending to know nothing.</p>

<p>Not knowing who the mobsters are, but knowing who accused whom, determine the maximum possible number of mobsters among these players!</p>

### 입력

<p>The first line of input contains the integer N (2 &lt; N &lt; 500 000), the number of players. The players are labeled with integers from 1 to N.</p>

<p>The K<sup>th</sup> line of input, out of the following N lines, contains the label of the player accused by the player K. (No player can accuse themselves.)</p>

### 출력

<p>The first and only line of output must contain the maximum possible number of mobsters.</p>

### 힌트

<p>Clarification of the first sample test: The mobster can be player 2 and 3.</p>

<p>Clarification of the second sample test: The mobster can be any player, but there cannot be more of them because that would mean that one of them accused the other.</p>