# [Silver III] Byäldsten - 20865

[문제 링크](https://www.acmicpc.net/problem/20865)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 34, 정답: 12, 맞힌 사람: 10, 정답 비율: 33.333%

### 분류

정렬

### 문제 설명

<p>En g&aring;ng f&ouml;r l&auml;nge sedan fanns det en liten by som hette Stackk&ouml;ping. Inv&aring;narna i Stackk&ouml;ping hade flera speciella traditioner. En tradition var att den &auml;ldsta levande bybon i slutet av varje &aring;r m&aring;ste h&aring;lla ett ny&aring;rstal. En annan tradition var att h&ouml;gst en ny person fick f&ouml;das varje &aring;r, och enligt vissa experter var det detta som till slut ledde till Stackk&ouml;pings underg&aring;ng.</p>

<p>Vid en arkeologisk utgr&auml;vning hittades ett dokument som visar vilka &aring;rtal samtliga $n$ personer som n&aring;gonsin levat i Stackk&ouml;ping f&ouml;ddes och dog. Du har kommit &ouml;ver dokumentet, och vill r&auml;kna ut hur m&aring;nga ny&aring;rstal varje person h&ouml;ll.</p>

<p>Ny&aring;rstalet &auml;r alltid det absolut sista som h&auml;nder varje &aring;r, s&aring; ingen f&ouml;ds eller d&ouml;r efter ny&aring;rstalet som sker samma &aring;r. Om ingen &auml;r vid liv vid ny&aring;r s&aring; h&aring;lls s&aring;klart inget tal alls. Annars h&aring;lls alltid ett tal, till och med om det bara &auml;r en person vid liv.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller ett heltal $n$ ($1 \le n \le 10^5$): antalet personer. F&ouml;ljande $n$ rader inneh&aring;ller tv&aring; heltal $f_i$ och $d_i$ ($0 \le f_i &lt; d_i \le 10^9$): de &aring;rtal person nummer $i$ f&ouml;ddes respektive dog. Alla talen $f_i$ &auml;r olika.</p>

### 출력

<p>Skriv ut $n$ rader med ett heltal p&aring; varje, d&auml;r det $i$:te talet &auml;r hur m&aring;nga ny&aring;rstal den $i$:te personen h&ouml;ll.</p>