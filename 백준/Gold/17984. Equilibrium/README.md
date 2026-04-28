# [Gold IV] Equilibrium - 17984

[문제 링크](https://www.acmicpc.net/problem/17984)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 14, 맞힌 사람: 12, 정답 비율: 41.379%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색, 재귀, 트리

### 문제 설명

<p>There are city elections in Treetopia! Treetopia, as you should know, is a quite unique country; there is <em>exactly</em> one way of travelling between <em>every</em> pair of cities! Two cities are said to be neighbouring if it is possible to travel from one to the other without visiting any other cities along the way, and the relationship between neighbouring cities is really something special.</p>

<p>The elections result are now being counted, and in just a short while the results will be announced on public broadcasting. This year, an election observer is standing ready in every of Treetopia&rsquo;s n cities to report on any problems they find. You know that every observer is very particular about the order that the results are announced. In particular, an observer in city i will count how many of the i<sup>th</sup> city&rsquo;s neighbours are announced <em>before</em> city i (denoted b<sub>i</sub>) as well as how many of its neighbouring cities are announced <em>after</em> city i (denoted a<sub>i</sub>).</p>

<p>The observer will expect a<sub>i</sub> to equal b<sub>i</sub>. In fact, for every number the two numbers differ, |a<sub>i</sub> &minus; b<sub>i</sub>|, the observer will send an angry letter of complaint. Desperate to avoid mountains of useless mail, you wonder which ordering you should choose to minimize the total number of complaints received.</p>

### 입력

<p>The first line of input contains a positive integer n (1 &le; n &le; 100 000), the number of cities in Treetopia. Then follows n &minus; 1 lines, the i<sup>th</sup> of which contains two distinct integers u<sub>i</sub> and v<sub>i</sub> (0 &le; u<sub>i</sub>, v<sub>i</sub> &lt; n), indicating that u<sub>i</sub> and v<sub>i</sub> are neighbouring cities.</p>

### 출력

<p>A single line with n space-separated integers, representing an order of the cities in Treetopia such that announcing the election results in this order minimize the number of received complaints. If there are several optimal orders, you can output any of them.</p>