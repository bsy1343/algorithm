# [Gold V] Competition - 6093

[문제 링크](https://www.acmicpc.net/problem/6093)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 67, 정답: 18, 맞힌 사람: 15, 정답 비율: 34.091%

### 분류

정렬, 두 포인터

### 문제 설명

<p>K competitors are taking part in a competition. Each of them must finish N full laps of a round circuit. All the competitors start together from the starting line. At the start of the event every runner is in his &lsquo;normal&rsquo; form. While making his laps he is losing his stamina and he is running with lower and lower tempo. That lower tempo means that every lap is done 1 millisecond slower than the previous one. When in normal form competitor with number i is doing one lap for msi milliseconds (msi is a positive integer). The rules of the competition allow a positive integer p<sub>i</sub> (1&le; p<sub>i</sub> &le; N) to be announced for every competitor before the start. On every full p<sub>i</sub> laps done the runner gets an energy drink (while passing the starting line) which returns him to full strength (after that his stamina is dropping again the same way as before). The drinking takes 0 time. It&rsquo;s obvious that while doing N laps every competitor will cross the starting line N times (we count the crossing after the last lap, but do not count the crossing of the line when they start the run).</p>

<p>Write program competition, which determines the maximum number of competitors who will cross the starting line together at any point of the competition (as we are working in milliseconds &ldquo;together&rdquo; means after equal amount of milliseconds after the competition&rsquo;s start)</p>

### 입력

<p>On the first line of the standard input you must read two positive integers, separated with an interval: K &ndash; competitors count and N &ndash; laps count.</p>

<p>After that there are K rows (one for each runner). On every row there are two positive integers: ms<sub>i</sub> - milliseconds for competitor i to run one lap in &ldquo;normal&rdquo; form and p<sub>i</sub> &ndash; lap count on which the runner receives his energy drinks and returns to &ldquo;normal&rdquo; form.</p>

### 출력

<p>Print one single integer &ndash; the determined maximum count of competitors who will cross the starting line together at some moment of the competition..</p>

### 제한

<ul>
	<li>2 &le; K&le; 10 000</li>
	<li>1 &le; N &le; 1 000</li>
	<li>1 &le; ms<sub>i</sub> &le; 1 000 000</li>
	<li>1 &le; p<sub>i</sub> &le; N</li>
</ul>

### 힌트

<p>The runners will do the following laps:</p>

<p>Runner1 &ndash; for 26, 27 and 26 msec.; Runner2 &ndash; for 39, 40 and 41 msec.; Runner3&ndash; for 45, 45 and 45 msec.; Runner4 &ndash; for 56, 57 and 56 msec. Respectively they will cross the starting line at: Runner1 &ndash; after 26, 53, 79 msec.; Runner2&ndash; after 39, 79 and 120 msec;Runner3 &ndash; after 45, 90 and 135 msec; Runner4 &ndash; after 56, 113 and 169 msec. The only case when more than one runner will cross the starting line is after 79 milliseconds when runner1 and runner2 will be on the line together.&nbsp;</p>