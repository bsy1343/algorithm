# [Gold IV] Trees - 8110

[문제 링크](https://www.acmicpc.net/problem/8110)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 59, 정답: 26, 맞힌 사람: 21, 정답 비율: 45.652%

### 분류

구현, 그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색

### 문제 설명

<p>Trees occur very often in computer science. As opposed to trees in nature, computer science trees &quot;grow upside down&quot;; the root is up and the leaves are down.</p>

<p>A tree consists of elements named nodes. A root is one of the nodes. Each node w&nbsp;(except for the root) has its (exactly one) father v. If the node v&nbsp;is the father of w, then w&nbsp;is a son of v. Nodes that have no sons are called leaves. Sons of the node w, their sons, sons of their sons, and so on, are called descendants of the node w. Every node - except for the root - is a descendant of the root.</p>

<p>Each node has a level number assigned to it. The level number of the root is 0, and the level number of sons is greater by 1&nbsp;then that of their father.</p>

<p>A tree is a complete binary tree if and only if each node has exactly two or zero sons. In binary trees sons are named left and right.</p>

<p>The following picture shows an example of a complete binary tree. The nodes of that tree are numbered in a special order called preorder. In this order the root has the number&nbsp;1, a father precedes its sons, and the left son and any its descendant have smaller numbers than the right son and every its descendant.</p>

<p style="text-align: center;"><br />
<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8110.%E2%80%85Trees/2a88d7c9.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8110/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 285px; height: 258px;" /></p>

<p>There are many written representations of complete binary trees having such numbering of nodes. Three ones follow.</p>

<p><b>Genealogical representation.</b><br />
It is a sequence of numbers. The first element of the sequence equals 0&nbsp;(zero), and for j &gt; 1, the j-th element of the sequence is the number of the father of the node j.</p>

<p><b>Bracket representation.</b><br />
Each node corresponds to a string composed of brackets. Leaves correspond to (). Each other node w&nbsp;corresponds to a string (lr), where l&nbsp;and r&nbsp;denote the strings that left and right sons of w&nbsp;respectively correspond to. The string the root corresponds to is the bracket representation of the tree.</p>

<p><b>Level representation.</b><br />
It is a sequence of level numbers of successive tree leaves (according to the assumed numbering).</p>

<p>The tree in the picture may be described as follows:</p>

<table class="table table-bordered" style="width: 40%;">
	<tbody>
		<tr>
			<td>Genealogical representation</td>
			<td><code>0 1 2 2 4 4 1 7 7</code></td>
		</tr>
		<tr>
			<td>Bracket representation</td>
			<td><code>((()(()()))(()()))</code></td>
		</tr>
		<tr>
			<td>Level representation</td>
			<td><code>2 3 3 2 2</code></td>
		</tr>
	</tbody>
</table>

<p>Write a program that reads from the standard input a sequence of numbers and examines whether it is the level representation of a complete binary tree. If not, the program writes one word&nbsp;<code>NIE</code>&nbsp;(&quot;no&quot;) in the standard output. If so, the program finds two other representations of this tree (genealogical and bracket ones), and writes them in the standard output.</p>

### 입력

<p>In the first line of the standard input there is a positive number of the sequence elements (not greater than 2500). In the second line there are successive elements of the sequence separated by single spaces.</p>

<p>The numbers in the standard input are written correctly. Your program need not verify that.</p>

### 출력

<p>The standard output should contain:</p>

<ul>
	<li>either only one word&nbsp;<code>NIE</code>,</li>
	<li>or in the first line - the consecutive elements of the genealogical representation, separated by single spaces; in the second line - the bracket representation, i.e. a sequence of left and right brackets with no spaces between them.</li>
</ul>