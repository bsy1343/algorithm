# [Bronze I] Office Hours - 34387

[문제 링크](https://www.acmicpc.net/problem/34387)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 38, 정답: 36, 맞힌 사람: 31, 정답 비율: 93.939%

### 분류

구현

### 문제 설명

<p>Your professor is wondering when to schedule their office hours for the upcoming semester. Since every student has a different schedule, the professor needs to find the best time to host office hours.</p>

<p>Your task is to output the time and day of the week that your professor should host office hours given the availability of the students. Your professor can host one hour of office hours per week, so you must find the time at which the largest number of students are available to attend office hours.</p>

<p>For simplicity, $24$-hour time will be used (there is no AM/PM). Each day starts at midnight which is denoted as 00:00. The last hour of the day starts at 23:00 (11:00 PM).</p>

### 입력

<p>The first line of input will be an integer $1 \leq N \leq 10\,000$, the number of availability reports that follow. The next $N$ lines will contain each person's name, a day they have availability, an integer $1 \leq X \leq 24$ indicating how many hours they are available on that day, and $X$ integers indicating the hours in $24$-hour time when they are available that day, each separated by a space.</p>

<p>An integer $H$ denoting when a student has availability means that they are available from H:00 until (H+1):00. All integers $H$ representing times will be in the range $[0, 23]$.</p>

<p>Note that a student's name may appear on more than one line if they have availability on more than one day of the week. Names are guaranteed to have no spaces.</p>

### 출력

<p>A string with the best day ($D$) and time ($T$) for office hours: </p>

<pre>Your professor should host office hours D @ T</pre>

<p>where $D$ is one of "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", or "Saturday" (without the quotes) and $T$ is a zero-padded time representing the start of the office hours in $24$-hour time. (If the time is before 10:00, then there should be a leading $0$ as in 01:00.)</p>

<p>Note that the solution is guaranteed to be unique. That is, there is a single day and time for which the maximum number of students are available to attend office hours.</p>