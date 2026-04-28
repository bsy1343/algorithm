# [Bronze II] Konsonantkoll - 20817

[문제 링크](https://www.acmicpc.net/problem/20817)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 184, 정답: 104, 맞힌 사람: 87, 정답 비율: 54.717%

### 분류

구현, 문자열

### 문제 설명

<p>Din kompis Frida &auml;lskar konsonanter! Tyv&auml;rr st&auml;ller det h&auml;r till problem f&ouml;r henne n&auml;r hon skriver p&aring; datorn. Hon gillar n&auml;mligen konsonanter s&aring; mycket att Frida, n&auml;r det ska st&aring; tv&aring; av samma konsonant p&aring; raken, i sin iver ibland r&aring;kar trycka p&aring; tangenten allldeles f&ouml;r m&aring;nga g&aring;nger.</p>

<p>F&ouml;r att hj&auml;lpa Frida ska du skriva ett program som tar bort de extra konsonanterna. I svenska finns 20 konsonanter: <strong>bcdfghjklmnpqrstvwxz</strong>. Praktiskt nog s&aring; f&ouml;rekommer aldrig tre eller fler av samma konsonant p&aring; raken i korrekt text.</p>

### 입력

<p>Indata best&aring;r av exakt en rad, som bara kommer inneh&aring;lla sm&aring; bokst&auml;ver (a-z) och eventuellt mellanslag. Mellanslag kommer aldrig finnas i b&ouml;rjan eller slutet av raden, och det kommer aldrig vara flera p&aring; raken (precis som i en vanlig mening). Raden &auml;r mellan 1 och 1000 tecken l&aring;ng.</p>

### 출력

<p>Skriv ut samma rad med &ouml;verfl&ouml;diga konsonanter borttagna, s&aring; att det aldrig finns fler &auml;n tv&aring; av samma konsonant i f&ouml;ljd.</p>