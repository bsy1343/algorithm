# [Silver I] Izbori - 15361

[문제 링크](https://www.acmicpc.net/problem/15361)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 64 MB

### 통계

제출: 102, 정답: 52, 맞힌 사람: 31, 정답 비율: 46.269%

### 분류

브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>In a land with developed democracy far, far away, presidential elections for the football association are taking place. This land consists of N counties, and each county has its own football association. There are M presidential candidates labeled with 1, 2, &hellip; M. Each of the football associations will select exactly one candidate to cast their vote for. The winner of the election is the candidate with the most votes. If multiple candidates get the most amount of votes, the winner is the one with the smallest label.</p>

<p>During the election campaign, candidates visited the counties and tried to gain their sympathies. After having met all the candidates, each county&rsquo;s football association determined the order in which they would cast their vote for each candidate.</p>

<p>For example, let&rsquo;s assume that there are four candidates in the election and that one county&rsquo;s order is 2, 1, 4, 3. This means that, unless they revoke their candidacy, the candidate with label 2 will get the county&rsquo;s vote. If candidate 2 revokes their candidacy, and candidate 1 is still in the race, then they will get the vote, and so on.</p>

<p>Zdravko is a passionate football fan, and also a close friend of candidate with label K. He wants to know which candidate will win if neither of the candidates revokes their candidacy.</p>

<p>He also wants to know what is the minimal number of candidates he must persuade to revoke their candidacy in order for his friend, candidate K, to become the president of the football association.</p>

<p>Zdravko is currently dealing with other problems, so he is hoping that you will answer these questions.</p>

### 입력

<p>The first line of input contains the numbers N (1 &le; N &le; 100), M (1 &le; M &le; 15) and K (1 &le; K &le; M) from the task.</p>

<p>Each of the following N lines contains the orders given by the counties&rsquo; football associations, i.e. a permutation of the first M natural numbers.</p>

### 출력

<p>You must output the answers to the questions from the task, each in its own line.</p>

### 힌트

<p>Clarification of the first test case: The land where the elections are being held consists of 3 counties, and there are 4 candidates for the president of the association. If neither of the candidates revoke their candidacy, candidate 3 will win the elections with two votes. Candidate 1 will only win if all the other candidates revoke their candidacy.</p>

<p>Clarification of the second test case: There is only one candidate, Zdravko&rsquo;s friend, so they will surely win.</p>