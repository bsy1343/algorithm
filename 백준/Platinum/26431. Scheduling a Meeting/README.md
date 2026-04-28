# [Platinum V] Scheduling a Meeting - 26431

[문제 링크](https://www.acmicpc.net/problem/26431)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

그리디 알고리즘, 구현, 시뮬레이션, 정렬

### 문제 설명

<p>Scheduling meetings at Google is not an easy task. Even with the help of Google Calendar, Ada has a lot of difficulty with it!</p>

<p>Ada works as a Software Engineer at Google, and needs to get approval for her new project. In order to get an approval, she needs to meet with at least $\mathbf{K}$ of $\mathbf{N}$ Tech Leads.</p>

<p>Ada has access to the calendars of all $\mathbf{N}$ Tech Leads. For each Tech Lead, Ada can see all their scheduled meetings. The timeline in this problem can be viewed as $\mathbf{D}$ consecutive hours, and all meetings are in $[0, \mathbf{D}]$ hours range, with both ends being integer numbers. Scheduled meetings, even for the same person, can overlap (people are notorious for this at Google!).</p>

<p>Ada needs to schedule an $\mathbf{X}$-hour-long meeting in the interval of $[0, \mathbf{D}]$ hours, with both ends being integer numbers as well. At least $\mathbf{K}$ of $\mathbf{N}$ Tech Leads should be present for the whole meeting, that is their calendar should be completely free for the entire meeting duration.</p>

<p>Unfortunately, it might be the case that it is already impossible to find a slot to schedule such an $\mathbf{X}$-hour-long meeting. In that case, Ada will need to persuade some Tech Leads to cancel their existing meetings.</p>

<p>What is the minimum number of scheduled meetings that need to be canceled so that Ada can meet with at least $\mathbf{K}$ Tech Leads?</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>The first line of each test case contains four integers $\mathbf{N}$, $\mathbf{K}$, $\mathbf{X}$, $\mathbf{D}$. $\mathbf{N}$ represents the number of Tech Leads, $\mathbf{K}$ is the minimum number of Tech Leads Ada needs to meet, $\mathbf{X}$ is the length of the meeting that needs to be set up, and $\mathbf{D}$ is the upper bound of the $[0, \mathbf{D}]$ hour range representing the timeline of the problem &mdash; no meeting can end after $\mathbf{D}$.</p>

<p>The second line of each test case contains an integer $\mathbf{M}$, representing the number of scheduled meetings.</p>

<p>$\mathbf{M}$ lines follow. The $i$-th of these contains three integer numbers $\mathbf{P_i}$, $\mathbf{L_i}$, and $\mathbf{R_i}$. These numbers represent that a Tech Lead $\mathbf{P_i}$ has a scheduled meeting between the hours $\mathbf{L_i}$ and $\mathbf{R_i}$, not including the endpoints (that is, the meeting can be seen as an $(\mathbf{L_i}, \mathbf{R_i})$ interval).</p>

<p>Note that all $\mathbf{M}$ meetings in the test case are independent, even if some of them have the same starting and ending time.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the minimum number of scheduled meetings that needs to be canceled so that Ada can schedule an $\mathbf{X}$-hour-long meeting with at least $\mathbf{K}$ Tech Leads.</p>

### 힌트

<p>The timeline of this problem can be seen as an $[0, \mathbf{D}]$ interval &mdash; that is, $\mathbf{D}$ consecutive hours, where $\mathbf{D}$ can be bigger than $24$.</p>

<p>A meeting in the interval $(L, R)$ means the meeting starts at the beginning of the $L$-th hour, and ends at the beginning of the $R$-th hour, covering the whole time period in between, without any gaps (i.e. the interval is continuous). Endpoints are not included in an $(L, R)$ interval. For Tech Leads attending Ada&#39;s scheduled meeting, Ada&#39;s new meeting can border some of their other non-canceled meetings &mdash; that is, it can start right when another meeting ends, or end right when another meeting starts, or both. A Tech Lead cannot attend Ada&#39;s meeting if they have any other non-canceled meetings overlapping with Ada&#39;s meeting at any point.</p>

<p>See explanation of the sample test cases for more clarity.</p>