# [Gold III] Skridskor - 26887

[문제 링크](https://www.acmicpc.net/problem/26887)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 21, 맞힌 사람: 19, 정답 비율: 65.517%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로, 데이크스트라, 0-1 너비 우선 탐색

### 문제 설명

<p>Natalie har k&ouml;pt nya skridskor, och har best&auml;mt sig f&ouml;r att prova dem vid sin lokala skridskobana. Skridskobanan &auml;r formad som en rektangel, och p&aring; banan st&aring;r ett antal hinder utplacerade. Natalie befinner sig p&aring; v&auml;stra sidan av rinken, och vill nu ta sig &ouml;ver till andra sidan (den &ouml;stra).</p>

<p>Natalie &auml;r ganska d&aring;lig p&aring; att &aring;ka skridskor. N&auml;r Natalie &aring;ker in p&aring; isen genom ing&aring;ngen s&aring; kan hon inte sv&auml;nga f&ouml;rr&auml;n hon st&ouml;ter p&aring; ett hinder. N&auml;r hon st&ouml;ter p&aring; det f&ouml;rsta hindret s&aring; kan hon v&auml;lja att sv&auml;nga v&auml;nster eller h&ouml;ger, f&ouml;r att sedan forts&auml;tta rakt fram, och s&aring; vidare. Hon sv&auml;nger allts&aring; alltid 90 grader v&auml;nster eller h&ouml;ger n&auml;r hon st&ouml;tt p&aring; ett hinder -- och hon kan enbart sv&auml;nga n&auml;r hon st&ouml;tt p&aring; ett hinder.</p>

<p>Natalie vill g&ouml;ra turen s&aring; enkel som m&ouml;jligt. Vad &auml;r det minsta antal sv&auml;ngar hon beh&ouml;ver g&ouml;ra f&ouml;r att ta sig ut fr&aring;n isen p&aring; h&ouml;gra sidan (&ouml;stra)? Natalie kommer alltid in p&aring; isen p&aring; rutan h&ouml;gst upp till v&auml;nster, och &aring;ker initialt &ouml;sterut (&aring;t h&ouml;ger).</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller heltalen $R$ och $C$, separerade med ett mellanslag.</p>

<p>De n&auml;sta $R$ raderna best&aring;r av $C$ tecken som var och en beskriver hur en ruta p&aring; skridskobanan ser ut. Ett &#39;<code>.</code>&#39; inneb&auml;r att rutan &auml;r tom, &#39;<code>#</code>&#39; beskriver en ruta med ett hinder.</p>

<p>N&auml;r Natalie har &aring;kt ut p&aring; h&ouml;gra sidan av rinken s&aring; &auml;r hon klar med turen. Om hon &aring;ker ut p&aring; n&aring;gon annan sida av rinken (uppe, nere eller till v&auml;nster) s&aring; misslyckas hon med sitt m&aring;l. Natalie b&ouml;rjar alltid p&aring; ruta $(0,0)$ och &aring;ker &aring;t h&ouml;ger.</p>

### 출력

<p>Ditt program ska skriva ut ett tal p&aring; en rad - det minsta antal sv&auml;ngar Natalie beh&ouml;ver g&ouml;ra f&ouml;r att ta sig ut fr&aring;n isen p&aring; h&ouml;ger sida. Det &auml;r garanterat att det finns en l&ouml;sning.</p>

### 제한

<ul>
	<li>$3 \le R,C \le 100$</li>
</ul>

### 힌트

<p>I det tredje exemplet (Sample Input 3) s&aring; &aring;ker Natalie f&ouml;rst &ouml;sterut fram till f&ouml;rsta hindret. Hon sv&auml;nger sedan h&ouml;ger och &aring;ker ned&aring;t. Hon sv&auml;nger sedan h&ouml;ger igen och &aring;ker v&auml;sterut, f&ouml;r att slutligen sv&auml;nga h&ouml;ger tv&aring; g&aring;nger till innan hon n&aring;r den &ouml;stra kanten av isen. Totalt fyra sv&auml;ngar, svaret &auml;r fyra.</p>