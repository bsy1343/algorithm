# [Platinum I] Mosaic - 4112

[문제 링크](https://www.acmicpc.net/problem/4112)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 42, 정답: 8, 맞힌 사람: 8, 정답 비율: 20.513%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 런타임 전의 전처리

### 문제 설명

<p>An architect wants to decorate one of his buildings with a long, thin mosaic. He has two kinds of tiles available to him, each 2 inches by 2 inches:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4112.%E2%80%85Mosaic/80f1df75.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4112/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:100px; width:271px" /></p>

<p>He can rotate the second kind of tile in any of four ways. He wants to fill the entire space with tiles, leaving no untiled gaps. Now, he wonders how many different patterns he can form. He considers two mosaics to be the same only if they have exactly the same kinds of tiles in exactly the same positions. So, if a rotation or a reflection of a pattern has tiles in different places than the original, he considers it a different pattern. The following are examples of 4&rdquo; x 16&rdquo; mosaics, and even though they are all rotations or reflections of each other, the architect considers them to be four different mosaics:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4112.%E2%80%85Mosaic/7fc08827.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4112/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:162px; width:544px" /></p>

### 입력

<p>There will be several test cases. Each test case will consist of two integers on a single line, N and M (2 &le; N &le; 10, 2 &le; M &le; 500). These represent the dimensions of the strip he wishes to fill, in inches. The data set will conclude with a line with two 0&#39;s.</p>

### 출력

<p>For each test case, print out a single integer representing the number of unique ways that the architect can tile the space, modulo 10<sup>6</sup>. Print each integer on its own line, with no extra whitespace. Do not print any blank lines between answers.</p>