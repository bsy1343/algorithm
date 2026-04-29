# [Platinum I] Word Search - 32566

[문제 링크](https://www.acmicpc.net/problem/32566)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 15, 맞힌 사람: 15, 정답 비율: 65.217%

### 분류

문자열, 해싱

### 문제 설명

<p>Find parts of a 2d grid matching a 2d word.</p>

### 입력

<ul>
	<li>One line containing the number of rows and columns in the search key, $r_k$ and $c_k$ ($1 \le r, c \le 2000$).</li>
	<li>$r_k$ further lines, each containing $c_k$ Latin characters comprising a row of the search key.</li>
	<li>One line containing the number of rows and columns in the haystack, $r_h$ and $c_h$ ($r_k \le r_h \le 2000$, $c_k \le c_h \le 2000$).</li>
	<li>$r_h$ further lines, each containing $c_h$ Latin characters comprising a row of the search key.</li>
</ul>

### 출력

<p>Illustrate the matching areas of the haystack by printing a grid of the same size. In locations that are part of at least one match, print the original character from the haystack. In other cases, print a full-stop "." character.</p>