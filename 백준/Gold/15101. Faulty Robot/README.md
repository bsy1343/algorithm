# [Gold III] Faulty Robot - 15101

[문제 링크](https://www.acmicpc.net/problem/15101)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 25, 맞힌 사람: 23, 정답 비율: 82.143%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>As part of a CS course, Alice just finished programming her robot to explore a graph having n nodes, labeled 1, 2, . . . , n, and m directed edges. Initially the robot starts at node 1.</p>

<p>While nodes may have several outgoing edges, Alice programmed the robot so that any node may have a forced move to a specific one of its neighbors. For example, it may be that node 5 has outgoing edges to neighbors 1, 4, and 6 but that Alice programs the robot so that if it leaves 5 it must go to neighbor 4.</p>

<p>If operating correctly, the robot will always follow forced moves away from a node, and if reaching a node that does not have a forced move, the robot stops. Unfortunately, the robot is a bit buggy, and it might violate those rules and move to a randomly chosen neighbor of a node (whether or not there had been a designated forced move from that node). However, such a bug will occur at most once (and might never happen).</p>

<p>Alice is having trouble debugging the robot, and would like your help to determine what are the possible nodes where the robot could stop and not move again.</p>

<p>We consider two sample graphs, as given in Figures G.1 and G.2. In these figures, a red arrow indicate an edge corresponding to a forced move, while black arrows indicate edges to other neighbors. The circle around a node is red if it is a possible stopping node.</p>

<table class="table" style="width:100%">
	<tbody>
		<tr>
			<td style="text-align:center; width:50%"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15101.%E2%80%85Faulty%E2%80%85Robot/4d31938a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/15101.%E2%80%85Faulty%E2%80%85Robot/4d31938a.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15101/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:127px; width:295px" /></td>
			<td style="text-align:center; width:50%"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15101.%E2%80%85Faulty%E2%80%85Robot/8021f99f.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/15101.%E2%80%85Faulty%E2%80%85Robot/8021f99f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15101/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:118px; width:134px" /></td>
		</tr>
		<tr>
			<td style="text-align:center; width:50%">Figure G.1: First sample graph.</td>
			<td style="text-align:center; width:50%">Figure G.2: Second sample graph.</td>
		</tr>
	</tbody>
</table>

<p>In the first example, the robot will cycle forever through nodes 1, 5, and 4 if it does not make a buggy move. A bug could cause it to jump from 1 to 2, but that would be the only buggy move, and so it would never move on from there. It might also jump from 5 to 6 and then have a forced move to end at 7.</p>

<p>In the second example, there are no forced moves, so the robot would stay at 1 without any buggy moves. It might also make a buggy move from 1 to either 2 or 3, after which it would stop.</p>

### 입력

<p>The first line contains two integers n and m, designating the number of nodes and number of edges such that 1 &le; n &le; 10<sup>3</sup>, 0 &le; m &le; 10<sup>4</sup>. The next m lines will each have two integers a and b, 1 &le; |a|, b &le; n and |a| &ne;&nbsp;b. If a &gt; 0, there is a directed edge between nodes a and b that is not forced. If a &lt; 0, then there is a forced directed edge from &minus;a to b. There will be at most 900 such forced moves. No two directed edges will be the same. No two starting nodes for forced moves will be the same.</p>

### 출력

<p>Display the number of nodes at which the robot might come to a rest.</p>