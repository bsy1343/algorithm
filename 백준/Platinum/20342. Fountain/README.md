# [Platinum IV] Fountain - 20342

[문제 링크](https://www.acmicpc.net/problem/20342)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 188, 정답: 32, 맞힌 사람: 27, 정답 비율: 47.368%

### 분류

자료 구조, 트리, 누적 합, 희소 배열, 데카르트 트리

### 문제 설명

<p>A new fountain consists of N vertically aligned circular water reservoirs numbered from top to bottom with integers starting from 1, as shown below:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20342.%E2%80%85Fountain/cbf44aea.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/20342.%E2%80%85Fountain/cbf44aea.png" data-original-src="https://upload.acmicpc.net/0eefa476-a542-4c7f-8711-286557d58a8a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 357px;" /></p>

<p>Each reservoir has its diameter, capacity and a tap which can release any amount of water inside the reservoir. Whenever water volume exceeds reservoir capacity, the excess water pours out of its sides and flows down into the closest one that has a <strong>strictly larger</strong> diameter or down to waterways if no such reservoir exists.</p>

<p>You have to answer Q independent queries of the following kind: what is the number of the reservoir where flow ends if you release V<sub>i</sub> liters of water from the R<sub>i</sub>-th reservoir&rsquo;s tap? If the flow ends in waterways the answer should be 0.</p>

### 입력

<p>First line of input contains two integers - N and Q.</p>

<p>Next N lines contain two integers D<sub>i</sub> and C<sub>i</sub> each - diameter and capacity of the i-th reservoir.</p>

<p>Next Q lines contain two integers R<sub>i</sub> and V<sub>i</sub> each.</p>

### 출력

<p>Print Q lines with one integer in each - answers to the queries in the order they are given.</p>

### 제한

<ul>
	<li>2 &le; N &le; 10<sup>5</sup></li>
	<li>1 &le; Q &le; 2&middot;10<sup>5</sup></li>
	<li>1 &le; C<sub>i</sub> &le; 1000</li>
	<li>1 &le; D<sub>i</sub>, V<sub>i</sub> &le; 10<sup>9</sup></li>
	<li>1 &le; R<sub>i</sub> &le; N</li>
</ul>

### 힌트

<p>The first two queries are illustrated on the image above.</p>

<p>Since the queries are independent from each other, for the third query the fifth reservoir won&rsquo;t overflow.</p>