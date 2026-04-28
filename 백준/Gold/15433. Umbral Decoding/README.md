# [Gold II] Umbral Decoding - 15433

[문제 링크](https://www.acmicpc.net/problem/15433)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 154, 정답: 30, 맞힌 사람: 27, 정답 비율: 20.000%

### 분류

정렬, 스위핑

### 문제 설명

<p>You are planning a clever attack against a new encryption algorithm. To succeed, you need to find the key, which is a pair of integers (p, q). We can think of the key as a point on a two-dimensional integer lattice whose location is unknown. However, you know that (p, q) lies in the square spanned by the lattice points (0, 0) and (n, n) for a given n, i.e. 0 &le; p, q &le; n.</p>

<p>Your attack has three stages:</p>

<p>Identify safe points and their bounds.<br />
Eliminate as key candidates those points that lie in the &ldquo;umbra&rdquo; of any safe point.<br />
Test the remaining points to see which one is the key.</p>

<p>Stage 1 has already been performed and you are given several safe points of the form (x, y, b) as input.</p>

<p>In Stage 2 you eliminate a point (p, q) if it lies in the umbra of any safe point. Point (p, q) is in the umbra of safe point (x, y, b) if and only if</p>

<p style="text-align:center">|x &minus; p|<sup>3</sup> + |y &minus; q|<sup>3</sup> &le; b.</p>

<p>Your task in this problem is to count how many points will be left for testing in Stage 3 so that we have an estimate of the amount of work left to complete the attack.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15433.%E2%80%85Umbral%E2%80%85Decoding/2defc34d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15433/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:185px; width:368px" /></p>

<p style="text-align:center">Figure M.1: Sample input safe points and umbra (red) and remaining points (blue).</p>

### 입력

<p>Input begins with two integers n, k on a single line, separated by a space, with 2 &le; n &le; 100 000 000, and 0 &le; k &le; 100. Following that are k lines each containing three integers x, y, b separated by spaces, representing the safe points. The values of x and y are both in the range [0, n]. The bound b lies in the range [0, n].</p>

### 출력

<p>Output the number of points (p, q), with 0 &le; p, q &le; n, that do not lie in the umbra of any safe point.</p>