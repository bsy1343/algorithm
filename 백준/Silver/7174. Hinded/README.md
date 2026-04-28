# [Silver III] Hinded - 7174

[문제 링크](https://www.acmicpc.net/problem/7174)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 21, 맞힌 사람: 15, 정답 비율: 78.947%

### 분류

구현, 누적 합

### 문제 설명

<p>Juku klassi k&otilde;ik &otilde;pilased peavad esitlema oma uurimist&ouml;&ouml;d. P&auml;rast iga esitlust annab iga kaas&otilde;pilasene t&ouml;&ouml;le hinde.</p>

<p>On teada, et &otilde;pilane $A$ hindab &otilde;pilase $B$ t&ouml;&ouml;d j&auml;rgmiselt:</p>

<ul>
	<li>kui $B$ ei ole $A$-d hinnanud, annab $A$ ausa hinde vastavalt t&ouml;&ouml; tegelikult v&auml;&auml;rtusele;</li>
	<li>kui $B$ on $A$-d hinnanud, annab $A$ tagasi sama hinde, mille ta $B$-lt sai.</li>
</ul>

<p>&Otilde;petaja on juba koostanud k&otilde;igi esitluste nimekirja, kuid Juku nimi on sealt v&auml;lja j&auml;&auml;nud. Leida, millisele reale nimekirjas peaks Juku ennast paigutama, et saada maksimaalne koguhinne. Juku valitud real asuv ning k&otilde;ik temale j&auml;rgnevad &otilde;pilased nihkuvad j&auml;rjekorras &uuml;he positsiooni v&otilde;rra edasi.</p>

### 입력

<p>Tekstifaili esimesel real on Juku uurimist&ouml;&ouml; t&auml;isarvuline v&auml;&auml;rtus $V$ ($1 \le V \le 1000$), teisel real juba nimekirjas olevate &otilde;pilaste arv $N$ ($1 \le N \le 1\,000\,000$) ning j&auml;rgneval $N$ real iga&uuml;hel &uuml;he &otilde;pilase uurimist&ouml;&ouml; t&auml;isarvuline v&auml;&auml;rtus $V_i$ ($1 \le V_i \le 1000$).</p>

### 출력

<p>Tekstifaili esimesele reale v&auml;ljastada kaks t&auml;isarvu: Juku parim v&otilde;imalik koguhinne ning positsioon nimekirjas, mille ta peab selle saavutamiseks valima. Kui sobivaid positsioone on mitu, v&auml;ljastada neist esimene.</p>