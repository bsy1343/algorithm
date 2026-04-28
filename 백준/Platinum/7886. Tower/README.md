# [Platinum II] Tower - 7886

[문제 링크](https://www.acmicpc.net/problem/7886)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 6, 맞힌 사람: 4, 정답 비율: 36.364%

### 분류

수학, 분할 정복을 이용한 거듭제곱, 선형대수학

### 문제 설명

<p>Alan loves to construct the towers of building bricks. His towers consist of many cuboids with square base. All cuboids have the same height h = 1. Alan puts the consecutive cuboids one over another:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7886.%E2%80%85Tower/8b43536b.png" data-original-src="https://upload.acmicpc.net/16f689a3-e7d2-44b3-9d12-c6c6b9922d23/-/crop/734x462/8,9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 367px; height: 231px;" /></p>

<p style="text-align: center;">Figure 1: Tower of three bricks when Alan fixes a<sub>2</sub> = 2.</p>

<p>Recently in math class, the concept of volume was introduced to Alan. Consequently, he wants to compute the volume of his tower now. The lengths of cuboids bases (from top to bottom) are constructed by Alan in the following way:</p>

<ol>
	<li>Length a<sub>1</sub> of the first square is one.</li>
	<li>Next, Alan fixes the length a<sub>2</sub> of the second square.</li>
	<li>Next, Alan calculates the length a<sub>n</sub> (n &gt; 2) by 2 a<sub>2</sub> a<sub>n&minus;1</sub> &minus; a<sub>n&minus;2</sub>. Do not ask why he chose such a formula; let us just say that he is a really peculiar young fellow.</li>
</ol>

<p>For example, if Alan fixes a<sub>2</sub> = 2, then a<sub>3</sub> = 8 &minus; a<sub>1</sub> = 7; see Figure 1. If Alan fixes a<sub>2</sub> = 1, then a<sub>n</sub> = 1 holds for all n &isin; N; see Figure 2.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7886.%E2%80%85Tower/7962ebaf.png" data-original-src="https://upload.acmicpc.net/95ed7082-8483-4087-8032-936dcfd24995/-/crop/300x729/13,19/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 150px; height: 365px;" /></p>

<p style="text-align: center;">Figure 2: Tower of four bricks when Alan fixes a<sub>2</sub> = 1.</p>

<p>Now Alan wonders if he can calculate the volume of tower of N consecutive building bricks. Help Alan and write the program that computes this volume. Since it can be quite large, it is enough to compute the answer modulo given natural number m.</p>

### 입력

<p>The input contains several test cases. The first line contains the number t (t &le; 10<sup>5</sup>) denoting the number of test cases. Then t test cases follow. Each of them is given in a separate line containing three integers a<sub>2</sub>, N, m (1 &le; a<sub>2</sub>, m &le; 10<sup>9</sup>, 2 &le; N &le; 10<sup>9</sup>) separated by a single space, where a<sub>2</sub> denotes the fixed length of second square in step 2, while N denotes the number of bricks constructed by Alan.</p>

### 출력

<p>For each test case (a2, N, m) compute the volume of tower of N consecutive bricks constructed by Alan according to steps (1&ndash;3) and output its remainder modulo m.</p>