# [Platinum III] Failing Factory - 32600

[문제 링크](https://www.acmicpc.net/problem/32600)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 92, 정답: 39, 맞힌 사람: 29, 정답 비율: 36.709%

### 분류

강한 연결 요소, 그래프 이론, 수학, 확률론

### 문제 설명

<p>The gigafactory for your new range of Battery-Assisted Postal Cars is finally up and running. This manufacturing plant is a highly complex facility, consisting of many individual steps, where the parts of each car are milled, stamped, welded, soldered, screwed, glued, assembled, tested, detailed, layered, painted, and cleaned. Every step is optimized to the tiniest detail, making them very complicated.</p>

<p>As you are preparing for a visit from your main investor, alarm bells start going off. One of the steps failed, causing a cascade of failures across the factory! After hurriedly resolving the failures, panic creeps up to you: what if a failure happens during the visit of the investor?</p>

<p>Currently, all processes in the factory are working, but your engineers determined that each of them has some independent probability of failing before the visit. As the visit is soon, there will be no time for any repairs, and as soon as a step fails, this will quickly halt all dependent steps as well.</p>

<p>Thus, you decide to show only a single processing step of your factory, and specifically, the one with the smallest probability of failing. As an example, consider the second sample case. The probability that step $1$ fails is $0.72$, but step $2$ is slightly more stable with a failure probability of $0.6$. Thus, you show step $2$ to your investor, with a probability of $0.4$ that it will <em>not</em> fail.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $m$ ($1 \leq n \leq 10^5$, $0 \leq m \leq 10^5$), the number of steps and the number of dependencies between steps.</li>
	<li>One line with $n$ floating point numbers $p$ ($0 \leq p \leq 1$), the individual failure probability of each step. Each probability is given in decimal form<sup>1</sup> with exactly three digits after the decimal point.</li>
	<li>$m$ lines, each with two integers $a$ and $b$ ($1 \leq a, b \leq n$, $a \neq b$), indicating that step $a$ depends on step $b$: failure of step $b$ will cause failure of step $a$. A direct dependency of one step on another occurs at most once. Cyclic dependencies are allowed.</li>
</ul>

<hr>
<p><sup>1</sup>When a floating-point number is written in decimal form, it is not in scientific notation.</p>

### 출력

<p>For the step with the smallest probability of failing, output the probability that it will <em>not</em> fail.</p>

<p>Your answer should have an <em>absolute</em> error of at most $10^{-200}$ or a <em>relative</em> error of at most $10^{-6}$.</p>