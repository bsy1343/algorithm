# [Platinum I] Placing Medals on a Binary Tree - 13405

[문제 링크](https://www.acmicpc.net/problem/13405)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 102, 정답: 49, 맞힌 사람: 45, 정답 비율: 50.562%

### 분류

비트마스킹, 자료 구조, 그리디 알고리즘, 해시를 사용한 집합과 맵, 수학, 정수론, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>You have drawn a chart of a perfect binary tree, like one shown in Figure G.1. The figure&nbsp;shows a finite tree, but, if needed, you can add more nodes beneath the leaves, making the tree&nbsp;arbitrarily deeper.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13405.%E2%80%85Placing%E2%80%85Medals%E2%80%85on%E2%80%85a%E2%80%85Binary%E2%80%85Tree/ccc58a3f.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13405/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-11%20%EC%98%A4%EC%A0%84%205.38.12.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:108px; width:257px" /></p>

<p>Figure G.1. A Perfect Binary Tree Chart</p>

<p>Tree nodes are associated with their depths, defined recursively. The root has the depth of zero,&nbsp;and the child nodes of a node of depth d have their depths d + 1.</p>

<p>You also have a pile of a certain number of medals, each engraved with some number. You want&nbsp;to know whether the medals can be placed on the tree chart satisfying the following conditions.</p>

<ul>
	<li>A medal engraved with d should be on a node of depth d.&nbsp;</li>
	<li>One tree node can accommodate at most one medal.&nbsp;</li>
	<li>The path to the root from a node with a medal should not pass through another node with a medal.</li>
</ul>

<p>You have to place medals satisfying the above conditions, one by one, starting from the top of&nbsp;the pile down to its bottom. If there exists no placement of a medal satisfying the conditions,&nbsp;you have to throw it away and simply proceed to the next medal.</p>

<p>You may have choices to place medals on different nodes. You want to find the best placement.&nbsp;When there are two or more placements satisfying the rule, one that places a medal upper in&nbsp;the pile is better. For example, when there are two placements of four medal, one that places&nbsp;only the top and the 2nd medal, and the other that places the top, the 3rd, and the 4th medal,&nbsp;the former is better.</p>

<p>In Sample Input 1, you have a pile of six medals engraved with 2, 3, 1, 1, 4, and 2 again&nbsp;respectively, from top to bottom.</p>

<ul>
	<li>The first medal engraved with 2 can be placed, as shown in Figure G.2 (A).</li>
	<li>Then the second medal engraved with 3 may be placed , as shown in Figure G.2 (B).</li>
	<li>The third medal engraved with 1 cannot be placed if the second medal were placed as&nbsp;stated above, because both of the two nodes of depth 1 are&nbsp;along the path to the root&nbsp;from nodes already with a medal. Replacing the second medal satisfying the placement&nbsp;conditions, however, enables a placement shown in Figure G.2 (C).</li>
	<li>The fourth medal, again engraved with 1, cannot be placed with any replacements of the&nbsp;three medals already placed satisfying the conditions. This medal is thus thrown away.</li>
	<li>The fifth medal engraved with 4 can be placed as shown in of Figure G.2 (D).</li>
	<li>The last medal engraved with 2 cannot be placed on any of the nodes with whatever&nbsp;replacements.</li>
</ul>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13405.%E2%80%85Placing%E2%80%85Medals%E2%80%85on%E2%80%85a%E2%80%85Binary%E2%80%85Tree/832ae80a.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13405/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-11%20%EC%98%A4%EC%A0%84%205.42.12.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:238px; width:531px" /></p>

<p>Figure G.2. Medal Placements</p>

### 입력

<p>The input consists of a single test case in the format below.</p>

<pre>
n
x<sub>1</sub>
.
.
.
x<sub>n</sub></pre>

<p>The first line has n, an integer representing the number of medals (1 &le; n &le; 5 &times; 10<sup>5</sup>). The following n lines represent the positive integers engraved on the medals. The i-th line of which has an integer x<sub>i</sub> (1 &le; x<sub>i</sub> &le; 10<sup>9</sup>) engraved on the i-th medal of the pile from the top.</p>

### 출력

<p>When the best placement is chosen, for each i from 1 through n, output Yes in a line if the i-th&nbsp;medal is placed; otherwise, output No in a line.</p>