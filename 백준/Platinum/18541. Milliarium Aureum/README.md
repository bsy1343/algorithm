# [Platinum I] Milliarium Aureum - 18541

[문제 링크](https://www.acmicpc.net/problem/18541)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 56, 정답: 9, 맞힌 사람: 8, 정답 비율: 23.529%

### 분류

자료 구조, 그래프 이론, 분리 집합, 두 포인터, 최소 스패닝 트리

### 문제 설명

<p>Roman Empire is vast and, as everybody knows, all roads lead to Rome!</p>

<p>Following the trail of the Last Centurion, professor Melody Song found an ancient map of Roman roads. The exact position of Rome was forgotten long ago, and Melody wants to recover it from the map. There are n cities on the map, numbered from 1 to n, and m roads. Each road is marked as either minor or major.</p>

<p>Major roads were used to travel to Rome and formed a spanning tree, and minor roads were used as alternatives or to travel between other cities. Each road had some fixed width. It is known that major roads were very wide: if we consider two paths from Rome to any other city, one arbitrary path P and another path Q using the major roads, the thinnest road on path P could not be wider than the thinnest road on path Q.</p>

<p>The map found by Melody contains information on every road in Roman Empire, namely its type t and width w. Your task is to help her determine which cities may correspond to Rome according to the map.</p>

### 입력

<p>The first line of input contains two integers n and m (1 &le; n, m &le; 10<sup>5</sup>).</p>

<p>Each of the next m lines contains four integers, t<sub>i</sub>, u<sub>i</sub>, v<sub>i</sub>, and w<sub>i</sub>, which describe a bidirectional road from city u<sub>i</sub> to city v<sub>i</sub> with type t<sub>i</sub> and width w<sub>i</sub> (1 &le; u<sub>i</sub>, v<sub>i</sub> &le; n, 1 &le; w<sub>i</sub> &le; 10<sup>9</sup>). The type is t<sub>i</sub> = 0 for minor roads and t<sub>i</sub> = 1 for major roads.</p>

<p>There may be multiple roads between the same pair cities, and there may be roads connecting a city to itself. It is guaranteed though that there is exactly one simple path via major roads between each pair of cities.</p>

### 출력

<p>On the first line, output an integer k which is number of cities which may be Rome.</p>

<p>On the second line, output k integers <strong>in ascending order</strong> which are the numbers of those cities.</p>

<p>It is guaranteed that there is at least one such city.</p>