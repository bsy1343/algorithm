# [Gold II] Tree Count - 13386

[문제 링크](https://www.acmicpc.net/problem/13386)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 19, 맞힌 사람: 15, 정답 비율: 27.273%

### 분류

자료 구조, 트리, 집합과 맵, 해시를 사용한 집합과 맵, 트리 동형 사상

### 문제 설명

<p>A tree T = (V, E), where V = {v<sub>1</sub>, v<sub>2</sub>,..., v<sub>n</sub>} is a set of vertices and E = {e<sub>1</sub>, e<sub>2</sub>,..., e<sub>n-1</sub>} is a set of edges, is a connected graph with no cycle. A labeled tree T = (V, E) is a tree, where each of its vertices has an associated unique number. More precisely, there is a one-to-one function mT : V &rarr; {..., -2, -1, 0, 1, 2,...}.</p>

<p>Let d<sub>T</sub>(u,v) = m<sub>T</sub>(u) - m<sub>T</sub>(v), where u, v &isin; V. Two labeled trees T<sub>1</sub> = (V<sub>1</sub>, E<sub>1</sub>) and T<sub>2</sub> = (V<sub>2</sub>, E<sub>2</sub>) are similar if and only if</p>

<ol>
	<li>|V<sub>1|</sub> = |V<sub>2</sub>|, and</li>
	<li>There is a bijection such that (u,v) &isin;&nbsp;E<sub>1</sub> if and only if (f(u),f(v)) &isin; E<sub>2</sub>. In other words, the trees are isomorphic.</li>
	<li>Moreover, d<sub>T1</sub>(u,v)=d<sub>T2</sub>(f(u),f(v))for every(u,v) &isin; E<sub>1</sub>.</li>
</ol>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13386.%E2%80%85Tree%E2%80%85Count/0ccb3683.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13386/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-10-11%20%EC%98%A4%ED%9B%84%205.19.13.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:294px; width:540px" /><br />
Figure 1: Trees T<sub>1</sub> and T<sub>2</sub> are similar.</p>

<p>In Figure 1, trees T<sub>1 </sub>and T<sub>2</sub> are similar according to the definition. The bijection is as drawn in the figure. Furthermore, it can be verified, for instance, that (v<sub>1</sub>,v<sub>2</sub>)= 1 - 9 = -8 = 9 - 17 = (v<sub>4</sub>, v<sub>5</sub>) and (v<sub>2</sub>, v<sub>4</sub>) = 9 - 6 = 3 = 17 - 14 = (v<sub>5</sub>, v<sub>1</sub>). Also, (v<sub>2</sub>, v<sub>3</sub>) = 9 - 7 = 2 = 17 - 15 = (v<sub>5</sub>, v<sub>3</sub>).</p>

<p>Given d labeled trees, your job is to count similar trees.</p>

### 입력

<p>The first line of the input file contains the number of labeled trees d &le; 100. 2 &le; n &le; 70,000. The following lines describe each tree and its labels. Each tree uses two lines to describe. The first line gives all edges of the tree. Tree nodes are numbered 1, 2, 3, ..., n. The second line gives the n labels of the tree in the order of vertices v<sub>1</sub>, v<sub>2</sub>, v<sub>3</sub>, v<sub>4</sub>,..., v<sub>n</sub>. -100,000&lt; m(v<sub>i</sub>)&lt; 100,000</p>

### 출력

<p>There is only one line in the output file. This line contains the numbers of similar trees in the increasing order. Note that the sum of all numbers in this line is d.</p>

<p>&nbsp;</p>

### 힌트

<p>Explanation of Sample Output: The first two 1s indicate that there are 2 trees that are not similar to any other trees. The next number (2) indicates that there are two trees that are similar to each other. Finally, the number 3 indicates that there are three trees that are similar to each other. Notice that the counts of similar trees are listed in increasing order and they sum to 7, which is the total of number given trees.</p>