# [Platinum I] Timetable - 6299

[문제 링크](https://www.acmicpc.net/problem/6299)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 5, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍, 구현

### 문제 설명

<p>You are the owner of a railway system between n cities, numbered by integers from 1 to n. Each train travels from the start station to the end station according to a very specific timetable (always on time), not stopping anywhere between. On each station a departure timetable is available. Unfortunately each timetable contains only direct connections. A passenger that wants to travel from city p to city q is not limited to direct connections however -- he or she can change trains. Each change takes zero time, but a passenger cannot change from one train to the other if it departs before the first one arrives. People would like to have a timetable of all optimal connections. A connection departing from city p at A o&#39;clock and arriving in city q at B o&#39;clock is called optimal if there is no connection that begins in p not sooner than at A and ends in q not later than at B. We are only interested in connections that can be completed during same day.</p>

<p>Write a program that:</p>

<ul>
	<li>reads the number n and departure timetable for each of n cities from the standard input,</li>
	<li>creates a timetable of optimal connections from city 1 to city n,</li>
	<li>writes the answer to the standard output.</li>
</ul>

### 입력

<p>The first line of the input contains an integer n (2 &le; n &le; 100000). The following lines contain n timetables for cities 1, 2, ..., n respectively.</p>

<p>The first line of the timetable description contains only one integer m. Each of the following m lines corresponds to one position in the timetable and contains: departure time A, arrival time B (A &lt; B) and destination city number t (1 &le; t &le; n) separated by single spaces. Departure time A and arrival time B are written in format hh:mm, where hh are two digits representing full hours (00 &le; hh &le; 23) and mm are two digits representing minutes (00 &le; mm &le; 59). Positions in the timetable are given in non-decreasing order according to the departure times. The number of all positions in all timetables does not exceed 1000000.</p>

### 출력

<p>The first line of the output contains an integer r -- the number of positions in the timetable being the solution. Each of the following r lines contains a departure time A and an arrival time B separated by single space. The time format should be like in the input and positions in the timetable should be ordered increasingly according to the departure times. If there is more then one optimal connection with the same departure and arrival time, your program should output just one.</p>