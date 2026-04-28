# [Gold II] Bitryssland - 20889

[문제 링크](https://www.acmicpc.net/problem/20889)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

비트마스킹, 그리디 알고리즘

### 문제 설명

<p>I Republiken Bitryssland har det nyligen inf&ouml;rts ett nytt system f&ouml;r mynt. Det finns $N$ olika val&ouml;rer av mynt som &auml;r v&auml;rda $2^0, 2^1, 2^2, ..., 2^{N-1}$.&nbsp;</p>

<p>Den lilla staden Napsaks &auml;r k&auml;nd f&ouml;r att vara fylld av intressanta aff&auml;rer. Samtidigt &auml;r Napsaks &ouml;k&auml;nd f&ouml;r att det aldrig finns n&aring;gon v&auml;xel i aff&auml;rerna. Man f&aring;r inte heller betala mer &auml;n vad det kostar. Det &auml;r d&auml;rf&ouml;r mycket viktigt att ta med sig gott om mynt av l&auml;mpliga val&ouml;rer f&ouml;r att kunna k&ouml;pa allt man vill ha.&nbsp;</p>

<p>I Napsaks bor Darja-Pavla. Hon planerar att g&aring; och handla julklappar och har tagit med sig $a_i$ mynt av v&auml;rde $2^i$ ($i = 0, 1, ..., N-1$). Hon ska bes&ouml;ka $M$ olika aff&auml;rer och i varje aff&auml;r ska hon k&ouml;pa en sak. Saken hon k&ouml;per i aff&auml;r $i$ kostar $b_i$ ($i = 0, 1, ..., M-1$). Hon &auml;r sj&auml;lvklart orolig &ouml;ver att hennes mynt inte kommer att r&auml;cka f&ouml;r att betala f&ouml;r allt hon vill k&ouml;pa. Hj&auml;lp henne att avg&ouml;ra detta!</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tv&aring; heltal $1 \le N \le 50$ och $1 \le M \le 100\,000$, separerade med blanksteg. N&auml;sta rad inneh&aring;ller de $N$ blankstegsseparerade heltalen $0 \le a_0, a_1, ..., a_{N-1} \le 10^{15}$. Den tredje och sista raden inneh&aring;ller de $M$ blankstegsseparerade heltalen $0 \le b_0, b_1, ..., b_{M-1} \le 10^{15}$.</p>

### 출력

<p>Skriv ut <code>ja</code> om Darja-Pavla kan betala f&ouml;r allt hon vill k&ouml;pa med sina mynt. Annars, skriv ut <code>nej</code>.</p>