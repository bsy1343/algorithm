# [Platinum I] Christmas Tree - 18670

[문제 링크](https://www.acmicpc.net/problem/18670)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 7, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

자료 구조, 오일러 경로 테크닉, 최소 공통 조상, 세그먼트 트리, 트리

### 문제 설명

<p>Christmas time is almost here! Families are getting ready for this by buying decorated evergreen trees. The christmas tree contains n nodes numbered from 0 to n &minus; 1 and rooted at node 0. Alice and Bob are playing around with the new tree and they will play a game using the tree in order to kill their boredom. Alice will carry a coloring marker and Bob will call out two types of instructions:</p>

<ul>
	<li>+x, this means that Alice will color the node numbered x.</li>
	<li>-x, this means that Alice will clear the color on the node numbered x.</li>
</ul>

<p>After each of these instructions, Alice should call out the lowest common ancestor (see note for definition) of all the colored nodes so far. Can you help Alice to reply to Bob&rsquo;s queries as fast as possible?</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T, the number of test cases (1 &le; T &le; 100). Followed by T test cases. The first line of each test cases will contain one integer N, the number of nodes in the tree (1 &le; N &le; 10<sup>5</sup>). The following N &minus; 1 lines will each contain a pair of integers x and y separated by a single space (0 &le; x, y &le; N &minus; 1) which means that node x is connected to node y. It&rsquo;s guaranteed that the given edges will form a tree. The following line will contain one integer Q, the number of instructions Bob will say (1 &le; Q &le; 4 &times; 10<sup>5</sup>). The following Q lines will each contain an instruction that Bob called out in the format of q<sub>i</sub> a<sub>i</sub> where q<sub>i</sub> &isin; {+, -} and (0 &le; a<sub>i</sub> &le; N &minus; 1).</p>

<p>It&rsquo;s guaranteed that the clear instruction will only be applied on a colored node and the color instruction on an uncolored node.</p>

### 출력

<p>For each test instruction that Bob calls out, print a single line containing an integer corresponding to Alice&rsquo;s response to what is the lowest common ancestor of all the colored nodes or &lsquo;-1&rsquo; if there are no colored nodes.</p>

### 힌트

<p>In graph theory and computer science, the lowest common ancestor (LCA) of two nodes v and w in a tree or directed acyclic graph (DAG) is the lowest (i.e. furthest from the root) node that has both v and w as descendants, where we define each node to be a descendant of itself.</p>