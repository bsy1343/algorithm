# [Silver V] Marslaste kalender - 29950

[문제 링크](https://www.acmicpc.net/problem/29950)

### 성능 요약

시간 제한: 0.2 초, 메모리 제한: 1024 MB

### 통계

제출: 96, 정답: 64, 맞힌 사람: 17, 정답 비율: 50.000%

### 분류

수학, 사칙연산, 누적 합

### 문제 설명

<p>Marslased ehitavad uut kosmoseuurimise keskust. Kuna kosmos on otsatu, tuleb ka uurimiskeskus tohutu suur. Seet&otilde;ttu on ehitusega kiire ja t&ouml;&ouml; hea planeerimine h&auml;davajalik.</p>

<p>Marslaste kalender erineb maalaste omast. Nende aasta on v&auml;ga pikk, koosnedes $10^{12}$ p&auml;evast. Aasta jagub kuudeks, kusjuures esimeses kuus on &uuml;ks p&auml;ev, teises kuus kaks p&auml;eva, kolmandas kolm p&auml;eva jne. P&auml;evi nummerdatakse igas kuus alates &uuml;hest. N&auml;iteks aasta 12 esimese p&auml;eva j&auml;rjekorranumbrid nende kuudes on 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2.</p>

<p>Ka p&auml;evad on erineva pikkusega. Kuu esimese p&auml;eva pikkus on &uuml;ks tund, teise p&auml;eva pikkus kaks tundi, kolmanda pikkus kolm tundi jne.</p>

<p>Uurimiskeskust hakkab ehitama Marsi parim brigaad, mis suudab uue hoone p&uuml;stitada k&otilde;igest &uuml;he tunniga. Seega suudavad nad kuu $k$. p&auml;eval ehitada $k$ hoonet. Brigaad saab keskuse ehitusel t&ouml;&ouml;tada alates aasta $A$. p&auml;evast kuni sama aasta $B$. p&auml;evani (m&otilde;lemad kaasa arvatud).</p>

<p>Kirjutada programm, mis leiab, mitu hoonet brigaad selle ajaga ehitada j&otilde;uab. (Marslased on v&auml;simatud ja t&ouml;&ouml;tavad &ouml;&ouml;p&auml;evaringselt.)</p>

### 입력

<p>Faili ainsal real on t&auml;isarvud $A$ ja $B$ ($1 \le A \le B \le 10^{12}$), brigaadi esimese ja viimase t&ouml;&ouml;p&auml;eva j&auml;rjekorranumbrid aastas.</p>

### 출력

<p>Faili ainsale reale v&auml;ljastada ehitatavate hoonete arv.</p>