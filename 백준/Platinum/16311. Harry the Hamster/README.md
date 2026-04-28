# [Platinum I] Harry the Hamster - 16311

[문제 링크](https://www.acmicpc.net/problem/16311)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 127, 정답: 45, 맞힌 사람: 42, 정답 비율: 43.299%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 게임 이론

### 문제 설명

<p>Harry the Hamster lives in a giant hamster cage. Inside the cage there is a set of n plastic balls connected by unidirectional hamster tubes of varying lengths. Harry is currently in ball s and his bed is in ball t.</p>

<p>Being a simple hamster, Harry&rsquo;s brain halves are not so great at communicating with each other and have a mind of their own. Harry&rsquo;s left brain half, usually being active when Harry is in the hamster wheel, likes running for as long as possible. Harry&rsquo;s right brain half, rarely active at all, would like to go to sleep as soon as possible. Together, Harry&rsquo;s brain halves will be navigating Harry through the maze of tubes, in each ball deciding which of the outgoing tubes to follow.</p>

<p>Harry&rsquo;s brain halves get really tired after making a decision and then need to rest a bit, so they cannot make two decisions in a row. Thus, they make decisions on which tube to take in alternating turns, with the left brain half going first. So starting in ball s, Harry&rsquo;s left brain half will decide on a tube to follow, ending in some ball u, where Harry&rsquo;s left brain half will rest and Harry&rsquo;s right brain half will pick an outgoing tube, et cetera.</p>

<p>Counterintuitively, the brain halves are familiar with the entire hamster cage and can plan arbitrarily far ahead. Assuming both brain halves make optimal decisions, how long will it take for Harry to reach his bed? It is guaranteed that each ball has at least one outgoing tube, except the ball containing Harry&rsquo;s bed which has none (there Harry will rest easily). There are no tubes connecting a ball to itself, but there may be multiple tubes going from one ball to another.</p>

### 입력

<ul>
	<li>On the first line are four space-separated integers: the number of plastic balls 1 &le; n &le; 10<sup>5</sup>, the number of tubes 0 &le; m &le; 2 &middot; 10<sup>5</sup>, and the locations of Harry and his bed 0 &le; s, t &lt; n.</li>
	<li>Then m lines follow, each containing three space-separated integers describing a single tube: the ball in which the tube starts 0 &le; a<sub>i</sub> &lt; n, in which it ends 0 &le; b<sub>i</sub> &lt; n and the time it takes to traverse 1 &le; w<sub>i</sub> &le; 10<sup>4</sup>. Note that each tube can only be traversed in one direction.</li>
</ul>

### 출력

<p>Print the time it takes for Harry to reach his bed, or the string <code>infinity</code> if Harry is doomed to roam the tubes forever.</p>