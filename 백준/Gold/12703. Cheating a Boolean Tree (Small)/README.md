# [Gold V] Cheating a Boolean Tree (Small) - 12703

[문제 링크](https://www.acmicpc.net/problem/12703)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 85, 정답: 60, 맞힌 사람: 55, 정답 비율: 74.324%

### 분류

구현, 다이나믹 프로그래밍, 그래프 이론, 트리, 백트래킹, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>For this problem we will consider a type of binary tree that we will call a boolean tree. In this tree, every row is completely filled, except possibly the last (deepest) row, and the nodes in the last row are as far to the left as possible. Additionally, every node in the tree will either have 0 or 2 children.&nbsp;</p>

<p>What makes a boolean tree special is that each node has a boolean value associated with it, 1 or 0. In addition, each interior node has either an &quot;AND&quot; or an &quot;OR&quot; gate associated with it. The value of an &quot;AND&quot; gate node is given by the logical AND of its two children&#39;s values. The value of an &quot;OR&quot; gate likewise is given by the logical OR of its two children&#39;s values. The value of all of the leaf nodes will be given as input so that the value of all nodes can be calculated up the tree.</p>

<p>The root of the tree is of particular interest to us. We would really like for the root to have the value&nbsp;<strong>V</strong>, either 1 or 0. Unfortunately, this may not be the value the root actually has. Luckily for us, we can cheat and change the type of gate for some of the nodes; we can change an AND gate to an OR gate or an OR gate to an AND gate.</p>

<p>Given a description of a boolean tree and what gates can be changed, find the minimum number of gates that need to be changed to make the value of the root node&nbsp;<strong>V</strong>. If this is impossible, output &quot;IMPOSSIBLE&quot; (quotes for clarity).</p>

### 입력

<p>The first line of the input file contains the number of cases,&nbsp;<strong>N</strong>.&nbsp;<strong>N</strong>&nbsp;test cases follow.</p>

<p>Each case begins with&nbsp;<strong>M</strong>&nbsp;and&nbsp;<strong>V</strong>.&nbsp;&nbsp;<strong>M</strong>&nbsp;represents the number of nodes in the tree and will be odd to ensure all nodes have 0 or 2 children.&nbsp;&nbsp;<strong>V</strong>&nbsp;is the desired value for the root node, 0 or 1.</p>

<p><strong>M</strong>&nbsp;lines follow describing each of the tree&#39;s nodes. The X<sup>th</sup>&nbsp;line will describe node X, starting with node 1 on the first line.</p>

<p>The first (<strong>M</strong>&minus;1)/2 lines describe the interior nodes. Each line contains&nbsp;<strong>G</strong>&nbsp;and&nbsp;<strong>C</strong>, each being either 0 or 1. If&nbsp;<strong>G</strong>&nbsp;is 1 then the gate for this node is an AND gate, otherwise it is an OR gate. If&nbsp;<strong>C</strong>&nbsp;is 1 then the gate for this node is changeable, otherwise it is not. Interior node X has nodes 2X and 2X+1 as children.</p>

<p>The next (<strong>M</strong>+1)/2 lines describe the leaf nodes. Each line contains one value&nbsp;<strong>I</strong>, 0 or 1, the value of the leaf node.</p>

<p>To help visualize, here is a picture of the tree in the first sample input.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12703.%E2%80%85Cheating%E2%80%85a%E2%80%85Boolean%E2%80%85Tree%E2%80%85(Small)/a9d56d33.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12703.%E2%80%85Cheating%E2%80%85a%E2%80%85Boolean%E2%80%85Tree%E2%80%85(Small)/a9d56d33.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12704/images-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:240px; width:422px" /></p>

<p>Limits</p>

<ul>
	<li>1 &lt;&nbsp;<strong>N</strong>&nbsp;&le; 20</li>
	<li>2 &lt;&nbsp;<strong>M</strong>&nbsp;&lt; 30</li>
</ul>

### 출력

<p>For each test case, you should output:</p>

<pre>
Case #<strong>X</strong>: <strong>Y</strong></pre>

<p>where&nbsp;<strong>X</strong>&nbsp;is the number of the test case and&nbsp;<strong>Y</strong>&nbsp;is the minimum number of gates that must be changed to make the output of the root node&nbsp;<strong>V</strong>, or &quot;IMPOSSIBLE&quot; (quotes for clarity) if this is impossible.</p>

### 힌트

<p>In case 1, we can change the gate on node 3 to an OR gate to achieve the desired result at the root.<br />
In case 2, only the root can be changed but changing it to an OR gate does not help.</p>