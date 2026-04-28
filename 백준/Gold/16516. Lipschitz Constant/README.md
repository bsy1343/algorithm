# [Gold III] Lipschitz Constant - 16516

[문제 링크](https://www.acmicpc.net/problem/16516)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 85, 정답: 59, 맞힌 사람: 48, 정답 비율: 75.000%

### 분류

수학, 그리디 알고리즘, 정렬, 애드 혹

### 문제 설명

<p>Today you are doing your calculus homework, and you are tasked with finding a Lipschitz constant for a function f(x), which is defined for N integer numbers x and produces real values. Formally, the Lipschitz constant for a function f is the smallest real number L such that for any x and y with f(x) and f(y) defined we have:</p>

<p style="text-align: center;">|f(x) &minus; f(y)| &le; L &middot; |x &minus; y|.</p>

### 입력

<p>The first line contains N &ndash; the number of points for which f is defined. The next N lines each contain an integer x and a real number z, which mean that f(x) = z. Input satisfies the following constraints:</p>

<ul>
	<li>2 &le; N &le; 200 000.</li>
	<li>All x and z are in the range &minus;10<sup>9</sup> &le; x, z &le; 10<sup>9</sup>.</li>
	<li>All x in the input are distinct.</li>
</ul>

### 출력

<p>Print one number &ndash; the Lipschitz constant. The result will be considered correct if it is within an absolute error of 10<sup>&minus;4</sup> from the jury&rsquo;s answer.</p>