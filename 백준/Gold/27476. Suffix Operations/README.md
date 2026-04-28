# [Gold III] Suffix Operations - 27476

[문제 링크](https://www.acmicpc.net/problem/27476)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 67, 정답: 54, 맞힌 사람: 50, 정답 비율: 80.645%

### 분류

그리디 알고리즘, 브루트포스 알고리즘

### 문제 설명

<p>Gildong has an interesting machine that has an array $a$ with $n$ integers. The machine supports two kinds of operations:</p>

<ol>
	<li>Increase all elements of a suffix of the array by $1$.</li>
	<li>Decrease all elements of a suffix of the array by $1$.</li>
</ol>

<p>A suffix is a subsegment (contiguous elements) of the array that contains $a_n$. In other words, for all $i$ where $a_i$ is included in the subsegment, all $a_j$&rsquo;s where $i\lt j\le n$ must also be included in the subsegment.</p>

<p>Gildong wants to make all elements of $a$ equal --- he will always do so using the minimum number of operations necessary. To make his life even easier, before Gildong starts using the machine, you have the option of changing one of the integers in the array to any other integer. You are allowed to leave the array unchanged. You want to minimize the number of operations Gildong performs. With your help, what is the minimum number of operations Gildong will perform?</p>

<p>Note that even if you change one of the integers in the array, you should <strong>not</strong> count that as one of the operations because Gildong did not perform it.</p>

### 입력

<p>Each test contains one or more test cases. The first line contains the number of test cases $t$ ($1\le t\le 1000$).</p>

<p>Each test case contains two lines. The first line of each test case consists of an integer $n$ ($2\le n\le 2\cdot 10^5$) --- the number of elements of the array $a$.</p>

<p>The second line of each test case contains $n$ integers. The $i$-th integer is $a_i$ ($-5\cdot 10^8\le a_i\le 5\cdot 10^8$).</p>

<p>It is guaranteed that the sum of $n$ in all test cases does not exceed $2\cdot 10^5$.</p>

### 출력

<p>For each test case, print one integer --- the minimum number of operations Gildong has to perform in order to make all elements of the array equal.</p>

### 힌트

<p>In the first case, all elements of the array are already equal. Therefore, we do not change any integer and Gildong will perform zero operations.</p>

<p>In the second case, we can set $a_3$ to be $0$, so that the array becomes $[-1,0,0]$. Now Gildong can use the $2$-nd operation once on the suffix starting at $a_2$, which means $a_2$ and $a_3$ are decreased by $1$, making all elements of the array $-1$.</p>

<p>In the third case, we can set $a_1$ to $96$, so that the array becomes $[96,96,97,95]$. Now Gildong needs to:</p>

<ul>
	<li>Use the $2$-nd operation on the suffix starting at $a_3$ once, making the array $[96,96,96,94]$.</li>
	<li>Use the $1$-st operation on the suffix starting at $a_4$ $2$ times, making the array $[96,96,96,96]$.</li>
</ul>

<p>In the fourth case, we can change the array into $[-3,-3,-2,1]$. Now Gildong needs to:</p>

<ul>
	<li>Use the $2$-nd operation on the suffix starting at $a_4$ $3$ times, making the array $[-3,-3,-2,-2]$.</li>
	<li>Use the $2$-nd operation on the suffix starting at $a_3$ once, making the array $[-3,-3,-3,-3]$.</li>
</ul>