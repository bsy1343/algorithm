# [Platinum IV] NLO - 16758

[문제 링크](https://www.acmicpc.net/problem/16758)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 80, 정답: 34, 맞힌 사람: 30, 정답 비율: 47.619%

### 분류

정렬, 스위핑, 오프라인 쿼리

### 문제 설명

<p>The locals of the village Žabnik have been struggling for many years with unidentified flying objects (UFOs) that create circles in grain fields. The damage is particularly noticeable during summer hay mowing.</p>

<p>Let us imagine a rectangular grain field of N rows and M columns - the upper left field is designated by coordinates (1, 1), while the lower right field is designated by coordinates (N, M). In each field there is a certain amount of grass. Initially, amount of grass in all the fields is equal to 1. In K days UFOs of circular shape land on the field and make circles in it. On the i<sup>th</sup> morning, the UFO of radius R<sub>i</sub> with the center in the field designated by the coordinates (X<sub>i</sub>, Y<sub>i</sub>) lands on the field and &quot;mows&quot; all the grass growing on covered fields. In other words, the amount of grass in the field designated by coordinates (x, y) is reduced to 0 if it holds (X<sub>i</sub> - x)<sup>2</sup> + (Y<sub>i</sub>&nbsp;- y)<sup>2</sup> &le; R<sub>i</sub><sup>2</sup>. Each new day, with the increase of the grass, the amount of grass in all the fields increases by 1.</p>

<p>On K<sup>th</sup> day in the evening, the locals will mow all the grass of the grain field that will be stored for feeding cattle. How much is the total amount of grass they will store?</p>

### 입력

<p>The first line contains positive integers N and M (1 &le; N, M &le; 100 000), dimensions of the grain field. The second line contains positive integer K (1 &le; K &le; 100), the number of the days in which unidentified flying objects land to the grain field before mowing.</p>

<p>In the i<sup>th</sup> of the following K lines there are three positive integers X<sub>i</sub> (1 &lt; X<sub>i</sub> &lt; N), Y<sub>i</sub> (1 &lt; Y<sub>i</sub> &lt; M), and R<sub>i</sub> (1 &le; R<sub>i</sub> &le; min(X<sub>i</sub> - 1, Y<sub>i</sub> - 1, N - X<sub>i</sub>, M - Y<sub>i</sub>)) which represent the central field on which the i<sup>th</sup> UFO lands and the radius the i<sup>th</sup> UFO.</p>

### 출력

<p>Print the total amount of grass that the locals will store after mowing.</p>