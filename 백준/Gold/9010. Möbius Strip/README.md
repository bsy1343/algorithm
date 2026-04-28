# [Gold III] Möbius Strip - 9010

[문제 링크](https://www.acmicpc.net/problem/9010)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 367, 정답: 159, 맞힌 사람: 123, 정답 비율: 45.556%

### 분류

수학

### 문제 설명

<p>The M&ouml;bius strip is a surface with only one side and only one boundary edge. M&ouml;bius strip can be created as follows Take a strip of paper and glue the ends together after twisting one end a half turn (see Figure 1).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9010.%E2%80%85M%C3%B6bius%E2%80%85Strip/5efac0eb.png" data-original-src="https://www.acmicpc.net/upload/images2/mo.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:224px; width:250px" /></p>

<p style="text-align: center;">Figure 1. Construction of a M&ouml;bius strip</p>

<p>Given a rectangular strip of paper with square grid pattern of size m &times; n (m &le; n) on both sides of the strip, we can create a M&ouml;bius strip by joining the shorter ends of the strip together. The M&ouml;bius strip is said to be of size m &times; 2n. For example, Figure 2 shows a M&ouml;bius strip of size 5 &times; 100. The squares on the M&ouml;bius strip are said to be adjacent if they touch each other by a side (except a side on a boundary edge). Consider a small ant lying in a square of the M&ouml;bius strip. The ant travels around on the strip by always moving to an adjacent square from the current square. Note that the ant cannot move across the boundary edge of the M&ouml;bius strip. The distance between two square on M&ouml;bius strip is defined to be the smallest number of squares an ant moved, except the starting square, when an ant travels from a square to the other. Therefore the distance between two adjacent squares is 1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9010.%E2%80%85M%C3%B6bius%E2%80%85Strip/de8385c1.png" data-original-src="https://www.acmicpc.net/upload/images2/mo2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:182px; width:210px" /></p>

<p style="text-align: center;">Figure 2. M&ouml;bius strip of size 5 &times; 100</p>

<p>An average distance of M&ouml;bius strip of size m &times; 2n is defined to be the average distance between all pairs of squares (including all pairs of the same square) on the strip. For example, the average distance of M&ouml;bius strip of size 1 &times; 2n is n/2.</p>

<p>Give a size of M&ouml;bius strip, you should output the average distance of the strip.</p>

### 입력

<p>Your program is to read from standard input. The input consists of T test cases. The number of test cases T is given in the first line of the input. Each test case consists of a single line containing two integers, and m and n(1 &le; m &le; n &le; 1,000,000), where the size of input M&ouml;bius strip is m &times; 2n.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line for each test case. The line should contain a real value, the average distance of the input M&ouml;bius strip; the output should have precision of exactly 1 digit after decimal point (You have to round to the nearest tenth, i.e., the first digit after decimal point).</p>