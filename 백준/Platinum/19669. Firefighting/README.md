# [Platinum II] Firefighting - 19669

[문제 링크](https://www.acmicpc.net/problem/19669)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 79, 정답: 30, 맞힌 사람: 27, 정답 비율: 38.028%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색, 그리디 알고리즘, 트리

### 문제 설명

<p>A terrible fire swept through Mouseopolis, the capital of the Great Kingdom of Mouseland. Many residents of Mouseopolis suffered great losses as the fire razed through large chunks of the town. As the residents of Mouseopolis picked themselves up and slowly put their livelihoods back together after the fire, Squeaky &mdash; the benevolent king of Mouseland &mdash; vowed to prevent such a horrifying disaster from ever occurring again.</p>

<p>Mouseland consists of N towns, numbered from 1 to N. There are N &minus; 1 bidirectional roads linking towns &mdash; each road is a direct link between some pair of towns. These roads may have varying lengths. The road network is designed such that it is possible to travel between any two towns using some sequence of roads. To quickly put out any fires, Squeaky has decided that fire stations should be built in some of the towns in Mouseland. These fire stations would then be able to dispatch fire trucks to mount an effective response to fires in any town.</p>

<p>Squeaky&rsquo;s advisors have determined that an effective response can be mounted only if the nearest fire station is no more than K kilometres away from the fire, as fire trucks would only then be able to reach the fire before the fire gets out of control. However, fire stations are expensive to maintain, so Squeaky would like to minimise the number of fire stations that need to be built.</p>

<p>Your task is to determine which towns fire stations should be built in, such that the required number of fire stations is minimised.</p>

<p>Note that fire stations may only be built in towns, and fires may only occur in towns.</p>

### 입력

<p>Your program must read from standard input.</p>

<p>The first line contains two integers, N and K, defined above.</p>

<p>N &minus; 1 lines follow, describing the N &minus; 1 bidirectional roads. Each of these lines contain three integers, A<sub>i</sub>, B<sub>i</sub>, and D<sub>i</sub>, meaning that towns A<sub>i</sub> and B<sub>i</sub> are linked by a bidirectional road of length D<sub>i</sub> kilometres.</p>

### 출력

<p>Your program must print to standard output.</p>

<p>The output should contain exactly two lines.</p>

<p>The first line should contain a single integer, F, the number of fire stations required.</p>

<p>The second line should contain exactly F distinct integers, specifying the towns in which fire stations should be built. This list may be printed in any order. If there are multiple possible ways, all of them will be accepted.</p>

### 제한

<ul>
	<li>1 &le; N &le; 3 &times; 10<sup>5</sup></li>
	<li>1 &le; K &le; 10<sup>15</sup></li>
	<li>1 &le; A<sub>i</sub>, B<sub>i</sub> &le; N for all 1 &le; i &le; N &minus; 1</li>
	<li>1 &le; D<sub>i</sub> &le; 10<sup>9</sup> for all 1 &le; i &le; N &minus; 1</li>
</ul>