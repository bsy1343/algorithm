# [Gold V] Always on the run - 6317

[문제 링크](https://www.acmicpc.net/problem/6317)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 58, 정답: 32, 맞힌 사람: 21, 정답 비율: 48.837%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Screeching tires. Searching lights. Wailing sirens. Police cars everywhere. Trisha Quickfinger did it again! Stealing the &lsquo;Mona Lisa&rsquo; had been more difficult than planned, but being the world&rsquo;s best art thief means expecting the unexpected. So here she is, the wrapped frame tucked firmly under her arm, running to catch the northbound metro to Charles-de-Gaulle airport.</p>

<p>But even more important than actually stealing the painting is to shake off the police that will soon be following her. Trisha&rsquo;s plan is simple: for several days she will be flying from one city to another, making one flight per day. When she is reasonably sure that the police has lost her trail, she will fly to Atlanta and meet her &lsquo;customer&rsquo; (known only as Mr. P.) to deliver the painting.</p>

<p>Her plan is complicated by the fact that nowadays, even when you are stealing expensive art, you have to watch your spending budget. Trisha therefore wants to spend the least money possible on her escape flights. This is not easy, since airlines prices and flight availability vary from day to day. The price and availability of an airline connection depends on the two cities involved and the day of travel. Every pair of cities has a &lsquo;flight schedule&rsquo; which repeats every few days. The length of the period may be different for each pair of cities and for each direction.</p>

<p>Although Trisha is a good at stealing paintings, she easily gets confused when booking airline flights. This is where you come in.</p>

### 입력

<p>The input file contains the descriptions of several scenarios in which Trisha tries to escape. Every description starts with a line containing two integers n and k. n is the number of cities through which Trisha&rsquo;s escape may take her, and k is the number of flights she will take. The cities are numbered 1, 2, . . . , n, where 1 is Paris, her starting point, and n is Atlanta, her final destination. The numbers will satisfy 2 &le; n &le; 10 and 1 &le; k &le; 1000.</p>

<p>Next you are given n(n - 1) flight schedules, one per line, describing the connection between every possible pair of cities. The first n - 1 flight schedules correspond to the flights from city 1 to all other cities (2, 3, ..., n), the next n - 1 lines to those from city 2 to all others (1, 3, 4, ..., n), and so on.</p>

<p>The description of the flight schedule itself starts with an integer d, the length of the period in days, with 1 &le; d &le; 30. Following this are d non-negative integers, representing the cost of the flight between the two cities on days 1, 2, . . . d. A cost of 0 means that there is no flight between the two cities on that day.</p>

<p>So, for example, the flight schedule &ldquo;3 75 0 80&rdquo; means that on the first day the flight costs 75, on the second day there is no flight, on the third day it costs 80, and then the cycle repeats: on the fourth day the flight costs 75, there is no flight on the fifth day, etc.</p>

<p>The input is terminated by a scenario having n = k = 0.</p>

### 출력

<p>For each scenario in the input, first output the number of the scenario, as shown in the sample output. If it is possible for Trisha to travel k days, starting in city 1, each day flying to a different city than the day before, and finally (after k days) arriving in city n, then print &ldquo;The best flight costs x.&rdquo;, where x is the least amount that the k flights can cost.</p>

<p>If it is not possible to travel in such a way, print &ldquo;No flight possible.&rdquo;.</p>

<p>Print a blank line after each scenario.</p>