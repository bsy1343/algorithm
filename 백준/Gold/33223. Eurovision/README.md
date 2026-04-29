# [Gold II] Eurovision - 33223

[문제 링크](https://www.acmicpc.net/problem/33223)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 6, 정답 비율: 60.000%

### 분류

그리디 알고리즘, 매개 변수 탐색, 이분 탐색

### 문제 설명

<p>It's that time of the year! Time again for Eurovision (and FPC)! Although, there is something rather special about this edition. In an unexpected turn of events, Delft was chosen to host Eurovision in the Aula. As you might expect, all tickets were sold out in a matter of seconds: students from all over Delft's faculties are eager to attend such a special event. Naturally, their enthusiasm is sparked by the same question: "<em>What's the longest time a contestant has to sing without breathing, given that they breathe optimally?</em>"</p>

<p>A song is divided into $n$ musical segments, where the $i$th musical segment has pitch intensity $a_i$ and is $b_i$ seconds in length. Each contestant sings these musical segments consecutively, with no pause in between, but will take some deep breaths at key moments (consider the time it takes to breathe negligible). To maintain a pleasing rhythm of music, performers only breathe immediately after a <em>local minimum</em> in pitch intensity (i.e., after a musical segment $i$ where $a_{i-1} &gt; a_i &lt; a_{i+1}, 1 &lt; i &lt; n$) and do not take more than $k$ breaths in total.</p>

<p>Note:</p>

<ul>
	<li>Eurovision contestants have an inclination towards algorithmic thinking, and therefore, they all breathe optimally: within the constraints, the longest time between two breaths is as short as possible.</li>
	<li>Naturally, a singer will breathe right before starting to sing and immediately after finishing, so these two breaths do <strong>NOT</strong> count towards the total number of breaths.</li>
</ul>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing two integers: $n$ ($1\leq n\leq 10^4$), the number of musical segments in the song, and $k$ ($0\leq k &lt; n$), the maximum number of breaths that can be taken while performing the song.</li>
	<li>$n$ lines containing two integers each, $a_i$ and $b_i$ ($1 \leq a_i, b_i \leq 10^9$), the pitch and length (in seconds) of the $i$th musical segment.</li>
</ul>

### 출력

<p>Output the longest time (in seconds) between two breaths, for an optimal performance of the song.</p>