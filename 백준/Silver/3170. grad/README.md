# [Silver I] grad - 3170

[문제 링크](https://www.acmicpc.net/problem/3170)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 61, 정답: 37, 맞힌 사람: 32, 정답 비율: 61.538%

### 분류

그래프 이론, 그래프 탐색, 기하학, 너비 우선 탐색

### 문제 설명

<p>A construction site is defined as a rectangle in the coordinate system with sides parallel to the coordinate axes, with one corner in (0,0) and the opposite corner in (X,Y).&nbsp;</p>

<p>The entrance to the site is in the middle of the bottom side. There are N cranes on the construction site. Each crane is situated in a point on the site, it can rotate 360 degrees and the maximum reach is known for each crane.&nbsp;</p>

<p>The truck unloads heavy equipment on the entrance of the site and after that the equipment is carried across the site by a sequence of crane movements. In each step, one crane picks up the equipment and leaves it at any place within the maximum reach of that crane.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/3170.%E2%80%85grad/28c4435c.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/3170.%E2%80%85grad/28c4435c.png" data-original-src="https://upload.acmicpc.net/783c37d6-6d83-4619-8cc0-78f1cfd098fe/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 237px; height: 387px;" /></p>

<p>Write a program that, given a list of K destinations within the site, determines for each destination if it is possible to carry the equipment to this destination.&nbsp;</p>

### 입력

<p>The first line of input contains two integers X and Y, 2 &le; X,Y &le; 200, X is even.&nbsp;</p>

<p>Next line contains an integer N, 1 &le; N &le; 50, the number of cranes.&nbsp;</p>

<p>Each of the following N lines contains three integers A, B and C &ndash; (A,B) is the position of the crane, and C is its maximum reach, 0 &le; A &le; X, 0 &le; B &le; Y, 0 &le; C &le; 200.&nbsp;</p>

<p>The next line contains an integer K, 3 &le; K &le; 30, the number of destinations.&nbsp;</p>

<p>Each of the following N lines contains two integers D and E &ndash; (D,E) is the position of one destination, 0 &le; D &le; X, 0 &le; E &le; Y.&nbsp;</p>

### 출력

<p>Each of the K lines should contain the word &#39;DA&#39; or &#39;NE&#39; &ndash; &#39;DA&#39; means that it is possible to deliver the equipment to that destination, and &#39;NE&#39; means that it is not possible.&nbsp;</p>