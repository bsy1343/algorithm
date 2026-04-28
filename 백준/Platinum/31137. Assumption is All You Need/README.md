# [Platinum II] Assumption is All You Need - 31137

[문제 링크](https://www.acmicpc.net/problem/31137)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 9, 맞힌 사람: 8, 정답 비율: 40.000%

### 분류

구현, 그리디 알고리즘, 브루트포스 알고리즘, 정렬, 시뮬레이션

### 문제 설명

<p>JB holds the belief that assumption is all you need to solve a problem. In order to prove that, JB has given you two permutations of numbers from $1$ to $n$: $A$ and $B$, and JB wants you to output a sequence of element swapping operation $(x_i,y_i)$ on $A$, so that:</p>

<ol>
	<li>every pair of swapped element forms an inversion pair (i.e. $x_i &lt; y_i$ and $A_{x_i} &gt; A_{y_i}$ when the $i$-th operation is being performed)</li>
	<li>$A$ will become $B$ at the end of the swapping sequence.</li>
</ol>

<p>or determine it is impossible. Help prove JB&#39;s belief by solving this problem!</p>

### 입력

<p>There are multiple test cases. The first line of the input contains one integer $T$ indicating the number of test cases. For each test case:</p>

<p>The first line contains one integer $n$ ($1 \le n \le 2\,021$), indicating the number elements in $A$ and $B$.</p>

<p>The second line contains $n$ distinct integers $A_1,A_2,\dots,A_n$ ($1 \le A_i \le n$), indicating the array $A$.</p>

<p>The third line contains $n$ distinct integers $B_1,B_2,\dots,B_n$ ($1 \le B_i \le n$), indicating the array $B$.</p>

<p>It is guaranteed that the sum of $n$ in all test cases will not exceed $2\,021$.</p>

### 출력

<p>For each test case, if there doesn&#39;t exist a sequence, output the one line containing one integer &quot;<code>-1</code>&quot;.</p>

<p>Otherwise, in the first line output one integer $k$ ($0 \le k \le \frac{n(n-1)}{2}$), indicating the length of the swapping sequence. Then, output $k$ line each containing two integers $x_i$ and $y_i$ ($1 \le x_i &lt; y_i \le n$), indicating the $i$-th operation $\text{swap}(A_{x_i},A_{y_i})$.</p>