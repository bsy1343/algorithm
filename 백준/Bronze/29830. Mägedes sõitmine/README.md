# [Bronze I] Mägedes sõitmine - 29830

[문제 링크](https://www.acmicpc.net/problem/29830)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 67, 정답: 55, 맞힌 사람: 44, 정답 비율: 91.667%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Juta k&auml;is Norras, kus on palju m&auml;gesid. Tema nutitelefon j&auml;&auml;dvustas, kuidas Juta teekond liikus k&otilde;rgemale ja madalamale: iga meetri j&auml;rel teatas telefon, mitu &uuml;hikut ta &uuml;les v&otilde;i alla liikus. Juta alustas oma teekonda maapinnal, aga m&otilde;nikord s&otilde;itis ta ka m&ouml;&ouml;da viadukti maa kohal v&otilde;i tunnelis maa all.</p>

<p>Antud on maapinna k&otilde;rgus merepinnast Juta teekonnal ja tema telefoni teated. Leida iga meetri j&auml;rel, kas Juta oli sel hetkel maapinnal, &otilde;hus viaduktil v&otilde;i maa all tunnelis.</p>

### 입력



### 출력

<p>Sisendi esimesel real on t&auml;isarv $N$, teekonna pikkus meetrites ($1 \le N \le 100\,000$).</p>

<p>Teisel real on $N+1$ t&auml;isarvu $H_0, H_1, \dots, H_N$ ($-1\,000\,000\,000 \le H_i \le 1\,000\,000\,000$), mis n&auml;itavad maapinna k&otilde;rgust merepinnast Juta teekonna alguses ja iga meetri j&auml;rel.</p>

<p>Kolmandal real on $N$ t&auml;isarvu $D_1, D_2, \ldots, D_N$ ($-10\,000 \le D_i \le 10\,000$), mis n&auml;itavad, kui palju Juta k&otilde;rgus muutus iga l&auml;bitud meetri jooksul. V&otilde;ib eeldada, et Juta k&otilde;rgus merepinnast ei v&auml;lju kordagi l&otilde;igust $-2\,000\,000\,000 \dots 2\,000\,000\,000$.</p>

### 제한

<p>Ainsale reale v&auml;ljastada $N$ t&auml;hte, mis n&auml;itavad teekonna iga meetri kohta, kas Juta on selle l&auml;bimise j&auml;rel maapinnal (&#39;<code>M</code>&#39;), &otilde;hus viaduktil (&#39;<code>V</code>&#39;) v&otilde;i maa all tunnelis (&#39;<code>T</code>&#39;).</p>