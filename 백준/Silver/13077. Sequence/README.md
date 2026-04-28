# [Silver I] Sequence - 13077

[문제 링크](https://www.acmicpc.net/problem/13077)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 127, 정답: 105, 맞힌 사람: 79, 정답 비율: 86.813%

### 분류

수학, 트리

### 문제 설명

<p>We inductively label the nodes of a rooted binary tree with an infinite number of nodes as follows:</p>

<ul>
	<li>The root is labeled by 1/1,</li>
	<li>If the label of a node is p/q, then
	<ul>
		<li>The label of its left child is p/(p+q), and</li>
		<li>The label of its right child is (p+q)/q.&nbsp;</li>
	</ul>
	</li>
</ul>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/13077.%E2%80%85Sequence/95bd6880.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/13077.%E2%80%85Sequence/95bd6880.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13077/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-10%20%EC%98%A4%ED%9B%84%206.39.14.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:232px; width:315px" /></p>

<p>By having this tree in our hand, we define a rational sequence a<sub>1</sub>, a<sub>2</sub>, a<sub>3</sub>, &hellip; by a breadth first traversal of the tree in such a way that nodes in the same level are visited from left to right. Therefore, we have a<sub>1 </sub>= 1/1, a<sub>2</sub> = 1/2, a<sub>3</sub> = 2/1, a<sub>4</sub> = 1/3, a<sub>5</sub> = 3/2, &hellip;</p>

<p>You are to write a program that gets values p and q and computes an integer n for which a<sub>n</sub> = p/q.</p>

### 입력

<p>The first line of the input includes the number of test cases, 1 &le;&nbsp;t &le; 1000. Each test case consists of one line. This line&nbsp;contains p, followed by / and then q without any&nbsp;space between them.</p>

### 출력

<p>For each test case, output in one line an integer n for which a<sub>n</sub> = p/q. It is guaranteed that in all test cases n fits in a 32-bit integer.</p>