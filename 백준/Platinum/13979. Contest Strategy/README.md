# [Platinum V] Contest Strategy - 13979

[문제 링크](https://www.acmicpc.net/problem/13979)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 23, 맞힌 사람: 17, 정답 비율: 77.273%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>You are participating in the Association for Computing Machinery&rsquo;s Intercollegiate Programming Competition (ACM ICPC). You must complete a set of n problems. Since you are an experienced problem solver, you can read a problem and accurately estimate how long it will take to solve it, in a negligible amount of time.</p>

<p>Let t<sub>i</sub> be the time it will take to solve the ith problem. Your strategy for the contest is as follows:</p>

<ol>
	<li>Read k random problems.</li>
	<li>Choose a problem that you have read that will take the shortest time to solve (if there are ties, choose any of them arbitrarily).</li>
	<li>Solve the problem, and read a random unread problem (if there is any).</li>
	<li>If there are still unsolved problems, go back to step 2.</li>
</ol>

<p>Your penalty time for the contest is defined by the sum of submission times for all the problems. Of course, your penalty time depends on the order in which the problems are read. What is the sum of penalty times, over all n! possible different orders you read the problems in? Since the result can be very large, find the answer modulo 10<sup>9</sup> + 7.</p>

### 입력

<p>The first line of input contains two space-separated integers n and k (1 &le; k &le; n &le; 300).</p>

<p>The ith line of the next n lines contains a single integer t<sub>i</sub> (1 &le; t<sub>i</sub> &le; 1,000,000).</p>

### 출력

<p>Print, on a single line, a single integer representing the sum of penalty times over all possible orders you read the problems in, modulo 10<sup>9</sup> + 7.</p>