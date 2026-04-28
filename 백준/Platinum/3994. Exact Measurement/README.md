# [Platinum II] Exact Measurement - 3994

[문제 링크](https://www.acmicpc.net/problem/3994)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 144, 정답: 36, 맞힌 사람: 34, 정답 비율: 36.957%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>Peter is working in a secret chemical laboratory. For his new experiment he needs to measure exactly x nanograms of a secret reagent. He has a balance and several standard masses, and his goal is to choose a set of standard masses with total sum equal to x ng.</p>

<p>Standard masses come in n sealed boxes. The i-th box contains q<sub>i</sub> identical masses of 10<sup>k<sub>i</sub></sup>&nbsp;ng. Peter wants to open the minimal number of boxes to take a set of masses with the sum of their weights of x ng.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3994.%E2%80%85Exact%E2%80%85Measurement/cb171704.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/3994.%E2%80%85Exact%E2%80%85Measurement/cb171704.png" data-original-src="https://www.acmicpc.net/upload/images2/exact.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:328px; width:523px" /></p>

### 입력

<p>The first line of the input file contains two integer numbers x and n (1 &le; x &le; 10<sup>18</sup>, 1 &le; n &le; 10<sup>5</sup>). The next n lines contain pairs of numbers k<sub>i</sub> and q<sub>i</sub> (0 &le; k<sub>i</sub> &le; 18, 1 &le; q<sub>i</sub> &middot; 10<sup>k<sub>i</sub></sup> &le; 10<sup>18</sup>).</p>

### 출력

<p>On the first line output the minimal number of boxes that should be opened. On the second line output the numbers of these boxes in any order. Boxes are numbered in the order they appear in the input file starting from 1. If it is impossible to measure exactly x ng, output a single line with &minus;1.</p>