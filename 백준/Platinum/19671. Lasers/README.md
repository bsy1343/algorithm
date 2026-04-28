# [Platinum IV] Lasers - 19671

[문제 링크](https://www.acmicpc.net/problem/19671)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 21, 맞힌 사람: 17, 정답 비율: 73.913%

### 분류

애드 혹, 정렬, 스위핑

### 문제 설명

<p>Mr. Panda knows cats love laser toys, and decides to invest in a laser toy for Rar the Cat. The laser toy that Mr. Panda has bought consists of L evenly spaced lasers at the top of the toy, pointing downward. The 1st laser is located 0.5 units away from the leftmost edge and the Lth laser is located 0.5 units away from the rightmost edge of the toy. Every adjacent lasers are of distance 1 unit.</p>

<p>There are R rows of sliding walls, with each row containing a set of non-overlapping walls. Precisely, each row contains some number of walls whose total length is at most L. These walls can be slid to any position on the same row, as long as their relative positions along the row remain the same and they do not overlap. A wall of width x units (where x is a positive integer) will block exactly x consecutive lasers.</p>

<p>A possible toy with L = 11 and R = 3 is depicted in the diagram below:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19671.%E2%80%85Lasers/8c6aacdc.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/19671.%E2%80%85Lasers/8c6aacdc.png" data-original-src="https://upload.acmicpc.net/e2be5d18-ec2c-4a87-a9ee-cb0c31a6d96a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 384px; height: 143px;" /></p>

<p>Rar the Cat, being the curious cat as he is, wishes to know: Out of the L lasers in his toy, how many lasers will always be blocked by at least one wall in all possible configurations of the toy?</p>

### 입력

<p>Your program must read from standard input.</p>

<p>The first line of the input will contain two integers, L and R.</p>

<p>The next R lines of input will describe one row each. It will start with a single integer X, the number of sliding walls in the row. X integers will follow, indicating the widths of the X walls in that row, with the first integer indicating the width of the leftmost wall. Note that the sum of widths of the walls on each row cannot exceed L units.</p>

### 출력

<p>Your program should print to standard output.</p>

<p>Output a single integer on a single line, the number of lasers that will be blocked by at least one wall in all possible configurations of the toy.</p>

### 제한

<ul>
	<li>1 &le; R &le; 5 &times; 10<sup>5</sup></li>
	<li>1 &le; L &le; 10<sup>9</sup></li>
	<li>1 &le; &Sigma;X &le; 5 &times; 10<sup>5</sup></li>
	<li>1 &le; &Sigma;width &le; L for each row</li>
</ul>