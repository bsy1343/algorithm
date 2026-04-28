# [Platinum III] Cow Politics - 6043

[문제 링크](https://www.acmicpc.net/problem/6043)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 70, 정답: 36, 맞힌 사람: 26, 정답 비율: 50.000%

### 분류

트리, 집합과 맵, 최소 공통 조상

### 문제 설명

<p>Farmer John&#39;s cows are living on N (2 &lt;= N &lt;= 200,000) different pastures conveniently numbered 1..N. Exactly N-1 bidirectional cow paths (of unit length) connect these pastures in various ways, and each pasture is reachable from any other cow pasture by traversing one or more of these paths (thus, the pastures and paths form a graph called a tree).</p>

<p>The input for a particular set of pastures will specify the parent node P_i (0 &lt;= P_i &lt;= N) for each pasture. The root node will specify parent P_i == 0, which means it has no parent.</p>

<p>The cows have organized K (1 &lt;= K &lt;= N/2) different political parties conveniently numbered 1..K. Each cow identifies with a single political party; cow i identifies with political party A_i (1 &lt;= A_i &lt;= K). Each political party includes at least two cows.</p>

<p>The political parties are feuding and would like to know how much &#39;range&#39; each party covers. The range of a party is the largest distance between any two cows within that party (over cow paths).</p>

<p>For example, suppose political party 1 consists of cows 1, 3, and 6, political party 2 consists of cows 2, 4, and 5, and the pastures are connected as follows (party 1 members are marked as -n-):</p>

<pre>
  -3-
   |
  -1-
 / | \
2  4  5
      |
     -6-</pre>

<p>The greatest distance between any two pastures of political party 1 is 3 (between cows 3 and 6), and the greatest distance for political party 2 is 2 (between cows 2 and 4, between cows 4 and 5, and between cows 5 and 2).</p>

<p>Help the cows determine party ranges.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and K</li>
	<li>Lines 2..N+1: Line i+1 contains two space-separated integers: A_i and P_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..K: Line i contains a single integer that is the range of party i.</li>
</ul>

<p>&nbsp;</p>