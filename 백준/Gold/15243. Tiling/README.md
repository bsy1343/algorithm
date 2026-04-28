# [Gold V] Tiling - 15243

[문제 링크](https://www.acmicpc.net/problem/15243)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 299, 정답: 192, 맞힌 사람: 177, 정답 비율: 65.799%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p dir="ltr">Domino tiles (or dominoes) are rectangular pieces of size 2x1. Each square contains a number from 1 to 6. These pieces are used to play a game but in this problem we are going to use them for something different.</p>

<p dir="ltr">We can build rectangles of certain width W and height 3 using dominoes. We are wondering how many ways of creating such rectangles are possible.</p>

<p>Below you can see the three possible ways of creating a rectangle of width 2 and height 3.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15243.%E2%80%85Tiling/068b40c7.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/15243.%E2%80%85Tiling/068b40c7.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15243/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:83px; width:245px" /></p>

<p>As you see there are many ways of tiling the rectangle. For example this is a possible solution with width 12:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15243.%E2%80%85Tiling/41736960.gif" data-original-src="%EB%B0%B1%EC%A4%80/Gold/15243.%E2%80%85Tiling/41736960.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15243/2.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:80px; width:273px" /></p>

<p>Your task is to write a program that computes the number of possible ways of tiling a rectangle of width W and height 3.</p>

### 입력

<p dir="ltr">A single line with an integer W. The width of the rectangle.</p>

<p dir="ltr">The value of W will be between 1 and 1000.</p>

### 출력

<p dir="ltr">A single line with the number of possible ways. The numbers can be large so print the solution modulo 1000000007 (10<sup>9</sup> + 7).</p>

### 힌트

<p>In the last test case, the actual result is 8155103542731753 by we have to print it modulo 10<sup>9</sup> + 7.</p>