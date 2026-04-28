# [Gold I] Frontier - 7430

[문제 링크](https://www.acmicpc.net/problem/7430)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

플로이드–워셜, 기하학, 그래프 이론, 최단 경로

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7430.%E2%80%85Frontier/e545ce00.png" data-original-src="https://upload.acmicpc.net/c1b785ac-efaa-4f00-9b4d-f040ebbcf175/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 353px; height: 353px; float: right;" />Lilliputian frontier is a convex polygon with non-zero area. The vertices of this polygon are guard towers, which are connected by straight lines. This frontier is too long and expensive for Lilliputia to maintain; therefore the Lilliputian government has decided to revise it to make it shorter. However, they don&#39;t want to build new guard towers, but to use existing ones as a part of a new frontier.</p>

<p>Each day frontier guards inspect the frontier. They go from one guard tower to the next one, traversing the frontier clockwise. Guard towers are numbered from 1 to N according to this inspection order. Frontier revision should not change this way of inspection and the area of Lilliputia shall remain non-zero.</p>

<p>For example, the frontier that is shown on the picture (axes are in kilometer scale) is traversed by 1 - 2 - 3 - 4 - 5 - 1 route, which is 57.89 kilometers long. To make the frontier as short as possible Lilliputia should revise it so that the frontier is traversed by 2 - 3 - 4 - 2 route, thus reducing its length to 27.31 kilometers.</p>

<p>However, Lilliputia has a number of historical monuments which are its major pride. The historical monuments shall be kept inside Lilliputia at any cost and they should not end up on the frontier. So, the task is to design the shortest frontier that will preserve all historical monuments inside Lilliputia.</p>

<p>On the sample picture two historical monuments marked &quot;A&quot; and &quot;B&quot; are shown. The desire to keep them inside Lilliputia will lead to the shortest frontier with a traverse path 1 - 2 - 3 - 4 - 1 having 51.78 kilometers in length.</p>

### 입력

<p>The first line of the input file contains two integers N and M, separated by a space. N (3 &le; N &le; 50) is a total number of guard towers on the Lilliputian frontier. M (0 &le; M &le; 1000) is a total number of historical monuments that are situated inside Lilliputia.</p>

<p>Next N lines contain guard towers&#39; coordinates in a clockwise order followed by M lines that contain historical monuments&#39; coordinates. All coordinates are represented as two integers (for X and Y correspondingly) separated by a space. Coordinates are given in a kilometer scale and each coordinate does not exceed 10000 by an absolute value. All guard towers are located at distinct points.</p>

### 출력

<p>Write to the output file a single real number &ndash; the minimal possible length of the Lilliputian frontier (in kilometers) accurate to two digits to the right of the decimal point.</p>