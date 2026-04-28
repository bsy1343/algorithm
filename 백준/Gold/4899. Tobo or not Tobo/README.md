# [Gold III] Tobo or not Tobo - 4899

[문제 링크](https://www.acmicpc.net/problem/4899)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 20, 맞힌 사람: 8, 정답 비율: 33.333%

### 분류

너비 우선 탐색, 자료 구조, 그래프 이론, 그래프 탐색, 해시를 사용한 집합과 맵, 구현, 시뮬레이션, 집합과 맵

### 문제 설명

<p><span style="line-height:1.6em"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4899.%E2%80%85Tobo%E2%80%85or%E2%80%85not%E2%80%85Tobo/7e46da92.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4899.%E2%80%85Tobo%E2%80%85or%E2%80%85not%E2%80%85Tobo/7e46da92.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4899/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:529px; width:134px" />The game of Tobo is played on a plastic board designed into a 3x3 grid with cells numbered from 1 to 9 as shown in figure (a). The grid has four dials (labeled &rdquo;A&rdquo; to &rdquo;D&rdquo; in the figure.) Each dial can be rotated in 90 degrees increment in either direction. Rotating a dial causes the four cells currently adjacent to it to rotate along. For example, figure (b) shows the Tobo after rotating dial &rdquo;A&rdquo; once in a clockwise direction. Figure (c) shows the Tobo in figure (b) after rotating dial &rdquo;D&rdquo; once in a counter- clockwise direction.</span></p>

<p>Kids love to challenge each other playing the Tobo. Starting with the arrangement shown in figure (a), (which we&rsquo;ll call the standard arrangement,) one kid would randomly rotate the dials, X number of times, in order to &lsquo;shuffle&rdquo; the board. Another kid then tries to bring the board back to its standard arrangement, taking no more than X rotations to do so. The less rotations are needed to restore it, the better. This is where you see a business opportunity. You would like to sell these kids a program to advise them on the minimum number of steps needed to bring a Tobo back to its standard arrangement.</p>

### 입력

<p>Your program will be tested on one or more test cases. Each test case is specified on a line by itself. Each line is made of 10 decimal digits. Let&rsquo;s call the first digit Y. The remaining 9 digits are non-zeros and describe the current arrangement of the Tobo in a row-major top-down, left-to-right ordering. The first sample case corresponds to figure (c).</p>

<p>The last line of the input file is a sequence of 10 zeros.</p>

### 출력

<p>For each test case, print the result using the following format:</p>

<p>k.␣R</p>

<p>where k is the test case number (starting at 1,) ␣ is a single space, and R is the minimum number of rotations needed to bring the Tobo back to its standard arrangement. If this can&rsquo;t be done in Y dials or less, then R=-1.</p>