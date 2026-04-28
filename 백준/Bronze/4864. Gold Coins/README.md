# [Bronze II] Gold Coins - 4864

[문제 링크](https://www.acmicpc.net/problem/4864)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 246, 정답: 207, 맞힌 사람: 190, 정답 비율: 83.700%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>The king pays his loyal knight in gold coins. On the first day of his service, the knight receives one gold coin. On each of the next two days (the second and third days of service), the knight receives two gold coins. On each of the next three days (the fourth, fifth, and sixth days of service), the knight receives three gold coins. On each of the next four days (the seventh, eighth, ninth, and tenth days of service), the knight receives four gold coins. This pattern of payments will continue indefinitely: after receiving&nbsp;<em>N</em>&nbsp;gold coins on each of&nbsp;<em>N</em>&nbsp;consecutive days, the knight will receive&nbsp;<em>N</em>+1 gold coins on each of the next&nbsp;<em>N</em>+1 consecutive days, where&nbsp;<em>N</em>&nbsp;is any positive integer.</p>

<p>Your program will determine the total number of gold coins paid to the knight in any given number of days (starting from Day 1).</p>

### 입력

<p>The input file contains at least one, but no more than 1001 lines. Each line of the input file (except the last one) contains data for one test case of the problem, consisting of exactly one integer (in the range 1..10000), representing the number of days. The end of the input is signaled by a line containing the number 0.</p>

### 출력

<p>There is exactly one line of output for each test case. This line contains the number of days from the corresponding line of input, followed by one blank space and the total number of gold coins paid to the knight in the given number of days, starting with Day 1.</p>