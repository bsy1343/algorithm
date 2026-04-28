# [Platinum II] Soccer Teams - 30141

[문제 링크](https://www.acmicpc.net/problem/30141)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 1, 정답 비율: 33.333%

### 분류

수학, 다이나믹 프로그래밍, 정수론

### 문제 설명

<p>My kid&#39;s favorite subject is math, as you know by now.  He is learning division now, and his teacher has taught him about even numbers being divisible by 2, numbers whose digits add up to a multiple of 3 being exactly divisible by 3 etc.</p>

<p>He was familiar with division by 11 during selection for soccer teams on his playground, and was wondering whether there was any easy rule to see if a number was divisible by 11.  For example, he wondered, if he arranged a number of digits 0-9 in a row to form a number, which ones would be divisible by 11?</p>

<p>He decided to start off with d[1] 1&#39;s, d[2] 2&#39;s ..., d[9] 9&#39;s, and seeing what is the minimum multiple of 11 that he could get by using all these digits, together with any number of 0&#39;s.  Please help him figure out how many digits there are in this minimum multiple.</p>

### 입력

<p>The first line will contain the number of test cases T. T lines follow one corresponding to each test case. Each line has 9 integers d[1],...,d[9].</p>

### 출력

<p>Output T lines one corresponding to each test case. The ith line should contain the required answer for the corresponding test case. If he will not be able to form a multiple of 11 in this way, print -1.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100</li>
	<li>1 &le; d[1] + ... + d[9] &le; 100</li>
</ul>

### 힌트

<p>For the first case, the number 11 can be formed which has 2 digits.</p>

<p>For the second case, number 209 can be formed which is divisible by 11 and has 3 digits.</p>