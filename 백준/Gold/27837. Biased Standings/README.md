# [Gold V] Biased Standings - 27837

[문제 링크](https://www.acmicpc.net/problem/27837)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 42, 맞힌 사람: 37, 정답 비율: 78.723%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Usually, results of competitions are based on the scores of participants. However, we are planning a change for the next year of IPSC. During the registration each team will be able to enter a single positive integer &ndash; their preferred place in the ranklist. We would take all these preferences into account, and at the end of the competition we will simply announce a ranklist that would please all of you.</p>

<p>But wait... How would that ranklist look like if it won&#39;t be possible to satisfy all the requests?</p>

<p>Suppose that we already have a ranklist. For each team, compute the distance between their preferred place and their place in the ranklist. The sum of these distances will be called the <i>badness</i> of this ranklist.</p>

<p>Given team names and their preferred placements find one ranklist with the minimal possible badness.</p>

### 입력

<p>The first line of the input file contains an integer <b>T</b> specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case looks as follows: The first line contains <b>N</b> &ndash; the number of teams participating in the competition. Each of the next <b>N</b> lines contains a team name (a string of letters and numbers) and its preferred place (an integer between 1 and <b>N</b>, inclusive). No two team names will be equal. The team name has a maximum length of 20 characters.</p>

### 출력

<p>For each of the test cases output a single line with a single integer &ndash; the badness of the best ranklist for the given teams.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 20</li>
</ul>

### 힌트

<p>In the first test case, one possible ranklist with the minimal badness is:</p>

<pre>
1. noobz
2. llamas
3. Winn3rz
4. 5thwheel
5. NotoricCoders
6. WhoKnows
7. StrangeCase
</pre>

<p>In the second test case all ranklists are equally good.</p>