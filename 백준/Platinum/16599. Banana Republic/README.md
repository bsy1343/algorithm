# [Platinum I] Banana Republic - 16599

[문제 링크](https://www.acmicpc.net/problem/16599)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

해 구성하기, 다이나믹 프로그래밍

### 문제 설명

<p>Prime Minister Louie, the democratically appointed top banana of the sovereign nation of orangutans, has a monkey on his back. His hairy subjects traditionally travel between locations by swinging from vine to vine along the forest superhighway. However, due to increasing traffic, there has been a dramatic increase of mid-air collisions and other forms of swinging accidents.</p>

<p>To improve travel safety, Louie has decided to replace the old vine-based transportation system by a new network of rope bridges. Two trees A and B along the highway will be connected by a rope bridge if all of the trees between A and B are strictly shorter than both A and B. If A and B are not connected by a bridge, a citizen travelling from A to B has to use multiple bridges, changing between bridges at some intermediate tree or trees between A and B (see Figure B.1). Note that a citizen travelling from A to B only does so by taking bridges leading towards B, never in the opposite direction.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e495d8f7-3e4b-4a31-82ed-b09bf1243651/-/preview/" style="width: 612px; height: 201px;" /></p>

<p>Figure B.1: A solution to Sample Input 2 showing the bridges built. Travelling from tree 1 to 4 can be done using a single bridge. Travelling from tree 2 to 8 requires 4 bridges&mdash;the trip could be made using 3 bridges by going via tree 1, but citizens never travel away from their destination.</p>

<p>The trees tend to be very crowded, especially during rush hour, so changing between bridges can be frustrating enough to make you go ape. Therefore, Louie aims to minimise the number of bridges that the average traveller needs to use to get to their destination. All routes travelled along the highway are well understood and have been collected in the most recent jungle census. What remains is to design the tree layout along the forest superhighway, or more specifically, the heights of the trees.</p>

<p>Find out how to set the heights of the trees so that the total number of bridges used, summed over all journeys in the jungle census, is minimised.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers n and m (2 &le; n &le; 500, 1 &le; m &le; 50 000), the number of trees and the number of journeys. The trees along the highway are numbered from 1 to n.</li>
	<li>m lines, each with two integers s and t (1 &le; s, t &le; n, s &ne; t), the starting and ending trees of a journey</li>
</ul>

### 출력

<p>On the first line, output the minimum possible total number of bridges used.</p>

<p>On the next line, output a sequence of heights, in metres, of the trees that achieves this minimum. Your answer may only use integer tree heights between 1 and 10<sup>9</sup> (inclusive).</p>

<p>If there are multiple valid solutions, output any one of them.</p>