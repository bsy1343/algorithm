# [Platinum II] The Fewest Coins - 6205

[문제 링크](https://www.acmicpc.net/problem/6205)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 168, 정답: 45, 맞힌 사람: 34, 정답 비율: 30.088%

### 분류

배낭 문제

### 문제 설명

<p>Farmer John has gone to town to buy some farm supplies. Being a very efficient man, he always pays for his goods in such a way that the smallest number of coins changes hands, i.e., the number of coins he uses to pay plus the number of coins he receives in change is minimized. Help him to determine what this minimum number is.</p>

<p>FJ wants to buy T (1 &lt;= T &lt;= 10,000) cents of supplies. &nbsp;The currency system has N (1 &lt;= N &lt;= 100) different coins, with values V1, V2, ..., VN (1 &lt;= Vi &lt;= 120). Farmer John is carrying C1 coins of value V1, C2 coins of value V2, ...., and CN coins of value VN (0 &lt;= Ci &lt;= 10,000). The shopkeeper has an unlimited supply of all the coins, and always makes change in the most efficient manner (although Farmer John must be sure to pay in a way that makes it possible to make the correct change).</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and T.</li>
	<li>Line 2: N space-separated integers, respectively V1, V2, ..., VN coins (V1...VN).</li>
	<li>Line 3: N space-separated integers, respectively C1, C2, ..., CN</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A line containing a single integer, the minimum number of coins involved in a payment and change-making. If it is impossible for Farmer John to pay and receive exact change, output -1.</li>
</ul>

### 힌트

<p>Farmer John pays 75 cents using a 50 cents and a 25 cents coin, and receives a 5 cents coin in change, for a total of 3 coins used in the transaction.</p>