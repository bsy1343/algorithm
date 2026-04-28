# [Silver II] Meeting Room Arrangement - 9620

[문제 링크](https://www.acmicpc.net/problem/9620)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 95, 정답: 80, 맞힌 사람: 77, 정답 비율: 85.556%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Faculty of Engineering of PSU has a large meeting room for faculty staff to organize events and meetings. The use of the meeting room must be reserved in advance. Since the meeting room is available in 10 hours per day and there may be several events that want to use the meeting room, the best usage policy is to maximize the number of events in day.&nbsp;</p>

<p>Suppose that the meeting room is available from time 0 to 10 (10 hours). Given the list of start time and finish time of each candidate event, you are to write a program to select the events that fit in the meeting room (i.e. their times do not overlap) and give the maximum number of events in a day.&nbsp;</p>

### 입력

<p>The first line is a positive integer n (1&lt;=n&lt;=100) which determines the number of days (test cases). Each test case consists of the time of the candidate events (less than 20 events). Each event time includes 2 integers which are start time(s) and finish time(f), 0&lt;=s&lt;=9, 1&lt;=f&lt;=10 and s &lt;f . The line containing 0 0 indicates the end of each test case. Note that an event must use at least 1 hour.&nbsp;</p>

### 출력

<p>For each test case, print out the maximum number of events that can be arranged in the meeting room.</p>