# [Bronze II] Finalists - 26310

[문제 링크](https://www.acmicpc.net/problem/26310)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 140, 정답: 106, 맞힌 사람: 102, 정답 비율: 76.119%

### 분류

구현, 정렬, 시뮬레이션

### 문제 설명

<p>Frank is trying his best to win a slot in Asia Pacific to the World Finals. But he could not find the selection rules to estimate his chance. Last night, Frank&rsquo;s coach found the following document.</p>

<pre>
=====================================================================
World Finals team selection rules from Asia Pacific (2022 cycle)

Due to COVID-19 outbreak, this year&#39;s Asia Pacific rules will
again be quite different from those of usual years. The plan
for having an Asia Pacific semi-final contest (play-off contest)
has been cancelled and postponed to the next year.

Only the following six regionals will be held this year.

Ho Chi Minh, Vietnam
Jakarta, Indonesia
Manila, Philippines
Seoul, Korea
Taoyuan, Taiwan
Yokohama, Japan

We have set a team participation rule. This rule is a special one
for this year (2022 cycle) only.

Teams from a hosting country (Indonesia, Japan, Korea, Philippines,
Taiwan and Vietnam) can only join the regional held in their own
country. Universities from non-hosting countries should choose a
regional. Note that all teams from a single university have to join
the same regional.

World Finals team selection rules are as follows.

Apply Steps A1 through A4 below in this order.

A1. Define the site score of a regional as follows.
0.56 * number of universities in regional
+ 0.24 * number of teams in regional
+ 0.14 * number of universities in preliminary contests
+ 0.06 * number of teams in preliminary contests
+ 0.3 * number of foreign teams

Only teams or universities solving at least one problem are counted.

A2. Sort our six regionals according to their site scores.

A3. Let N be the number of World Finals slots given from the ICPC
Headquarters. Until the sum of the number of allocated slots
reaches N, allocate slots to regionals, one by one, in the
descending order of their site scores. When all six regionals
are allocated one slot each, continue from the regional with the
highest site score in the round robin fashion.

A4. For each regional, let M be the number of slots allocated to the
regional through the step A3. Select the M highest ranked
universities. The team with the highest rank in the university
is automatically selected.
=====================================================================
</pre>

<p>Assume that the document is the final selection rules for teams from Asia Pacific. Given N and the necessary numbers to calculate the site scores, please write a program to compute the number of slots allocated to Taiwan.</p>

### 입력

<p>There are seven lines in the inputs. The first line contains $N$, the number of World Finals slots given from the ICPC Headquarters. Each of the following six lines consists of one string $s$ and five non-negative integers $p_t , p_u, r_t , r_u, f$. The string and the numbers are separated by spaces. $s$ is a country hosting a regional contest. $p_t$ is the number of teams solving at least one problem in the preliminary contests hosted by the country $s$. $p_u$ is the number of universities solving at least one problem in the preliminary contests hosted by the country $s$. $r_t$ is the number of teams solving at least one problem in the regional contest hosted by the country $s$. $r_u$ is the number of universities solving at least one problem in the regional contest hosted by the country $s$. $f$ is the number of foreign teams solving at least one problem in the regional hosted by the country $s$.</p>

### 출력

<p>Output the number of slots allocated to Taiwan.</p>

### 제한

<ul>
	<li>$N$ is at least $6$ and at most $50$.</li>
	<li>Each line has a distinct $s$.</li>
	<li>$s$ is among the following countries: Vietnam, Indonesia, Philippines, Korea, Taiwan, and Japan.</li>
	<li>$0 &le; p_u &le; p_t &le; 5000$</li>
	<li>$0 &le; r_u &le; r_t &le; 300$</li>
	<li>$0 &le; f &le; 30$</li>
	<li>You may assume that distinct regional contests have different site scores.</li>
	<li>The size of an input file is no more than 64 kilobytes.</li>
</ul>

### 힌트

<p>The document in the problem statement is not official. Please refer to Prof. CJ Hwang&rsquo;s blog <a href="https://icpcasia.wp.txstate.edu/">https://icpcasia.wp.txstate.edu/</a> for the official rules.</p>