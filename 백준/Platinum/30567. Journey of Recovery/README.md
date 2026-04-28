# [Platinum IV] Journey of Recovery - 30567

[문제 링크](https://www.acmicpc.net/problem/30567)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 29, 정답: 17, 맞힌 사람: 6, 정답 비율: 37.500%

### 분류

데이크스트라, 그래프 이론, 파싱, 최단 경로, 문자열

### 문제 설명

<p>You are making an international trip with several stops to blow off steam and celebrate your progression onto the NWERC. Since your flights are often booked with low-cost airlines, you always run the risk of your flights being cancelled last minute leaving you stuck in the airport. Normally this is no problem---take the next flight---but you have to arrive at the NWERC on time.</p>

<p>If any one of your flights is cancelled at the same moment you are about to depart, and all others operate as planned, you will book a new itinerary from there to your final destination. Assuming you always plot the fastest route, by how much will you be delayed in the worst case?</p>

### 입력

<ul>
	<li>One line containing the number of flight connections overall, $n$ ($1 \le n \le 10^6$).</li>
	<li>$n$ further lines, the $i$th of which contains four space-separated fields:
	<ul>
		<li>The code of the departure airport, $s_i$ ($1 \le |s| \le 20$)</li>
		<li>The time of departure in days, minutes, and hours, in the format <code><strong>d</strong>d<strong>hh</strong>:<strong>mm</strong></code> ($1 \le d \le 365$, $0 \le hh \le 23$, $0 \le mm \le 59$).</li>
		<li>The code of the arrival airport, $t_i$ ($1 \le |s| \le 20$)</li>
		<li>The time of arrival in days, minutes, and hours, in the format <code><strong>d</strong>d<strong>hh</strong>:<strong>mm</strong></code> ($1 \le d \le 365$, $0 \le hh \le 23$, $0 \le mm \le 59$).</li>
	</ul>
	</li>
	<li>One line containing the number of flight connections in your itinerary, $m$ ($1 \le m \le n$).</li>
	<li>One line containing the $m$ indices $f_{1}\ldots f_{m}$ of flight connections, in the order you plan to take them.</li>
</ul>

<p>Flights always go between different airports and always strictly forward in time. For every consecutive pair $u, v$ in your itinerary, the arrival time of flight $u$ is guaranteed to be less than or equal to the departure time of flight $v$.</p>

<p>Transfers are instantaneous---that is to say, arriving at an airport and departing from it in the same minute is possible. Likewise, if one planned flight is cancelled, you may board another departing at exactly the same time.</p>

### 출력

<p>Output the maximum amount by which you could be delayed if any one of the given flights is cancelled at its moment of boarding. If you would not be delayed at all in any case (or can even arrive early) simply output $0$.</p>

<p>If you cannot always make it to the destination at all, output <code>stranded</code> instead.</p>