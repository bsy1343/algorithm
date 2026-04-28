# [Gold II] Chocolate - 6070

[문제 링크](https://www.acmicpc.net/problem/6070)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 71, 정답: 21, 맞힌 사람: 14, 정답 비율: 22.951%

### 분류

수학, 다이나믹 프로그래밍, 확률론, 분할 정복을 이용한 거듭제곱, 선형대수학

### 문제 설명

<p>In 2100, ACM chocolate will be one of the favorite foods in the world.&nbsp;</p>

<p>&quot;Green, orange, brown, red...&quot;, colorful sugar-coated shell maybe is the most attractive feature of ACM chocolate. How many colors have you ever seen? Nowadays, it&#39;s said that the ACM chooses from a palette of twenty-four colors to paint their delicious candy bits.&nbsp;</p>

<p>One day, Sandy played a game on a big package of ACM chocolates which contains five colors (green, orange, brown, red and yellow). Each time he took one chocolate from the package and placed it on the table. If there were two chocolates of the same color on the table, he ate both of them. He found a quite interesting thing that in most of the time there were always 2 or 3 chocolates on the table.&nbsp;</p>

<p>Now, here comes the problem, if there are C colors of ACM chocolates in the package (colors are distributed evenly), after N chocolates are taken from the package, what&#39;s the probability that there is exactly M chocolates on the table? Would you please write a program to figure it out?&nbsp;</p>

### 입력

<p>The input file for this problem contains several test cases, one per line.&nbsp;</p>

<p>For each case, there are three non-negative integers: C (C &le; 100), N and M (N, M &le; 1000000).&nbsp;</p>

<p>The input is terminated by a line containing a single zero.&nbsp;</p>

### 출력

<p>The output should be one real number per line, shows the probability for each case, round to three decimal places.</p>