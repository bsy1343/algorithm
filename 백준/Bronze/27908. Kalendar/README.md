# [Bronze I] Kalendar - 27908

[문제 링크](https://www.acmicpc.net/problem/27908)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 233, 정답: 141, 맞힌 사람: 116, 정답 비율: 61.376%

### 분류

구현, 문자열

### 문제 설명

<p>Magdalena likes calendars, and she makes her own calendar for each month.</p>

<p>Each day of the month is represented with exactly three characters:</p>

<ul>
	<li>If the day number is single-digit, then it is represented as &#39;<code>..X</code>&#39;. For example, the number $7$ is represented as &#39;<code>..7</code>&#39;</li>
	<li>If the day number is double-digit, then it is represented as &#39;<code>.XY</code>&#39;. For example, the number $17$ is represented as &#39;<code>.17</code>&#39;.</li>
</ul>

<p>Each row of the calendar represents a week, and each week consists of $7$ days. If the week doesn&rsquo;t have all the $7$ days (because the month doesn&rsquo;t start on Monday, or it doesn&rsquo;t end on Sunday), then the missing days are replaced with &#39;<code>...</code>&#39;.</p>

<p>Magdalena also wants her calendar to be pretty. She will decorate it in the following way: she will fill the upper and lower sides with &#39;<code>-</code>&#39; (ASCII 45), the left and right sides with &#39;<code>|</code>&#39; (ASCII 124), and the corners with &#39;<code>+</code>&#39; (ASCII 43).</p>

<p>For example, the format of Magdalena&rsquo;s calendar, when the month has 31 days and starts on Wednesday, is the following:</p>

<pre style="text-align: center;">
+&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;+
|........1..2..3..4..5|
|..6..7..8..9.10.11.12|
|.13.14.15.16.17.18.19|
|.20.21.22.23.24.25.26|
|.27.28.29.30.31......|
+&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;&ndash;+</pre>

<p>Your task is to determine the format of Magdalena&rsquo;s calendar if it has $n$ days, and the first day of the month is the $x$-th day of the week. For example, if $x = 1$, the month starts on Monday, and if $x = 5$, it starts on Friday.</p>

<p>Note: We assume the first day of the week is Monday.</p>

### 입력

<p>The first and only line contains integers $n$ and $d$ ($1 &le; n &le; 99$, $1 &le; d &le; 7$), the number of days in the month, and the day it starts with.</p>

### 출력

<p>Print Magdalena&rsquo;s calendar.</p>

### 힌트

<p>Clarification of the second example: Note that, although there is only one day in the month, the calendar still has the format of seven days per row.</p>