# [Platinum III] Museum Guards - 4106

[문제 링크](https://www.acmicpc.net/problem/4106)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 10, 맞힌 사람: 8, 정답 비율: 42.105%

### 분류

그래프 이론, 최대 유량

### 문제 설명

<p>A museum has hired some guards and is trying to build a schedule for them. The museum would like to build a 24-hour schedule for the guards, such that:</p>

<ul>
	<li>Each guard works during the same time intervals every day.</li>
	<li>Each guard works within his/her time windows of availability, which s/he specifies.</li>
	<li>Each guard works at most the amount of time s/he is able, which s/he also specifies.</li>
	<li>The guards can only shift (start or stop working) on half hour boundaries. (e.g. 04:00 or 04:30, but not 04:15).</li>
	<li>The guards are only scheduled for shifts if they are available to work at all times during those shifts. (e.g. if a guard‟s window of availability opens at 03:05, they cannot be scheduled at 03:00.)</li>
	<li>The minimum number of guards on duty at any time during the day is maximized. This improves security of the museum.</li>
</ul>

<p>Write a program to help the museum staff determine the maximum number of guards that they can maintain at all times throughout a 24-hour day, given the constraints of the guards‟ availability. You may assume that guard exchanges are instantaneous. That is, if 2 guards leave and 2 other guards arrive at the same time, the museum is guarded by 2 guards through this exchange.</p>

### 입력

<p>There will be multiple test cases. Each test case begins with a line containing a single integer N (1 &le; N &le; 50), the number of guards available. There will then be N blocks of data, one for each guard.</p>

<p>Each block provides the preferences of one guard. A block begins with two integers, K (1 &le; K &le; 50) and M (1 &le; M &le; 1440), in that order; K is the number of time intervals specifying when the guard is available for work, and M is the maximum number of minutes s/he is able to work each day. The next K lines each contains the starting and ending time, in that order, of a time interval where the guard is available, separated by whitespace. These time intervals may overlap. The union of all K time intervals provides the complete set of times at which the guard is available.</p>

<p>A starting or ending time is formatted as HH:MM (00 &le; HH &le; 23, 00 &le; MM &le; 59). Midnight is represented by 00:00. When the ending time is smaller than the starting time, it means the guard is available for working past midnight. For example, the interval &ldquo;23:00 03:00&rdquo; means the guard is available from 11pm at night to 3am in the morning. If the starting and ending times are equal, then the guard is available for work during any time intervals throughout the day. The last test case is followed by a line with a single 0.</p>

### 출력

<p>For each test case, output a single integer, representing the minimum number of guards on duty at any given time during the day, using a schedule that maximizes this value. That is, output the largest integer k, such that there is a schedule where at any given moment, there are k guards on duty at the museum, assuming instantaneous exchanges specified above. Do not print any blank lines between answers.</p>