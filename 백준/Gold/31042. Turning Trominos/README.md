# [Gold IV] Turning Trominos - 31042

[문제 링크](https://www.acmicpc.net/problem/31042)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 8, 맞힌 사람: 8, 정답 비율: 50.000%

### 분류

구현

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31042.%E2%80%85Turning%E2%80%85Trominos/a4d435b5.png" data-original-src="https://upload.acmicpc.net/0cb8f639-3f8c-49ed-862e-0c8e570839f1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 137px;" /></p>

<p style="text-align: center;">$L$ trominos,replicated.</p>

<p>The $L$-tromino is composed of three unit squares arranged as shown in part A of the illustration to the right. The $L$-tromino is also an example of a <em>rep-tile</em> because four $L$-trominos can be arranged to make a replica of itself that is twice as tall and twice as wide, as shown in B. Rep-tiles are interesting because, once they can tile themselves, they can recursively tile as much of the plane as we want, as suggested in C and D. Part C is made from four copies of B, and D is made from four copies of C. Figure 1 shows the first quadrant of the plane completely tiled by $L$-trominos by repeating the same procedure.</p>

<p>For this problem, you will be given a square in the first quadrant, and your task is to find the orientation of the $L$-tromino covering that square. The unit squares of the first quadrant are numbered $0, 1, 2, \ldots $ in the $x$- and $y$-directions, as shown. The dots, in order from left to right, correspond to the first four sample inputs.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31042.%E2%80%85Turning%E2%80%85Trominos/4ebd199a.png" data-original-src="https://upload.acmicpc.net/0d13b0aa-27b4-4805-b2bd-29946579b47f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 256px;" /></p>

<p style="text-align: center;"><b>Figure 1</b>: $L$-trominos tiling the first quadrant.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31042.%E2%80%85Turning%E2%80%85Trominos/e084c142.png" data-original-src="https://upload.acmicpc.net/6fe93cd9-0c4e-4013-a567-1207acbde979/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 150px; height: 41px;" /></p>

<p style="text-align: center;"><b>Figure 2</b>: $L$-tromino orientations.</p>

### 입력

<p>The first line contains an integer $n$ $(1 \leq n \leq 10\, 000)$, indicating the number of cases that follow. Each case consists of a single line. Each of the next $n$ lines contains two integers $x$ and $y$, separated by a space, with $0\leq x,y\leq 2^{60}$, indicating a particular square in the first quadrant.</p>

### 출력

<p>For each case, output the orientation of the $L$-tromino that covers the given square, one line per case, where the orientations are shown in Figure 2.</p>