# [Silver III] Metal Harvest - 23918

[문제 링크](https://www.acmicpc.net/problem/23918)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 62, 정답: 29, 맞힌 사람: 26, 정답 비율: 48.148%

### 분류

수학, 그리디 알고리즘, 정렬, 사칙연산

### 문제 설명

<p>You are in charge of deploying robots to harvest Kickium from a nearby asteroid. Robots are not designed to work as a team, so only one robot can harvest at any point of time. A single robot can be deployed for up to&nbsp;<b>K</b>&nbsp;units of time in a row before it returns for calibration, regardless of how much time it spends on harvesting during that period. Harvesting can only be done during specific time intervals. These time intervals do not overlap. Given&nbsp;<b>K</b>&nbsp;and the time intervals in which harvesting is allowed, what is the minimum number of robot deployments required to harvest at all possible times?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow.</p>

<p>The first line of each test case gives two space separated integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>K</b>: the number of time intervals in which harvesting is allowed, and the maximum duration a robot can be deployed for before returning for calibration.</p>

<p>The next&nbsp;<b>N</b>&nbsp;lines contain a pair of space separated integers&nbsp;<b>S<sub>i</sub></b>&nbsp;and&nbsp;<b>E<sub>i</sub></b>: the start time and the end time of the i-th interval respectively. Please note that intervals don&#39;t include the time unit starting at the moment&nbsp;<b>E<sub>i</sub></b>, so for example an interval with (<b>S<sub>i</sub></b>&nbsp;= 2;&nbsp;<b>E<sub>i</sub></b>&nbsp;= 5) has duration of 3 time units.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of times robot deployment is needed so that for each interval there is one robot harvesting at that time.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>All&nbsp;<b>S<sub>i</sub></b>&nbsp;are distinct.</li>
	<li>For any two intervals (<b>S<sub>i</sub></b>,<b>E<sub>i</sub></b>) and (<b>S<sub>j</sub></b>,<b>E<sub>j</sub></b>) with&nbsp;<b>S<sub>i</sub></b>&nbsp;&lt;&nbsp;<b>S<sub>j</sub></b>,&nbsp;<b>E<sub>i</sub></b>&nbsp;&lt;&nbsp;<b>S<sub>j</sub></b>.</li>
</ul>

### 힌트

<p>In Sample Case #1, we deploy the robot at time instant 1 and it becomes available for the interval [1, 6]. However, it harvests only for the time range [1, 5]. After that we deploy the robot at 6 and it becomes available for the time interval [6, 11]. This deployment covers both the remaining intervals [8, 9] and [10, 11]. There are multiple optimal strategies here. For example, we can deploy the second robot at 7. It would then cover the range [7, 12], thus harvesting for the intervals [8, 9] and [10, 11].</p>

<p>In Sample Case #2, we deploy the robot at time instant 1, and it becomes available for [1, 3], but harvests for [1, 2] as [2, 3] is not part of any interval. After that we deploy the robot at 3 for the time range [3, 5] in which the robot harvests for the interval [3, 5]. The third deployment is done at time instant 13 making the robot available for time range [13, 15]. However, it harvests only for the interval [13, 14]. Thus three deployments are needed to cover all the intervals.</p>