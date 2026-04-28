# [Platinum III] Summing Sums - 6150

[문제 링크](https://www.acmicpc.net/problem/6150)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 234, 정답: 101, 맞힌 사람: 54, 정답 비율: 36.486%

### 분류

수학, 정수론, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>The N (1 &lt;= N &lt;= 50,000) cows, conveniently numbered 1..N, are trying to learn some encryption algorithms. After studying a few examples, they have decided to make one of their own! However, they are not very experienced at this, so their algorithm is very simple:</p>

<p>Each cow i is given a starting number C_i (0 &lt;= C_i &lt; 90,000,000), and then all the cows perform the following process in parallel:</p>

<ul>
	<li>First, each cow finds the sum of the numbers of the other N-1 cows.</li>
	<li>After all cows are finished, each cow replaces her number with the sum she computed. To avoid very large numbers, the cows will keep track of their numbers modulo 98,765,431.</li>
</ul>

<p>They told Canmuu the moose about it in November; he was quite impressed.</p>

<p>Then one foggy Christmas Eve, Canmuu came to say:</p>

<p>&quot;Your algorithm is too easy to break! You should repeat it T (1 &lt;= T &lt;= 1,414,213,562) times instead.&quot;</p>

<p>Obviously, the cows were very frustrated with having to perform so many repetitions of the same boring algorithm, so after many hours of arguing, Canmuu and the cows reached a compromise: You are to calculate the numbers after the encryption is performed!</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and T</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer: C_i</li>
</ul>

### 출력

<ul>
	<li>Lines 1..N: Line i contains a single integer representing the number of cow i (modulo 98,765,431) at the end of the encryption.</li>
</ul>

### 힌트

<p>The following is a table of the cows&#39; numbers for each turn:</p>

<pre>
          Cows&#39; numbers
Turn    Cow1  Cow2  Cow3
 0        1     0     4
 1        4     5     1
 2        6     5     9
 3       14    15    11
 4       26    25    29</pre>