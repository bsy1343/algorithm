# [Platinum V] SIRO Challenge - 10681

[문제 링크](https://www.acmicpc.net/problem/10681)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 15, 맞힌 사람: 14, 정답 비율: 56.000%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 비트마스킹, 최단 경로, 비트필드를 이용한 다이나믹 프로그래밍, 플로이드–워셜, 외판원 순회 문제

### 문제 설명

<p>You are now participating in the Summer Training Camp for Programming Contests with your friend Jiro, who is an enthusiast of the ramen chain SIRO. Since every SIRO restaurant has its own tasteful ramen, he wants to try them at as many different restaurants as possible in the night. He doesn&#39;t have plenty of time tonight, however, because he has to get up early in the morning tomorrow to join a training session. So he asked you to find the maximum number of different restaurants to which he would be able to go to eat ramen in the limited time.</p>

<p>There are \(n\) railway stations in the city, which are numbered \(1\) through \(n\). The station \(s\) is the nearest to the camp venue. \(m\) pairs of stations are directly connected by the railway: you can move between the stations \(a_i\) and \(b_i\) in \(c_i\) minutes in the both directions. Among the stations, there are \(l\) stations where a SIRO restaurant is located nearby. There is at most one SIRO restaurant around each of the stations, and there are no restaurants near the station \(s\). It takes \(e_i\) minutes for Jiro to eat ramen at the restaurant near the station \(j_i\).</p>

<p>It takes only a negligibly short time to go back and forth between a station and its nearby SIRO restaurant. You can also assume that Jiro doesn&#39;t have to wait for the ramen to be served in the restaurants.</p>

<p>Jiro is now at the station \(s\) and have to come back to the station in \(t\) minutes. How many different SIRO&#39;s can he taste?</p>

### 입력

<p>The input is a sequence of datasets. The number of the datasets does not exceed \(100\). Each dataset is formatted as follows:</p>

<pre>
n m l s t
a<sub>1</sub> b<sub>1</sub> c<sub>1</sub>
:
:
a<sub>m</sub> b<sub>m</sub> c<sub>m</sub>
j<sub>1</sub> e<sub>1</sub>
:
:
j<sub>l</sub> e<sub>l</sub>
</pre>

<p>The first line of each dataset contains five integers:</p>

<ul>
	<li>
	<p>\(n\) for the number of stations,</p>
	</li>
	<li>
	<p>\(m\) for the number of directly connected pairs of stations,</p>
	</li>
	<li>
	<p>\(l\) for the number of SIRO restaurants,</p>
	</li>
	<li>
	<p>\(s\) for the starting-point station, and</p>
	</li>
	<li>
	<p>\(t\) for the time limit for Jiro.</p>
	</li>
</ul>

<p>Each of the following \(m\)&nbsp;lines contains three integers:</p>

<ul>
	<li>
	<p>\(a_i\) and \(b_i\) for the connected stations, and</p>
	</li>
	<li>
	<p>\(c_i\) for the time it takes to move between the two stations.</p>
	</li>
</ul>

<p>Each of the following \(l\) lines contains two integers:</p>

<ul>
	<li>
	<p>\(j_i\) for the station where a SIRO restaurant is located, and</p>
	</li>
	<li>
	<p>\(e_i\) for the time it takes for Jiro to eat at the restaurant.</p>
	</li>
</ul>

<p>The end of the input is indicated by a line with five zeros, which is not included in the datasets.</p>

<p>The datasets satisfy the following constraints:</p>

<ul>
	<li>
	<p>\(2 \le n \le 300\)</p>
	</li>
	<li>
	<p>\(1 \le m \le 5{,}000\)</p>
	</li>
	<li>
	<p>\(1 \le l \le 16\)</p>
	</li>
	<li>
	<p>\(1 \le s \le n\)</p>
	</li>
	<li>
	<p>\(1 \le t \le 100{,}000\)</p>
	</li>
	<li>
	<p>\(1 \le a_i, b_i \le n\)</p>
	</li>
	<li>
	<p>\(1 \le c_i \le 1{,}000\)</p>
	</li>
	<li>
	<p>\(1 \le j_i \le n\)</p>
	</li>
	<li>
	<p>\(1 \le e_i \le 15\)</p>
	</li>
	<li>
	<p>\(s \ne j_i\)</p>
	</li>
	<li>
	<p>\(j_i\)&#39;s are distinct.</p>
	</li>
	<li>
	<p>\(a_i \ne b_i\)</p>
	</li>
	<li>
	<p>\((a_i, b_i) \ne (a_j, b_j)\) and \((a_i, b_i) \ne (b_j, a_j)\) for any \(i \ne j\)</p>
	</li>
</ul>

<p>Note that there may be some stations not reachable from the starting point \(s\).</p>

### 출력

<p>For each data set, output the maximum number of different restaurants where Jiro can go within the time limit.</p>