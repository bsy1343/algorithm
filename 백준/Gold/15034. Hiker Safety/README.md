# [Gold II] Hiker Safety - 15034

[문제 링크](https://www.acmicpc.net/problem/15034)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 13, 맞힌 사람: 13, 정답 비율: 65.000%

### 분류

구현, 자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>Times are hard at the Association of Chartered Mountaineers.</p>

<p>The growth of their pedestrian sport has slowed to a crawl. Instead of taking up mountaineering, younger potentials are gravitating towards warmer indoor activities such as snooker, musical chairs, and programming contests.</p>

<p>To win over more members, the Association is going to organise a series of new time trial orienteering events next year. The route for the first race will be a short run through the Cairngorms, with every contestant following the same route designated by marker points but all starting at different times.</p>

<p>Because hiking can be dangerous, and many of the contestants will be inexperienced, the competition committee drew up two rules:</p>

<ul>
	<li>Every contestant needs to keep a specific maximum distance away from the next-closest contestant, in either direction, at all times.</li>
	<li>Every contestant should be given personal space. If a contestant needs a personal space of D metres, nobody else should ever come closer than that at any time. This distance varies according to level of experience.</li>
</ul>

<p>The hardest part of orienteering is the pathfinding; once a contestant knows where to go next, they can get there in almost no time (for the purposes of this problem, instantaneously).</p>

<p>In fact, while the inaugural ACM &quot;Icy-Cold Peak Contest&quot; is already underway, pathfinding is turning out to be a problem: nobody is sure whether they can move next without breaking any of the conditions on minimum and maximum distance.</p>

<p>Help the runners reach the end of their route by computing a list of who should move to the next goal point, and at what time.</p>

### 입력

<ul>
	<li>One line containing an integer B (1 &le; B &le; 50000), the maximum separation allowed between any two runners.</li>
	<li>One line containing an integer P (3 &le; P &le; 1000), the number of marker points along the route.</li>
	<li>One line containing P unique space-separated integers d<sub>1</sub> . . . d<sub>P</sub>&nbsp;(0 &le; d<sub>P</sub> &le; 10<sup>6</sup>), with di being the distance of the i-th vertex from the starting point d<sub>1</sub> = 0.</li>
	<li>One line containing an integer K (2 &le; K &le; 1000), the number of hikers on the landscape.</li>
	<li>K further lines, each containing the pair of space-separated integers A<sub>i</sub> and V<sub>i</sub> (1 &le; A<sub>i</sub> &le; 10<sup>6</sup>; 1 &le; V<sub>i</sub> &le; P), the minimum separation distance and current marker position&nbsp;respectively for the i-th person.</li>
</ul>

<p>The initial configuration of hikers will be legal according to the minimum and maximum distance rules. The hikers will be given in increasing order of distance from the start.</p>

### 출력

<p>If it is not possible to get everyone to the end of the route without breaking minimum or maximum distance requirements, output impossible.</p>

<p>Otherwise, output a space-separated list of moves on one line, each describing which person should make the next move.</p>

<p>If anyone falls off the landscape, your answer will not be judged as correct. However, once someone has arrived at the end of their journey they cease to count towards any rule violations.</p>