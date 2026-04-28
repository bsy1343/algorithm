# [Platinum II] Crystalfly - 31182

[문제 링크](https://www.acmicpc.net/problem/31182)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 11, 맞힌 사람: 11, 정답 비율: 45.833%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Paimon is catching crystalflies on a tree, which are a special kind of butterflies in Teyvat. A tree is a connected graph consisting of $n$ vertices and $(n - 1)$ undirected edges. </p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31182.%E2%80%85Crystalfly/55ec81b5.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31182.%E2%80%85Crystalfly/55ec81b5.png" data-original-src="https://upload.acmicpc.net/2b060885-46ff-4e12-aa29-4d82b44fd18c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 266px;" /></p>

<p style="text-align: center;">Pixiv ID: 93964680</p>

<p>There are initially $a_i$ crystalflies on the $i$-th vertex. When Paimon reaches a vertex, she can catch all the remaining crystalflies on the vertex immediately. However, the crystalflies are timid. When Paimon reaches a vertex, all the crystalflies on the adjacent vertices will be disturbed. For the $i$-th vertex, if the crystalflies on the vertex are disturbed for the first time at the beginning of the $t&#39;$-th second, they will disappear at the end of the $(t&#39; + t_{i})$-th second.</p>

<p>At the beginning of the $0$-th second, Paimon reaches vertex $1$ and stays there before the beginning of the $1$-st second. Then at the beginning of each following second, she can choose one of the two operations:</p>

<ul>
	<li>Move to one of the adjacent vertices of her current vertex and stay there before the beginning of the next second (if the crystalflies in the destination will disappear at the end of that second she can still catch them).</li>
	<li>Stay still in her current vertex before the beginning of the next second.</li>
</ul>

<p>Calculate the maximum number of crystalflies Paimon can catch in $10^{10^{10^{10^{10}}}}$ seconds.</p>

### 입력

<p>There are multiple test cases. The first line of the input contains an integer $T$ indicating the number of test cases. For each test case:</p>

<p>The first line contains an integer $n$ ($1 \le n \le 10^5$) indicating the number of vertices.</p>

<p>The second line contains $n$ integers $a_1, a_2, \cdots, a_n$ ($1 \le a_i \le 10^9$) where $a_i$ is the number of crystalflies on the $i$-th vertex.</p>

<p>The third line contains $n$ integers $t_1, t_2, \cdots, t_n$ ($1 \le t_i \le 3$) where $t_i$ is the time before the crystalflies on the $i$-th vertex disappear after disturbed.</p>

<p>For the next $(n - 1)$ lines, the $i$-th line contains two integers $u_i$ and $v_i$ ($1 \le u_i, v_i \le n$) indicating an edge connecting vertices $u_i$ and $v_i$ in the tree.</p>

<p>It&#39;s guaranteed that the sum of $n$ of all the test cases will not exceed $10^6$.</p>

### 출력

<p>For each test case output one line containing one integer indicating the maximum number of crystalflies Paimon can catch.</p>

### 힌트

<p>For the first sample test case, follow the strategy below.</p>

<ul>
	<li>During the $0$-th second
	<ul>
		<li>Paimon arrives at vertex $1$;</li>
		<li>Paimon catches $1$ crystalfly;</li>
		<li>Crystalflies in vertices $2$ and $3$ are disturbed.</li>
	</ul>
	</li>
	<li>During the $1$-st second
	<ul>
		<li>Paimon arrives at vertex $3$;</li>
		<li>Paimon catches $100$ crystalflies.</li>
	</ul>
	</li>
	<li>During the $2$-nd second
	<ul>
		<li>Paimon arrives at vertex $1$;</li>
		<li>Crystalflies in vertex $2$ disappears.</li>
	</ul>
	</li>
	<li>During the $3$-rd second
	<ul>
		<li>Paimon arrives at vertex $2$;</li>
		<li>Crystalflies in vertices $4$ and $5$ are disturbed.</li>
	</ul>
	</li>
	<li>During the $4$-th second
	<ul>
		<li>Paimon arrives at vertex $5$;</li>
		<li>Paimon catches $10000$ crystalflies;</li>
		<li>Crystalflies in vertex $4$ disappears.</li>
	</ul>
	</li>
</ul>

<p>For the second sample test case, the optimal strategy is the same with the first sample test case. Crystalflies in vertex $2$ are scheduled to disappear at the end of the $3$-rd (instead of the $2$-nd) second, allowing Paimon to catch them.</p>