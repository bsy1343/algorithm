# [Platinum III] Graduation Requirements (Large) - 12292

[문제 링크](https://www.acmicpc.net/problem/12292)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 7, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

그리디 알고리즘, 브루트포스 알고리즘, 정렬, 애드 혹

### 문제 설명

<p>Before graduating from Awesome Programmer University, students traditionally perform certain &quot;graduation requirements&quot;. One of these is driving around a traffic circle backwards. For most people, this is crazy enough, but as an extra challenge, <em>you</em> want to see if you can go backwards around the traffic circle multiple times without stopping.</p>

<p>The traffic circle consists of <strong>N</strong> intersections, spaced evenly around the circle. A car would normally enter the traffic circle at one intersection, and then every second, it will move to the next counter-clockwise intersection, until eventually it reaches its destination and leaves.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12292.%E2%80%85Graduation%E2%80%85Requirements%E2%80%85(Large)/78da2471.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/12292.%E2%80%85Graduation%E2%80%85Requirements%E2%80%85(Large)/78da2471.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12291/images-56.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>You have been watching cars enter and leave the traffic circle for <strong>X</strong> seconds. For each car, you record the time it enters the circle, as well as the intersections it enters and leaves at. All cars are moving counter-clockwise at the rate of 1 intersection per second. Each car you watched exited the circle before coming back to the intersection it entered at. There are multiple lanes on the traffic circle, so multiple cars can occupy the same position at the same time.</p>

<p>If you had planned it just right, how long could you have driven clockwise in the traffic circle during this time? You must enter the circle at some integer time &gt;= 0, leave at time &lt;= <strong>X</strong>, and once you leave, you are not allowed to come back. When in the traffic circle, you must travel clockwise at the rate of 1 intersection per second. You want to play it safe (well, as safe as driving backwards on a traffic circle can be), so you must never touch or pass by another car. In particular, you cannot leave the circle at an intersection at which another car is entering at the same moment, and you cannot enter the circle at an intersection at which another car is leaving at the same moment. You can choose when and where to enter and leave the circle.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. The first line of any test case describes the number <strong>C</strong> of cars you observed. The second line contains two integers, <strong>X</strong> and <strong>N</strong> &mdash; the time (in seconds) for which you observed the circle, and the number of intersections on the circle. Next <strong>C</strong> lines describe the cars you have seen. Each of those lines contains three integers <strong>s</strong><strong><sub>i</sub></strong>, <strong>e</strong><strong><sub>i</sub></strong> and <strong>t</strong><strong><sub>i</sub></strong> &mdash; the intersection at which the car entered the circle, the intersection on which it left and the time at which it entered. The intersections are numbered from 1 to <strong>N</strong>, counterclockwise (that is, the intersection number 2 is the next intersection counterclockwise from number 1).</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100</li>
	<li>1 &le; <strong>s</strong><strong><sub>i</sub></strong>, <strong>e</strong><strong><sub>i</sub></strong> &le; <strong>N</strong></li>
	<li><strong>s</strong><strong><sub>i</sub></strong> &ne; <strong>e</strong><strong><sub>i</sub></strong>&nbsp;</li>
	<li>0 &le; <strong>t</strong><strong><sub>i</sub></strong></li>
	<li>Each observed car leaves the circle at time <strong>X</strong> or earlier.</li>
	<li><span style="line-height:1.6em">3 &le; </span><strong style="line-height:1.6em">N</strong><span style="line-height:1.6em"> &le; 10</span><sup style="line-height:1.6em">10</sup></li>
	<li>1 &le; <strong>X</strong> &le; 10<sup>10</sup></li>
	<li>0 &le; <strong>C</strong> &le; 1000</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the maximum number of seconds you can travel on the circle. Note that y can be zero both in the case where you cannot enter the circle at all and in the case when you can enter it, but can&#39;t travel even one intersection.</p>

<p>Remember that you are required to enter the circle at a time expressed as an integer number of seconds &mdash; you must enter at an integer time, and thus arrive at each intersection at an integer time.</p>

### 힌트

<p>In the first sample case, we have one car, going as in the picture in the statement. There are a number of ways allowing us to travel backwards for one second &mdash; for instance, we can enter at intersection 1 at time 1 (we can&#39;t enter at time zero, because the other car is there), and travel to intersection 4 (we can&#39;t go on to intersection 3, as we would pass the other car which will be going from 3 to 4). Another option is to enter at intersection 4 at time 0, and travel to intersection 3 (and then exit).</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12292.%E2%80%85Graduation%E2%80%85Requirements%E2%80%85(Large)/9ec896ce.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/12292.%E2%80%85Graduation%E2%80%85Requirements%E2%80%85(Large)/9ec896ce.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12291/images-57.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:252px; width:251px" /></p>

<p>In the second sample case, we can travel for two seconds by entering at intersection 5 at time 1, and traveling backwards to intersection 3. In the third sample case, we can&#39;t even enter the circle - there are cars at all intersections at every full second. In the fourth case there are no cars, so we can just enter the circle at any point at time 0 and travel round and round till time 6. In the fifth case we can enter the circle, but since there are only three intersections, we will always collide with the other car if we try to move to the next one.</p>

<p>Note: Driving against the direction of the traffic on a traffic circle is typically not a wise thing to do and may cause harm to you or other people. Google (and Google Code Jam in particular) encourages you not to try this.</p>