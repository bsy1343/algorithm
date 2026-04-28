# [Gold V] Colouring - 8340

[문제 링크](https://www.acmicpc.net/problem/8340)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 81, 정답: 40, 맞힌 사람: 36, 정답 비율: 50.704%

### 분류

수학, 그래프 이론, 그래프 탐색, 조합론, 깊이 우선 탐색

### 문제 설명

<p>A number from 1&nbsp;to n&nbsp;is inscribed in each cell of a 2&nbsp;&times; n&nbsp;grid in such a way that each number appears exactly twice in the grid and each column contains two different numbers. An example of such a configuration is depicted below.</p>

<p align="center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8340.%E2%80%85Colouring/1f13906f.png" data-original-src="https://upload.acmicpc.net/6a59b623-1ddc-4ec6-ae28-8558dccde36c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>We would like to colour each of the cells white or gray in such a way that cells located in the same column receive different colours and cells containing same number receive different colours. An example of such a colouring of the grid from the previous figure is depicted below.</p>

<p align="center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8340.%E2%80%85Colouring/cc7d42b2.png" data-original-src="https://upload.acmicpc.net/592d4229-12c9-43be-b100-60d9d9d71e21/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>How many such colourings exist?</p>

### 입력

<p>The first line of the standard input contains one integer n&nbsp;(2 &le; n &le; 100). Each of the following two lines contains n&nbsp;integers in the range [1, n], separated by single spaces. The numbers in these lines represent numbers inscribed in consecutive cells of the grid.</p>

### 출력

<p>&nbsp;</p>

<p>The first and only line of the standard output should contain a single integer - the number of different colourings of the grid with two colours that fulfill the described conditions.</p>

### 힌트

<p>Please note that the example describes the grid from the above figures.</p>