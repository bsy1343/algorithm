# [Platinum I] Buildings - 16052

[문제 링크](https://www.acmicpc.net/problem/16052)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 119, 정답: 87, 맞힌 사람: 77, 정답 비율: 74.038%

### 분류

수학, 정수론, 조합론, 분할 정복을 이용한 거듭제곱, 모듈로 곱셈 역원, 페르마의 소정리, 번사이드 보조정리

### 문제 설명

<p>As a traveling salesman in a globalized world, Alan has always moved a lot. He almost never lived in the same town for more than a few years until his heart yearned for a different place. However, this newest town is his favorite yet - it is just so colorful. Alan has recently moved to Colorville, a smallish city in between some really nice mountains. Here, Alan has finally decided to settle down and build himself a home - a nice big house to call his own.</p>

<p>In Colorville, many people have their own houses - each painted with a distinct pattern of colors such that no two houses look the same. Every wall consists of exactly n &times; n squares, each painted with a given color (windows and doors are also seen as unique &ldquo;colors&rdquo;). The walls of the houses are arranged in the shape of a regular m-gon, with a roof on top. According to the deep traditions of Colorville, the roofs should show the unity among Colorvillians, so all roofs in Colorville have the same color.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16052.%E2%80%85Buildings/5a9360ac.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16052.%E2%80%85Buildings/5a9360ac.png" data-original-src="https://upload.acmicpc.net/282c92ed-7da5-4ef7-a3f8-a76b3d21eaaf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 292px; height: 231px;" /></p>

<p style="text-align: center;">Figure B.1: Example house design for n = 3, m = 6.</p>

<p>Of course, Alan wants to follow this custom to make sure he fits right in. However, there are so many possible designs to choose from. Can you tell Alan how many possible house designs there are? (Two house designs are obviously the same if they can be translated into each other just by rotation.)</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with three integers n, m, and c, where
	<ul>
		<li>n (1 &le; n &le; 500) is the side length of every wall, i.e. every wall consists of n &times; n squares;</li>
		<li>m (3 &le; m &le; 500) is the number of corners of the regular polygon;</li>
		<li>c (1 &le; c &le; 500) the number of different colors.</li>
	</ul>
	</li>
</ul>

### 출력

<p>Output s where s is the number of possible different house designs. Since s can be very large, output s mod (10<sup>9</sup> + 7).</p>