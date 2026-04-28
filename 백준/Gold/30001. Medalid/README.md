# [Gold V] Medalid - 30001

[문제 링크](https://www.acmicpc.net/problem/30001)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 34, 정답: 13, 맞힌 사람: 11, 정답 비율: 44.000%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 큐

### 문제 설명

<p>Oleg on osalenud mitmes spordiv&otilde;istluste sarjas. Igas sarjas on v&otilde;istlused j&auml;rjest nummerdatud, n&auml;iteks &quot;36. K&uuml;kametsa T&otilde;ukekelgumaraton&quot;.</p>

<p>Igal v&otilde;istlusel antakse igale osalejale medal. Igale medalile on kirjutatud v&otilde;istluse j&auml;rjenumber oma sarjas, aga muus osas on medalid identsed.</p>

<p>Oleg on osalenud paljudel v&otilde;istlustel ning tal on suur kotit&auml;is medaleid. Tuvastada v&auml;him v&otilde;imalik erinevate sarjade arv, millelt ta need medalid saada v&otilde;is.</p>

<p>On teada, et kui Oleg mingis sarjas osalema hakkab, k&auml;ib ta j&auml;rjest k&otilde;igil selle sarja v&otilde;istlustel, &uuml;htki vahele j&auml;tmata. Seega, kui ta k&auml;ib n&auml;iteks 36. ja 38. K&uuml;kametsa T&otilde;ukekelgumaratonil, osaleb ta kindlasti ka 37. K&uuml;kametsa T&otilde;ukekelgumaratonil.</p>

### 입력

<p>Tekstifaili esimesel real on medalite arv $N$ ($1 \le N &lt; 10^6$) ja teisel real $N$ t&uuml;hikutega eraldatud t&auml;isarvu $M_i$ ($1 \le M_{i} \le 1000$): medalitel olevad v&otilde;istluste j&auml;rjenumbrid.</p>

### 출력

<p>Tekstifaili esimesele reale v&auml;ljastada v&auml;him v&otilde;imalik v&otilde;istlussarjade arv $V$ ning j&auml;rgmisele $V$ reale &uuml;ks v&otilde;imalik medalite jaotus sarjade vahel. Igale reale v&auml;ljastada &uuml;hes sarjas osalemiste arv ning sellelt saadud medalite numbrid kasvavas j&auml;rjekorras.</p>