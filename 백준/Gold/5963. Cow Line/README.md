# [Gold V] Cow Line - 5963

[문제 링크](https://www.acmicpc.net/problem/5963)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 109, 정답: 71, 맞힌 사람: 63, 정답 비율: 70.000%

### 분류

수학, 조합론

### 문제 설명

<p>The N (1 &lt;= N &lt;= 20) cows conveniently numbered 1...N are playing yet another one of their crazy games with Farmer John. The cows will arrange themselves in a line and ask Farmer John what their line number is. In return, Farmer John can give them a line number and the cows must rearrange themselves into that line.</p>

<p>A line number is assigned by numbering all the permutations of the line in lexicographic order.</p>

<p>Consider this example:</p>

<pre>
Farmer John has 5 cows and gives them the line number of 3.
The permutations of the line in ascending lexicographic order:
1st: 1 2 3 4 5
2nd: 1 2 3 5 4
3rd: 1 2 4 3 5
Therefore, the cows will line themselves in the cow line 1 2 4 3 5.</pre>

<p>The cows, in return, line themselves in the configuration &quot;1 2 5 3 4&quot; and ask Farmer John what their line number is.</p>

<p>Continuing with the list:</p>

<pre>
4th : 1 2 4 5 3
5th : 1 2 5 3 4
Farmer John can see the answer here is 5</pre>

<p>Farmer John and the cows would like your help to play their game. They have K (1 &lt;= K &lt;= 10,000) queries that they need help with. Query i has two parts: C_i will be the command, which is either &#39;P&#39; or &#39;Q&#39;.</p>

<p>If C_i is &#39;P&#39;, then the second part of the query will be one integer A_i (1 &lt;= A_i &lt;= N!), which is a line number. This is Farmer John challenging the cows to line up in the correct cow line.</p>

<p>If C_i is &#39;Q&#39;, then the second part of the query will be N distinct integers B_ij (1 &lt;= B_ij &lt;= N). This will denote a cow line. These are the cows challenging Farmer John to find their line number.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and K</li>
	<li>Lines 2..2*K+1: Line 2*i and 2*i+1 will contain a single query.</li>
	<li>Line 2*i will contain just one character: &#39;Q&#39; if the cows are lining up and asking Farmer John for their line number or &#39;P&#39; if Farmer John gives the cows a line number.</li>
</ul>

<p>If the line 2*i is &#39;Q&#39;, then line 2*i+1 will contain N space-separated integers B_ij which represent the cow line. If the line 2*i is &#39;P&#39;, then line 2*i+1 will contain a single integer A_i which is the line number to solve for.</p>

### 출력

<ul>
	<li>Lines 1..K: Line i will contain the answer to query i.</li>
</ul>

<p>If line 2*i of the input was &#39;Q&#39;, then this line will contain a single integer, which is the line number of the cow line in line 2*i+1.</p>

<p>If line 2*i of the input was &#39;P&#39;, then this line will contain N space separated integers giving the cow line of the number in line 2*i+1.</p>