# [Silver III] TRAJEKT - 3235

[문제 링크](https://www.acmicpc.net/problem/3235)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 52, 정답: 32, 맞힌 사람: 23, 정답 비율: 58.974%

### 분류

구현, 그리디 알고리즘, 정렬, 시뮬레이션

### 문제 설명

<p>Towns A and B are connected with a ferry line.</p>

<p>We know the legth of the ferry ride, the minimal boarding time (needed for unloading and loading), and the times of the ferry departures from the both towns.</p>

<p>You have to write a program that will calculate the minimal number of ferries needed to keep the schedule.</p>

<p>Note: the ferries ride only by the schedule, that is the ferry cant&#39;t ride if it is not their daeparture time.&nbsp;</p>

### 입력

<p>First line of the input file consists of two integers K and L divided by a single space, 1 &le; K,L &le; 1000, the legth of the ferry ride between the two towns and the minimal boarding time (in minutes).</p>

<p>The next line consists of an integer A, 1 &le; A &le; 1440, number of departures from the town A. The next A lines consist of departure times from town A.</p>

<p>The next line consists of an integer B, 1 &le; B &le; 1440, number of departures from the town B. The next B lines consist of departure times from town B.</p>

<p>All departure times for a town are given in chronological order and written in the HH:MM format (hours and minutes). If the minutes or the hour of the departure time are a one digit number, they will be preceeded by a leading zero.</p>

<p>The times are between 00:00 and 23:59.</p>

### 출력

<p>The first and the only line of the output file should consist of the minimal number of ferries needed to keep the schedule.</p>