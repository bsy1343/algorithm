# [Silver I] Hesthoppning - 26885

[문제 링크](https://www.acmicpc.net/problem/26885)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 1024 MB

### 통계

제출: 57, 정답: 45, 맞힌 사람: 41, 정답 비율: 80.392%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>De snela hestarna Hsara och Pascal bor tillsammans i en tv&aring;dimensionell hage av storlek $N$ rader och $M$ kolumner. Hagen &auml;r omgiven av ett stort st&auml;ngsel, men innanf&ouml;r det s&aring; finns det rutor d&auml;r hestarna kan hoppa fritt. De vill dock b&aring;da undvika att hoppa p&aring; rutor d&auml;r det ligger stora stenar.</p>

<p>F&ouml;r de som spelat schack s&aring; &auml;r det v&auml;lk&auml;nt att ett hopp g&aring;r till genom att ta tv&aring; steg i en riktning och ett steg i en riktning vinkelr&auml;t mot den f&ouml;rsta. Det &auml;r m&ouml;jligt att hoppa &ouml;ver stenar, men rutan som man landar i m&aring;ste vara fri. Givet hur hagen ser ut, och var hestarna befinner sig fr&aring;n b&ouml;rjan, s&aring; vill de veta om det &auml;r m&ouml;jligt f&ouml;r dem att tr&auml;ffas. De kan tr&auml;ffas om det finns n&aring;got s&auml;tt de kan hoppa p&aring; s&aring; att de hamnar p&aring; samma ruta. Hj&auml;lp dem att ta reda p&aring; det.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller heltalen $N$ och $M$, separerade med ett blanksteg.</p>

<p>De n&auml;sta $N$ raderna best&aring;r av $M$ tecken som var och en beskriver hur en ruta i hagen ser ut. Ett &#39;.&#39; inneb&auml;r att rutan &auml;r tom, &#39;\#&#39; beskriver en ruta med en sten i, och &#39;H&#39; betyder att en av hestarna st&aring;r i den h&auml;r rutan.</p>

<p>Hagen &auml;r omgiven av st&auml;ngsel. Det &auml;r garanterat att indata alltid inneh&aring;ller exakt tv&aring; &#39;H&#39;-celler.</p>

### 출력

<p>Ditt program ska skriva ut ett ord p&aring; en rad - &quot;JA&quot; om hestarna kan m&ouml;tas p&aring; n&aring;gon cell och &quot;NEJ&quot; annars.</p>

### 제한

<ul>
	<li>$3 \le N,M \le 500$</li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26885.%E2%80%85Hesthoppning/570b7448.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/26885.%E2%80%85Hesthoppning/570b7448.png" data-original-src="https://upload.acmicpc.net/c4ae7f87-840c-43db-b0dd-c0373eb0d175/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 150px; height: 150px;" /></p>

<p style="text-align: center;">En illustration av Sample Input 2 som visar hur Pascal kan hoppa f&ouml;r att n&aring; Hsara.</p>