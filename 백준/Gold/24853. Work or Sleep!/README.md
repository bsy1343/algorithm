# [Gold V] Work or Sleep! - 24853

[문제 링크](https://www.acmicpc.net/problem/24853)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 32, 맞힌 사람: 31, 정답 비율: 77.500%

### 분류

수학, 미적분학

### 문제 설명

<p>Oleg is a programmer from a planet where there are exactly $T$ hours in a day. Oleg adheres to the principle of &quot;Work or Sleep&quot;. According to this principle, all the time that you are not sleeping, you are working.</p>

<p>Recently Oleg has read an article in a scientific journal about the dependence of a programmer&#39;s performance on sleep time. The results of the study are the following:</p>

<ul>
	<li>If you sleep $T/3$ hours a day, then the performance will be $100\%$.</li>
	<li>If you sleep $T/6$ hours a day, then the performance will be $X\%$.</li>
	<li>If you sleep $0$ hours a day, then the performance will be $0\%$.</li>
	<li>Also, if you sleep from $T/6$ to $T/3$ hours a day, the performance will increase linearly from $X\%$ to $100\%$.</li>
	<li>Also, if you sleep from $T/6$ to $0$ hours a day, the performance will decrease linearly from $X\%$ to $0\%$.</li>
</ul>

<p>Oleg decided to structure this information, so he drew a graph of the dependence of performance on sleep time and got the following result:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24853.%E2%80%85Work%E2%80%85or%E2%80%85Sleep!/9bceadd1.png" data-original-src="https://upload.acmicpc.net/1060ff34-42fb-4ebb-a898-0d4ee91b6cb7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 281px;" /></p>

<p>Oleg believes that the amount of work he will do per day is equal to the product of working time and performance. So, the problem is that if you sleep more, you work less, and if you sleep less, you have less performance.</p>

<p>Oleg wants to get back to work as soon as possible. So, help him determine the maximum possible daily amount of work that he can do with the optimal choice of sleep time.</p>

### 입력

<p>Input contains two integers $X$ and $T$ --- performance as a percentage if the sleep time is $T/6$, and the number of hours per day on Oleg&#39;s planet ($0 \le X \le 100$, $1 \le T \le 10^5$).</p>

### 출력

<p>Output a single real number --- the maximum possible daily amount of the work that can be done by Oleg. Your answer will be considered correct if its absolute or relative error doesn&#39;t exceed $10^{-6}$.</p>

### 힌트

<p>In the first test case, the maximum amount of the work that could be done if Oleg sleeps for eight hours. In the second test case, Oleg needs to sleep for four hours to maximize his amount of work.</p>