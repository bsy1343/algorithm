# [Platinum IV] Gourmet Grazers - 6142

[문제 링크](https://www.acmicpc.net/problem/6142)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 273, 정답: 169, 맞힌 사람: 117, 정답 비율: 62.903%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 이분 탐색, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Like so many others, the cows have developed very haughty tastes and will no longer graze on just any grass. Instead, Farmer John must purchase gourmet organic grass at the Green Grass Grocers store for each of his N (1 &lt;= N &lt;= 100,000) cows.</p>

<p>Each cow_i demands grass of price at least A_i (1 &lt;= A_i &lt;= 1,000,000,000) and with a greenness score at least B_i (1 &lt;= B_i &lt;= 1,000,000,000). The GGG store has M (1 &lt;= M &lt;= 100,000) different types of grass available, each with a price C_i (1 &lt;= C_i &lt;= 1,000,000,000) and a greenness score of D_i (1 &lt;= D_i &lt;= 1,000,000,000). Of course, no cow would sacrifice her individuality, so no two cows can have the same kind of grass.</p>

<p>Help Farmer John satisfy the cows&#39; expensive gourmet tastes while spending as little money as is necessary.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and M.</li>
	<li>Lines 2..N+1: Line i+1 contains two space-separated integers: A_i and B_i</li>
	<li>Lines N+2..N+M+1: Line i+N+1 contains two space-separated integers: C_i and D_i</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer which is the minimum cost to satisfy all the cows. If that is not possible, output -1.</li>
</ul>

### 힌트

<p>Cow 1 eats grass 2 at cost 2, cow 2 eats grass 3 at cost 4, cow 3 eats grass 6 at cost 2, and cow 4 eats grass 7 at cost 4, for a total cost of 12.</p>