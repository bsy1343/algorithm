# [Platinum II] Migration - 18308

[문제 링크](https://www.acmicpc.net/problem/18308)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 10, 맞힌 사람: 7, 정답 비율: 30.435%

### 분류

최대 유량, 최대 유량 최소 컷 정리, 정렬, 그래프 이론

### 문제 설명

<p>Each year, the Wildlife Protection Agency (WPA) tracks the migration of birds in order to assess the health of the bird population. During the migration, the birds stop in places they consider safe to rest and eat. There are only a limited number of such spots and the WPA uses them to check the tags attached to the birds&rsquo; legs. Birds can follow different routes, which means that the WPA might have to cover several places to be sure to count all the birds (it is not a problem if some of the birds are counted multiple times as they have unique tags).</p>

<p>The routes that the birds follow can be seen as a directed graph in which the vertices correspond to the possible stops of birds and an edge links the node a to the node b whenever it is possible that a bird flies from a to b without stopping. The routes follow the birds&rsquo; journey and therefore it is impossible to have a loop in this graph.</p>

<p>The WPA now needs to decide on a set of places it will monitor. Each bird resting in a monitored place will be accounted for and the agency wants the set of monitored places to be such that every bird is counted at least once. The WPA has the choice of different technologies to monitor places. Some technologies are cheap but have a low range and can only monitor small places, while others are a bit more expensive but can cover larger places. Obviously it is not reasonable to use two different technologies as it would imply to tag the birds with two different systems of tags. For each resting place r of the bird, the agency has determined the price P(r) of the cheapest technology needed to monitor it. It is always possible to monitor a place r with all technologies that have a price p &gt; P(r). Therefore, if the WPA wants to monitor a set E of places, it will need to pay a price max<sub>r&isin;E</sub>(P(r)) per resting place, i.e., a total of max<sub>r&isin;E</sub>(P(r)) &times; |E|, where |E| is the size of E. Finally, some places are simply impossible to monitor, because of their size or terrain.</p>

<p>The WPA asks you to compute the minimum total price it has to pay to count at least once each of the migrating birds.</p>

### 입력

<p>The input consists of the following lines:</p>

<ul>
	<li>On the first line, two space-separated integers N (the number of stops) and M (the number of links).</li>
	<li>On line i + 2 for 0 &le; i &lt; N, the integer P(i), which is the price of the cheapest technology to monitor place i. If a place is impossible to monitor, a value of &minus;1 is used.</li>
	<li>Each of the M remaining lines contains two space-separated integers a and b (0 &le; a, b &lt; N, a &ne;&nbsp;b) meaning that a bird can fly from place a to place b. It is guaranteed that the same pair a, b will not appear twice.</li>
</ul>

<p>By convention, place 0 corresponds to the birds&rsquo; summer home and place N &minus; 1 corresponds to the birds&rsquo; destination. Note that it might be possible to monitor only place 0 or only place N &minus; 1. You are guaranteed that the graph is acyclic, that all places are reachable from 0 and that place N &minus; 1 is reachable from all places.</p>

### 출력

<p>Your output should contain a single line with a single integer corresponding to the minimum total price required to monitor all the birds during their migration. If it is not possible to count all the birds, then you should output &minus;1.</p>

### 제한

<ul>
	<li>2 &lt; N &le; 2 000;</li>
	<li>2 &lt; M &le; 2 000;</li>
	<li>For all 0 &le; i &lt; N we have P(i) = &minus;1 or 1 &le; P(i) &le; 10<sup>9</sup>.</li>
</ul>