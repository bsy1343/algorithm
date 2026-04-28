# [Platinum IV] Inspection - 8215

[문제 링크](https://www.acmicpc.net/problem/8215)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 73, 정답: 22, 맞힌 사람: 15, 정답 비율: 31.915%

### 분류

센트로이드, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>The railway network of the Byteotian Railways (BR) consists of bidirectional tracks connecting certain pairs of stations. Each pair of stations is connected by at most one segment of tracks. Furthermore, there is a unique route from every station to every other station. (The route may consist of several segments of tracks, but it may not pass through any station more than once.)</p>

<p>Byteasar is an undercover inspector of the BR. His job is to pick one of the stations (denote it by S) for centre of his operations and to travel to all other stations. His journey should be as follows:</p>

<ul>
	<li>Byteasar starts in station S.</li>
	<li>Next, he picks one of the stations he did not yet control and goes to it along the shortest path (by train, of course), inspects the station, and then goes back to S.</li>
	<li>The crooked employees of BR warn one another of Byteasar&#39;s comings. To deceive them, Byteasar picks the next station for control in such a way that he sets off from the station &nbsp;in different direction than the last time, i.e., along a different segment of tracks leaving from S.</li>
	<li>Each station (except S) is inspected exactly once.</li>
	<li>After inspecting the last station Byteasar does not come back to S.</li>
</ul>

<p>The travel time along every segment of tracks takes the same amount of time: one hour.</p>

<p>Byteasar intends to consider all the stations as the initial station S. For each of them he wants to know the order of inspecting the remaining stations that minimises the total travel time, provided that it is possible at all for that particular S.</p>

### 입력

<p>The first line of the standard input contains a single integer n (1 &le; n &le; 1,000,000) that denotes the number of stations. These are numbered from 1 to n. The following n-1 lines specify the track segments, one per line. Each of them holds two integers a,b (1 &le; a,b &le; n, a&ne;b), separated by a single space, indicating that there is a track segment connecting the stations a and b. Each track segments appears exactly once in the description.</p>

<p>In tests worth at least 30% of the points it holds additionally that n &le; 2,000.</p>

### 출력

<p>Your program should print n lines on the standard output, each holding a single integer. The one in the i-th line should be the minimum number of hours Byteasar has to spend travelling to inspect the stations when S=i - if inspecting them all is possible for S=i; if it is not, the i-th line should hold the number -1.</p>

### 힌트

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/8215/1.gif" style="height:144px; width:143px" /></p>

<p>The figure illustrates the railway network as specified in the example. It is possible to inspect all the stations only for S=2. One optimal order of inspection is: 7, 4, 8, 6, 1, 5, 3, 9. It results in 23 hours of travel.</p>

<p>&nbsp;</p>