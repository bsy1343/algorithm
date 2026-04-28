# [Bronze II] Flipper - 17013

[문제 링크](https://www.acmicpc.net/problem/17013)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 450, 정답: 314, 맞힌 사람: 242, 정답 비율: 70.760%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>You are trying to pass the time while at the optometrist. You notice there is a grid of four numbers:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/17013.%E2%80%85Flipper/7e70f278.svg" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/17013.%E2%80%85Flipper/7e70f278.svg" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/17013/1.svg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 69px; height: 50px;" /></p>

<p>You see lots of mirrors and lenses at the optometrist, and wonder how flipping the grid horizontally or vertically would change the grid.</p>

<p>Specifically, a &quot;horizontal&quot; flip (across the horizontal centre line) would take the original grid of four numbers and result in:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/17013.%E2%80%85Flipper/52a251ba.svg" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/17013.%E2%80%85Flipper/52a251ba.svg" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/17013/2.svg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 69px; height: 50px;" /></p>

<p>A &quot;vertical&quot; flip (across the vertical centre line) would take the original grid of four numbers and result in:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/17013.%E2%80%85Flipper/71348f32.svg" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/17013.%E2%80%85Flipper/71348f32.svg" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/17013/3.svg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Your task is to determine the final orientation of the numbers in the grid after a sequence of horizontal and vertical flips.</p>

### 입력

<p>The input consists of one line, composed of a sequence of at least one and at most 1000000 characters. Each character is either H, representing a horizontal flip, or V, representing a vertical flip.</p>

<p>For 8 of the 15 available marks, there will be at most 1000 characters in the input.</p>

### 출력

<p>Output the final orientation of the four numbers. Specifically, each of the two lines of output will contain two integers, separated by one space.</p>