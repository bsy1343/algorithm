# [Platinum IV] Test Tubes - 31646

[문제 링크](https://www.acmicpc.net/problem/31646)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 134, 정답: 35, 맞힌 사람: 34, 정답 비율: 28.099%

### 분류

구현, 애드 혹, 해 구성하기, 많은 조건 분기

### 문제 설명

<p>Bessie has recently gotten into chemistry. At the moment, she has two different colors $1$ and $2$ of various liquids that don&#39;t mix well with one another. She has two test tubes of infinite capacity filled with $N$ $(1 \leq N \leq 10^5)$ units each of some mixture of liquids of these two colors. Because the liquids don&rsquo;t mix, once they settled, they divided into layers of separate colors. Because of this, the two tubes can be viewed as strings $f_1f_2\ldots f_N$ and $s_1s_2\ldots s_N$ where $f_i$ represents the color of the liquid that is $i$ units from the bottom of the first tube, and $s_i$ represents the color of the liquid that is $i$ units from the bottom of the second tube. It is guaranteed that there is at least one unit of each color of liquid.</p>

<p>Bessie wants to separate these liquids so that each test tube contains all units of one color of liquid. She has a third empty beaker of infinite capacity to help her in this task. When Bessie makes a &quot;pour&quot;, she moves all liquid of color $i$ at the top of one test tube or beaker into another.</p>

<p>Determine the minimum number of pours to separate all the liquid into the two test tubes, and the series of moves needed to do so. It does not matter which test tube ends up with which color, but the beaker must be empty..</p>

<p>There will be $T$ ($1 \leq T \leq 10$) test cases, with a parameter $P$ for each test case.</p>

<p>Suppose the minimum number of pours to separate the liquids into the original tubes is $M$.</p>

<ul>
	<li>If $P=1$, you will receive credit if you print only $M$.</li>
	<li>If $P=2$, you will receive credit if you print an integer $A$ such that $M \leq A \leq M+5$, followed by $A$ lines that construct a solution with that number of moves. Each line should contain the source and the destination tube ($1$, $2$, or $3$ for the beaker). The source tube must be nonempty before the move and a tube may not be poured into itself.</li>
	<li>If $P=3$, you will receive credit if you print $M$, followed by a valid construction using that number of moves.</li>
</ul>

### 입력

<p>The first line contains $T$, the. number of test cases. For each test case, the next line contains $N$ and $P$ representing the amount each test tube is initially filled to, and the query type. The following line contains $f_1f_2f_3\ldots f_N$ representing the first test tube. $f_i \in \{ 1,2 \}$ and $f_1$ represents the bottom of the test tube. The subsequent line contains $s_1s_2s_3\ldots s_N$ representing the second test tube. $s_i \in \{ 1,2 \}$ and $s_1$ represents the bottom of the test tube.</p>

<p>It is guaranteed that there will be at least one $1$ and one $2$ across both input strings.</p>

### 출력

<p>For each test case, you will print a single number representing the minimum pours to separate the liquid in the test tubes. Depending on the query type, you may also need to provide a valid construction.</p>