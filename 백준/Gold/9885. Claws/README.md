# [Gold IV] Claws - 9885

[문제 링크](https://www.acmicpc.net/problem/9885)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 51, 맞힌 사람: 38, 정답 비율: 76.000%

### 분류

그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색

### 문제 설명

<p>Consider a heavy machinery in the form of a binary tree (i.e., every non-leaf node has <em>at most two</em> child nodes) as shown in Figure 1. The edges of the tree are metal bars, which are connected by hinges, denoted by nodes (labelled &lsquo;1&rsquo; through &lsquo;5&rsquo;) in the tree. The leaf nodes of the tree in Figure 1(a) are essentially the claws used by the heavy machinery to perform heavy-duty tasks. The claws are also connected to metal bars by hinges.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9885.%E2%80%85Claws/24aab3f6.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9885.%E2%80%85Claws/24aab3f6.png" data-original-src="https://upload.acmicpc.net/327655e7-bd87-4db1-9961-7bc761455f87/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 363px; height: 214px;" /></p>

<p style="text-align: center;">Figure 1: (a) A tree and (b) the corresponding tree of claws.</p>

<p>As the machinery is load-bearing, the hinges used to connect metal bars must be of the correct <em>grade</em>. For a particular node, say v, in the tree, the grade of the hinge used at that node is determined by the sum of (i) the total weight of the metal bars in the subtree rooted at v and (ii) the total weight of the metal bars from v to the tree root.</p>

<p>The weights of the metal bars are shown beside the corresponding edges in Figure 1. The claws and hinges used in the machinery are made of superlight materials that they can be considered weightless. Hence, the grades of the hinges used at leaf nodes &lsquo;1&rsquo;, &lsquo;2&rsquo;, and &lsquo;3&rsquo; in Figure 1 to connect the claws to metal bars are 50, 30, and 50, respectively. The grade of the hinge used at node &lsquo;4&rsquo; is 60, and the grade of the hinge used at the root node, &lsquo;5&rsquo;, is 110.</p>

<p>The <em>unladen load</em> of a claw is the sum of the grades of the hinges along the path from the claw to the root node. The unladen loads of the claws in this example are 220 (at &lsquo;1&rsquo;), 200 (at &lsquo;2&rsquo;), and 160 (at &lsquo;3&rsquo;). In this task, you have to output the maximum unladen load among all the claws of a given heavy machinery.</p>

### 입력

<p>Let n (1 &le; n &le; 12000) be the total number of nodes in the given binary tree. The input contains n lines. The first line contains the integer n. Each of the next (n &minus; 1) lines contains three integers separated by spaces:</p>

<ul>
	<li><code>thisnode</code>, which specifies the node number of the current node.</li>
	<li><code>parnode</code>, which specifies the node number of the parent of the current node.</li>
	<li><code>weight</code>, which specifies the weight, a positive integer &le; 100, of the metal bar connecting the current node and its parent node.</li>
</ul>

<p>The nodes are labelled 1 through n. The root node is the node without a parent.</p>

### 출력

<p>The output file contains an integer, which is the maximum unladen load among all the claws of a given heavy machinery.</p>