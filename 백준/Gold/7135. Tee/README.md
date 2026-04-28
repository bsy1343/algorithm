# [Gold I] Tee - 7135

[문제 링크](https://www.acmicpc.net/problem/7135)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

구현, 그래프 이론, 정렬, 누적 합, 최단 경로, 데이크스트라, 스위핑, 역추적

### 문제 설명

<p>&Uuml;ks saar on jagatud $N$ maat&uuml;kiks. Iga maat&uuml;kk on ristk&uuml;liku kujuga. Vaja on ehitada tee punktist $A$ punkti $B$ nii, et tee kulgeks m&ouml;&ouml;da maat&uuml;kkide servasid (sest keegi maaomanikest ei soovi, et tee tema maat&uuml;ki mitmeks v&auml;iksemaks t&uuml;kiks jagaks).</p>

<p>Kirjutada programm, mis leiab l&uuml;hima n&otilde;uetekohase tee punktist $A$ punkti $B$.</p>

### 입력

<p>Tekstifaili esimesel real on maat&uuml;kkide arv $N$ ($1 \le N \le 1000$). J&auml;rgneval $N$ real on maat&uuml;kke defineerivate ristk&uuml;likute alumise vasakpoolse ja &uuml;lemise parempoolse nurga koordinaadid $X_0$, $Y_0$, $X_1$, $Y_1$. Viimasel kahel real on punktide $A$ ja $B$ koordinaadid $X_A$, $Y_A$ ja $X_B$, $Y_B$. K&otilde;ik koordinaadid on mittenegatiivsed t&auml;isarvud, mille v&auml;&auml;rtus ei &uuml;leta $1\,000\,000$. On teada, et punktid $A$ ja $B$ on maat&uuml;kkide servadel. Lisaks on teada, et k&otilde;ik maat&uuml;kid on &uuml;hel saarel, kuigi saarel v&otilde;ib olla ka j&auml;rvi.</p>

### 출력

<p>Tekstifaili esimesele reale v&auml;ljastada leitud tee pikkus $L$. J&auml;rgnevatele ridadele v&auml;ljastada leitud tee l&otilde;ikude otspunktide koordinaadid $X$, $Y$. Kui leidub mitu sama teepikkusega lahendust, v&auml;ljastada ainult &uuml;ks neist.</p>