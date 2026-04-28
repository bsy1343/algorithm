# [Platinum I] Petrol - 15614

[문제 링크](https://www.acmicpc.net/problem/15614)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 18, 맞힌 사람: 14, 정답 비율: 66.667%

### 분류

자료 구조, 데이크스트라, 그래프 이론, 최소 스패닝 트리, 희소 배열, 최단 경로

### 문제 설명

<p>Byteasar is employed in the logistics department of Byteonian petroleum giant Byteoil. His job is to plan fuel deliveries to petrol stations.</p>

<p>There are n&nbsp;intersections in Byteotia (marked by numbers from 1&nbsp;to n) and m&nbsp;two-way roads connecting certain pairs of intersections. There are Byteoil petrol stations located at some intersections.</p>

<p>Byteoil transport fleet consists of petrol tankers with various capacities of fuel tanks. Each tanker consumes 1 litre of petrol per kilometre of distance travelled. It can therefore be assumed that a tanker having tank capacity of b&nbsp;litres can cover a maximum distance of b&nbsp;kilometres without the need to refuel. Drivers cannot use the fuel carried by the tanker in the main tank, however they can refuel at any Byteoil petrol stations free of charge.</p>

<p>Byteasar&#39;s work consists of repeatedly answering the following queries: Is a petrol tanker with a fuel tank of capacity of b&nbsp;litres capable of covering the distance of from a petrol station located at the intersection x&nbsp;to a petrol station located at the intersection y? Tanker with a fuel tank of capacity of b&nbsp;litres cannot cover a distance of more than b&nbsp;kilometres, during which there will be no Byteoil petrol station. Tankers starting point is always located at an intersection where Byteoil petrol station is present, and also all the trips end at an intersection with Byteoil petrol station.</p>

<p>Help Byteasar to provide an automated reply to his logistic queries.</p>

### 입력

<p>The first line of input contains three integers n, s&nbsp;and m&nbsp;(2 &le; s &le; n &le; 200,000, 1 &le; m &le; 200,000), denoting the number of intersections, the number of petrol stations and the number of roads in Byteotia. The second line contains a sequence of s&nbsp;pairwise distinct integers c<sub>1</sub>, c<sub>2</sub>, ..., c<sub>s</sub>&nbsp;(1 &le; c<sub>i</sub> &le; n), denoting the intersections where Byteoil stations are located.</p>

<p>The next m&nbsp;lines describe the roads in Byteotia; i-th of these lines contains three integers u<sub>i</sub>, v<sub>i</sub>&nbsp;and d<sub>i</sub>&nbsp;(1 &le; u<sub>i</sub>, v<sub>i</sub> &le; n, u<sub>i</sub> &ne; v<sub>i</sub>, 1 &le; d<sub>i</sub> &le; 10,000), indicating that the i-th road has a length of d<sub>i</sub> kilometres and connects the intersection u<sub>i</sub>&nbsp;with the intersection v<sub>i</sub>. Each pair of intersections is connected by at most one road.</p>

<p>The next line contains one integer q&nbsp;(1 &le; q &le; 200,000), denoting the number of queries. The consecutive q&nbsp;lines hold the descriptions of queries; i-th of these lines contains three integers x<sub>i</sub>, y<sub>i</sub>&nbsp;and b<sub>i</sub>&nbsp;(1 &le; x<sub>i</sub>, y<sub>i</sub> &le; n, x<sub>i</sub> &ne; y<sub>i</sub>, 1 &le; b<sub>i</sub> &le; 2&middot;10<sup>9</sup>) indicating query concerning the possibility of a tanker with a capacity of b<sub>i</sub>&nbsp;litres to cover the distance from a petrol station at the intersection x<sub>i</sub>&nbsp;to the station at the intersection of y<sub>i</sub>. It can be assumed that at both intersections x<sub>i</sub>, y<sub>i</sub>&nbsp;Byteoil petrol stations are located.</p>

### 출력

<p>Your program should output exactly q&nbsp;lines. The&nbsp;<img src="%EB%B0%B1%EC%A4%80/Platinum/15614.%E2%80%85Petrol/48a5367e.png" data-original-src="https://main.edu.pl/en/images/AMPPZ2014/ben-en-tex.48.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" />-th of these lines should contain one word&nbsp;<code>TAK</code>&nbsp;(i.e.,&nbsp;<i>yes</i>) or&nbsp;<code>NIE</code>&nbsp;(i.e.,&nbsp;<i>no</i>), depending on whether the tanker with a fuel tank with a capacity of b<sub>i</sub>&nbsp;is able to travel from the intersection x<sub>i</sub>&nbsp;to the intersection y<sub>i</sub>.</p>