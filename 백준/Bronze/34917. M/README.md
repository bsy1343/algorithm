# [Bronze III] M - 34917

[문제 링크](https://www.acmicpc.net/problem/34917)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 210, 정답: 173, 맞힌 사람: 151, 정답 비율: 83.425%

### 분류

구현

### 문제 설명

<p>Busy Beaver is throwing an MITIT party!</p>

<p>Busy Beaver is planning to print a large banner. His printer is old-school: it draws on an $N \times N$ pixel board, <strong>where $N$ is odd</strong>, using <code>#</code> for ink and <code>.</code> for blank space. For the first letter of the banner, he needs the letter M, printed as shown below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/34917.%E2%80%85M/fd34bc35.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34917-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 546px; height: 256px;"></p>

<p>Your job is to tell the printer exactly which pixels to ink.</p>

<p>Formally, the M is defined as follows. The left and right edges of the banner are the M's vertical legs, running all the way from top to bottom. From the top corners, two strokes with slope $1$ and $-1$ descend inward, one from each side, meeting exactly in the middle row. Because $n$ is odd, there is a single center column and a single middle row where the slanted strokes touch. Below that meeting point, only the two outer legs continue to the bottom.</p>

### 입력

<p>The first line contains a single integer $T$ ($1 \leq T \leq 50$) --- the number of test cases.</p>

<p>The only line of each test case contains a single odd integer $N$ ($5 \leq N &lt; 50$, $N$ is odd) --- the side length of Busy Beaver's board.</p>

### 출력

<p>For each test case, output $N$ lines, each containing $N$ characters <code>#</code> and <code>.</code> without spaces --- the letter M, as described in the statement.</p>

<p>Do not output empty lines between test cases.</p>