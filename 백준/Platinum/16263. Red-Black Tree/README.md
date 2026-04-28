# [Platinum II] Red-Black Tree - 16263

[문제 링크](https://www.acmicpc.net/problem/16263)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>Did you now that most standard libraries use red-black tree to implement &quot;set&quot; data structure? In this problem you have to find the number of ways to color the vertices of the given binary tree so that it became red-black. Print the answer modulo 10<sup>9</sup>&thinsp;+&thinsp;7.</p>

<p>Consider a binary tree. If the vertex has less than two children, add fake vertices to the potential places of the missing children. The tree is called a red-black tree if the following constraints are satisfied:</p>

<ol>
	<li>Each vertex is colored one of the two colors: red or black.</li>
	<li>The root of the tree and added fake vertices are colored black.</li>
	<li>The parent of a red vertex is black.</li>
	<li>All paths the root to fake leafs contain the same number of black vertices.</li>
</ol>

<p>Note that the parent of a black vertex can be black itself.</p>

<p>Two ways to color the tree are different if there is a vertex that has different colors.</p>

<p>The picture shows two ways to color the tree from the second test case.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16263.%E2%80%85Red-Black%E2%80%85Tree/451bb312.png" data-original-src="https://upload.acmicpc.net/de78fa10-3f1b-42c9-80d8-e4b0d8422558/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 417px; height: 141px;" /></p>

### 입력

<p>The first line contains one integer n &mdash; the number of vertices in a tree (1&thinsp;&le;&thinsp;n&thinsp;&le;&thinsp;500&thinsp;000).</p>

<p>The following n lines describe a tree. The i-th of these lines contains two integers l<sub>i</sub> and r<sub>i</sub> &mdash; the indices of the left and the right child of the i-th vertex, or 0 if the corresponding child is missing (l<sub>i</sub>&thinsp;=&thinsp;0 or i&thinsp;&lt;&thinsp;l<sub>i</sub>&thinsp;&le;&thinsp;n; r<sub>i</sub>&thinsp;=&thinsp;0 or i&thinsp;&lt;&thinsp;r<sub>i</sub>&thinsp;&le;&thinsp;n). The root of the tree has number 1. Input describes the correct tree.</p>

### 출력

<p>Output one integer &mdash; the number of ways to color the given tree so that it was a correct red-black tree. The answer must be printed modulo 10<sup>9</sup>&thinsp;+&thinsp;7.</p>