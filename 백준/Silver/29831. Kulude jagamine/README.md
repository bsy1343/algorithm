# [Silver IV] Kulude jagamine - 29831

[문제 링크](https://www.acmicpc.net/problem/29831)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 25, 맞힌 사람: 12, 정답 비율: 66.667%

### 분류

구현, 그리디 알고리즘

### 문제 설명

<p>$N$ s&otilde;pra k&auml;isid Informaatika Maailmameistriv&otilde;istlustel. V&otilde;istlusel osalemine tekitas neile erinevaid &uuml;hiseid kulutusi, kusjuures iga kulu eest maksis &uuml;ks s&otilde;pradest.</p>

<p>P&auml;rast v&otilde;istlust soovivad s&otilde;brad kulud v&otilde;rdselt &auml;ra jagada. Leida minimaalse kogusummaga panga&uuml;lekannete komplekt, mille abil seda teha.</p>

### 입력

<p>Sisendi esimesel real on s&otilde;prade arv $N$ ($1 \le N \le 50\,000$) ja tehtud kulutuste arv $M$ ($0 \le M \le 50\,000$). T&auml;histame s&otilde;pru arvudega $1, \ldots, N$.</p>

<p>J&auml;rgmisel $M$ real on tehtud kulutuste andmed. Igal real on t&auml;isarvud $X$ ja $S$, kus $X$ ($1 \le X \le N$) on selle selle s&otilde;bra number, kes maksis, ja $S$ ($S &gt; 0$) on makstud summa. V&otilde;ib eeldada, et k&otilde;ik makstud summad jaguvad t&auml;pselt s&otilde;prade arvuga ja et k&otilde;igi kulude kogusumma ei &uuml;leta $1\,000\,000\,000$.</p>

### 출력

<p>Esimesele reale v&auml;ljastada lahenduseks olevate panga&uuml;lekannete kogusumma $K$.</p>

<p>Teisele reale v&auml;ljastada &uuml;lekannete arv $P$. J&auml;rgmisele $P$ reale v&auml;ljastada iga&uuml;hele kolm t&uuml;hikutega eraldatud t&auml;isarvu $X$, $Y$ ja $S$ ($1 \le X \le N$, $1 \le Y \le N$, $X \ne Y$, $S &gt; 0$), mis n&auml;itavad, et s&otilde;ber $X$ kannab s&otilde;brale $Y$ &uuml;le summa $S$.</p>

<p>K&otilde;igi &uuml;lekannete kogusumma peab olema v&auml;him v&otilde;imalik. Kui sobivaid &uuml;lekannete komplekte on mitu, v&auml;ljastada &uuml;ksk&otilde;ik milline neist.</p>