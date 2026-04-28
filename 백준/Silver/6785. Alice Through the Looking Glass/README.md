# [Silver I] Alice Through the Looking Glass - 6785

[문제 링크](https://www.acmicpc.net/problem/6785)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 78, 정답: 44, 맞힌 사람: 37, 정답 비율: 63.793%

### 분류

분할 정복, 재귀

### 문제 설명

<p>Alice is looking at a crystal through a microscope. Alice&rsquo;s microscope has the interesting feature that it can superimpose grid lines over the image that she is looking at.</p>

<p>At level 1 of magnification, Alice sees the image as follows:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/6785.%E2%80%85Alice%E2%80%85Through%E2%80%85the%E2%80%85Looking%E2%80%85Glass/f0098802.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/6785.%E2%80%85Alice%E2%80%85Through%E2%80%85the%E2%80%85Looking%E2%80%85Glass/f0098802.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/6785/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-03-24%20%EC%98%A4%ED%9B%84%201.49.24.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:295px; width:289px" /></p>

<p>Notice that at level 1, there is a 5 &times; 5 grid superimposed over the image.</p>

<p>However, as Alice increases the magnification, the leaf pattern becomes more intricate.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/6785.%E2%80%85Alice%E2%80%85Through%E2%80%85the%E2%80%85Looking%E2%80%85Glass/7e043e01.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/6785.%E2%80%85Alice%E2%80%85Through%E2%80%85the%E2%80%85Looking%E2%80%85Glass/7e043e01.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/6785/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-03-24%20%EC%98%A4%ED%9B%84%201.50.53.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:289px; width:289px" /></p>

<p>At level 2 of the magnification, Alice sees the image with a 25 &times; 25 grid, and notices that three of the four larger squares in the original image have the small four square pattern on top. In fact, for this particular crystal, this self-similarity repeats for each magnification level.</p>

<p>Given that Alice&rsquo;s microscope has up to 13 levels of magnification, she would like to try to quantify the detail of each grid cell at every one of these magnification levels.</p>

<p>Specifically, since there is a 5<sup>m</sup> &times; 5<sup>m</sup> grid at magnification level m, Alice will call the bottom-left corner grid cell (0, 0), the bottom-right grid cell (5<sup>m</sup> &minus; 1, 0), the top-left grid cell (0, 5<sup>m</sup> &minus; 1), and the top-right grid cell (5<sup>m</sup> &minus; 1, 5<sup>m</sup> &minus; 1).</p>

<p>Given an integer magnification level m (1 &le; m &le; 13) and a grid position (x, y) (where 0 &le; x &lt; 5<sup>m</sup> and 0 &le; y &lt; 5<sup>m</sup>), Alice would like to know if her crystal will fill that grid cell, or if that grid cell will be empty space.</p>

### 입력

<p>The first line of input will be T (0 &lt; T &le; 10) which is the number of test cases. On each of the next T lines there will be three integers: m, the magnification level, followed by x and y, the position of the grid cell that Alice wishes to examine.</p>

### 출력

<p>The output will be T lines. Each line of output will either be <code>empty</code>, if the specified grid cell is empty, or <code>crystal</code> if that grid cell contains crystal.</p>