# [Gold II] Gardening - 33235

[문제 링크](https://www.acmicpc.net/problem/33235)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 9, 정답: 6, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

스택, 자료 구조

### 문제 설명

<p>In preparation for the Fashionable Park Competition (FPC), you have set out to prune all the trees of your town's park into fashionable shapes. With so much work to do, you decide that you might as well make a fun game out of it. You take a tree that looks particularly odd, label all the branches, and start chopping off branches according to the following rules:</p>

<ul>
	<li>Only a leaf can be chopped off the tree.</li>
	<li>When choosing between multiple leaves to chop, start with the leftmost one.</li>
</ul>

<p>The tree can be codified as a string. Each node has a non-unique label on it (a lowercase letter) and a list of children. The children of the node are given as a list of labels between '<code>(</code>' and '<code>)</code>' and separated by '<code>,</code>'. Note that a leaf (a node with no children) is not followed by a list of labels.</p>

<p>The tree in Figure G.1 shows a visualisation of the codified tree of the first sample input. For this tree, the leaf with label '<code>b</code>' should be chopped first, followed by '<code>d</code>', '<code>e</code>', and '<code>f</code>'. Node '<code>c</code>' is now a leaf, so it should be chopped next. Finally, '<code>a</code>' can be chopped as well.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33235.%E2%80%85Gardening/209f9bd4.png" data-original-src="https://boja.mercury.kr/assets/problem/33235-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 180px; height: 150px;"></p>

<p style="text-align: center;">Figure G.1: A visualisation of the first sample input.</p>

<p>Given the codification of a tree, parse it and compute the order in which the nodes should be chopped off the tree, if you would chop them off all the way to the root.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line with a single string $s$ ($1\leq |s|\leq 10^5$), the tree codification.</li>
</ul>

<p>The string $s$ contains no spaces, and you can assume that it is a correct codification for some tree.</p>

### 출력

<p>A string consisting of the nodes' labels, printed in the order in which they should be chopped.</p>