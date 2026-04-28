# [Gold II] The Bad Number - 3744

[문제 링크](https://www.acmicpc.net/problem/3744)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 58, 정답: 4, 맞힌 사람: 3, 정답 비율: 16.667%

### 분류

애드 혹, 많은 조건 분기

### 문제 설명

<p>John and Brus believe that number N is a very bad number. Thus they try to avoid it every time and everywhere.</p>

<p>Now the guys would like to represent number M as a sum of positive numbers, each of which not exceeding K. But don&rsquo;t forget about the bad number N! Each summand must not be divisible by N, moreover the number of summands also must not be divisible by N.</p>

<p>Your task is to find the minimal possible number of summands in such representation of M.</p>

<p>For example, if N=3, M=11, K=6 then we can represent M as 5+6, but as far as 6 is divisible by 3 we must have at least 3 summands. But as far as N=3 we can&rsquo;t have 3 summands and thus the answer is 4. One of the possible ways to represent M is 11=4+4+2+1.</p>

### 입력

<p>The first line contains single integer T &ndash; the number of test cases. Each test case consists of a single line containing three integers N, M and K separated by single spaces.</p>

### 출력

<p>For each test case print a single line containing the minimal possible number of summands according to the requirements described above. If it is impossible to do this output &ldquo;-1&rdquo; (quotes for clarity) instead.</p>

### 제한

<ul>
	<li>1 &le; T &le; 74</li>
	<li>1 &le; N, M, K &le; 1000000000 (10<sup>9</sup>)</li>
</ul>