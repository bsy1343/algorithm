# [Gold III] Rings of Saturn - 11081

[문제 링크](https://www.acmicpc.net/problem/11081)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 15, 정답: 9, 맞힌 사람: 8, 정답 비율: 61.538%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>There has been reported an infiltration of our Earth&rsquo;s population by Enceladians, from Saturn&rsquo;s moon Enceladus, posing as humans.</p>

<p>While the names of specific individuals have not been identified we, the Android Communications Ministry, do know from intercepted communications that the Enceladians are strategically located in major cities and that they work together in rings of exactly seven individuals. Each individual suspected of being an Enceladian has been given an identifier. Each ring is isolated from the other rings in terms of communication.</p>

<p>Each communication assessed by the Ministry has a threat level assigned to it. Your task is to examine the associations implied by the communications and to locate any rings of exactly seven individuals for further investigation. The threat level of a ring of individuals is calculated by summing the threat levels of all communications carried out by the ring.</p>

### 입력

<p>The input contains a single test case.</p>

<p>The first line of input will specify the number of individuals n (0 &lt; n &le; 200 000) and the number of communications lines m (1 &le; m &le; 100 000) to be processed.</p>

<p>The next m lines each contain three integers separated by a single space, id<sub>s</sub>, id<sub>r</sub> (0 &le; id<sub>s</sub>, id<sub>r</sub> &lt; n; id<sub>s</sub> &ne; id<sub>r</sub>) and t (0 &lt; t &le; 10), being the sender&rsquo;s identifier, the receiver&rsquo;s identifier and the threat level of the communication respectively.</p>

### 출력

<p>Output consists of information on all rings of exactly seven individuals who have proven communication between each other.</p>

<p>The information for each ring must be on a separate line and be composed of the id of the individual with the lowest identifier who was involved in the ring, followed by a single space then the total threat level of the ring.</p>

<p>Rings should be output in descending order of the total threat level for the ring. If any rings have the same threat level, rings should then be output in ascending order of the identifier used for the ring.</p>

<p>If no rings of exactly seven individuals are discovered, the output should be:</p>

<pre>
There is currently no threat to Earth</pre>