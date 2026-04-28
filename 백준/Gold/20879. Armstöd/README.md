# [Gold II] Armstöd - 20879

[문제 링크](https://www.acmicpc.net/problem/20879)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 11, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

많은 조건 분기, 다이나믹 프로그래밍

### 문제 설명

<p>Petitess-organisationen (PO) har m&ouml;te och de $N$ medlemmarna sitter p&aring; stolar i en ring, v&auml;nda in&aring;t. Mellan varje par av stolar finns ett armst&ouml;d som h&ouml;gst en av personerna kan anv&auml;nda. Varje person har en preferens i form av vilken eller vilka armar hen vill placera p&aring; armst&ouml;den:</p>

<ul>
	<li>V: v&auml;nster arm</li>
	<li>H: h&ouml;ger arm</li>
	<li>A: antingen v&auml;nster eller h&ouml;ger arm</li>
	<li>B: b&aring;da armarna</li>
	<li>I: ingen arm</li>
</ul>

<p>Skriv ett program som ber&auml;knar hur m&aring;nga av personerna som maximalt kan bli n&ouml;jda.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r ett heltal $N$, antal personer i ringen. P&aring; andra raden st&aring;r personernas preferenser, givna i den ordning personerna sitter, <em>moturs</em> i ringen, i form av en str&auml;ng best&aring;ende av $N$ bokst&auml;ver, vardera <code>V</code>, <code>H</code>, <code>A</code>, <code>B</code> eller <code>I</code>.&nbsp;</p>

### 출력

<p>Programmet ska skriva ut ett heltal: det maximala antalet personer som kan f&aring; sin preferens uppfylld.</p>

### 제한

<ul>
	<li>$5 \le N \le 30$</li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20879.%E2%80%85Armst%C3%B6d/44552f98.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/20879.%E2%80%85Armst%C3%B6d/44552f98.png" data-original-src="https://upload.acmicpc.net/65ef158d-1f72-4cb0-94bf-fac107f3c4fa/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 220px; height: 226px;" /></p>

<p style="text-align: center;">Figuren visar l&ouml;sningen till exempel 1. De tjocka linjerna markerar armar som personer lagt p&aring; armst&ouml;den. Den gr&aring; f&auml;rgen visar vilka som f&aring;tt sina preferenser uppfyllda. Pilen markerar var den givna indatastr&auml;ngen b&ouml;rjar och slutar.</p>