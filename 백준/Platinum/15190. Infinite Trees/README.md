# [Platinum II] Infinite Trees - 15190

[문제 링크](https://www.acmicpc.net/problem/15190)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 2, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

자료 구조, 그래프 이론, 애드 혹, 분리 집합, 재귀

### 문제 설명

<p>Type checking is the process of verifying that a computer program satisfies the typing rules of a programming language. In some languages this is very difficult, and just checking if two types are equal can be tricky!</p>

<p>For this problem, a type will be represented as a tree made up of nodes. Each node has zero or more child nodes, corresponding to component types. Here is an example of a tree:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15190.%E2%80%85Infinite%E2%80%85Trees/691b6a76.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15190.%E2%80%85Infinite%E2%80%85Trees/691b6a76.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15190/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:191px; width:143px" /></p>

<p>Figure 1: A simple finite tree. The root is node 0 and its children are nodes 1 and 2. Node 1 does not have any children, and node 2 has one child (node 3).</p>

<p>Types are allowed to be recursive. This means that a node can have any node as a child, including its parent and even itself. The result is an infinite tree:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15190.%E2%80%85Infinite%E2%80%85Trees/a229d256.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15190.%E2%80%85Infinite%E2%80%85Trees/a229d256.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15190/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:290px; width:176px" /></p>

<p>Figure 2: An infinite tree. Node 0 has node 2 as a child, which has node 0 as a child, which has node 2 as a child, and so on. The tree keeps going forever, and has been truncated to fit on this page.</p>

<p>Given two possibly infinite trees, your task is to determine whether or not they have the same structure. Two nodes A and B have the same structure if</p>

<ul>
	<li>They have the same number of children, and</li>
	<li>The i&#39;th child of node A has the same structure as the i&#39;th child of node B, for each child index i.</li>
</ul>

<p>Two trees have the same structure if their root nodes have the same structure.</p>

### 입력

<p>Input will consist of a sequence of problems. The first line for each problem will have two space-separated integers, N and M, the number of nodes in the two trees (1 &le; N, M &le; 100,000).</p>

<p>The following N lines will describe the first tree. The i&#39;th of these lines (counting from 0) will consist of a number of space-separated integers describing node i. The first integer will be c[i], the number of children that node i has (0 &le; c[i]; sum of c[i]&#39;s &le; 100,000). The rest of the line will contain c[i] space-separated integers, the children of node i. The following M lines will describe the second tree similarly. The root of each tree is always node 0.</p>

<p>Each problem will be followed by a blank line. End of input will be denoted by a line with two zeroes (which should not be processed).</p>

### 출력

<p>For each problem, output &quot;YES&quot; if the two trees have the same structure, or &quot;NO&quot; if they don&#39;t.</p>

### 힌트

<p>For the first problem, Figure 1 shows the first tree and the other tree is its mirror image. They have different structures, because the order of the children is significant.</p>

<p>Figure 2 shows the first tree in the second problem. The other tree is represented using more nodes but has the same structure.</p>