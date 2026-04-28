# [Platinum I] Triangles - 7743

[문제 링크](https://www.acmicpc.net/problem/7743)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 14, 정답: 6, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

자료 구조, 이분 탐색, 집합과 맵, 누적 합, 스위핑

### 문제 설명

<p>Once there was a famous sailing ship contest called SEJLY. Every year many experienced sailors competed in it. For this year the annual 100th SEJLY is planned and its organizers want to have more competing sailors than ever. So they have decided to make billboards with a nice photo from the previous year to attract new sailors. Unfortunately this year the price of green color has extremely increased and unfortunately it is also the color of all the sails. So they need to count how much green color is needed for a single billboard and thence also how many billboards they can afford. Fortunately the rules of the SEJLY are very restrictive &mdash; all the sails must be right-angled isosceles triangles. To make things easier you know that the coordinates of the vertices of all the sails (triangles) are integers. So they ask you &mdash; the young promising programmers &mdash; to help them with the problem. Your task is to compute the area of all the sails on the billboard. In other words you are given a set of isosceles right-angled triangles with integer coordinates, having legs parallel to the coordinate axis and hypotenuses going &quot;from upper left to lower right&quot; and you are to output area of their union.</p>

### 입력

<p>On the first line there is a number n (1 &le; n &le; 10 000) &mdash; the number of triangles. Following n lines will contain three space-separated integers x, y, d describing each triangle. A 3-tuple x, y, d corresponds to a triangle ABC with the following coordinates: A = [x, y], B = [x + d, y], C = [x, y + d]. You may assume that 0 &le; x, y, d &le;1 000 000.&nbsp;</p>

### 출력

<p>It will consist of a single number u &mdash; the area of the union of given triangles. It should be printed with exactly one digit after the decimal point. You may assume that u &lt; 2<sup>31</sup>.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7743.%E2%80%85Triangles/0dba2ffd.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7743/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:225px; width:169px" /></p>