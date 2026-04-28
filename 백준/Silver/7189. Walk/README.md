# [Silver V] Walk - 7189

[문제 링크](https://www.acmicpc.net/problem/7189)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 73, 정답: 36, 맞힌 사람: 31, 정답 비율: 46.269%

### 분류

수학, 문자열, 사칙연산, 파싱

### 문제 설명

<p>Mart takes a walk every day and his sports watch registers the duration and speed of each segment of uniform movement of his walk. After the walk, Mart can download a log file to his computer. Find the total distance and the average speed of the walk based on this file.</p>

### 입력

<p>The first line of input contains an integer $N$ ($1 &le; N &le; 10\,000$) and each of the subsequent $N$ lines contains the following (space-separated) data about one segment:</p>

<ul>
	<li>the duration of the segment in minutes and seconds in the form $M$<code>m</code>$S$<code>s</code>, where $M$ is the integer number of minutes (and the minutes part is omitted for times less than a minute) and $S$ is the integer number of seconds (which never exceeds 59);</li>
	<li>the word <code>kiirusega</code>;</li>
	<li>the speed on this segment expressed as minutes and seconds per kilometre in the form $M$<code>m</code>$S$<code>s/km</code>, where $M$ is the integer number of minutes and $S$ is the integer number of seconds (which never exceeds $59$), and you may assume Mart needs at least a minute, but less than an hour, per kilometre.</li>
</ul>

<p>You may also assume that the total of the durations of all segments does not exceed $24$ hours.</p>

### 출력

<p>The output should contain two lines</p>

<ul>
	<li>on the first line the total distance of the walk, rounded to metres, in the form $L$<code>m</code>, where $L$ is the integer number of metres;</li>
	<li>on the second line the average speed in the form $V$<code>km/h</code>, where $V$ is a real number; the output value must not differ from the correct answer by more than $0.001$.</li>
</ul>