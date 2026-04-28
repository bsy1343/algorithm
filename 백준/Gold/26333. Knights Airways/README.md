# [Gold II] Knights Airways - 26333

[문제 링크](https://www.acmicpc.net/problem/26333)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

방향 비순환 그래프, 자료 구조, 그래프 이론, 위상 정렬, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>&ldquo;This is Knights Airways Flight 472 requesting permission to take off&hellip;over&hellip;kshh.&rdquo; Knights Airways was recently created to take UCF Knights to their vacation destinations at a cost every college student can afford. One day, while trying to get to his favorite travel spot, Knights Airways owner Uppin Diare realized there was a problem. His flight from Orlando arrived into Tampa on time, but his connecting flight from Tampa to Miami had already taken off. Not wanting other travelers to experience this, Mr. Diare wants flights to be ordered in such a way that no passenger would miss their connections. Mr. Diare has asked you to determine a flight ordering that would prevent people from experiencing the annoyances of a missed connection. Note that this flight ordering will dictate from which cities passengers can fly to which other cities. For example, if the flight ordering puts the flight from City A to City B before the flight from City B to City C, then passengers can fly from A to B, B to C, and A to C.</p>

<p>Given a list of flights, determine an ordering that would allow all passengers flying into a city to arrive before the departure of the flights leaving the same city. You may assume that no traveler, once departing a city, can make any number of connecting flights and return back to their origin.</p>

### 입력

<p>The first input line contains a positive integer, n, indicating the number of flight schedules to order. The description of each flight schedule is as follows: Each flight schedule will start with a line containing a single integer, f (1 &le; f &le; 10,000), which is the number of flights for the given schedule. The following f lines will contain the origin city, destination city, and flight number for each flight, each separated by a single space. There will be no leading or trailing spaces on any input line. All cities will consist of up to 25 uppercase letters. Multiple flights from the same origin city to the same destination city may exist, but will have different flight numbers. All flight numbers for a given flight schedule will be unique positive integers less than 100,000 with no leading zeros.</p>

### 출력

<p>For each flight schedule, on a single line, output the ordered flight numbers separated by a space. If there are multiple ways of ordering the flights, choose the ordering that comes first numerically based on flight numbers. You are guaranteed that each flight schedule will produce one unique answer. Note that all the flights in the input will be in the output. In particular, when there are multiple flights from the same origin city to the same destination city, every one of these flights will be listed in the output.</p>