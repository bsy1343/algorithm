# [Gold II] ACM Revenge - 9407

[문제 링크](https://www.acmicpc.net/problem/9407)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 9, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

수학, 그래프 이론, 그래프 탐색, 이분 탐색, 깊이 우선 탐색

### 문제 설명

<p>Treasure hunters from all over the world have gathered together near the site of the Amazing Corridors of Mesopotamia (known as ACM among the treasure hunters).</p>

<p>&ldquo;Over the years, many of us have entered ACM and never came back; now is the time for us to end this. We have gathered here to take revenge.&rdquo; These morale-raising words of the newly elected leader, do not affect you. You know better the purpose of the project ACM Revenge; this is all about the treasures hidden in ACM.</p>

<p>Data gathered from old Mesopotamian scripts provide the following insights:</p>

<ol>
	<li>ACM is a collection of rooms connected to each other via a number of one-way corridors. It is impossible to travel along a corridor in the wrong way.</li>
	<li>There is an entrance room connected to the outside world. Each room in the ACM can be reached by a unique path from that entrance room.</li>
	<li>Some rooms have no outgoing corridors. These rooms are filled with treasures, and as soon as one reaches them he/she and all the treasures inside will be teleported outside ACM, somewhere near the entrance.</li>
	<li>Other rooms have exactly two outgoing corridors. At any given time, exactly one of these two corridors is blocked by a huge stone. As soon as someone enters the free corridor, the stone moves to block that corridor and frees the other one. In each of these rooms, there are a number of traps, each capable of killing one person. However each trap is used at most once and becomes inactive afterwards.</li>
</ol>

<p>The new leader&rsquo;s plan is to send in treasure hunters one by one. As soon as one gets killed, his/her screaming is heard at the entrance; then another treasure hunter enters ACM. From the data you&rsquo;ve collected, you know precisely what the map of ACM looks like, and how many working traps are still remaining in each room. You also know the corridors&nbsp;that are free right now. You want to be the first person who reaches one of the treasure rooms. You figure out that the m<sup>th</sup> person who enters ACM reaches the first treasure room. Unfortunately, you need the help of a computer program to compute m.</p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case contains a single integer 1 &le; N &le; 20000, the number of rooms in ACM. N lines follow, containing the descriptions of the 1<sup>st</sup>, 2<sup>nd</sup>, &hellip; and the N<sup>th</sup> rooms. The ith line contains three integers 0 &le; p<sub>i</sub> &le; n, 0 &le; f<sub>i</sub> &le; 1 and 0 &le; t<sub>i</sub> &le; 100000. p<sub>i</sub> is the number of the room on the other end of&nbsp;the corridor leading to the ith room; p<sub>i</sub> = 0 means that the i<sup>th</sup> room is the entrance. The number f<sub>i</sub> is 1 if the corridor leading to the i<sup>th</sup> room is currently free and is 0 otherwise. t<sub>i</sub> shows the number of working traps located in the i<sup>th</sup> room. The input terminates with a line containing 0. It&rsquo;s guaranteed that f<sub>i</sub> = 1 for the entrance room, and that t<sub>i</sub> = 0 for all rooms having no outgoing corridors. The input is terminated by a line containing &ldquo;0&rdquo;.</p>

### 출력

<p>For each test case, write a single line containing m&minus;1, the number of people who die before the first person reaches a treasure room.</p>