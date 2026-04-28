# [Platinum III] Hokej - 14966

[문제 링크](https://www.acmicpc.net/problem/14966)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 95, 정답: 22, 맞힌 사람: 17, 정답 비율: 28.333%

### 분류

그리디 알고리즘, 정렬, 해 구성하기

### 문제 설명

<p>The date of a major marathon ice hockey tournament is approaching. As it is often the case in marathon ice hockey, the game is M minutes long. On the field (ice) are, as in regular ice hockey, at each given moment, six players from each team. However, a game of marathon ice hockey can last a very long time, so the coaches brought a bunch of players in buses and planes so they can perform substitutions when the players get tired.</p>

<p>One of the coaches is the hero of our story, and his name is Ante. Ante brought N players to the tournament. For each player, he knows two things: the player quality - K, and the player endurance - I. The player endurance is the total time in minutes that a player can spend playing in the game without getting tired. If the player played for X minutes, then rested on the bench, then played again for Y minutes, his total playing time is X + Y. When a player plays a total number of minutes equal to their endurance, he gets tired and can&rsquo;t continue playing, so in that moment someone needs to substitute for him, or he will faint on the ice and end up in the hospital (marathon ice hockey is a dangerous game).</p>

<p>The quality of the team in a given minute of the game is the sum of the quality of that team&rsquo;s players that are currently playing. Ante is not a great coach, so he asked you to come up with the initial six players and the substitute schedule so he can achieve the maximum possible ​sum of the quality of the team for all the minutes in the game - Z. It is guaranteed that it will always be possible to come up with a schedule such that there are six players in the game in each minute.</p>

<p>For example, if the game lasted for 3 minutes, and if in the first minute the quailty of the team was 15, in the second 12, and in the third 14, Z will be equal to 15 + 12 + 14 = 41.</p>

<p>Please note: in marathon ice hockey, there is no goalie, because the game must be interesting!</p>

### 입력

<p>The first line of input contains the positive integers M and N (1 &le; M &le; 500 000, 6 &le; N &le; 500 000), the duration of the game in minutes, and the number of players Ante brought.</p>

<p>Each of the following N lines contains two positive integers per player, K ​(1 &le; K &le; 100 000) and I​ ​(1 &le; I &le; M), the quality and the endurance.</p>

<p>The players are numbered from 1 to N, in the order given in the input (the first player&rsquo;s number is 1, the second is 2, etc.)</p>

### 출력

<p>The first line of output must contain the maximum possible Z from the task.</p>

<p>The second line of output must contain exactly six numbers - the numbers of the six players that start the game.</p>

<p>The third line of output must contain the number of substitutions B, that must not exceed 3 * N​.</p>

<p>Each of the following B lines must contain, in order from the earliest to the latest substitute, the information about the substitutes, three numbers per substitute, X (1 &le; X &lt; M), A and B, where X is the number of minutes from the start of the game when the substitute is being&nbsp;done, A is the number of the player exiting the game and going to the bench, and B is the number of the player that is entering​ ​the game as their substitute.</p>

<p>Multiple substitutions in the same minute are permitted, but a player cannot enter the game,​ ​and​ ​then​ ​exit​ ​in​ ​the​ ​same​ ​moment,​ ​or​ ​vice​ ​versa.​</p>

<p>If multiple solutions exist, output any.</p>

### 힌트

<p>Clarification​ ​of​ ​the​ ​first​ ​test​ ​case:</p>

<p>No substitutes were needed, the entire team will play the game from start to end.</p>