# [Gold IV] Cake Cutting - 7691

[문제 링크](https://www.acmicpc.net/problem/7691)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 32, 정답: 24, 맞힌 사람: 20, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You are given a rectangular cake of integral dimensions w &times; h. Your goal is to divide this cake into m rectangular pieces of integral dimensions such that the area of the largest piece is minimal. Each cut must be a straight line parallel to one of the sides of the original cake and must divide a piece of cake into two new pieces of positive area. Note that since a cut divides only a single piece, exactly m &minus; 1 cuts are needed.</p>

### 입력

<p>The input test file will contain multiple test cases, each of which consists of three integers w, h, m separated by a single space, with 1 &le; w, h, m &le; 20 and m &le; wh. The end-of-file is marked by a test case with w = h = m = 0 and should not be processed.</p>

### 출력

<p>For each test case, write a single line with a positive integer indicating the area of the largest piece.</p>

### 힌트

<p>If w = 4, h = 4, and m = 4, then the following cuts minimize the area of the largest piece:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7691.%E2%80%85Cake%E2%80%85Cutting/4a99208d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7691/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:112px; width:109px" /></p>

<p>However, if w = 4, h = 4, and m = 3, then the following cuts are optimal:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7691.%E2%80%85Cake%E2%80%85Cutting/b3a717a0.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7691/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:117px; width:126px" /></p>