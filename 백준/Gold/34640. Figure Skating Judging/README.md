# [Gold III] Figure Skating Judging - 34640

[문제 링크](https://www.acmicpc.net/problem/34640)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 14, 맞힌 사람: 13, 정답 비율: 72.222%

### 분류

그리디 알고리즘, 수학, 슬라이딩 윈도우, 정렬

### 문제 설명

<p>Anissa has just finished her figure skating routine and is anxiously awaiting her scores. The way scoring works at this specific event is a little peculiar - each figure skater is evaluated by several judges and the scores are averaged to give a final score.</p>

<p>Jolie is managing the software used to compile the scores and notices that a hacker has gotten in and inserted many fake evaluations. She knows exactly how many scores she should expect, so she will manually invalidate evaluations until the number of evaluations matches the number of judges she knows actually submitted evaluations.</p>

<p>The problem is, Jolie doesn’t know which evaluation to invalidate. She decides to use the following metric for assessing the <em>badness</em> of a collection of scores after invalidating enough to get the number of evaluations to match the number of judges:</p>

<ol>
<li>Compute the arithmetic mean of all the evaluations from the chosen collection.</li>
<li>Compute the squared deviation of each evaluation in the chosen collection to the given arithmetic mean. That is, if the mean is $\mu $ and a given evaluation is $x$, the squared deviation is $(\mu - x)^2$.</li>
<li>Compute the sum of all squared deviations from step 2. This sum is the <em>badness</em>.</li>
</ol>

<p>Compute the minimum badness over all possible collections of scores that can be obtained.</p>

### 입력

<p>The first line of input contains two integers, $n$ and $k$ $(1 \le k &lt; n \le 5 \cdot 10^5)$, where $n$ is the total number of evaluations and $k$ is the expected number of evaluations.</p>

<p>Each of the next $n$ lines contains a single integer $x$ $(1 \le x \le 10^6)$. These are the evaluations.</p>

### 출력

<p>Output a single number, which is the minimum badness over all possible collections of scores that can be obtained. Answer is correct if it is within absolute or relative error of $10^{-6}$.</p>