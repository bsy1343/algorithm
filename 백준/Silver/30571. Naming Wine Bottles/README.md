# [Silver III] Naming Wine Bottles - 30571

[문제 링크](https://www.acmicpc.net/problem/30571)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 66, 정답: 51, 맞힌 사람: 45, 정답 비율: 83.333%

### 분류

구현, 자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Wine is a sophisticated business. Bottling alone encompasses the art of label design, the physics of vacuum sealing, the craft of glassforming, and the calculus of volumetric shapes.</p>

<p>Today we will deal with literature: every size of wine bottle has a name. You may know that a &ldquo;Standard&rdquo; bottle holds 0.75L. Did you also know that a 15L bottle is a &ldquo;Nebuchadnezzar&rdquo;, and a 12L is a mighty &ldquo;Balthazar&rdquo;?</p>

<p>Usually wine bottle sizes come in multiples of 1.5L. You have some other bottles in non-standard sizes and you will need to create impressive names for them as well. Note that any two bottles of the same size must have consistent names.</p>

### 입력

<ul>
	<li>On the first line, the number of bottles $n$ ($1 \le n \le 10\,000$)</li>
	<li>On each of the following $n$ lines, the volume of a bottle $v$ ($0.0 \le v_i \le 10^4$) with up to $10$ digits after the decimal point, followed by an uppercase letter &quot;L&quot;</li>
</ul>

### 출력

<p>For each given line, output one lower-case word, with Latin letters only, giving a name for this size of bottle.</p>