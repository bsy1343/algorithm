# [Platinum I] Big Brother - 1880

[문제 링크](https://www.acmicpc.net/problem/1880)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 10, 맞힌 사람: 7, 정답 비율: 38.889%

### 분류

그래프 이론, 애드 혹, 백트래킹

### 문제 설명

<p>A spy agency wants to monitor all communications in a computer network. They have a budget for at most 10 installations of spying software on 10 of the host computers on the network. For the software to work properly each communication line A&ndash;B must have at least one host A or B being monitored.</p>

### 입력

<p>Input will consist of a number of network scenarios. Each scenario will contain:</p>

<ul>
	<li>An integer n (10 &le; n &le; 2500) on a line on its own, giving the number of hosts in the network.</li>
	<li>A line of data for each host (thus n lines in total) giving the list of other hosts to which the host has a direct communication line. The hosts are named 0, 1, . . . , n&minus;1; the first line of data gives the neighbours of host 0, the second those of host 1, and so on up to host n &minus; 1.<br />
	Each of these lines consists of an integer d (1 &le; d &lt; n) which is the number of neighbours host k has, followed by d integers which are the neighbouring hosts&rsquo; names, separated by spaces. The neighbours will be given in numerical order, and will each be valid host names in 0, 1, . . . n &minus; 1 other than k.<br />
	(Note that each of these input lines may thus be up to 2500&times;5 characters in length.)</li>
</ul>

<p>The last line of input will be a &lsquo;0&rsquo; on a line by itself. This line should not be processed.</p>

### 출력

<p>Output will consist of one line for each input network, indicating whether the network can be successfully spied upon by infecting 10 nodes. Each line of the output will consist of &lsquo;Network n: &rsquo;, where n is the scenario number, starting at 1, followed by &lsquo;yes&rsquo; or &lsquo;no&rsquo;.</p>