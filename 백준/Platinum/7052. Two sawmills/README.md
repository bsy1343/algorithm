# [Platinum V] Two sawmills - 7052

[문제 링크](https://www.acmicpc.net/problem/7052)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 149, 정답: 74, 맞힌 사람: 49, 정답 비율: 45.370%

### 분류

볼록 껍질을 이용한 최적화, 다이나믹 프로그래밍

### 문제 설명

<p>There are n old trees planted along a road that goes from the top of a hill to its bottom. Local government decided to cut them down. In order not to waste wood each tree should be transported to a sawmill.</p>

<p>Trees can be transported only in one direction: downwards. There is a sawmill at the lower end of the road. Two additional sawmills can be built along the road. You have to decide where to build them, as to minimize the cost of transportation. The transportation costs one cent per meter, per kilogram of wood.</p>

<p>Write a program, that:</p>

<ul>
	<li>reads from the standard input the number of trees, their weights and locations,</li>
	<li>calculates the minimum cost of transportation,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>The first line of the input contains one integer n the number of trees (2 &le; n &le;20 000). The trees are numbered 1, 2, ..., n, starting from the top of the hill and going downwards. Each of the following n lines contains two positive integers separated by single space. Line i + 1 contains: w<sub>i</sub> weight (in kilograms) of the i-th tree and d<sub>i</sub> distance (in meters) between trees number i and i + 1, 1 &le; w<sub>i</sub> &le; 10 000, 0 &le; d<sub>i</sub> &le; 10 000. The last of these numbers, d<sub>n</sub>, is the distance from the tree number n to the lower end of the road. It is guaranteed that the total cost of transporting all trees to the sawmill at the end of the road is less than 2 000 000 000 cents.</p>

### 출력

<p>The first and only line of output should contain one integer: the minimum cost of transportation.</p>

### 힌트

<p>The figure shows the optimal location of sawmills for the example data.Trees are depicted as circles with weights given below. Sawmills aremarked black. The result is equal to:</p>

<p style="text-align: center;">1 &middot; (2 + 1) + 2 &middot; 1+1 &middot; (1 + 2) + 3 &middot; 2+2 &middot; (1 + 2 + 1) + 1 &middot; (2 + 1) + 1 &middot; 1</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7052.%E2%80%85Two%E2%80%85sawmills/d31542f3.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/7052.%E2%80%85Two%E2%80%85sawmills/d31542f3.png" data-original-src="https://upload.acmicpc.net/7e452303-ade5-4787-9c29-5c532e371322/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 96px; width: 469px;" /></p>