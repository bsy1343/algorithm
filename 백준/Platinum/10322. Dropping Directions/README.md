# [Platinum IV] Dropping Directions - 10322

[문제 링크](https://www.acmicpc.net/problem/10322)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 28, 정답: 23, 맞힌 사람: 22, 정답 비율: 84.615%

### 분류

애드 혹, 오일러 경로, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Your sports club has a rivaling sports club in the same city. They did some awful things to you and you want to get back at them. You have learned that they are planning on doing a &rsquo;drop&rsquo;: they drive people blindfolded to a city none of the participants know and tell them to find a specific place, the goal. They then have fun randomly walking through the city trying to find the goal.</p>

<p>You intend to spoil their fun thoroughly: you know that they promise a prize for whoever reaches the goal first, so the participants will use all available means to get to the goal. Indeed, you are fairly sure that if you set up official-looking signposts in that city in advance, they will probably follow them. You therefore decide to place signposts throughout the city so that no matter where the participants get dropped, they can follow the signposts to the goal; this takes out the element of &rsquo;randomly walking around&rsquo; and therefore all the fun.</p>

<p>However, official-looking signposts are not cheap and attract a lot of attention, particularly from police officers. So you wish to minimize the number of signposts you have to place in the city. This may lead the participants to use a very slow detour, but they don&rsquo;t know the city anyway, so they won&rsquo;t find out.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10322.%E2%80%85Dropping%E2%80%85Directions/c59e943d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10322.%E2%80%85Dropping%E2%80%85Directions/c59e943d.png" data-original-src="https://www.acmicpc.net/upload/images2/droping.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:305px; width:524px" /></p>

<p style="text-align:center">City of 2nd and 3rd sample input. The 2nd input has the goal at intersection 5 and the 3rd at 4.</p>

<p>You get yourself a map of the city and start planning. You notice one nice aspect of the city: all intersections are cross-shaped, so it is easy to predict where participants will go to: they will just go to the opposite side of the intersection they arrive at. If a participant gets dropped at an intersection with a signpost, he or she will follow that sign; otherwise they go in an arbitrary direction until they hit a sign post. You know that participants never get dropped at the goal (that would be silly).</p>

### 입력

<p>On the first line one positive number: the number of test cases, at most 100. After that per test case:</p>

<ul>
	<li>one line with two space-separated integers n and g (5 &le; n &le; 100 000 and 1 &le; g &le; n): the number of intersections and the goal, respectively.</li>
	<li>n lines, each with four space-separated integers a, b, c and d (1 &le; a, b, c, d &le; n). The i-th line gives the intersections you end up at if you follow one of the roads adjacent to the i-th intersection; more precisely, participants who approach the i-th intersection coming from intersection a will continue towards intersection c and vice versa, while participants coming from intersection b will continue towards intersection d and vice versa.</li>
</ul>

<p>Each intersection connects to four different other intersections.</p>

### 출력

<p>Per test case:</p>

<ul>
	<li>one line with a single integer: the smallest number of signposts needed to ruin the fun.</li>
</ul>