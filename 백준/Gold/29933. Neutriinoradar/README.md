# [Gold III] Neutriinoradar - 29933

[문제 링크](https://www.acmicpc.net/problem/29933)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 4, 맞힌 사람: 4, 정답 비율: 28.571%

### 분류

수학, 정수론, 이분 탐색, 비트마스킹, 유클리드 호제법

### 문제 설명

<p>M&otilde;ne aja eest leidsid astronoomid t&auml;he $\zeta$-2019A, millel on $N$ planeeti. N&uuml;&uuml;d avastati, et &uuml;ks neist planeetidest on eluks k&otilde;lbulik. T&auml;ht on aga nii kaugel, et selle planeete saab uurida ainult v&otilde;imsa neutriinoradariga.</p>

<p>Radar t&ouml;&ouml;tab j&auml;rgmiselt. Algul saadab radar t&auml;hes&uuml;steemi suunas neurtiinovoo, mida iseloomustavad t&auml;isarvulised parameetrid $X$ ja $Y$. T&auml;hes&uuml;steemilt tagasi peegeldunud signaali anal&uuml;&uuml;sides on v&otilde;imalik sellest eraldada t&auml;isarv $B = \gcd(X, A + Y)$, kus $A$ on eluks k&otilde;lbuliku planeedi j&auml;rjekorranumber (planeedid on nummerdatud $1 \ldots N$ alates t&auml;hele $\zeta$-2019A l&auml;himast) ja $\gcd(X, Y)$ t&auml;histab arvude $X$ ja $Y$ suurimat &uuml;histegurit, see t&auml;hendab suurimat sellist t&auml;isarvu, millega nii $X$ kui $Y$ jaguvad j&auml;&auml;gita. Kuna neutriinovoo v&auml;ljasaatmine on v&auml;ga energiakulukas, v&otilde;ib seda teha maksimaalselt 40 korda.</p>

<p>N&uuml;&uuml;d on astronoomidel vaja programmi, mis juhiks radarit ja tuvastaks eluks k&otilde;lbuliku planeedi numbri. Programmi tuumaks on funktsioon <code>int Locate(int n)</code>. Seda funktsiooni kutsutakse v&auml;lja &uuml;ks kord, andes parameetrina t&auml;he $\zeta$-2019A planeetide arvu $N$, ja funktsioon peab tagastama eluks k&otilde;lbuliku planeedi numbri $A$ ($1 \le A \le N$).</p>

<p>Funktsioon <code>Locate</code> v&otilde;ib oma t&ouml;&ouml; k&auml;igus kasutada funktsiooni <code>int Scan(int x, int y)</code>, mis k&auml;ivitab radari parameetritega $X$ ja $Y$ ($1 \le X \le 10^9$, $0 \le Y \le 10^9$) ning tagastab radarisignaali anal&uuml;&uuml;si tulemuse $B = \gcd(X, A + Y)$. Funktsiooni <code>Scan</code> v&otilde;ib kasutada maksimaalselt 40 korda.</p>

<p>Testimiskeskkonnas on antud n&auml;itefailid, kus vajalikud funktsioonid on juba kirjeldatud ja vaja on lisada ainult funktsiooni <code>Locate</code> realisatsioon. Lisaks v&otilde;ib lahenduse faili kirjutada ka oma funktsioone. Oma lahenduse oma arvutis testimiseks on ka hindamisprogrammi n&auml;ide, mille sisendi ja v&auml;ljundi kirjeldus on toodud allpool (serveris on kasutusel teine hindamisprogramm, mis kontrollib ka lahenduse tagastatud vastuse &otilde;igsust). Oma lahenduse oma arvutis kompileerimiseks ja testimiseks:</p>

### 입력

<p>Tekstifaili ainsal real on kaks t&auml;isarvu: t&auml;he $\zeta$-2019A planeetide koguarv $N$ ($1 \le N \le 10^9$) ja eluks k&otilde;lbliku planeedi number $A$ ($1 \le A \le N$).</p>

### 출력

<p>Tekstifaili v&auml;ljastatakse hindamisprogrammi ja funktsiooni <code>Locate</code> vahelise suhtluse logi.</p>