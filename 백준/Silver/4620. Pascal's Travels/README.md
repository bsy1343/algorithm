# [Silver I] Pascal's Travels - 4620

[문제 링크](https://www.acmicpc.net/problem/4620)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 486, 정답: 264, 맞힌 사람: 255, 정답 비율: 58.891%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>An n x n game board is populated with integers, one nonnegative integer per square. The goal is to travel along any legitimate path from the upper left corner to the lower right corner of the board. The integer in any one square dictates how large a step away from that location must be. If the step size would advance travel off the game board, then a step in that particular direction is forbidden. All steps must be either to the right or toward the bottom. Note that a 0 is a dead end which prevents any further progress.</p>

<p>Consider the 4 x 4 board shown in Figure 1, where the solid circle identifies the start position and the dashed circle identifies the target. Figure 2 shows the three paths from the start to the target, with the irrelevant numbers in each removed.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4620.%E2%80%85Pascal's%E2%80%85Travels/877bada0.gif" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4620.%E2%80%85Pascal's%E2%80%85Travels/b1088076.gif" data-original-src="https://boja.mercury.kr/assets/problem/4620-1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:147px; width:147px" /></p>

<p style="text-align:center">Figure 1</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4620.%E2%80%85Pascal's%E2%80%85Travels/2cfd19aa.gif" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4620.%E2%80%85Pascal's%E2%80%85Travels/59772284.gif" data-original-src="https://boja.mercury.kr/assets/problem/4620-2.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:147px; width:460px" /></p>

<p style="text-align:center">Figure 2</p>

### 입력

<p>The input contains data for one to thirty boards, followed by a final line containing only the integer -1. The data for a board starts with a line containing a single positive integer n, 4 &le; n &le; 34, which is the number of rows in this board. This is followed by n rows of data. Each row contains n single digits, 0-9, with no spaces between them.&nbsp;</p>

### 출력

<p>The output consists of one line for each board, containing a single integer, which is the number of paths from the upper left corner to the lower right corner. There will be fewer than 2<sup>63</sup> paths for any board.</p>

### 힌트

<p>Brute force methods examining every path will likely exceed the allotted time limit. 64-bit integer values are available as long values in Java or long long values using the contest&#39;s C/C++ compilers.</p>