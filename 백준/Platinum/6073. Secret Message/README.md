# [Platinum V] Secret Message - 6073

[문제 링크](https://www.acmicpc.net/problem/6073)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 281, 정답: 106, 맞힌 사람: 86, 정답 비율: 35.537%

### 분류

자료 구조, 트리, 트라이

### 문제 설명

<p>Bessie is leading the cows in an attempt to escape! To do this, the cows are sending secret binary messages to each other.</p>

<p>Ever the clever counterspy, Farmer John has intercepted the first b_i (1 &lt;= b_i &lt;= 10,000) bits of each of M (1 &lt;= M &lt;= 50,000) of these secret binary messages.</p>

<p>He has compiled a list of N (1 &lt;= N &lt;= 50,000) partial codewords that he thinks the cows are using. Sadly, he only knows the first c_j (1 &lt;= c_j &lt;= 10,000) bits of codeword j.</p>

<p>For each codeword j, he wants to know how many of the intercepted messages match that codeword (i.e., for codeword j, how many times does a message and the codeword have the same initial bits). &nbsp;Your job is to compute this number.</p>

<p>The total number of bits in the input (i.e., the sum of the b_i and the c_j) will not exceed 500,000.</p>

### 입력

<ul>
	<li>Line 1: Two integers: M and N</li>
	<li>Lines 2..M+1: Line i+1 describes intercepted code i with an integer b_i followed by b_i space-separated 0&#39;s and 1&#39;s</li>
	<li>Lines M+2..M+N+1: Line M+j+1 describes codeword j with an integer c_j followed by c_j space-separated 0&#39;s and 1&#39;s</li>
</ul>

### 출력

<ul>
	<li>Lines 1..N: Line j: The number of messages that the jth codeword could match.</li>
</ul>

### 힌트

<ul>
	<li>0 matches only 010: 1 match</li>
	<li>1 matches 1, 100, and 110: 3 matches</li>
	<li>01 matches only 010: 1 match</li>
	<li>01001 matches 010: 1 match</li>
	<li>11 matches 1 and 110: 2 matches</li>
</ul>