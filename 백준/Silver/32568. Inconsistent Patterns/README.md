# [Silver II] Inconsistent Patterns - 32568

[문제 링크](https://www.acmicpc.net/problem/32568)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 16, 맞힌 사람: 16, 정답 비율: 66.667%

### 분류

수학, 애드 혹, 통계학, 해 구성하기

### 문제 설명

<p>The Simpson's Paradox is a phenomenon in statistics where a trend or pattern that appears in different groups of data is inconsistent (disappears or even reverses) with what we see when the groups are combined. It is named after the British statistician Edward H. Simpson, who described it in 1951, although similar observations had been made earlier.</p>

<p>For example, let assume that two teams have been training for the UKIEPC 2024 and have the following statistics for the graph and geometry problems:</p>

<ul>
	<li>Team X has solved 81 out of 87 graph problems (success rate of approx 93%), and 192 out of 263 geometry (73%). Total is 273 out of 350 problems (78%).</li>
	<li>Team Y has solved 234 out of 270 graph problems (87%), and 55 out of 80 geometry (69%). Total is 289 out of 350 (83%).</li>
</ul>

<p>If we look per category --- team X has higher success rate in both categories, but when looking in combination, the pattern reverses, and team Y appears to have higher success rate.</p>

<p>In this problem you are to construct an example of the dataset illustrating the Simpson’s paradox. More specifically, let us assume (similarly to the example above) that there are two teams who have been solving problems of $N$ categories and the total number of problems solved by each of the teams is $M$. Let us denote the number of the problems in $i$-th category solved by Team X as $a_i$, attempted --- by $b_i$. Similarly, let us define $c_i$ as the number of problems solved by Team Y in the $i$-th category and $d_i$ as the number of problems attempted.</p>

<p>You are to find such $a_i$, $b_i$, $c_i$ and $d_i$ that:</p>

<ul>
	<li>$\sum b_i = \sum d_i = M$</li>
	<li>$a_i \le b_i$ for all $i$ from $1$ to $N$</li>
	<li>$c_i \le d_i$ for all $i$ from $1$ to $N$</li>
	<li>$a_i, b_i, c_i, d_i &gt; 0$ for all $i$ from $1$ to $N$</li>
	<li>$\frac{a_i}{b_i} &gt; \frac{c_i}{d_i}$ for all $i$ from $1$ to $N$</li>
	<li>$\frac{\sum a_i}{\sum b_i} &lt; \frac{\sum c_i}{\sum d_i}$</li>
</ul>

### 입력

<p>Input file contains two integer numbers $N$ and $M$ ($2 \le N \le 10000$, $4*N \le M \le 10^5$).</p>

### 출력

<p>Output $N$ lines --- $i$-th of them should contain four positive integer numbers $a_i$, $b_i$, $c_i$, $d_i$, describing the dataset. Input data is selected in such a way that the solution exists.</p>