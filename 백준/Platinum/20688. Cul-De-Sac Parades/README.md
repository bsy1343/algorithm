# [Platinum II] Cul-De-Sac Parades - 20688

[문제 링크](https://www.acmicpc.net/problem/20688)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 38, 맞힌 사람: 33, 정답 비율: 70.213%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Treantis is a wonderful town with N junctions (numbered from 1 to N) that are connected by exactly N &minus; 1 roads such that one can go from one junction to any other junction using a sequence of roads. Such a special structure causes Treantis to have some junctions in which each of them is only connected to exactly one other junction; such a junction is known as a cul-de-sac (or a dead-end junction) in Treantis.</p>

<p>To live up the town, the mayor of Treantis decides to carry out a festival in Treantis with glamorous parades. Due to some superstition in Treantis, there are two constraints that should be fulfilled when designing the routes for the parades.</p>

<ol>
	<li>Each parade should march starting from a cul-de-sac, ending at another cul-de-sac, and never passing the same road more than once.</li>
	<li>Any two parades should not share a common road on their paths; on the other hand, sharing the same junction is not an issue.</li>
</ol>

<p>The mayor has estimated that if a parade passes a road connecting junction u<sub>i</sub> and junction v<sub>i</sub>, then the citizen happiness will be increased by w<sub>i</sub>.</p>

<p>Your task in this problem is to help the mayor to calculate the maximum happiness that can be obtained by carefully designing the parades while satisfying the two constraints mentioned above.</p>

<p>For example, let N = 10 and the town structure is as shown in the following figure.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20688.%E2%80%85Cul-De-Sac%E2%80%85Parades/339f8c05.png" data-original-src="https://upload.acmicpc.net/8f5a190d-1be4-4750-ac54-cdba84df4d32/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 450px; height: 188px;" /></p>

<p>As we can see, there are 7 cul-de-sacs and their numbers are {1, 2, 3, 4, 8, 9, 10}. In this example, the maximum happiness can be obtained by running 3 parades of the following routes.</p>

<ul>
	<li>1 &rarr; 5 &rarr; 8 with a happiness of 10 + 30 = 40.</li>
	<li>2 &rarr; 5 &rarr; 6 &rarr; 9 with a happiness of 20 + 50 + 20 = 90.</li>
	<li>4 &rarr; 7 &rarr; 10 with a happiness of 40 + 40 = 80.</li>
</ul>

<p>Observe that all those parades start and end at a cul-de-sac and no two parades share the same road. The total happiness of those parades is 40 + 90 + 80 = 210. There are no parades that yield a happiness of more than 210 in this example.</p>

### 입력

<p>Input begins with a line containing an integer: N (2 &le; N &le; 100 000) representing the number of junctions in Treantis. The next N &minus; 1 lines each contains three integers: u<sub>i</sub> v<sub>i</sub> w<sub>i</sub> (1 &le; u<sub>i</sub> &lt; v<sub>i</sub> &le; N; 1 &le; w<sub>i</sub> &le; 10<sup>6</sup>) representing a road and its increment in happiness if this road is passed by a parade, respectively. It is guaranteed that one can go from one junction to any other junction using a sequence of roads.</p>

### 출력

<p>Output in a line an integer representing the maximum happiness that can be obtained by carefully designing the parades while satisfying all the constraints.</p>