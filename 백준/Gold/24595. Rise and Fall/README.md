# [Gold V] Rise and Fall - 24595

[문제 링크](https://www.acmicpc.net/problem/24595)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 353, 정답: 114, 맞힌 사람: 104, 정답 비율: 36.879%

### 분류

그리디 알고리즘

### 문제 설명

<p>A number is said to <em>Rise and Fall</em> if the decimal representation can be broken up into two parts (possibly empty) where the first part has digits in nondecreasing order and the second part has digits in nonincreasing order.</p>

<p>Compute the largest number less than or equal to an input number that rises and falls.</p>

### 입력

<p>The first line of input contains an integer $t$ ($1 \le t \le 10^5$), which is the number of test cases.</p>

<p>Each of the next $t$ lines contains a single integer $n$ ($1 \le n &lt; 10^{100{,}000}$). Each is a single test case.</p>

<ul>
	<li>Note: that is not a typo. The integer can be up to $10^5$ digits long.</li>
</ul>

<p>The sum of the lengths of all input test cases will not exceed $10^5$.</p>

### 출력

<p>For each test case, output a single line with a single integer, which is the largest number less than or equal to the $n$ for that test case that rises and falls.</p>