# [Platinum III] Lopsided Lineup - 23386

[문제 링크](https://www.acmicpc.net/problem/23386)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 116, 정답: 90, 맞힌 사람: 78, 정답 비율: 78.000%

### 분류

수학, 그리디 알고리즘, 정렬, 애드 혹

### 문제 설명

<p>Together with your coworker, Sergey, you are organizing the exciting Billiards and Pool Competition for your coworkers in your small company. However, communication has not been great between you two. You are not sure you and Sergey think alike, but as far as you are concerned, this would be a great opportunity to do some team building. The actual prizes are meaningless, but there is possibly a lot to be gained from this in team bonding. You want to maximise result.</p>

<p>You start reading some pseudo-scientific books on team management, and after some research, you conclude that there are two good ways of team bonding: people feel more connected after either a triumphant victory or a crushing defeat. This gives you a great idea: if you divide your coworkers into two groups that are as far apart in skill level as possible, both teams will experience improved bonding! You therefore think it is optimal to try to make the teams as unbalanced as possible. Make sure, however, that the teams are of equal size.</p>

<p>With a bit of work you come up with a nice model for the strength of a team. You think team strength is mainly determined by how well two players play together, whether they encourage one another and complement each other&#39;s weaknesses. Whenever two players $i$ and $j$ are in the same team, they increase the team score by an integer $c_{i,j}$. The total score of a team is thus equal to the sum of $c_{i,j}$, over all unordered pairs of players $i$ and $j$ in the team.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an even integer $n$ ($2\leq n\leq 1000$), the total number of players.</li>
	<li>$n$ lines, the $i$th of which contains $n$ integers $c_{i,1}, c_{i,2}, \dots, c_{i, n}$ ($-10^6 \leq c_{i,j} \leq 10^6$). For any $i$ and $j$, it is guaranteed that $c_{i,i} = 0$ and $c_{i,j} = c_{j,i}$.</li>
</ul>

### 출력

<p>Output the maximum possible difference in strength between two teams of equal size.</p>