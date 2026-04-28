# [Gold V] Z - 1074

[문제 링크](https://www.acmicpc.net/problem/1074)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 107164, 정답: 47273, 맞힌 사람: 35465, 정답 비율: 43.957%

### 분류

분할 정복, 재귀

### 문제 설명

<p>한수는 크기가 2<sup>N</sup> &times; 2<sup>N</sup>인 2차원 배열을 Z모양으로 탐색하려고 한다. 예를 들어, 2&times;2배열을 왼쪽 위칸, 오른쪽 위칸, 왼쪽 아래칸, 오른쪽 아래칸 순서대로 방문하면 Z모양이다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/1074.%E2%80%85Z/b1d67b8b.png" data-original-src="https://u.acmicpc.net/21c73b56-5a91-43aa-b71f-9b74925c0adc/Screen%20Shot%202020-12-02%20at%208.09.46%20AM.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 99px;" /></p>

<p>N &gt; 1인 경우, 배열을 크기가 2<sup>N-1</sup> &times; 2<sup>N-1</sup>로 4등분 한 후에 재귀적으로 순서대로 방문한다.</p>

<p>다음 예는 2<sup>2</sup> &times; 2<sup>2</sup> 크기의 배열을 방문한 순서이다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/1074.%E2%80%85Z/33a10169.png" data-original-src="https://u.acmicpc.net/adc7cfae-e84d-4d5c-af8e-ee011f8fff8f/Screen%20Shot%202020-12-02%20at%208.11.17%20AM.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 252px;" /></p>

<p>N이 주어졌을 때, r행 c열을 몇 번째로 방문하는지 출력하는 프로그램을 작성하시오.</p>

<p>다음은 N=3일 때의 예이다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/1074.%E2%80%85Z/796a76ac.png" data-original-src="https://u.acmicpc.net/d3e84bb7-9424-4764-ad3a-811e7fcbd53f/Screen%20Shot%202020-12-30%20at%2010.50.47%20PM.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 533px; height: 535px;" /></p>

### 입력

<p>첫째 줄에 정수 N, r, c가 주어진다.</p>

### 출력

<p>r행 c열을 몇 번째로 방문했는지 출력한다.</p>

### 제한

<ul>
	<li>1 &le; N &le; 15</li>
	<li>0 &le; r, c &lt; 2<sup>N</sup></li>
</ul>