# [Platinum II] Eggscavation - 14037

[문제 링크](https://www.acmicpc.net/problem/14037)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 7, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

자료 구조, 분리 집합, 포함 배제의 원리, 누적 합, 세그먼트 트리

### 문제 설명

<p>It&rsquo;s time for a vacation! You are sick and tired of C shells, so you decide to become a seashell collector.</p>

<p>For your vacation, you have decided to visit the beautiful island nation of Cartesia. It is wellknown for having a lovely square beach that is composed of an N &times; N grid of square cells. You have brought your trusty shovel, which is able to dig up a K &times; K square subgrid of the beach. Your shovel, being trusty, can only dig up a K &times; K subgrid that is entirely within the beach.</p>

<p>There are M undiscovered species of shells hidden under certain grid cells. Specifically for each i, there are S<sub>i</sub> shells from the ith species in S<sub>i</sub> grid locations, with 1 &le; S<sub>i</sub> &le; 4. For each distinct species that you dig up and bring back home, you can sell it to a scientist back home for one dollar. Multiple shells of the same species don&rsquo;t add extra value.</p>

<p>Complicating matters is a glorious dodo bird running around the beach. At a given moment, it may decide to bury an egg in a grid cell (including grid cells that have eggs or shells already). The bad news is that if the K &times; K subgrid dug up by your shovel includes a dodo egg, the scientists will become annoyed that you are harming endangered species, and nobody will pay you anything.</p>

<p>After all is said and done, you decide to sit back, go back to programming, and simulate the digging instead. You will be computing the probability that your scoop, when chosen uniformly from all valid possible scoops, will make at least a given minimum profit (to pay off your student loans) at different points in time. Who wants to get all sweaty from shoveling on a beach anyway?</p>

### 입력

<p>The first line of input contains two integers N and K, (1 &le; N &le; 2500; 1 &le; K &le; N), the size of the beach and the size of the shovel, respectively.</p>

<p>The second line of input contains the integer M (0 &le; M &le; 10<sup>5</sup>), the number of species of shells. The next M lines each represent species i and consist of the integer S<sub>i</sub> (1 &le; S<sub>i</sub> &le; 4) followed by 2 &times; S<sub>i</sub> more integers, which represent the grid positions (between (1, 1) and (N, N)) where the Si shells of that species are buried.</p>

<p>The next line contains T (1 &le; T &le; 10 000). Each of the next T lines represent one specific point in time (from oldest to newest) and each line has one of the following two forms:</p>

<ul>
	<li>1 A<sub>i</sub> B<sub>i</sub> (1 &le; A<sub>i</sub>, B<sub>i</sub> &le; N), meaning that the dodo just buried an egg in the grid cell (A<sub>i</sub>, B<sub>i</sub>); or</li>
	<li>2 V<sub>i</sub> (1 &le; V<sub>i</sub> &le; 10<sup>9</sup>), meaning we would like to calculate the probability that a random dig at this point in time has profit in dollars &ge; V<sub>i</sub>. Note that no shells or eggs are actually removed or added when this probability is calculated.</li>
</ul>

### 출력

<p>For each query operation, output on one line the probability that a random scoop would contain at least the desired number of different types of shells.</p>

<p>Your answer must be within 10<sup>&minus;4</sup> of the judge&rsquo;s answer.</p>