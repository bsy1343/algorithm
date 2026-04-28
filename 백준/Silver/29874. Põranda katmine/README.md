# [Silver V] Põranda katmine - 29874

[문제 링크](https://www.acmicpc.net/problem/29874)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 78, 정답: 45, 맞힌 사람: 26, 정답 비율: 45.614%

### 분류

구현, 브루트포스 알고리즘, 기하학

### 문제 설명

<p>Maaler Mati hakkab toa lage v&auml;rvima ja tal on vaja p&otilde;rand kinni katta, et v&auml;rvitilgad seda &auml;ra ei m&auml;&auml;riks. P&otilde;randa katmiseks on tal kaks papptahvlit. Aga neid tahvleid on hiljem veel tarvis ja Mati ei taha neid l&otilde;igata ega kokku murda. Kui p&otilde;randa saab katta &uuml;he tahvliga, siis Mati teist tahvlit ei kasuta. Nii tuba kui tahvlid on ristk&uuml;liku kujuga. Toa m&otilde;&otilde;tmed on $X \times Y$ cm, esimese tahvli m&otilde;&otilde;tmed $A_1 \times B_1$ cm ja teise omad $A_2 \times B_2$ cm.</p>

<p>Kontrollida, kas nende tahvlitega saab katta korraga kogu p&otilde;randa. Tahvleid v&otilde;ib p&ouml;&ouml;rata ja nad v&otilde;ivad ka osaliselt &uuml;ksteist katta, aga ei saa ulatuda &uuml;le p&otilde;randa &auml;&auml;re. Kui p&otilde;randa katmine on v&otilde;imalik, siis leida sobiv tahvlite paigutus XY-teljestikus, kus toa vastasnurkade koordinaadid on $(0, 0)$ ja $(X, Y)$. Kui lahendeid on mitu, siis esitada &uuml;ks neist.</p>

### 입력

<p>Sisendi esimesel real on t&uuml;hikuga eraldatud t&auml;isarvud $X$ ja $Y$: toa m&otilde;&otilde;tmed ($0 &lt; X, Y \le 500$). Teisel real on &uuml;he tahvli m&otilde;&otilde;tmed $A_1$ ja $B_1$ ning kolmandal real teise tahvli m&otilde;&otilde;tmed $A_2$ ja $B_2$ samas vormingus ($0 &lt; A_1, B_1, A_2, B_2 \le 500$).</p>

### 출력

<p>Kui p&otilde;randat ei saa n&otilde;utud viisil katta, kirjutada v&auml;ljundi ainsale reale &#39;<code>EI SAA</code>&#39;.</p>

<p>Kui programmi leitud lahend kasutab kahte tahvlit, siis kirjutada v&auml;ljundi kahele reale kummalegi neli t&uuml;hikutega eraldatud t&auml;isarvu. Esimesel real kirjeldada esimese tahvli asendit, andes koordinaattasandi suhtes vasakpoolse alumise nurga koordinaadid $X_{1,1}$ ja $Y_{1,1}$ ning parempoolse &uuml;lemise nurga koordinaadid $X_{1,2}$ ja $Y_{1,2}$. Teisel real anda teise tahvli nurkade koordinaadid $X_{2,1}$ ja $Y_{2,1}$ ning $X_{2,2}$ ja $Y_{2,2}$.</p>

<p>Kui lahend kasutab ainult esimest tahvlit, siis kirjutada v&auml;ljundi esimesele reale selle nurkade koordinaadid ja teisele reale s&uuml;mbol &#39;<code>Z</code>&#39;. Kui lahend kasutab ainult teist tahvlit, siis kirjutada v&auml;ljundi esimesele reale s&uuml;mbol &#39;<code>Z</code>&#39; ja teisele reale teise tahvli asendi kirjeldus.</p>