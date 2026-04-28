# [Gold IV] Good Coalition - 5428

[문제 링크](https://www.acmicpc.net/problem/5428)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 37, 정답: 21, 맞힌 사람: 21, 정답 비율: 70.000%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>The Dutch political system is in turmoil. There have been six coalition governments in the past fourteen years, all of which have fallen before completing their term in office. Recently there have been elections (again), the outcome of which has been described as &ldquo;impossible&rdquo; by several political commentators. The only bright spot in this bleak situation is that they have appointed you as the &ldquo;informateur&rdquo;. As the informateur it is your task to find a suitable coalition.</p>

<p>Being the rational person you are, you have decided the first negotiation attempt should be started between the parties forming the most stable coalition. A coalition is formed by a set of parties having won a strict majority of seats in the election (i.e. at least 76 seats out of a total of 150). The most stable coalition is one that has the highest chance of completing its term in office. A coalition falls (and new elections must be held) if a single party leaves the coalition. The probability of a coalition completing their term is estimated by the product of the probabilities of each party in the coalition completing their term. This probability is in turn based on historical data.</p>

<p>Find the best coalition and save the Netherlands from becoming a banana republic!</p>

### 입력

<p>On the first line one positive number: the number of test cases, at most 100. After that per test case:</p>

<ul>
	<li>one line with an integer n (1 &le; n &le; 150), the number of political parties that have won at least one seat in the election.</li>
	<li>n lines, each with two space-separated integers s<sub>i</sub> and p<sub>i</sub> (1 &le; s<sub>i</sub> &le; 150 and 1 &le; p<sub>i</sub> &le; 100): the number of seats won by the i-th party and the probability (expressed as a percentage) that the i-th party will complete its term in office, respectively.</li>
</ul>

<p>Note that there are exactly 150 seats divided among all parties (&Sigma;s<sub>i</sub> = 150).</p>

### 출력

<p>Per test case:</p>

<ul>
	<li>one line with a floating point number: the probability (expressed as a percentage) of the most stable coalition sitting out their term in office.</li>
</ul>

<p>This number should be accurate up to 10<sup>-6</sup> relative or absolute precision.</p>