# [Platinum III] Treasure - 6342

[문제 링크](https://www.acmicpc.net/problem/6342)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 37, 정답: 9, 맞힌 사람: 8, 정답 비율: 30.769%

### 분류

다이나믹 프로그래밍, 애드 혹, 많은 조건 분기

### 문제 설명

<p>After a recent earthquake, a new island has emerged in the Adriatic sea! The island is mostly barren except for an unusual device that was discovered. The name &ldquo;oracle&rdquo; quickly caught on for the device. Although the oracle came with no instruction manual, a crack team of archaeologists and computer experts was able to understand its behavior.</p>

<p>The oracle provides information about the locations of treasure on the island. The island is divided into a grid of cells consisting of N rows and N columns, with both rows and columns numbered 1 through N. Some of the cells in the grid contain treasure. The oracle answers questions of the form &ldquo;Given a rectangle in the grid, how many cells in the rectangle contain treasure?&rdquo;</p>

<p>Although the oracle answers questions for rectangles of all sizes, it was found that the more specific the information requested (the smaller the rectangle), the more energy is used by the oracle when answering. More precisely, if a rectangle contains S cells, then the oracle uses exactly 1 + N&times;N - S units of energy to answer.</p>

<p>Write a program that will, given the ability to interact with the oracle, find the locations of all cells on the island that contain treasure. We do not want to use too much energy in the process &ndash; the less energy is used, the better. It is not required that the amount of energy used is the smallest possible &ndash; see the &ldquo;Grading&rdquo; section for details on how your solution will be scored.</p>

### 입력



### 출력

