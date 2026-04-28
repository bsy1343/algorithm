# [Silver IV] On-Call - 22369

[문제 링크](https://www.acmicpc.net/problem/22369)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 65, 정답: 43, 맞힌 사람: 30, 정답 비율: 60.000%

### 분류

구현, 슬라이딩 윈도우

### 문제 설명

<p>Fox Jiro works for a company that runs a social networking site for programmers. His duty is to recover the service as soon as possible when it becomes unavailable.</p>

<p>His predecessor has developed a monitoring system that detects service unavailability based on the frequency of server error responses such as &quot;502 Bad Gateway&quot; and &quot;503 Service Unavailable&quot;. The system records the frequency of server error responses per minute. If the frequency remains high for a while, an alert is triggered and Fox Jiro receives a phone call. After that, if the frequency of server error responses remains low for a while, the alert will be resolved.</p>

<p>In more detail, alerts are triggered and resolved as follows.</p>

<ul>
	<li>Initially, no alert is triggered.</li>
	<li>An alert is triggered when no alert is triggered and the frequency of server error response for each of the last $D$ consecutive minutes is greater than or equal to $U$.</li>
	<li>The alert is resolved when the frequency of server error responses for each of the last&nbsp;$D$ consecutive minutes is less than or equal to $L$.</li>
</ul>

<p>Fox Jiro can receive compensation from the company according to the number of times he received phone calls due to the alerts. Last month, he received phone calls so many times that he forgot how many times the alerts were triggered. Your task is counting the number of alerts triggered based on the record of server error responses.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$N$ $U$ $L$ $D$</p>

<p>$x_1$ $x_2$ $\dots$ $x_N$</p>
</blockquote>

<p>The first line consists of four integers $N$, $U$, $L$, and $D$. $N$ represents the length of the record of the frequency of server error responses. $U$, $L$, and $D$ are the settings that determine the behavior of the monitoring system as explained above. Here, $N$ and $D$ satisfy $1 \le N, D \le 2 \times 10^5$. $U$ and $L$ satisfy $0 \le L &lt; U \le 2 \times 10^5$.</p>

<p>The second line consists of $N$ integers. The $i$-th integer represents the frequency of server error responses that occurred in the $i$-th minute. Each of the integers in the second line is between $0$ and $2 \times 10^5$ inclusive.</p>

### 출력

<p>Print the number of times the alerts were triggered in one line.</p>