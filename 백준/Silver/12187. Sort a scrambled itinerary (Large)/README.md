# [Silver II] Sort a scrambled itinerary (Large) - 12187

[문제 링크](https://www.acmicpc.net/problem/12187)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 109, 정답: 90, 맞힌 사람: 82, 정답 비율: 83.673%

### 분류

자료 구조, 그래프 이론, 문자열, 그래프 탐색, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Once upon a day, Mary bought a one-way ticket from somewhere to somewhere with some flight transfers.</p>

<p>For example: SFO-&gt;DFW DFW-&gt;JFK JFK-&gt;MIA MIA-&gt;ORD.</p>

<p>Obviously, transfer flights at a city twice or more doesn&#39;t make any sense. So Mary will not do that.</p>

<p>Unfortunately, after she received the tickets, she messed up the tickets and she forgot the order of the ticket.</p>

<p>Help Mary rearrange the tickets to make the tickets in correct order.</p>

### 입력

<p>The first line contains the number of test cases&nbsp;<b>T</b>, after which&nbsp;<b>T</b>&nbsp;cases follow.</p>

<p>For each case, it starts with an integer&nbsp;<b>N</b>. There are&nbsp;<b>N</b>&nbsp;flight tickets follow.</p>

<p>Each of the next 2 lines contains the source and destination of a flight ticket.</p>

### 출력

<p>For each test case, output one line containing &quot;Case #x: itinerary&quot;, where&nbsp;<b>x</b>&nbsp;is the test case number (starting from 1) and&nbsp;<b>itinerary</b>&nbsp;is sorted list of flight tickets which represents the actual itinerary. Each flight segment in the itinerary should be outputted as pair of source-destination airport codes.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>For each case, the input tickets are messed up from an entire itinerary bought by Mary. In other words, it&#39;s ensured can be recovered to a valid itinerary.</li>
	<li>1 &le;&nbsp;<b>N</b>&nbsp;&le; 10<sup>4</sup>.</li>
	<li>(The segment for second case in sample can be seen as below) MIA-ORD, DFW-JFK, SFO-DFW, JFK-MIA</li>
</ul>