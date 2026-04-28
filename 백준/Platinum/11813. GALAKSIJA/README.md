# [Platinum I] GALAKSIJA - 11813

[문제 링크](https://www.acmicpc.net/problem/11813)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 153, 정답: 59, 맞힌 사람: 47, 정답 비율: 40.870%

### 분류

자료 구조, 트리, 해시를 사용한 집합과 맵, 분리 집합, 오프라인 쿼리, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>A long time ago in a galaxy far, far away, there were N planets. There were also N &minus; 1 interplanetary paths that connected all the planets (directly or indirectly). In other words, the network of planets and paths formed a tree. Additionally, each path was enumerated with an integer that denoted the curiosity of the path.</p>

<p>A pair of planets A, B is boring if the following holds:</p>

<ul>
	<li>A and B are different planets</li>
	<li>travelling between planet A and B is possible using one or more interplanetary paths</li>
	<li>binary XOR of the curiosity of all the paths in that travel is equal to 0</li>
</ul>

<p>Alas, the times have changed and an evil emperor is ruling the galaxy. He decided to use the Force to destroy all the interplanetary paths in a certain order. Determine the number of boring pairs of planets before the emperor started the destruction and after each destruction.</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 100 000).</p>

<p>Each of the following N &minus; 1 line contains three integers A<sub>i</sub>, B<sub>i</sub>, Z<sub>i</sub> (1 &le; A<sub>i</sub>, B<sub>i</sub> &le; N, 0 &le; Z<sub>i</sub> &le; 1 000 000 000) that denote that planets A<sub>i</sub> and B<sub>i</sub> are directly connected with a path of curiosity Z<sub>i</sub>.</p>

<p>The following line of input contains the permutation of the first N &minus; 1 integers that denote the order in which the emperor is destroying the paths. If the ith element of the permutation is j, then the emperor destroyed the path between planets A<sub>j</sub> and B<sub>j</sub> in the ith step.</p>

### 출력

<p>The output must contain N lines, the kth line containing the number of boring pairs A, B from the task after the emperor destroyed exactly k &minus; 1 paths.</p>

### 힌트

<p>Clarification of the first example: Before the destruction, the path between planets 1 and 2 is boring. After destruction, the path between them doesn&rsquo;t exist anymore.</p>

<p>Clarification of the second example: Before the destruction, pair of planets (1, 3) is boring. Travel between 1 and 3 is no longer possible after the first and after the second destruction, and none of the remaining pairs of planets is boring.</p>

<p>Clarification of the third example: Notice that in this example each pair of planets with a possible path between them is boring because all paths have the curiosity 0.</p>