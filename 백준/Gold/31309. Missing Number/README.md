# [Gold III] Missing Number - 31309

[문제 링크](https://www.acmicpc.net/problem/31309)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 54, 정답: 24, 맞힌 사람: 20, 정답 비율: 51.282%

### 분류

브루트포스 알고리즘, 구현

### 문제 설명

<p>Kirby has written down all the integers from $a$ to $b$ in order. He wrote them down as one big string, with no spaces between them and no leading zeroes, and he didn&#39;t tell you the values of $a$ and $b$! </p>

<p>Because Kirby was hungry, he ate one of the numbers. Can you figure out what number he ate?</p>

### 입력

<p>The first line contains a single integer $t$ ($1 \le t \le 10^5$), which is the number of test cases that follow. </p>

<p>Each of the next $t$ lines contains a string of digits of length at least one and at most $488888$. This string is what Kirby wrote. Note that $1 \le a &lt; b \le 99999$. It is guaranteed that this string can be obtained by the process given above.</p>

<p>It is guaranteed that the sum of the lengths of all the strings does not exceed $10^6$.</p>

### 출력

<p>Output $2t$ lines, two for each test case.</p>

<p>On the first line, output a single integer, which is the number of numbers that Kirby could have possibly eaten.</p>

<p>On the second line, output the numbers that Kirby could have eaten, in ascending order, separated by at least one space.</p>