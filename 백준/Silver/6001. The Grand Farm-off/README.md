# [Silver IV] The Grand Farm-off - 6001

[문제 링크](https://www.acmicpc.net/problem/6001)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 126, 정답: 71, 맞힌 사람: 47, 정답 비율: 47.959%

### 분류

수학, 정렬

### 문제 설명

<p>Farmer John owns 3*N (1 &lt;= N &lt;= 500,000) cows surprisingly numbered 0..3*N-1, each of which has some associated integer weight W_i (1 &lt;= W_i &lt;= d). He is entering the Grand Farm-off, a farming competition where he shows off his cows to the greater agricultural community.</p>

<p>This competition allows him to enter a group of N cows. He has given each of his cows a utility rating U_i (1 &lt;= U_i &lt;= h), which represents the usefulness he thinks that a particular cow will have in the competition, and he wants his selection of cows to have the maximal sum of utility.</p>

<p>There might be multiple sets of N cows that attain the maximum utility sum. FJ is afraid the competition may impose a total weight limit on the cows in the competition, so a secondary priority is to bring lighter weight competition cows.</p>

<p>Help FJ find a set of N cows with minimum possible total weight among the sets of N cows that maximize the utility, and print the remainder when this total weight is divided by M (10,000,000 &lt;= M &lt;= 1,000,000,000).</p>

<p>Note: to make the input phase faster, FJ has derived polynomials which will generate the weights and utility values for each cow. For each cow 0 &lt;= i &lt; 3*N,</p>

<pre>
       W_i = (a*i^5+b*i^2+c) mod d
 and   U_i = (e*i^5+f*i^3+g) mod h</pre>

<p>with reasonable ranges for the coefficients (0 &lt;= a &lt;= 1,000,000,000; 0 &lt;= b &lt;= 1,000,000,000; 0 &lt;= c &lt;= 1,000,000,000; 0 &lt;= e &lt;= 1,000,000,000; 0 &lt;= f &lt;= 1,000,000,000; 0 &lt;= g &lt;= 1,000,000,000; 10,000,000 &lt;= d &lt;= 1,000,000,000; 10,000,000 &lt;= h &lt;= 1,000,000,000).</p>

<p>The formulae do sometimes generate duplicate numbers; your algorithm should handle this properly.</p>

### 입력

<ul>
	<li>Line 1: Ten space-separated integers: N, a, b, c, d, e, f, g, h, and M</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer representing the lowest sum of the weights of the N cows with the highest net utility.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>The functions generate weights of 5, 6, 9, 14, 21, and 30 along with utilities of 0, 1, 8, 27, 64, and 125.</p>

<p>The two cows with the highest utility are cow 5 and 6, and their combined weight is 21+30=51.</p>