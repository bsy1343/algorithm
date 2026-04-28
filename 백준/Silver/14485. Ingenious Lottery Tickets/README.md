# [Silver III] Ingenious Lottery Tickets - 14485

[문제 링크](https://www.acmicpc.net/problem/14485)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 95, 정답: 51, 맞힌 사람: 47, 정답 비율: 53.409%

### 분류

구현, 정렬

### 문제 설명

<p>Your friend Superstitious Stanley is always getting himself into trouble. This time, in his Super Lotto Pick and Choose plan, he wants to get rich quick by choosing the right numbers to win the lottery. In this lottery, entries consist of six distinct integers from 1 to 49, which are written in increasing order. Stanley has compiled a list of winning entries from the last n days, and is going to use it to pick his winning numbers.</p>

<p>In particular, Stanley will choose the six numbers that appeared the most often. When Stanley is breaking ties, he prefers smaller numbers, except that he prefers seven to every other number. What is Stanley&rsquo;s entry?</p>

### 입력

<p>The first line of input contains a single integer T (1 &le; T &le; 100), the number of test cases. The first line of each test case contains a single integer n (1 &le; n &le; 1,000), the number of winning entries that Stanley compiled. The next n lines each contain a lottery entry as described above.</p>

### 출력

<p>For each test case, output a single line containing Stanley&rsquo;s entry.</p>

### 힌트

<p>In the first test case, the numbers 4 through 9 appear twice each, while all other numbers appear at most one time.</p>

<p>In the second test case, all numbers 1 through 9 appear twice each. The tiebreaking rule means Stanley prioritizes picking 7 and then the five smallest numbers.</p>