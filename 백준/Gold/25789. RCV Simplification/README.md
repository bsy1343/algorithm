# [Gold II] RCV Simplification - 25789

[문제 링크](https://www.acmicpc.net/problem/25789)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 102, 정답: 23, 맞힌 사람: 15, 정답 비율: 20.270%

### 분류

구현, 그리디 알고리즘, 이분 탐색, 시뮬레이션

### 문제 설명

<p>The following is from Ballotpedia [ https://ballotpedia.org/Ranked-choice_voting_(RCV) ]:</p>

<p>Broadly speaking, the ranked-choice voting process unfolds as follows for single-winner elections:</p>

<ol>
	<li>Voters rank the candidates for a given office by preference on their ballots.</li>
	<li>If a candidate wins an outright majority of first-preference votes (i.e., 50 percent plus one), he or she will be declared the winner.</li>
	<li>If, on the other hand, no candidates win an outright majority of first-preference votes, the candidate with the fewest first-preference votes is eliminated.</li>
	<li>All first-preference votes for the failed candidate are eliminated, lifting the secondpreference choices indicated on those ballots.</li>
	<li>A new tally is conducted to determine whether any candidate has won an outright majority of the adjusted voters.</li>
	<li>The process is repeated until a candidate wins a majority of votes cast.</li>
</ol>

<p>Example: Assume that there are four candidates in an election. The table below presents the raw first-preference vote totals for each candidate:</p>

<table class="table table-bordered th-center td-center">
	<thead>
		<tr>
			<th colspan="3">Raw first-preference vote tallies</th>
		</tr>
		<tr>
			<th>Candidate</th>
			<th>First-Preference Votes</th>
			<th>Percentage</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>Candidate A</td>
			<td>475</td>
			<td>46.34%</td>
		</tr>
		<tr>
			<td>Candidate B</td>
			<td>300</td>
			<td>29.27%</td>
		</tr>
		<tr>
			<td>Candidate C</td>
			<td>175</td>
			<td>17.07%</td>
		</tr>
		<tr>
			<td>Candidate D</td>
			<td>75</td>
			<td>7.32%</td>
		</tr>
	</tbody>
</table>

<p>In the above scenario, no candidate won an outright majority of first-preference votes. As a result, the candidate (Candidate D) with the smallest number of first-preference votes is eliminated. The ballots that listed candidate D as the first preference are adjusted, raising their second-preference candidates. Assume that, of the 75 first-preference votes for Candidate D, 50 listed Candidate A as their second preference and 25 listed Candidate B. The adjusted vote totals would be as follows:</p>

<table class="table table-bordered th-center td-center">
	<thead>
		<tr>
			<th colspan="3">Adjusted vote tallies</th>
		</tr>
		<tr>
			<th>Candidate</th>
			<th>Adjusted First-Preference Votes</th>
			<th>Percentage</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>Candidate A</td>
			<td>525</td>
			<td>51.22%</td>
		</tr>
		<tr>
			<td>Candidate B</td>
			<td>325</td>
			<td>31.71%</td>
		</tr>
		<tr>
			<td>Candidate C</td>
			<td>175</td>
			<td>17.07%</td>
		</tr>
	</tbody>
</table>

<p>On the second tally, Candidate A secured 51.22 percent of the vote, thereby winning the election.</p>

<p>Note: If several candidates are tied for the fewest first-preference votes, all such candidates are eliminated. So, candidates not eliminated must have at least one more first-preference vote than those eliminated.</p>

<p>We have received information on the percentage for the first-preference for each candidate, but we don&rsquo;t know how the candidates are listed as the second preference, third preference, etc. Help write a program to remove candidates that cannot possibly win. More specifically, given the current votes for a set of candidates, find the set of candidates that cannot possibly win.</p>

### 입력

<p>The first input line contains a single integer, N (1 &le; N &le; 100,000), representing the number of votes. Each of the following N input lines contains a candidate name receiving the first-place vote from that voter. Each candidate name is 1-25 letters (lowercase and uppercase), starting in column one.</p>

### 출력

<p>On the first output line, print a single positive integer, C, the number of candidates that cannot win. Each of the remaining C output lines should contain a candidate name that cannot win. The candidate names should be printed in lexicographical order (increasing order).</p>