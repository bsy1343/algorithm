# [Platinum V] Quite the cheater! - 27696

[문제 링크](https://www.acmicpc.net/problem/27696)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 13, 맞힌 사람: 9, 정답 비율: 30.000%

### 분류

수학, 그리디 알고리즘, 해 구성하기, 비트마스킹

### 문제 설명

<p>Your physics lab report is due tomorrow. However, you had no time to do the required experiments, as you spent all your time practicing for the IPSC. Therefore you decided to write a fake report quickly. Here is how to get a good grade for your lab report:</p>

<ul>
	<li>It has to contain a lot of measurements.</li>
	<li>You already know the correct value you were supposed to measure. The mean of all &ldquo;measured&rdquo; values in your report has to be equal to that value.</li>
	<li>The values must look suﬃciently random to avoid suspicion that you made them all up. (Yeah, right.) More formally, they must have a suﬃcient variance.</li>
</ul>

<p>You are given two integers: the desired mean &mu; and the desired variance v.</p>

<p>Pick a number of measurements n and the values of those measurements a<sub>1</sub>,&hellip;,a<sub>n</sub> such that the mean of those values is exactly &mu; and their variance is (easy subproblem: at least v / hard subproblem: exactly v). Formally, your values must satisfy the following conditions:</p>

<ul>
	<li>10 &le; n &le; 1000</li>
	<li>Each a<sub>i</sub> is an integer between &minus;10<sup>9</sup> and 10<sup>9</sup>, inclusive.</li>
	<li>The value &mu; is exactly the mean: &mu; = (a<sub>1</sub> + ⋯ + a<sub>n</sub>)∕n.</li>
	<li>The variance of your values is computed as follows: (1∕n) &sdot;<img align="middle" alt="(" src="https://ipsc.ksp.sk/2013/practice/problems/q0x.png" />(a<sub>1</sub> &minus; &mu;)<sup>2</sup> + ⋯ + (a<sub>n</sub> &minus; &mu;)<sup>2</sup><img align="middle" alt=")" src="https://ipsc.ksp.sk/2013/practice/problems/q1x.png" />.
	<p>(If you are a statistics buﬀ, note that we are not using the unbiased sample variance formula (the one with 1∕(n&minus;1) instead of 1∕n), as in our case the mean is known a priori. If the previous sentence makes no sense, just ignore it and use the formula in the problem statement.)</p>
	</li>
</ul>

### 입력

<p>The ﬁrst line of the input ﬁle contains an integer t specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case contains a single line with two integers: &mu; and v.</p>

<p>You may assume that t &le; 100, |&mu;|&le; 10<sup>6</sup>, and 0 &le; v &le; 10<sup>9</sup>.</p>

### 출력

<p>For each test case, output two lines. The ﬁrst line should contain the number of values n, the second line a space-separated list of values a<sub>1</sub>,&hellip;,a<sub>n</sub>. Any valid solution will be accepted.</p>

### 힌트

<p>This sequence of 11 values has mean exactly 47 and variance exactly 2080.</p>