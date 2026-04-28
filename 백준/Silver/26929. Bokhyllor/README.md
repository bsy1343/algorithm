# [Silver III] Bokhyllor - 26929

[문제 링크](https://www.acmicpc.net/problem/26929)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 30, 맞힌 사람: 16, 정답 비율: 59.259%

### 분류

수학, 다이나믹 프로그래밍

### 문제 설명

<p>Du ska k&ouml;pa bokhyllor f&ouml;r att f&aring; plats med alla dina b&ouml;cker. Du vet fr&aring;n b&ouml;rjan vilka b&ouml;cker du har och beh&ouml;ver r&auml;kna ut antalet bokhyllor som kr&auml;vs. B&ouml;ckerna har tre olika storlekar: en liten bok tar $1$ platsenhet, en mellanstor $2$ och en stor bok tar $3$ platsenheter. Varje hylla rymmer ett visst antal platsenheter.</p>

<p>Givet hur m&aring;nga b&ouml;cker du har av varje sort, skriv ett program som ber&auml;knar hur m&aring;nga hyllor du beh&ouml;ver om du vill ha s&aring; f&aring; hyllor som m&ouml;jligt.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tre heltal som, i tur och ordning, beskriver antalet sm&aring; b&ouml;cker, antalet mellanstora b&ouml;cker samt antalet stora b&ouml;cker. Antalet b&ouml;cker av varje sort kommer vara h&ouml;gst $20$.</p>

<p>D&auml;refter f&ouml;ljer en rad med heltalet $S$ ($S \le 20$), hyllstorleken. Det kommer alltid kr&auml;vas minst $2$ hyllor.</p>

### 출력

<p>Skriv ut det minimala antalet hyllor som kr&auml;vs f&ouml;r att f&aring; plats med alla b&ouml;cker.</p>