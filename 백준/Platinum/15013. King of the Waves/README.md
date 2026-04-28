# [Platinum II] King of the Waves - 15013

[문제 링크](https://www.acmicpc.net/problem/15013)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 211, 정답: 94, 맞힌 사람: 87, 정답 비율: 44.388%

### 분류

그래프 이론, 그래프 탐색, 해 구성하기, 깊이 우선 탐색

### 문제 설명

<p>You are organising a king of the hill tournament, the Buenos Aires Paddleboarding Competition (BAPC), with n participants. In a king of the hill tournament, one person starts as a &ldquo;king&rdquo; and is then challenged by another person, the winning person becomes the new king. This is repeated until all participants have challenged exactly once (except for the starting person). In a paddleboarding match, there are no draws. The person which ends up as king, wins the tournament. Since you are the organiser, you get to choose the starting person and the order in which they challenge the king.</p>

<p>Someone is offering you a substantial amount of money in case one of the participants, Henk, ends up winning the tournament. You happen to know, for any two participants x and y, which of the two would win if they were to match during the tournament. Consequently, you choose to do the unethical: you will try to rig the game. Can you find a schedule that makes Henk win the tournament?</p>

### 입력

<ul>
	<li>The first line contains an integer 1 &le; n &le; 1000, the number of participants. The participants are numbered 0, . . . , n &minus; 1, where Henk is 0.</li>
	<li>Then n lines follow, where each line has exactly n characters (not counting the newline character). These lines represent the matrix with the information of who beats who, as follows. On line i the jth character is (note that 0 &le; i, j &lt; n):
	<ul>
		<li>&rsquo;1&rsquo; if person i will win against person j.</li>
		<li>&rsquo;0&rsquo; if person i will lose against person j.</li>
		<li>X&rsquo; if i = j.</li>
	</ul>
	</li>
</ul>

### 출력

<p>Print a sequence of participants, such that the first person starts as king and the consequent participants challenge the king. If there is no way to rig the game such that Henk wins, print &ldquo;impossible&rdquo;.</p>