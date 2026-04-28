# [Silver III] Election - 14762

[문제 링크](https://www.acmicpc.net/problem/14762)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 131, 정답: 54, 맞힌 사람: 48, 정답 비율: 48.000%

### 분류

수학, 조합론

### 문제 설명

<p>After all the fundraising, campaigning and debating, the election day has finally arrived. Only two candidates remain on the ballot and you work as an aide to one of them.</p>

<p>Reports from the voting stations are starting to trickle in and you hope that you can soon declare a victory.</p>

<p>There are N voters and everyone votes for one of the two candidates (there are no spoiled ballots). In order to win, a candidate needs more than half of the votes. A certain number M &le; N of ballots have been counted, and there are V<sub>i</sub> votes for candidate i (V<sub>1</sub>+V<sub>2</sub> = M), where V<sub>1</sub> is the number of votes your candidate received.</p>

<p>Due to the historical data and results of highly scientific polls, you know that each of the remaining votes has a 50% chance to go to your candidate. That makes you think that you could announce the win before all the votes are counted. So, if the probability of winning strictly exceeds a certain threshold W, the victory is yours! We just hope you are sure of this, we don&rsquo;t want any scandals...</p>

### 입력

<p>The first line of input contains a single positive integer T &le; 100 indicating the number of test cases. Next T lines each contain four integers: N, V<sub>1</sub>, V<sub>2</sub> and W as described above.</p>

<p>The input limits are as follows:</p>

<ul>
	<li>1 &le; N &le; 50</li>
	<li>50 &le; W &lt; 100</li>
	<li>V<sub>1</sub>, V<sub>2</sub> &ge; 0</li>
	<li>V<sub>1</sub> + V<sub>2</sub> &le; N</li>
</ul>

### 출력

<p>For each test case print a single line containing the appropriate action:</p>

<ul>
	<li>If the probability that your candidate will win is strictly greater than W%, print&nbsp;<code>GET A CRATE OF CHAMPAGNE FROM THE BASEMENT!</code></li>
	<li>If your candidate has no chance of winning, print&nbsp;<code>RECOUNT!</code></li>
	<li>Otherwise, print&nbsp;<code>PATIENCE, EVERYONE!</code></li>
</ul>