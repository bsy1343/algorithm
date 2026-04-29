# [Gold V] Knitting - 32570

[문제 링크](https://www.acmicpc.net/problem/32570)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 22, 맞힌 사람: 22, 정답 비율: 75.862%

### 분류

애드 혹, 우선순위 큐, 자료 구조

### 문제 설명

<p>You are knitting a scarf in a striped pattern, having made strong progress on the first few stripes. You have multiple colours available to continue creating the pattern and would very much like that no colour appears too often -- more specifically, that the colour appearing most often still appears as few times as possible.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32570.%E2%80%85Knitting/9e79ee89.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32570-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 395px; height: 70px;"></p>

<p style="text-align: center;">Figure K.1: A knitted solution to sample input 1. No colour is used more than twice, nor is any colour repeated within 3 consecutive stripes.</p>

<p>Please extend the given design to fashion a nice scarf.</p>

### 입력

<ul>
	<li>One line containing the number of stripes to create, $n$, the number of colours available, $k$, and the minimum spacing between stripes of the same colour, $p$ ($1 \le n, k, p \le 10^5$).</li>
	<li>One line containing the number of stripes already knitted, $m$ ($1 \le m \le n$).</li>
	<li>One line containing $m$ integers, the colours of the stripes $s_i$ ($1 \le s \le k$).</li>
</ul>

<p>The colours of the stripes are represented as integers in $[1{\ldots}k]$.</p>

### 출력

<p>Output any stripe pattern starting with $s_{1 \ldots m}$ that does not repeat any of the colours too soon and uses the most-frequent colour as few times as possible.</p>

<p>If it is not possible to create a scarf from the parameters, output <code>impossible</code> instead.</p>