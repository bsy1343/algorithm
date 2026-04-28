# [Platinum III] spiral123 - 5264

[문제 링크](https://www.acmicpc.net/problem/5264)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 31, 정답: 19, 맞힌 사람: 16, 정답 비율: 76.190%

### 분류

구현, 해 구성하기, 백트래킹

### 문제 설명

<p>We shall name a square matrix as spiral123 if it has the following properties:</p>

<ul>
	<li>its elements are from the {0, 1, 2, 3} set;</li>
	<li>each row and column contains each of the values 1, 2 and 3, exactly once and all the other values are 0;</li>
	<li>starting from the upper-left corner going right, moving in spiral, the non-zero values will appear in the following order 1, 2, 3, 1, 2, 3, ... , 1, 2, 3.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5264.%E2%80%85spiral123/510e0654.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5264.%E2%80%85spiral123/510e0654.png" data-original-src="https://upload.acmicpc.net/5c89f24b-4431-4dfe-a9a6-0c5110ecb952/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 114px; height: 100px;" /></p>

<p>For example a 5x5 spiral123 matrix is the following:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5264.%E2%80%85spiral123/272effa8.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5264.%E2%80%85spiral123/272effa8.png" data-original-src="https://upload.acmicpc.net/b54a96f0-79a2-4305-873f-5945269bf828/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 107px; height: 96px;" /></p>

<p>For a given natural number n, you should generate a n x n spiral123 matrix.</p>

### 입력

<p>The input contains only one natural number n on the first line.</p>

### 출력

<p>If there is solution, output&nbsp;must contain n lines, each with n numbers separated with one space, representing the required matrix. If there is no solution, on the single line of the output file, the -1 value will be written.</p>

### 제한

<ul>
	<li>5 &le; n &le; 200;</li>
	<li>There can be many solutions, any of them can be written.</li>
</ul>

### 힌트

<p>Another correct solution would be:</p>

<pre>
0 1 2 3 0
2 3 0 0 1
0 0 3 1 2
1 0 0 2 3
3 2 1 0 0</pre>