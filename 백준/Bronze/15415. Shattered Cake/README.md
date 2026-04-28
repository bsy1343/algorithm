# [Bronze III] Shattered Cake - 15415

[문제 링크](https://www.acmicpc.net/problem/15415)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 556, 정답: 425, 맞힌 사람: 367, 정답 비율: 77.590%

### 분류

수학, 사칙연산

### 문제 설명

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/15415.%E2%80%85Shattered%E2%80%85Cake/5b1afb52.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/15415.%E2%80%85Shattered%E2%80%85Cake/5b1afb52.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15415/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:208px; width:264px" /></p>

<p>A rectangular cake is transported via a truck to a restaurant. On the way to the destination, the truck hits a pothole, which shatters the cake in N perfectly rectangular pieces of width w<sub>i</sub> and length l<sub>i</sub>, for 1 &le; i &le; N.</p>

<p>At the destination, the damage is assessed, and the customer decides to order a replacement cake of the same dimensions. Unfortunately, the original order form was incompletely filled and only the width W of the cake is known. The restaurant asks for your help to find out the length L of the cake. Fortunately, all pieces of the shattered cake have been kept.</p>

### 입력

<p>The input consists of the following integers:</p>

<ul>
	<li>on the first line, the width W of the cake;</li>
	<li>on the second line, the number N of shattered pieces;</li>
	<li>on each of the next N lines, the width w<sub>i</sub> and length l<sub>i</sub> of each piece.</li>
</ul>

<p>Limits</p>

<ul>
	<li>1 &le; N &le; 5 000 000;</li>
	<li>1 &le; W, L &le; 10 000;</li>
	<li>for each 1 &le; i &le; N, 1 &le; w<sub>i</sub>, l<sub>i</sub> &le; 10 000.</li>
</ul>

### 출력

<p>The output should be the integer L.</p>