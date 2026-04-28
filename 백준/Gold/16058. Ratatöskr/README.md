# [Gold II] Ratatöskr - 16058

[문제 링크](https://www.acmicpc.net/problem/16058)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 118, 정답: 32, 맞힌 사람: 19, 정답 비율: 19.388%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리, 너비 우선 탐색, 트리에서의 다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Ratat&ouml;skr is a squirrel that lives in a giant (but finite) mythical tree called Yggdrasil. He likes to gossip, which sets the other inhabitants of the tree against each other. Ratat&ouml;skr is thus hunted by the two ravens of Odin, which are called Hugin and Munin, to bring him to justice.</p>

<p>The tree is made up of nodes connected by branches. Initially, the ravens and the squirrel sit on three different nodes. Now the following happens repeatedly:</p>

<ul>
	<li>On Odin&rsquo;s signal, one of the ravens launches into the air and flies to another node of the tree (or possibly back to its previous position), while the other stays where it is.</li>
	<li>During this maneuver, Ratat&ouml;skr can travel along the branches to reach another node, but may not pass through a node where a raven sits. He is much quicker than the ravens and will reach his destination before the flying raven lands.</li>
</ul>

<p>Ratat&ouml;skr gets captured if one of the ravens flies to his position and there is no other node he can escape to.</p>

<p>Help Odin determine an optimal strategy for capture, i.e. the minimum number of signals he has to give until Ratat&ouml;skr is guaranteed to be captured by a raven.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with a single integer n (3 &le; n &le; 80), the number of nodes in the tree. The nodes are labeled 1, . . . , n.</li>
	<li>one line with a single integer r (1 &le; r &le; n), the initial position of the squirrel Ratat&ouml;skr.</li>
	<li>one line with a single integer h (1 &le; h &le; n), the initial position of the raven Hugin.</li>
	<li>one line with a single integer m (1 &le; m &le; n), the initial position of the raven Munin.</li>
	<li>n &minus; 1 lines each containing two integers i and j (1 &le; i &lt; j &le; n), indicating a branch between nodes i and j.</li>
</ul>

<p>The positions r, h and m are distinct. There is at most one branch between any two nodes and every node is reachable from every other node by a sequence of branches.</p>

### 출력

<p>One line containing an integer s, the number of signals that the ravens need to capture Ratat&ouml;skr in an optimal strategy. If Ratat&ouml;skr can escape them indefinitely, output impossible.</p>