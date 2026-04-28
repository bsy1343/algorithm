# [Platinum III] Third grader's task - 30674

[문제 링크](https://www.acmicpc.net/problem/30674)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 9, 맞힌 사람: 9, 정답 비율: 90.000%

### 분류

조합론, 자료 구조, 수학, 세그먼트 트리

### 문제 설명

<p>While looking at the kitchen fridge, little boy Tyler noticed magnets with symbols, that can be aligned into a string $s$.</p>

<p>Tyler likes strings, and especially those that are lexicographically less than string $t$. After playing with magnets on the fridge he is wondering, how many distinct strings can be composed out of letters of string $s$ by rearranging them, so that the the resulting string is lexicographically less than string $t$. Tyler is studying only in the third grade, so he can not answer this question. Help him to calculate the number of permutations of letters of string $s$, that are lexicographically less than string $t$.</p>

<p>We call string $x$ lexicographically less than string $y$ if one of the followings conditions is fulfilled:</p>

<ul>
	<li>There exists such position of symbol $m$ that is presented in both strings, so that before $m$-th symbol the strings are equal, and the $m$-th symbol of string $s$ is less than $m$-th symbol of string $y$.</li>
	<li>String $x$ is the prefix of string $y$.</li>
</ul>

<p>Because the answer can be too large, print it modulo $998\,244\,353$.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($1 \le n, m \le 200\,000$) --- lengths of strings $s$ and $t$.</p>

<p>The second line contains $n$ integers $s_1, s_2, s_3 \ldots s_n$ ($1 \le s_i \le 200\,000$) --- symbols of string $s$.</p>

<p>The third line contains $m$ integers $t_1, t_2, t_3 \ldots t_m$ ($1 \le t_i \le 200\,000$) --- symbols of string $t$.</p>

### 출력

<p>Print the single integer --- the number of strings that are lexicographically less than $t$, that can be composed by rearranging letters of string $s$ modulo $998\,244\,353$.</p>

### 힌트

<p>In the first sample, we should count strings [1 2 2] and [2 1 2]. String [2 2 1] is lexicographically grater than string [2 1 2 1], so we do not count it.</p>

<p>In the second sample we should count all strings except [4 3 2 1], so the answer is $4! - 1 = 23$.</p>

<p>In the third sample we should count only string [1 1 1 2].</p>