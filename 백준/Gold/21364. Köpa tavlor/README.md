# [Gold V] Köpa tavlor - 21364

[문제 링크](https://www.acmicpc.net/problem/21364)

### 성능 요약

시간 제한: 14 초, 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 30, 맞힌 사람: 24, 정답 비율: 58.537%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Mona har just flyttat och ska nu b&ouml;rja inreda. Hon har kommit fram till att hon beh&ouml;ver precis $k$ stycken tavlor, och har &aring;kt till konstmarknaden f&ouml;r att handla. Mona &auml;r v&auml;ldigt rik, och bryr sig inte alls om hur mycket tavlorna kostar, utan vill ist&auml;llet bara bli f&auml;rdig s&aring; snabbt som m&ouml;jligt.&nbsp;</p>

<p>P&aring; marknaden s&auml;ljs $N$ tavlor l&auml;ngs en l&aring;ng gata. Tavla $i$ tar $t_i$ sekunder att k&ouml;pa. Att g&aring; fr&aring;n en tavla till n&auml;sta tar 1 sekund. Mona tar bussen dit och hem, s&aring; hon kan v&auml;lja vid vilken tavla hon b&ouml;rjar och slutar. Vad &auml;r den kortaste tiden Mona kan k&ouml;pa $k$ tavlor p&aring;?</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tv&aring; heltal: $N$ ($1 \le N \le 2000$), antalet tavlor p&aring; marknaden, och $k$ ($1 \le k \le N$), antal tavlor Mona beh&ouml;ver k&ouml;pa.</p>

<p>Den andra raden inneh&aring;ller $N$ heltal: $1 \le t_1,t_2,...t_n \le 1000$, antal sekunder det tar att k&ouml;pa respektive tavla.</p>

### 출력

<p>Skriv ut ett heltal -- det minsta antalet sekunder det kan ta f&ouml;r Mona att k&ouml;pa $k$ tavlor.</p>