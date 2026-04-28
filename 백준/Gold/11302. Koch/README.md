# [Gold II] Koch - 11302

[문제 링크](https://www.acmicpc.net/problem/11302)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 55, 정답: 16, 맞힌 사람: 7, 정답 비율: 28.000%

### 분류

선형대수학, 수학, 재귀

### 문제 설명

<p>The Koch curve or snowflake is drawn in the XY plane. It is defined recursively.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11302.%E2%80%85Koch/c3726bae.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/11302.%E2%80%85Koch/c3726bae.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11302/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:45px; width:198px" /></p>

<p>Start with a line of length 1 from (0,0) to (1,0). We call this a level 0 Koch curve.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11302.%E2%80%85Koch/995f71d0.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/11302.%E2%80%85Koch/995f71d0.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11302/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:83px; width:196px" /></p>

<p>Divide the line into thirds. Make an equilateral triangle on the centre third, then delete the bottom edge of the triangle. This is a level 1 Koch curve.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11302.%E2%80%85Koch/3494c086.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/11302.%E2%80%85Koch/3494c086.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11302/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:84px; width:199px" /></p>

<p>Divide and put triangles on each of the sections of the level 1 curve. This results in a level 2 curve.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11302.%E2%80%85Koch/5beaaa5d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/11302.%E2%80%85Koch/5beaaa5d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11302/4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:76px; width:196px" /></p>

<p>And so on. Here is a level 4 curve.</p>

<p>Consider the strip of the XY plane from X=0 to X=1. The Koch curve divides this strip into an upper and lower part. Your task is: given a point (x, y): 0 &lt; x &lt; 1 decide whether it is in the upper or lower part of the strip &ndash; where upper and lower are defined by a Koch curve of a given level.</p>

### 입력

<p>You are given a number N (N &gt; 0) of cases to check. The first line of input holds the number N. The following N lines each specify a case. Each line holds three values L, X, Y. Where L is an integer: 0 &lt;= L &lt;= 10. X and Y are floating point numbers: 0 &lt; X &lt; 1 and -10 &lt; Y &lt; 10.</p>

### 출력

<p>For each input case output one line with either Above or Below. The input has been arranged so that test points are not exactly on the curve. They should be roughly 0.0000001 distant at least from the nearest line segment.</p>