# [Platinum IV] Moon and Sun - 20687

[문제 링크](https://www.acmicpc.net/problem/20687)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 35, 맞힌 사람: 33, 정답 비율: 64.706%

### 분류

수학, 정수론, 조합론, 모듈로 곱셈 역원, 페르마의 소정리

### 문제 설명

<p>Let $S$ be a non-empty sequence of integers and $K$ be a positive integer. The functions $moon()$ and $sun()$ are defined as follows.</p>

<p>$$moon\left(S_{1\dots|S|}\right) = \begin{cases} S &amp; \text{if } |S| = 1 \\ \left[ S_2 &minus; S_1, S_3 &minus; S_2, \dots , S_{|S|} &minus; S_{|S|&minus;1} \right] &amp; \text{if }|S| &gt; 1 \end{cases}$$</p>

<p>$$sun\left(S_{1\dots|S|}, K\right) = \begin{cases} S &amp; \text{if } K = 1 \\ sun\left(moon\left(S_1\dots|S|\right), K &minus; 1\right) &amp; \text{if }K &gt; 1 \end{cases}$$</p>

<p>For example,</p>

<ul>
	<li>$moon([2, 7]) = [5]$.</li>
	<li>$moon([4, 1, 0, 7, 2]) = [&minus;3, &minus;1, 7, &minus;5]$.</li>
	<li>$sun([4, 1, 0, 7, 2], 5) = sun([&minus;3, &minus;1, 7, &minus;5], 4) = sun([2, 8, &minus;12], 3) = sun([6, &minus;20], 2) = sun([&minus;26], 1) = [&minus;26]$.</li>
</ul>

<p>Observe that $sun\left(S_{1\dots |S|}, |S|\right)$ is always a sequence with exactly one element.</p>

<p>You are given a sequence of $N$ integers $A_{1\dots N}$. An index $i = [1\dots N]$ is hot if and only if there exists a sequence $A&#39;_{1\dots N}$ satisfying the following conditions.</p>

<ul>
	<li>$A&#39;_i \ne A_i$ and $A_i&#39;$ is an integer between $-100 000$ and $100 000$, inclusive;</li>
	<li>$A&#39;_j = A_j$ for all $j \ne i$;</li>
	<li>The only element in $sun\left(A&#39;_{1\dots N}, N\right)$ is a multiple of $235 813$.</li>
</ul>

<p>Your task in this problem is to count the number of hot indices in a given $A_{1\dots N}$.</p>

<p>For example, there are $3$ hot indices in $A_{1\dots 5} = [4, 1, 0, 7, 2]$, which are $\{1, 3, 5\}$.</p>

<ul>
	<li>$i = 1 ~~ A&#39;_1 = 30 \rightarrow A&#39;_{1\dots5} = [30, 1, 0, 7, 2] \rightarrow sun([30, 1, 0, 7, 2], 5) = [0]$</li>
	<li>$i = 3 ~~ A&#39;_1 = &minus;78 600 \rightarrow A&#39;_{1\dots5} = [4, 1, &minus;78 600, 7, 2] \rightarrow sun([4, 1, &minus;78 600, 7, 2], 5) = [&minus;471 626]$</li>
	<li>$i = 5 ~~ A&#39;_1 = 28 \rightarrow A&#39;_{1\dots5} = [4, 1, 0, 7, 28] \rightarrow sun([4, 1, 0, 7, 28], 5) = [0]$</li>
</ul>

<p>Note that both $0$ and $-471 626$ are multiples of $235 813$. On the other hand, the index $i = 2$ is not hot as there does not exist an integer $A&#39;_2 \ne A_2$ between $-100 000$ and $100 000$, inclusive, such that the only element in $sun(A&#39;_{1\dots 5} , 5)$ is a multiple of $235 813$. The index $i = 4$ is also not hot for a similar reason.</p>

### 입력

<p>Input begins with a line containing an integer: $N$ ($1 \le N \le 100 000$) representing the number of integers in $A$. The next line contains $N$ integers: $A_i$ ($-100 000 \le A_i \le 100 000$) representing the sequence of integers.</p>

### 출력

<p>Output in a line an integer representing the number of hot indices in the given $A_{1\dots N}$ .</p>