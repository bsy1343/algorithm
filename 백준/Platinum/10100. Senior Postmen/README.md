# [Platinum III] Senior Postmen - 10100

[문제 링크](https://www.acmicpc.net/problem/10100)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 74, 정답: 48, 맞힌 사람: 34, 정답 비율: 64.151%

### 분류

자료 구조, 오일러 경로, 그래프 이론, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10100.%E2%80%85Senior%E2%80%85Postmen/a84c1b33.png" data-original-src="https://upload.acmicpc.net/dc9513a8-d7b1-45bd-adc0-39f98cb92b4e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 157px; height: 153px; float: right;" />It is the year 2036 and Europe is crowded by senior citizens. In order to keep them healthy, the European ministry for majority groups (seniors are a majority!) suggests to have them deliver the small amount of paper mail that is still being sent &mdash; typically to seniors. This suggestion is going to be implemented all over Europe.</p>

<p>The ministry has devised a &ldquo;senior postmen system&rdquo; in the following way: Europe has been divided into mail districts. A mail district has a street network of streets and junctions. Every street in the network can be walked in both directions. In each district, arbitrarily many senior citizens are available to be hired as mailman. Every morning, each mailman receives a bag with mail to be delivered on a tour that covers a part of the street network. Every tour must be senior&ndash;compatible, i.e. it must satisfy the following conditions:</p>

<ul>
	<li>It starts and ends at the same junction.</li>
	<li>It never passes a junction more than once. (The seniors shall not be confused.)</li>
	<li>It must not have a street in common with any other tour; hence, any street in the district is to be served by exactly one mailman. (The seniors shall not fight with each other.)</li>
</ul>

<p>Together, the tours must cover the given network: each street in the network must be part of exactly one tour.</p>

<p>The ministry now needs a software that, for a given mail district&rsquo;s street network, will compute a set of senior&ndash;compatible tours that covers the network.</p>

### 입력

<p>The input describes the street network.</p>

<p>The first input line contains two integers N and M. N is the number of junctions, and M is the number of streets. Junctions are numbered from 1 to N.</p>

<p>Each of the following M lines contains two integers u and v (1 &le; u, v &le; N, u &ne; v), meaning that there is a street connecting junctions u and v.</p>

<p>For any input holds:</p>

<ol>
	<li>Any two junctions can be connected by no more than one street.</li>
	<li>You can reach any junction from any other by traveling along one or more streets.</li>
	<li>There is a solution, i.e. a set of senior&ndash;compatible tours can be computed that cover the network.</li>
</ol>

### 출력

<p>Each line of the output should correspond to one senior&ndash;compatible tour, and should list the numbers of the junctions in that tour. Junction numbers must be output in the order the junctions are passed by the mailman, with the starting (and ending) junction being output first (and only once).</p>

<p>If more than one solution exists, your program may output any one of them.</p>

### 힌트

<p>The following picture illustrates the street network and the three senior&ndash;compatible tours that may be used to cover it.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10100.%E2%80%85Senior%E2%80%85Postmen/64688108.png" data-original-src="https://www.acmicpc.net/upload/images2/p.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 221px; line-height: 20.8px; width: 270px;" /></p>

<p>Note that there are several solutions to this example, among them some with only two tours.</p>