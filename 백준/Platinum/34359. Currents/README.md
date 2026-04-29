# [Platinum III] Currents - 34359

[문제 링크](https://www.acmicpc.net/problem/34359)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 15, 정답: 8, 맞힌 사람: 8, 정답 비율: 53.333%

### 분류

그래프 이론, 데이크스트라, 최단 경로

### 문제 설명

<p>Well-hidden in the atrium of an abandoned house, you have found an ancient book that uncovers the most well-kept secret of the city of Bonn. Deep below the city, there is a system of $N$ caves, connected by $M$ water channels. Within each water channel there's a one-directional magical current that can quickly transport a boat along the channel. The cave system currently has exactly one exit that is located in cave $N-1$.</p>

<p>You are very excited about your discovery and cannot wait to explore the caves! However, the cave system is inhabited by a troll who likes to have some fun with uninvited visitors. The troll has some limited magical power – which he can use <strong>at most once</strong> during your visit – to modify the cave system and make it harder for you to reach the exit.</p>

<p>Your visit to the cave system will consist of a sequence of rounds. Each round will be as follows:</p>

<ol>
	<li>First, the troll gets to choose whether or not he uses his magical power. If he does, his spell does all of the following:
	<ul>
		<li>reverses the direction of the magical current in every channel: $a \rightarrow b$ will change to $b \rightarrow a$ immediately;</li>
		<li>closes the exit in cave $N-1$; and</li>
		<li>opens a new exit in cave $0$.</li>
	</ul>
	</li>
	<li>Then, you choose a magical current that flows from your present cave, and use your boat to travel to another cave. For simplicity, we will call the use of a boat a "move".</li>
</ol>

<p>Additionally, whenever you are in the same cave as the exit, you will <strong>immediately</strong> use it to leave the cave system. Note that this can even happen during a round if you are in cave $0$ and the troll decides to use his magical power.</p>

<p>Your goal is to leave the cave system as quickly as possible to be in time for the closing ceremony of the EGOI. The troll's goal is exactly the opposite; he wants to keep you in his caves for as long as possible. The troll always knows your location and he will pick the moment at which to use his magical power in a way that serves his goal the best.</p>

<p>Separately for each cave $c$ ($0 \leq c \leq N-2$) consider the scenario in which you start in cave $c$. For each of these scenarios, determine the <strong>smallest number of moves in which you can definitely reach an exit from cave $c$, no matter when the troll chooses to use his power</strong>.</p>

<p>Assuming the spell is not used, every cave is reachable from cave $0$, and cave $N-1$ is reachable from every cave.</p>

### 입력

<p>The first line of the input contains two integers, $N$ and $M$, where $N$ is the number of caves and $M$ is the number of water channels. The next $M$ lines of the input each contain two integers, $a_i$ and $b_i$, representing a channel that right now can be used to travel from cave $a_i$ to cave $b_i$. There is no channel connecting a cave to itself. For each pair of caves there is at most one channel in each direction.</p>

### 출력

<p>Output a line with $N-1$ integers, where the $i$th integer, $0 \leq i \leq N-2$, is the smallest number of moves within which you can definitely reach an exit if starting from cave $i$.</p>

<p>Note that you do not output the time for cave $N - 1$ (as you would just exit this cave immediately).</p>

### 제한

<ul>
	<li>$2 \leq N \leq 200\,000$.</li>
	<li>$1 \leq M \leq 500\,000$.</li>
	<li>$0 \leq a_i, b_i \leq N-1$ and $a_i \neq b_i$.</li>
	<li>Before the reversal, cave $0$ can reach all caves, and cave $N-1$ can be reached from all caves.</li>
</ul>