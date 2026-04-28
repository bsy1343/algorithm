# [Gold I] Electric Car Rally - 9480

[문제 링크](https://www.acmicpc.net/problem/9480)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 8, 맞힌 사람: 8, 정답 비율: 20.513%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 다이얼

### 문제 설명

<p>In an attempt to demonstrate the practicality of electric cars, ElecCarCo is sponsoring a cross-country road rally. There are n charging stations for the rally where cars may check in and charge their batteries</p>

<p>The rally may require multiple days of travel. Each car can travel four hours (240 minutes) between charges. A car must be plugged into a charger for two minutes for each minute of travel time. Cars start the rally at noon on the first day, fully charged. Cars are permitted remain at a station even after they are fully charged.</p>

<p>It is only possible to drive directly between select pairs of stations. Variations in traffic conditions, road conditions, availability of HOV lanes, etc., result in different travel times along each route depending upon the time of day at which travel along that route begins. All roads are two-way, and the prevailing conditions affect travel in both directions.</p>

<p>The winner is the first car to reach checkpoint n-1, starting form checkpoint 0. Other than the starting and ending conditions, cars may pass through the stations in any order, and need not visit all stations to complete the course.</p>

<p>Write a program to determine the earliest time, expressed as the total number of minutes elapsed since the start of the rally, at which a car could reach the final checkpoint.</p>

### 입력

<p>There will be several test cases in the input. Each test case starts with a line containing n (1&le;n&le;500), the number of stations, and m (1&le;m&le;1,000), the number of connecting road segments.</p>

<p>This is followed by m blocks, each block describing one road segment. A road segment block has the following structure:</p>

<p>Each block begins with a single line containing two integers, a and b (0&le;a,b&le;n-1, a&ne;b). These numbers are the two checkpoints connected by that segment. The connections are undirected: a segment permitting travel from station a to station b will also allow travel from station b to station a.</p>

<p>This is followed by from one to twenty &#39;travel lines&#39; describing travel times. Each of the travel lines contains 3 numbers: Start, Stop, (0&le;Start&lt;Stop&le;1,439), and Time (0&lt;Time&lt;1,000). Start and Stop are the time of day (expressed in minutes since midnight) described by this line, and Time is the travel time, in minutes, required to traverse this road segment if travel begins at any time in the range [Start..Stop], inclusive. The first travel line in a block will have a start time of 0 (midnight, or 00:00). The final travel line in a block will have a stop time of 1439 (i.e., 23:59, or 1 less than 24 hours times 60 minutes). Adjacent travel lines in the input will be arranged in order, and the start time of any line after the first is one higher than the stop time of the preceding line. The travel lines will cover all times from 00:00 to 23:59.</p>

<p>Input will end with a line with two 0s. All test cases will describe a course that can be completed by the cars.</p>

### 출력

<p>For each test case, output a single integer representing the smallest number of minutes needed to complete the rally. Output no spaces, and do not separate answers with blank lines.</p>