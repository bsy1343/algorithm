# [Gold I] Vacation Rentals - 4844

[문제 링크](https://www.acmicpc.net/problem/4844)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 66, 정답: 6, 맞힌 사람: 6, 정답 비율: 18.750%

### 분류

0-1 너비 우선 탐색, 데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>The Fifth Season Resort consists of a number of condominiums which are frequently occupied by their owners. At other times, however, they are available as vacation rentals. Since the resort has no more than 26 condominiums, they are identified by upper case letters.</p>

<p>One day the resort manager&#39;s telephone rings. She receives a reservation request for a vacation rental with an arrival date of December 2 and a departure date of December 9. She looks at the table of reservations, but doesn&#39;t find a condominium that would be available for the entire period. Most of the existing reservations were made by the owners of the respective condominiums (who want to stay in their own units), so it is not desirable to move an existing reservation from one unit to another. As she continues to scrutinize the table of reservations, however, she has an idea and says: &quot;I can put you up in unit B for the first three nights, and transfer you to unit F for the rest of your stay. Will that work?&quot; The person agrees and the reservation is made. Notice that reservations are done by &quot;nights&quot;, so that a one night reservation implies that the guest departs one day after the arrival.</p>

<p>The goal of this problem is to satisfy such reservation requests (without changing existing reservations), with a minimum number of transfers (from one unit to another) during the requested period.</p>

### 입력

<p>The input consists of a number of cases. The first line of each case contains two positive integers M and N. M is the number of consecutive days for which the resort&#39;s manager has a reservation table, and N is the number of units (condominiums) in the resort. The units are labeled by upper case letters starting at &#39;A&#39;. There are at most 100 days and at least 3 rooms in the reservation table. The days are numbered 1, 2, ..., M for simplicity.</p>

<p>The reservation table is given in the next M lines. Each line (row) of the table refers to a particular day (in the order 1, 2, 3, etc.), and each column of the table to a particular unit of the resort (in the order &#39;A&#39;, &#39;B&#39;, &#39;C&#39;, etc.). An entry of &#39;X&#39; means that the corresponding unit is reserved for that day, while an &#39;O&#39; means that the unit is available.</p>

<p>The reservation table is followed by one line of input, the reservation request, consisting of two integers: the arrival date and the departure date. The arrival date is in the range 1..M. The departure date is greater than the arrival date and less than or equal to M+1.</p>

<p>The end of input is indicated by M = N = 0.</p>

### 출력

<p>For each test case, first print the case number followed by a colon and a blank line. If the reservation request can be met, the output will show a reservation schedule with a minimum number of transfers (from one unit to another) during the stay at the resort. Each line of the schedule corresponds to a consecutive stay in the same unit, and should be printed in the following way:</p>

<p>&lt;unit&gt;: &lt;start date&gt;&minus;&lt;end date&gt;</p>

<p>where &lt;unit&gt; is the unit, &lt;start date&gt; is the date on which the guests moves into the unit, and &lt;end date&gt; is the date on which the guests moves out of the unit. The lines in the schedule should be ordered in ascending order by the start date.</p>

<p>Tie breaking rule. There may be several schedules with a minimum number of transfers. In these cases, choose the schedule which uses the lowest &quot;unit label&quot; in the first day (so unit A is given preference to unit B). If there is still a tie, choose the schedule with the lowest unit number in the second day, and so on.</p>

<p>If the reservation request cannot be met, print the line:</p>

<p>Not available</p>

<p>instead of the schedule.</p>

<p>Separate the output of consecutive cases by a blank line.</p>