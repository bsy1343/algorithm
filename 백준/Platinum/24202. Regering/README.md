# [Platinum IV] Regering - 24202

[문제 링크](https://www.acmicpc.net/problem/24202)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

정렬, 누적 합, 비트마스킹, 배낭 문제, 중간에서 만나기

### 문제 설명

<p>V&auml;ljarna i PO-land har r&ouml;stat och $N$ partier har f&aring;tt plats i parlamentet, vardera med ett visst antal mandat. Eftersom alla partier tycker ungef&auml;r likadant i PO-land (rekursion ist&auml;llet f&ouml;r inflation etc.) funderar talmannen p&aring; att lotta ut regeringsmakten. Men d&aring; m&aring;ste hon f&ouml;rst veta hur m&aring;nga m&ouml;jliga majoritetsregeringar det finns.</p>

<p>Skriv ett program som ber&auml;knar p&aring; hur m&aring;nga s&auml;tt man kan bilda regering s&aring; att regeringen har majoritet i parlamentet, d.v.s. s&aring; att de ing&aring;ende partierna tillsammans har fler mandat &auml;n &ouml;vriga partier. Regeringen f&aring;r inte ha n&aring;got &ouml;verfl&ouml;digt parti, vilket inneb&auml;r att om man kan ta bort ett parti fr&aring;n regeringen och de fortfarande har majoritet, s&aring; ska den regeringsformationen inte r&auml;knas.</p>

### 입력

<p>Den f&ouml;rsta raden i indatat inneh&aring;ller antalet partier $N$, $2 \le N \le 35$.</p>

<p>D&auml;refter f&ouml;ljer en rad med $N$ tal: antalet mantal f&ouml;r varje parti (alltid ett heltal). Varje parti har minst ett mandat och det totala antalet mandat &ouml;verstiger inte 1000.</p>

### 출력

<p>Programmet ska skriva ut ett tal: antalet m&ouml;jliga regeringsformationer enligt ovan. Svaret kommer inte att &ouml;verstiga 2 miljarder.</p>