# [Gold II] NiceSet - 26491

[문제 링크](https://www.acmicpc.net/problem/26491)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 9, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

누적 합, 두 포인터

### 문제 설명

<p>The Great Kagura loves the number $S$. In front of her, she has a sequence of integers $a_1, \dots , a_n$. She wants to select a collection of these integers such that the sum of the absolute values of the differences of all pairs of integers in her collection is at most $S$. For example, if her collection is $x$, $y$, $z$, then $|x &minus; y| + |x &minus; z| + |y &minus; z| &le; S$. She wants to select the largest collection that she can. Can you help her?</p>

### 입력

<p>The first line of the input contains the two integers $n$ and $S$. The second line of the input contains $a_1, \dots , a_n$.</p>

### 출력

<p>Output the size of the largest collection of integers from among $a_1, \dots , a_n$ that satisfy the required condition.</p>

### 제한

<ul>
	<li>$1 &le; n &le; 300\,000$</li>
	<li>$1 &le; a_i &le; 1\,000\,000\,000$</li>
	<li>$1 &le; S &le; 10^{18}$</li>
</ul>