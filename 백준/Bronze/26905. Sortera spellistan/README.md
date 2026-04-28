# [Bronze I] Sortera spellistan - 26905

[문제 링크](https://www.acmicpc.net/problem/26905)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 84, 정답: 74, 맞힌 사람: 62, 정답 비율: 91.176%

### 분류

정렬

### 문제 설명

<p>Du har en spellista med $N$ l&aring;tar med olika l&auml;ngder som ligger i en given ordning. Du vill sortera listan s&aring; att de kortaste l&aring;tarna kommer f&ouml;rst och de l&auml;ngsta l&aring;tarna kommer sist.</p>

<p>Vad &auml;r det minsta antalet platsbyten du beh&ouml;ver g&ouml;ra f&ouml;r att f&aring; listan sorterad? Vid ett platsbyte v&auml;ljer du tv&aring; intilliggande l&aring;tar och byter plats p&aring; dem.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e979e29c-b871-4768-bbf4-98bd7050f147/-/preview/" style="width: 256px; height: 154px;" /></p>

<p style="text-align: center;">&Ouml;versta raden visar l&aring;tarnas startordning i f&ouml;rsta exemplet. Pilarna visar platsbytena som beh&ouml;ver g&ouml;ras f&ouml;r att g&ouml;ra spellistan sorterad (understa raden)</p>

### 입력

<p>P&aring; f&ouml;rsta raden av indatan st&aring;r ett heltal $N$, ($1 \leq N \leq 1000$), antalet l&aring;tar.</p>

<p>D&auml;refter f&ouml;ljer $N$ rader. Varje rad inneh&aring;ller ett heltal $l$ ($1 \leq l \leq 1000)$, l&auml;ngden p&aring; vardera l&aring;t. Alla l&aring;tarna har olika l&auml;ngd.</p>

### 출력

<p>Skriv ut ett enda tal: det minsta antalet platsbyten som beh&ouml;ver g&ouml;ras f&ouml;r att sortera spellistan.</p>