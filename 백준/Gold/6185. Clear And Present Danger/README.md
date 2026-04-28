# [Gold V] Clear And Present Danger - 6185

[문제 링크](https://www.acmicpc.net/problem/6185)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 146, 정답: 116, 맞힌 사람: 103, 정답 비율: 78.626%

### 분류

그래프 이론, 최단 경로, 플로이드–워셜

### 문제 설명

<p>Farmer John is on a boat seeking fabled treasure on one of the N (1 &lt;= N &lt;= 100) islands conveniently labeled 1..N in the Cowribbean Sea.</p>

<p>The treasure map tells him that he must travel through a certain sequence A_1, A_2, ..., A_M of M (2 &lt;= M &lt;= 10,000) islands, starting on island 1 and ending on island N before the treasure will appear to him. He can visit these and other islands out of order and even more than once, but his trip must include the A_i sequence in the order specified by the map.</p>

<p>FJ wants to avoid pirates and knows the pirate-danger rating (0 &lt;= danger &lt;= 100,000) between each pair of islands. The total danger rating of his mission is the sum of the danger ratings of all the paths he traverses.</p>

<p>Help Farmer John find the least dangerous route to the treasure that satisfies the treasure map&#39;s requirement.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and M</li>
	<li>Lines 2..M+1: Line i+1 describes the i_th island FJ must visit with a single integer: A_i</li>
	<li>Lines M+2..N+M+1: Line i+M+1 contains N space-separated integers that are the respective danger rating of the path between island i and islands 1, 2, ..., and N, respectively. The ith integer is always zero.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: The minimum danger that Farmer John can encounter while obtaining the treasure.</li>
</ul>

### 힌트

<p>There are 3 islands and the treasure map requires Farmer John to visit a sequence of 4 islands in order: island 1, island 2, island 1 again, and finally island 3. The danger ratings of the paths are given: the paths (1, 2); (2, 3); (3, 1) and the reverse paths have danger ratings of 5, 2, and 1, respectively.</p>

<p>He can get the treasure with a total danger of 7 by traveling in the sequence of islands 1, 3, 2, 3, 1, and 3. The cow map&#39;s requirement (1, 2, 1, and 3) is satisfied by this route. We avoid the path between islands 1 and 2 because it has a large danger rating.</p>