# [Gold V] Expected Allowance - 3886

[문제 링크](https://www.acmicpc.net/problem/3886)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 46, 정답: 34, 맞힌 사람: 28, 정답 비율: 77.778%

### 분류

브루트포스 알고리즘, 다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>Hideyuki is allowed by his father Ujisato some 1000 yen bills every month for his pocket money. In the first day of every month, the number of bills is decided as follows. Ujisato prepares n pieces of m-sided dice and declares the cutback k. Hideyuki rolls these dice. The number of bills given is the sum of the spots of the rolled dice decreased by the cutback. Fortunately to Hideyuki, Ujisato promises him to give at least one bill, even if the sum of the spots does not exceed the cutback. Each of the dice has spots of 1 through m inclusive on each side, and the probability of each side is the same.</p>

<p>In this problem, you are asked to write a program that finds the expected value of the number of given bills.</p>

<p>For example, when n = 2, m = 6 and k = 3, the probabilities of the number of bills being 1, 2, 3, 4, 5, 6, 7, 8 and 9 are \(\frac{1}{36} + \frac{2}{36} + \frac{3}{36}\), \(\frac{4}{36}\), \(\frac{5}{36}\), \(\frac{6}{36}\), \(\frac{5}{36}\), \(\frac{4}{36}\), \(\frac{3}{36}\), \(\frac{2}{36}\) and \(\frac{1}{36}\), respectively.</p>

<p>Therefore, the expected value is</p>

<p>\((\frac{1}{36} + \frac{2}{36} + \frac{3}{36}) \times 1 + \frac{4}{36} \times 2 + \frac{5}{36} \times 3 + \frac{6}{36} \times 4 + \frac{5}{36} \times 5 + \frac{4}{36} \times 6 + \frac{3}{36} \times 7 + \frac{2}{36} \times 8 + \frac{1}{36} \times 9\),</p>

<p>which is approximately 4.11111111.</p>

### 입력

<p>The input is a sequence of lines each of which contains three integers n, m and k in this order.</p>

<p>They satisfy the following conditions.</p>

<ul>
	<li>1 &le; n</li>
	<li>2 &le; m</li>
	<li>0 &le; k &lt; nm</li>
	<li>nm &times; m<sup>n</sup> &lt; 100000000 (10<sup>8</sup>)</li>
</ul>

<p>The end of the input is indicated by a line containing three zeros.</p>

### 출력

<p>The output should be comprised of lines each of which contains a single decimal fraction. It is the expected number of bills and may have an error less than 10<sup>&minus;7</sup>. No other characters should occur in the output.</p>