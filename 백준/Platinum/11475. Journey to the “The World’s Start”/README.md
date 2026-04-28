# [Platinum III] Journey to the “The World’s Start” - 11475

[문제 링크](https://www.acmicpc.net/problem/11475)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 143, 정답: 56, 맞힌 사람: 51, 정답 비율: 39.844%

### 분류

이분 탐색, 자료 구조, 덱, 덱을 이용한 구간 최댓값 트릭, 다이나믹 프로그래밍, 덱을 이용한 다이나믹 프로그래밍, 매개 변수 탐색, 세그먼트 트리

### 문제 설명

<p>Jerry Prince is the fourth grade student and he goes to New-Lodnon to visit the most popular amusement park &ldquo;The World&rsquo;s Start&rdquo;.</p>

<p>An airport he arrives at is next to the first stop of the metro line. This line has n stops and &ldquo;The World&rsquo;s Start&rdquo; is on the last of them. The metro of New-Lodnon is pretty fast so you may assume that you can get from a stop to the next one in just one minute.</p>

<p>Jerry needs a travel card to use the metro. Each travel card has a range r and a price p. With a travel card of range r Jerry may travel no more than r stops at once. Therefore, if Jerry enters metro at the stop i he should exit on one of the stops from i &minus; r to i + r inclusive. It takes d<sub>i</sub> minutes to exit and reenter metro at i-th stop. There is no time required to enter the first stop or exit the last one.</p>

<p>Jerry is not very rich but he has some spare time, so he decided to buy the cheapest travel card that will allow him to travel from the first metro stop to the last one in no more than t minutes.</p>

### 입력

<p>The first line of the input file contains two integers n and t &mdash; the number of stops and the maximum possible time (2 &le; n &le; 50 000; n &minus; 1 &le; t &le; 10<sup>9</sup>).</p>

<p>The second line contains n &minus; 1 integers p<sub>r</sub> &mdash; the prices of travel cards with range r = 1 . . . n &minus; 1 (1 &le; p<sub>r</sub> &le; 100 000)</p>

<p>The third line contains n &minus; 2 integers d<sub>i</sub> &mdash; the number of minutes required to reenter metro at stop i = 2 . . . n &minus; 1 (1 &le; d<sub>i</sub> &le; 10<sup>5</sup>).</p>

### 출력

<p>Output a single integer p &mdash; the lowest possible price of one travel card that allows Jerry to travel from the first to the last stop in no more than t minutes.</p>