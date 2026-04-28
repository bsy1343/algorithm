# [Platinum II] Boys don't cry! - 23464

[문제 링크](https://www.acmicpc.net/problem/23464)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 5, 맞힌 사람: 5, 정답 비율: 27.778%

### 분류

수학, 그리디 알고리즘, 조합론

### 문제 설명

<p>Laska is the son of the king of the toilet. The pressure of being the son of such an important person was too big for him, so he decided to ask himself one really important question -- what do I really want to do with my life? He answered himself that he want to be high all the time.</p>

<p>While being high he got amazing vision of permutations. They were forming different shapes, different patterns. Out of those infinite mix of permutations, he was able to distinguish $n$ permutations of integers ${1, 2, \ldots, m}$.</p>

<p>He picked one of those permutations, let it be $\pi_1, \pi_2, \ldots, \pi_m$. He created a new permutation based on this with following algorithm:</p>

<ul>
	<li>Start with empty sequence</li>
	<li>Analyze elements in order $1, 2, \ldots, m$. For element $\pi_i$ he appended it either to the beginning or to the end of current sequence.</li>
</ul>

<p>For example if initial permutation was $(5, 2, 3, 1, 4)$, he could create permutation $() \rightarrow (5) \rightarrow (2, 5) \rightarrow (3, 2, 5) \rightarrow (3, 2, 5, 1) \rightarrow (4, 3, 2, 5, 1)$.</p>

<p>He applied this operation exactly once to each of his initial permutations. Surprisingly it turned out that all resulting permutations were the same.</p>

<p>The next day he told you this story. Now you wonder how many different permutations could be created in such way. Moreover you want to restore the lexicographically minimal possible permutation which could be created in that way (if such exists).</p>

<p>As a reminder permutation $a_1, a_2, \ldots, a_m$ is lexicographically smaller then permutation $b_1, b_2, \ldots, b_m$ if there exist an index $k$ fulfilling $a_k &lt; b_k$ and $a_i = b_i$ for $1 \le i &lt; k$.</p>

### 입력

<p>In the first line one integer $Z \le 50$ is given, denoting number of testcases described in following lines.&nbsp;</p>

<p>The first line of the each test case contains two integers $n$ and $m$, denoting the number of permutations and length of those permutations. Each of the following $n$ lines contains a description of those permutations. A description of a permutation consists of $m$ pairwise distinct integers from set $\{1, 2, \ldots, m\}$.</p>

### 출력

<p>For each test case, in the first line your program should write the remainder of number of permutations that could be created by $10^9 + 7$. If there exist at least one such permutation then in the second line you should write lexicographically minimum such permutation in the same format as in the input. If there is no such permutation then you should output only one line.</p>

### 제한

<ul>
	<li>$n,m \in [1,1000]$</li>
	<li>sum of $n$ over all testcases does not exceed $5\,000$</li>
</ul>