# [Platinum V] Buddy, Can You Spare a Tronk? - 5233

[문제 링크](https://www.acmicpc.net/problem/5233)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 5, 맞힌 사람: 3, 정답 비율: 42.857%

### 분류

백트래킹, 브루트포스 알고리즘, 재귀

### 문제 설명

<p>The principal unit of currency in the world of Tron is the <em>Tronk</em>. Making change for the Tronk in this virtual world is challenging. In the USA, we have half-dollars, quarters, dimes, nickels, and pennies, worth respectively $\frac{1}{2}$, $\frac{1}{4}$, $\frac{1}{10}$, $\frac{1}{20}$, and $\frac{1}{100}$ of a US dollar. In the world of Tron, they have infinitely many coins, one for the reciprocal of <em>every</em> integer: $$1, \frac{1}{2},&nbsp;\frac{1}{3},&nbsp;\frac{1}{4},&nbsp;\frac{1}{5}, \dots$$</p>

<p>In particular, there is no smallest coin. Sam meets his Clu, his father&rsquo;s alter ego, who offers him the following puzzle:</p>

<blockquote>
<p>If you could use any combination of <em>n</em> coins, how many different ways are there of making change for one Tronk?</p>
</blockquote>

<p>For example, if you could use $n = 3$ coins, there are exactly three ways to make change for one Tronk: $$\frac{1}{3}+\frac{1}{3}+\frac{1}{3},&nbsp;\frac{1}{6}+\frac{1}{3}+\frac{1}{2}, \text{and }\frac{1}{2}+\frac{1}{4}+\frac{1}{4}\text{.}$$</p>

<p>Clu adds two more constraints:</p>

<ul>
	<li>You are given an integer $r$. No coin may be used more then $r$ times. (For example, if $r = 2$, then the first solution above would not be valid, but the other two would be.) If $r = 0$, then each coin may be used an arbitrary number of times.</li>
	<li>You are given a list of integers $F = \{f_1, f_2, . . . , f_k\}$. None of the reciprocals on this list may be used. For example, if $F = \{4, 6\}$, then $\frac{1}{4}$ and $\frac{1}{6}$ cannot be used, and so only the first solution above is valid.</li>
</ul>

<p>Sam wonders, &ldquo;But, how do I know what the smallest coin is that I will need to use?&rdquo; Clu answers, &ldquo;Sorry, you gotta figure that out on your own.&rdquo; To help Sam, design a program to solve this problem. The program&rsquo;s input consists of $n$, $r$, and the list $F$ (the input format is given below). The program should output a list of all the valid solutions, followed by the total number of solutions.</p>

<p>Clu tells Sam that he also wants the output to be nicely sorted. Each line should hold the reciprocals of the coins that sum to 1, listed in <em>increasing order</em>. For example, the sequence $\{\frac{1}{6}, \frac{1}{3}, \frac{1}{2}\}$ must be output as <code>2 3 6</code>. Also, each of the sequences of coins must be sorted in lexicographically increasing order. Thus, the above solution would be output as</p>

<pre>
2 3 6
2 4 4
3 3 3
3 solutions found</pre>

<p>Clu also warns Sam that each solution he produces must be a correct solution. He explains to Sam that because of floating point errors and extremely small coins involved (e.g., coins like 1/10000000), a set of coins might sum up to arbitrarily close to 1, but if the values do not sum exactly to 1, the answer is incorrect.</p>

### 입력

<p>The first line in the test data file contains the number of test cases (&le; 20). After that, each line contains one test case. The first number is the number of coins that you must use $n$ (&le; 10). The second number is the number of repetitions allowed for each coin ($r$). If&nbsp;$r = 0$, that means any number of repetitions are allowed. The next number is the number of forbidden coins $k$ (&le; 20), and the following $k$ numbers denote the forbidden coins.</p>

### 출력

<p>For each test case, you are to find all different solutions, sorted as described above. We may give full credit if you miss a few solutions, but if your program returns a wrong solution (i.e., a solution where the set of coins does not add up to exactly 1), then you will not get any credit. You can also assume that you will not need to use any coin smaller than the reciprocal of 10,000,000.</p>