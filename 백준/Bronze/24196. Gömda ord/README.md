# [Bronze IV] Gömda ord - 24196

[문제 링크](https://www.acmicpc.net/problem/24196)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 1147, 정답: 931, 맞힌 사람: 881, 정답 비율: 81.198%

### 분류

구현, 문자열

### 문제 설명

<p>Anna skickar hemliga krypterade meddelanden till Bert. F&ouml;r att kunna l&auml;sa meddelandena m&aring;ste Bert dekryptera dem med f&ouml;ljande algoritm:</p>

<ul>
	<li>F&ouml;rsta bokstaven i indata-str&auml;ngen tas med i utdata-str&auml;ngen.</li>
	<li>Varje bokstav som man tar med beskriver var i indatastr&auml;ngen n&auml;sta bokstav finns som ska tas med. Ett &#39;A&#39; betyder att n&auml;sta bokstav finns 1 position fram, ett &#39;B&#39; inneb&auml;r 2 positioner fram osv.</li>
	<li>N&auml;r man kommit till den sista bokstaven i indatat s&aring; tar man med den bokstaven och &auml;r klar. Indatan &auml;r s&aring;dan att man alltid kommer till den sista bokstaven.</li>
</ul>

<p>Hj&auml;lp Bert genom att skriva ett program som avkrypterar Annas meddelanden.</p>

### 입력

<p>Den f&ouml;rsta och enda raden i indatat inneh&aring;ller den krypterade str&auml;ngen (h&ouml;gst 50 tecken). Str&auml;ngen kommer kunna avkrypteras med ovan beskrivna algoritm utan att man trillar &ouml;ver sista bokstaven.&nbsp;</p>

### 출력

<p>Skriv ut den avkrypterade str&auml;ngen.</p>