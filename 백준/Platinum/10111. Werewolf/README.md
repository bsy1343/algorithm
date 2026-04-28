# [Platinum III] Werewolf - 10111

[문제 링크](https://www.acmicpc.net/problem/10111)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 57, 정답: 12, 맞힌 사람: 12, 정답 비율: 63.158%

### 분류

수학, 다이나믹 프로그래밍, 그래프 이론, 트리, 조합론, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>As they usually do, N robots are playing the game of Werewolf, and the robots are numbered with integers from 1 to N. Exactly W of these robots are werewolves, and the remainder are civilians. Though the game of Werewolf involves various aspects, we will focus on a single discussion phase of the game.</p>

<p>Robots accuse other robots of being werewolves and defend other robots by vouching for their innocence.</p>

<p>The werewolves know each other&rsquo;s identities and:</p>

<ul>
	<li>a werewolf never accuses another werewolf;</li>
	<li>any robot that a werewolf defends is another werewolf.</li>
</ul>

<p>Civilians may accuse or defend either type of robot. Additional constraints make our task a bit easier:</p>

<ul>
	<li>No robot is both accused and defended.</li>
	<li>No robot is accused or defended more than once.</li>
	<li>For a robot A to accuse or defend robot B, then A &lt; B.</li>
</ul>

<p>You will be given all the accusations and defenses between N robots where there are exactly W werewolves. A role assignment identifies each of the robots as either werewolf or civilian. Your goal is to figure out how many role assignments satisfy all the above constraints.</p>

### 입력

<p>The first line contains three numbers (each separated by one space):</p>

<ul>
	<li>N (1 &le; N &le; 200), the number of robots, followed by</li>
	<li>W (0 &le; W &le; N), the number of werewolves, followed by</li>
	<li>M (0 &le; M &lt; N), the number of accusations/defenses.</li>
</ul>

<p>The next M lines give the accusations and defenses. Each of these lines will be one of the following two forms:</p>

<ul>
	<li>A a b indicates robot a accused robot b of being a werewolf;</li>
	<li>D a b indicates robot a defended robot b.</li>
</ul>

### 출력

<p>Output the number of role assignments that are consistent with the given information. Since this number may be very large, you must output this answer modulo 10<sup>9</sup> + 7.</p>