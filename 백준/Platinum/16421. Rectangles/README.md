# [Platinum II] Rectangles - 16421

[문제 링크](https://www.acmicpc.net/problem/16421)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 133, 정답: 87, 맞힌 사람: 68, 정답 비율: 69.388%

### 분류

자료 구조, 세그먼트 트리, 스위핑, 느리게 갱신되는 세그먼트 트리, 값 / 좌표 압축

### 문제 설명

<p>You are working on a new graphics system, which has added a new feature. Whenever you draw a figure, all the pixels in that figure flip from white to black, or from black to white. This image is what happens when three overlapping rectangles are drawn on a white field:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16421.%E2%80%85Rectangles/9b6538a8.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16421.%E2%80%85Rectangles/9b6538a8.png" data-original-src="https://upload.acmicpc.net/88a890d7-e4a9-4db3-aac2-f9f503997c22/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 204px; height: 124px;" /></p>

<p>Starting with a white field, given a series of axis-aligned rectangles, how many pixels end up black?</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs.</p>

<p>Each test case will begin with a line with a single integer n (1 &le; n &le; 100,000) indicating the number of rectangles.</p>

<p>Each of the next n lines will have four space-separated integers x1, y1, x2 and y2 (0 &le; x1 &lt; x2 &le; 10<sup>9</sup>, 0 &le; y1 &lt; y2 &le; 10<sup>9</sup>) which represent opposite corners of a rectangle. The rectangle consists of all pixels (x,y) such that x1 &le; x &lt; x2 and y1 &le; y &lt; y2, so the area of the rectangle is (x2 - x1) &times; (y2 - y1) pixels.</p>

### 출력

<p>Output a single integer, which is the number of pixels that are black after all of the rectangles are drawn on a white field.</p>