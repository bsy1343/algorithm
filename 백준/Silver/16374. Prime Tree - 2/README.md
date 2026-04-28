# [Silver I] Prime Tree - 2 - 16374

[문제 링크](https://www.acmicpc.net/problem/16374)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 117, 정답: 90, 맞힌 사람: 67, 정답 비율: 67.677%

### 분류

해 구성하기, 백트래킹

### 문제 설명

<p>A tree is a connected undirected graph that has no cycles. Consider a tree with n vertices, labeled with integers 1, 2, ..., n. Let&rsquo;s call an edge (u, v) bad if there is an integer d &gt; 1 such that the label of u and the label of v are both divisible by d. For example, in the tree below there are three bad edges: (6, 4) are both divisible by 2, (2, 6) are both divisible by 2, and (3, 6) are both divisible by 3:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/16374.%E2%80%85Prime%E2%80%85Tree%E2%80%85-%E2%80%852/872aceea.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/16374.%E2%80%85Prime%E2%80%85Tree%E2%80%85-%E2%80%852/872aceea.png" data-original-src="https://upload.acmicpc.net/7fe97d76-cb4f-4744-ace0-bfad8c943d02/-/crop/462x218/0,28/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 231px; height: 109px;" /></p>

<p>Your goal is to relabel vertices in such a way that the number of bad edges is as small as possible. For example, if you relabel vertices of the tree shown above in the following way, there will be only one bad edge (3, 6):</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/16374.%E2%80%85Prime%E2%80%85Tree%E2%80%85-%E2%80%852/c5a5df0c.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/16374.%E2%80%85Prime%E2%80%85Tree%E2%80%85-%E2%80%852/c5a5df0c.png" data-original-src="https://upload.acmicpc.net/923e1db4-dc45-4820-8d10-3370b4b850ad/-/crop/453x210/9,8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 227px; height: 105px;" /></p>

<p>The less bad edges your tree will have the more points you will get.</p>

<p>This is an output-only problem. You need to run your program locally and only submit the answer file for each input file.</p>

### 입력

<p>Each input file contains several test cases.</p>

<p>The first line of the input file contains the number of test cases in this input file.</p>

<p>The first line of test case description contains a single integer n, the number of the vertices in the tree.</p>

<p>Each of the following n &minus; 1 lines contains two integers u and v (1 &le; u, v &le; n), vertices connected by the edge.</p>

<p>All trees in a single file have the same number of vertices.</p>

### 출력

<p>For each test case print one line containing exactly n different integers from 1 to n &mdash; labels assigned to vertices 1, 2, . . . , n.</p>

### 힌트

<p>First test case is shown in the problem statement above. There is one bad edge (6, 3) after relabeling, because both 6 and 3 are divisible by 3.</p>

<p>In the second test case there will be edges (5, 1), (5, 2), (5, 3), (5, 4) and (5, 6). None of them are bad.</p>

<p>There are 10 edges in the input file and 1 bad edge in the answer. Thus, M = 10, X = 1, R = 0.1. According to the scoring table, this answer would get 5 points.</p>

<p>Tests have the following structure:</p>

<ul>
	<li>Input file 1 contains three trees on 7 vertices, depicted below from the left to the right:</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/16374.%E2%80%85Prime%E2%80%85Tree%E2%80%85-%E2%80%852/bf329b19.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/16374.%E2%80%85Prime%E2%80%85Tree%E2%80%85-%E2%80%852/bf329b19.png" data-original-src="https://upload.acmicpc.net/913408b7-5903-426f-bd5a-55fa40592d87/-/crop/1058x334/19,16/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 529px; height: 167px;" /></p>

<ul>
	<li>Input files 2 and 3 contain 100 random trees on 10 and 30 vertices respectively.</li>
	<li>Input files 4 to 8 contain various randomly generated trees with some special structure (e.g. trees with many leaves, binary trees etc). Distribution of different kinds of trees is roughly the same for<br />
	all inputs.</li>
	<li>Input files 9 and 10 contain randomly generated trees of 50 000 and 100 000 vertices respectively.</li>
</ul>

<p>Initially, label of vertices of all trees in all input files are random.</p>

<p><a href="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/data/16373-16382.tar.gz">압축 파일</a>의 <code>data-2.in</code>으로 채점한다.</p>