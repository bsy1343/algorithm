# [Platinum II] Macarons - 15412

[문제 링크](https://www.acmicpc.net/problem/15412)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 52, 맞힌 사람: 32, 정답 비율: 65.306%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱, 수학

### 문제 설명

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15412.%E2%80%85Macarons/8d156a2a.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15412/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:308px; width:392px" /></p>

<p>Pierre is famous for his macarons. He makes round macarons, stored in square boxes of size 1 &times; 1, and oval-shaped macarons, stored in rectangular boxes of size 1 &times; 2 (or, rotated, in rectangular boxes of size 2 &times; 1). For the purpose of a buffet, Pierre wishes to tile a rectangular table of size N &times; M with the two kinds of macarons, meaning that the table must be completely full, with no empty space left. The width N of the table is small, for the guest to be able to grab the macarons easily, and the length M of the table is large, to accommodate a huge number of guests. To keep the table pretty, the orientation of macarons should always be aligned with the sides of the table.</p>

<p>Pierre wishes to know how many ways there are to tile the table. Can you help him?</p>

### 입력

<p>The input consists of the following integers:</p>

<ul>
	<li>the value of N, an integer, on the first line;</li>
	<li>the value of M, an integer, on the second line.</li>
</ul>

<p>Limits</p>

<p>The input satisfies 1 &le; N &le; 8 and 1 &le; M &le; 10<sup>18</sup>.</p>

### 출력

<p>The output should consist of the total number of tilings, given modulo 10<sup>9</sup>, on a single line.</p>