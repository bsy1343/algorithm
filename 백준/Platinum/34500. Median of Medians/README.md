# [Platinum IV] Median of Medians - 34500

[문제 링크](https://www.acmicpc.net/problem/34500)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 256 MB

### 통계

제출: 20, 정답: 6, 맞힌 사람: 6, 정답 비율: 46.154%

### 분류

수학, 조합론

### 문제 설명

<p>Busy Beaver has just learned about the Median of Medians algorithm! To better understand the algorithm, he has chosen an odd positive integer $N$ and wants to experiment with permutations of $\{1,2,\dots,3N\}$.<sup>1</sup></p>

<p>For any odd number $k$ and a sequence of distinct numbers $A = (a_1,a_2,\dots,a_k)$, let $B = (b_1,b_2,\dots,b_k)$ be $A$ sorted in increasing order. Then, $\text{median}(a_1,a_2,\dots,a_k)$ is $b_{\frac{k+1}{2}}$, the $\left(\frac{k+1}{2}\right)$-th element of $B$.</p>

<p>Busy Beaver thinks that a permutation of $(p_1,p_2,\dots,p_{3N})$ of $\{1,2,\dots,3N\}$ is <strong>nice</strong> if and only if</p>

<p>$$ \text{median}\Big(\text{median}(p_1, p_2, \dots, p_N),\text{median}(p_{N+1}, p_{N+2},\dots,p_{2N}),\text{median}(p_{2N+1},\dots,p_{3N})\Big) = \frac{3N+1}{2}. $$</p>

<p>Busy Beaver is extra picky with his permutations; he likes having certain numbers in certain positions. He has $M$ pairs of numbers $(a_i,b_i)$. A nice permutation $(p_1,p_2,\dots,p_{3N})$ is <strong>fitting</strong> if $p_{a_i} = b_i$ for all $1 \leq i \leq M$.</p>

<p>Help Busy Beaver determine the number of <strong>fitting</strong> permutations! Since the number of such permutations may be very large, compute the number of such permutations modulo $10^9 + 7$.</p>

<hr>
<p><sup>1</sup>A permutation of length $N$ is an array consisting of $N$ distinct integers from $1$ to $N$ in arbitrary order. For example, $[2,3,1,5,4]$ is a permutation, but $[1,2,2]$ is not a permutation ($2$ appears twice in the array), and $[1,3,4]$ is also not a permutation ($N=3$ but there is $4$ in the array).</p>

### 입력

<p>Each test contains multiple test cases. The first line of input contains a single positive integer $T$, the number of test cases $(1 \leq T \leq 10^5)$. The description of each test case follows.</p>

<p>The first line of each test case contains two spaced positive integers $N$ and $M$ ($1 \leq N \leq 3 \cdot 10^5$, $0 \leq M \leq 3N$, and $N$ is odd) --- the size of the permutation, and the number of pairs $(a_i, b_i)$, respectively.</p>

<p>The next $M$ lines contain two positive integers $a_i, b_i$ ($1 \leq a_i, b_i \leq 3N$) --- specifying that $p_{a_i} = b_i$. It is guaranteed that for all $1 \leq i &lt; j \leq M$, $a_i \neq a_j$ and $b_i \neq b_j$.</p>

<p>It is guaranteed that the sum of $M$ across all test cases is no more than $10^6$.</p>

<p><strong>Note that there is no additional guarantee on the sum of $N$ across all test cases.</strong></p>

### 출력

<p>For each test case, output one line with a single integer, indicating the number of <strong>fitting</strong> permutations modulo $10^9 + 7$.</p>

### 힌트

<p>In the first test case, $N=1$, so we are working with permutations of length $3N = 3$. Since $M=0$, we have no additional constraints on the permutation. One can check that for all permutations of length $3$, computing the median of the medians gives the correct median of $2$, so there are $6$ fitting permutations.</p>

<p>In the second test case, $N=3$, so we are working with permutations of length $3N = 9$. Since $M=9$, we have $9$ constraints on the permutation, which have fixed all $9$ elements of the permutation to $(1,2,3,4,5,6,7,8,9)$.</p>

<ul>
	<li>The median of the first $3$ elements $(1,2,3)$ is $2$.</li>
	<li>The median of the middle $3$ elements $(4,5,6)$ is $5$.</li>
	<li>The median of the last $3$ elements $(7,8,9)$ is $8$.</li>
</ul>

<p>The median of $(2,5,8)$ is $5$, which is the correct median. Thus, there is exactly $1$ fitting permutation, which is $(1,2,3,4,5,6,7,8,9)$.</p>

<p>In the third test case, $N=3$, so we are working with permutations of length $3N = 9$. Since $M=6$, we have $6$ constraints on the permutation, which have fixed the last $6$ elements of the permutation to $(4,5,6,7,8,9)$. We are free to permute $(1,2,3)$ among the first $3$ elements. Using a similar analysis as the second test case, we see that the following $6$ permutations</p>

<ul>
	<li>$(1,2,3,4,5,6,7,8,9)$</li>
	<li>$(1,3,2,4,5,6,7,8,9)$</li>
	<li>$(2,1,3,4,5,6,7,8,9)$</li>
	<li>$(2,3,1,4,5,6,7,8,9)$</li>
	<li>$(3,1,2,4,5,6,7,8,9)$</li>
	<li>$(3,2,1,4,5,6,7,8,9)$</li>
</ul>

<p>are all fitting permutations.</p>

<p>In the fourth test case, $N=3$, so we are working with permutations of length $3N = 9$. Since $M=3$, we have $3$ constraints on the permutation, which have fixed the first $3$ elements of the permutation to $(1,2,5)$. It can be checked that there are no fitting permutations that satisfy these constraints.</p>