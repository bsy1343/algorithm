# [Platinum III] Ludo - 24284

[문제 링크](https://www.acmicpc.net/problem/24284)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍, 게임 이론, 트리에서의 전방향 다이나믹 프로그래밍

### 문제 설명

<p>A new game has appeared on the market - a version of the well-known game &quot;Don&#39;t Angry Man!&quot;, named also &quot;Ludo&quot;. Deni and Bob immediately decided to buy it and began to learn the rules: A map is given with fields numbered from 1 to N. Some pairs of fields are neighbor. There is a pawn that can be placed on a field and can be moved from a field to any neighboring field.</p>

<p>The map is special - starting from a field, the pawn cannot return to the same field without passing through previously visited fields. The first player chooses on which field to put the pawn. Then, it is a turn of the second player and the players begin to alternate moving the pawn from a field to some neighbor field. Every field that the pawn has visited becomes marked and the pawn can no longer step on it. The player who cannot move the pawn in a neighbor unmarked field loses and the other player wins. Deni and Bob have a lot of experience with similar games, so they will always play optimally. Deni starts the first move. She knows how to find a field, so that if she puts a pawn on it to start, she will win.</p>

<p>Write program ludo that reads the parameters of the game and for each field shows whether it is a winning position or not for the player making the first move.</p>

### 입력

<p>From the first line of the standard input, your program reads two positive integers N and M - the count of fields on the map and the count of pairs of neighbors. From each of the following M lines, your program reads two integers x and y, which indicate that the fields numbered x and y are neighbor.</p>

### 출력

<p>In order of fields&#39; numbers, your program should output a sequence of 0 and 1 with no spaces, where 0 means that it is a losing position and 1 &minus; if it is a winning posi2on for the first player.</p>

### 제한

<ul>
	<li>1 &le; N &le; 5∙10<sup>5</sup></li>
	<li>1 &le; M &le; 5∙10<sup>5</sup></li>
</ul>

### 힌트

<p>The output means that for an optimal game, Deni loses if she places the pawn in the fields with numbers 1, 2 and 3, and in all the other fields she will win. If Deni places the pawn in the field with number 1, Bob can move the pawn in the field with number 3 and Deni will not have more moves because the field with number 1 is already marked. Analogously Deni will lose if she places the pawn in the field with number 2. For the fields with numbers 4 and 5, she has a winning strategy.</p>