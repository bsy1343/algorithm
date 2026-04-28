# [Platinum III] Driving Out the Piggies - 6045

[문제 링크](https://www.acmicpc.net/problem/6045)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

수학, 확률론, 선형대수학, 가우스 소거법

### 문제 설명

<p>The Cows have constructed a randomized stink bomb for the purpose of driving away the Piggies. The Piggy civilization consists of N (2 &lt;= N &lt;= 300) Piggy cities conveniently numbered 1..N connected by M (1 &lt;= M &lt;= 44,850) bidirectional roads specified by their distinct endpoints A_j and B_j (1 &lt;= A_j &lt;= N; 1 &lt;= B_j &lt;= N). Piggy city 1 is always connected to at least one other city.</p>

<p>The stink bomb is deployed in Piggy city 1. Each hour (including the first one), it has a P/Q (1 &lt;= P &lt;= 1,000,000; 1 &lt;= Q &lt;= 1,000,000; P &lt;= Q) chance of polluting the city it occupies. If it does not go off, it chooses a random road out of the city and follows it until it reaches a new city. &nbsp;All roads out of a city are equally likely to be chosen.</p>

<p>Because of the random nature of the stink bomb, the Cows are wondering which cities are most likely to be polluted. Given a map of the Piggy civilization and the probability that the stink bomb detonates in a given hour, compute for each city the probability that it will be polluted.</p>

<p>For example, suppose that the Piggie civilization consists of two cities connected together and that the stink bomb, which starts in city 1, has a probability of 1/2 of detonating each time it enters a city:</p>

<pre>
                            1--2</pre>

<p>We have the following possible paths for the stink bomb (where the last entry is the ending city):</p>

<pre>
1: 1
2: 1-2
3: 1-2-1
4: 1-2-1-2
5: 1-2-1-2-1
etc.</pre>

<p>To find the probability that the stink bomb ends at city 1, we can add up the probabilities of taking the 1st, 3rd, 5th, ... paths above (specifically, every odd-numbered path in the above list). The probability of taking path number k is exactly (1/2)^k - the bomb must not remain in its city for k - 1 turns (each time with a probability of 1 - 1/2 = 1/2) and then land in the last city (probability 1/2).</p>

<p>So our probability of ending in city 1 is represented by the sum 1/2 + (1/2)^3 + (1/2)^5 + ... . When we sum these terms infinitely, we will end up with exactly 2/3 as our probability, approximately 0.666666667. This means the probability of landing in city 2 is 1/3, approximately 0.333333333.</p>

<p>Partial feedback will be provided for your first 50 submissions.</p>

### 입력

<ul>
	<li>Line 1: Four space separated integers: N, M, P, and Q</li>
	<li>Lines 2..M+1: Line i+1 describes a road with two space separated integers: A_j and B_j</li>
</ul>

### 출력

<ul>
	<li>Lines 1..N: On line i, print the probability that city i will be destroyed as a floating point number. An answer with an absolute error of at most 10^-6 will be accepted (note that you should output at least 6 decimal places for this to take effect).</li>
</ul>