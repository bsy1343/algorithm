# [Gold I] BIẾN ĐỔI CẶP SỐ - 11026

[문제 링크](https://www.acmicpc.net/problem/11026)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 226, 정답: 38, 맞힌 사람: 19, 정답 비율: 13.475%

### 분류

수학, 정수론, 유클리드 호제법

### 문제 설명

<p>Từ cặp số (a, b) gồm 2 số nguy&ecirc;n dương, c&oacute; thể sử dụng 1 trong 3 ph&eacute;p biến đổi sau để tạo ra cặp số mới&nbsp;</p>

<ul>
	<li>(a,b) &rarr; (a, a+b)&nbsp;</li>
	<li>(a,b) &rarr; (a+b, b)&nbsp;</li>
	<li>(a,b) &rarr; (b,a)&nbsp;</li>
</ul>

<p>Bắt đầu từ cặp số (1, 1) h&atilde;y d&ugrave;ng &iacute;t ph&eacute;p biến đổi nhất để tạo ra một cặp số c&oacute; chứa số N.</p>

### 입력

<p>D&ograve;ng đầu chứa số test T. Tiếp theo l&agrave; T test, mỗi test chứa một số 1 &le; N &le; 10<sup>6</sup>.</p>

### 출력

<p>Ứng với mỗi test, in ra tr&ecirc;n một d&ograve;ng số bước biến đổi &iacute;t nhất.</p>

### 힌트

<ul>
	<li>(1 1)</li>
	<li>(1 1) &rarr; (2 1) &rarr; (3 1)&nbsp;</li>
	<li>(1 1) &rarr; (2 1) &rarr; (2 3) &rarr; (2 5)&nbsp;</li>
	<li>(1 1) &rarr; (2 1) &rarr; (2 3) &rarr; (2 5) &rarr; (2 7)</li>
</ul>