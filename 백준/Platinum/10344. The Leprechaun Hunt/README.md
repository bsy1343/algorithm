# [Platinum III] The Leprechaun Hunt - 10344

[문제 링크](https://www.acmicpc.net/problem/10344)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 9, 정답: 6, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍, 비트마스킹, 게임 이론

### 문제 설명

<p>In Irish mythology, a Leprechaun is a small sprite who stores all his treasure in a hidden pot of gold at the end of the rainbow. If someone is able to catch the Leprechaun, he must give that person his pot of gold. In this problem, we explore the difficulty of capturing a Leprechaun.</p>

<p>We model a search with <em>V</em> villagers trying to catch a single Leprechaun as a game on a simple undirected graph having <em>N &ge; 1+V</em> nodes. To begin the game, the villagers position themselves at a subset of <em>V</em> distinct nodes. After that, the Leprechaun chooses a remaining node as a starting position. In each round of the game that follows, one villager moves from his or her current node to an adjacent node that is unoccupied by another villager. If that node has the Leprechaun, the villagers win the pot of gold. Otherwise, the Leprechaun now has the option of either staying at his current node, or moving to an adjacent, unoccupied node. Given a specific graph, and a fixed number of villagers, we are interested in the minimum number of turns the villagers need to capture the most clever of Leprechauns.</p>

<p>As examples, consider the two figures below. For the graph in Figure&nbsp;1, a single villager can never capture a Leprechaun, as the Leprechaun can easily stay away from the villager. However, two villagers can capture the Leprechaun after at most 2 turns. For example, the villagers might begin at nodes <code>A</code> and <code>D</code>, in which case a clever Leprechaun will start at node <code>F</code>. But after the villager at <code>A</code> moves to <code>G</code> the villagers can capture the Leprechaun on their second turn, no matter whether the Leprechaun moves to <code>E</code> or remains at&nbsp;<code>F</code>.</p>

<p>For the graph in Figure&nbsp;2, a single villager is unable to catch a clever Leprechaun. To see why this is the case, we describe a possible strategy of the Leprechaun, which is to always stay within the square made by BCDE, and opposite of the villager if the villager is in that square. If the villager were ever to go to A, the Leprechaun can remain still. In contrast, two villagers are able to capture the Leprechaun on their first move by picking initial positions such as B and E.</p>

<table style="height:204px; text-align:center; width:406px">
	<tbody>
		<tr>
			<td><img alt="cycle graph" src="%EB%B0%B1%EC%A4%80/Platinum/10344.%E2%80%85The%E2%80%85Leprechaun%E2%80%85Hunt/12ef0d62.png" data-original-src="https://www.acmicpc.net/upload/images2/cycle.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:200px" /></td>
			<td><img alt="house graph" src="%EB%B0%B1%EC%A4%80/Platinum/10344.%E2%80%85The%E2%80%85Leprechaun%E2%80%85Hunt/b2f080cf.png" data-original-src="https://www.acmicpc.net/upload/images2/house.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:200px" /></td>
		</tr>
		<tr>
			<td>Figure 1</td>
			<td>Figure 2</td>
		</tr>
	</tbody>
</table>

### 입력

<p>Each tests begins with a line containing three integers: <em>V N E</em>. The value of <em>V</em> denotes the number of villagers such that 1 &le; <em>V</em> &le; 7. The number of nodes <em>N</em> in the graph will satisfy 1 + <em>V</em> &le; <em>N</em> &le; 15. The value 1 &le; <em>E</em> &le; 45 designates the number of edges in the graph. Following the initial line of parameters will be one or more lines describing the edges of the graph, with up to 15 edges per line. Nodes of the graph are implicitly denoted with the first <em>N</em> uppercase letters (<code>A</code>, <code>B</code>, <code>C</code>, ...), and edges are explicitly denoted as two-character strings; for example the string <code>AC</code> denotes an edge connecting nodes <code>A</code> and <code>C</code> to each other. The <em>E</em> edges will be distinct, each edge connects two distinct nodes, and any node will have at most 6&nbsp;incident edges. A line with the single value <code>0</code> designates the end of the input.</p>

### 출력

<p>For each test case, output a line, prefaced with the case number as shown in the example output below, followed by the minimum number of moves that the villagers need to guarantee capture of the Leprechaun, or the word <code>NEVER</code> if the villagers are unable to capture the Leprechaun.</p>