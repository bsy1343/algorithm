# [Platinum V] Rozejděte se! - 9148

[문제 링크](https://www.acmicpc.net/problem/9148)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

백트래킹

### 문제 설명

<p>Nejobl&iacute;beněj&scaron;&iacute; větou každ&eacute;ho spr&aacute;vn&eacute;ho policisty je ,,Občan&eacute;, rozejděte se! Nen&iacute; tady nic k&nbsp;viděn&iacute;!&#39;&#39;. Ov&scaron;em samotn&aacute; věta vždy nepomůže. Existuj&iacute; obs&aacute;hl&eacute; př&iacute;ručky, kter&eacute; popisuj&iacute;, jak se m&aacute; policista zachovat, pokud občan&eacute; neuposlechnou dobře m&iacute;něn&eacute; v&yacute;zvy a nerozejdou se. Nejdůležitěj&scaron;&iacute; rada pro takovou chv&iacute;li ř&iacute;k&aacute;, že je dobr&eacute; hlouček lid&iacute; rozdělit tak, aby jich bylo pohromadě co nejm&eacute;ně. A o takov&eacute; dělen&iacute; n&aacute;m půjde i v&nbsp;t&eacute;to &uacute;loze. &Uacute;kolem bude hledat různ&aacute; dělen&iacute; hloučku, aby si z&nbsp;nich policista mohl vybrat to nejsn&aacute;ze realizovateln&eacute;.</p>

<p>Pro zjednodu&scaron;en&iacute; uvažujeme pouze takzvan&eacute; ,,ortogon&aacute;ln&iacute; normohloučky stejnoměrně rozlehl&yacute;ch občanů&#39;&#39;, což je term&iacute;n zaveden&yacute; v&nbsp;dnes již klasick&eacute; př&iacute;ručce na toto t&eacute;ma<em>Rozch&aacute;zen&iacute; se snadno a rychle</em>. Takov&yacute; normohlouček je možn&eacute; modelovat jako čtvercov&yacute; &uacute;tvar složen&yacute; z&nbsp;<var>N x N</var>&nbsp;čtvercov&yacute;ch občanů stejn&eacute; půdorysov&eacute; velikosti. &Uacute;kolem policisty je tento hlouček rozdělit na dvě poloviny. A ide&aacute;ln&iacute; poloviny jsou samozřejmě takov&eacute;, kter&eacute; jsou obě stejn&eacute;, a to nejen co do velikosti, ale i do tvaru.</p>

<p>Kromě toho je v&scaron;ak tak&eacute; nutn&eacute; uvažovat způsob oddělen&iacute; obou polovin od sebe. Existuje speci&aacute;ln&iacute; oddělovac&iacute; policejn&iacute; p&aacute;ska určen&aacute; speci&aacute;lně k&nbsp;tomuto &uacute;čelu, v&nbsp;policejn&iacute;m žargonu se j&iacute; ř&iacute;k&aacute; ,,oddělovačka&#39;&#39;. Tuto p&aacute;skou je možn&eacute; rychle ovinout kolem skupiny občanů, a tak je oddělit od zbytku davu. Vzhledem k&nbsp;tomu, že oddělovačka je velmi drah&aacute;, nesm&iacute; se nikdy stř&iacute;hat ani kr&aacute;tit. Je proto nutn&eacute; naj&iacute;t takov&eacute; rozdělen&iacute; normohloučku, kdy každ&aacute; ze vznikl&yacute;ch polovin m&aacute; přesně dan&yacute; obvod.</p>

<p>Va&scaron;&iacute;m &uacute;kolem je určit počet různ&yacute;ch způsobů, kter&yacute;mi je možn&eacute; rozdělit čtvercov&yacute; normohlouček o velikosti strany&nbsp;<var>N</var>&nbsp;takov&yacute;m způsobem, aby vznikly dvě č&aacute;sti o přesně dan&eacute;m obvodu&nbsp;<var>M</var>. Tyto č&aacute;sti mus&iacute; b&yacute;t stejn&eacute;, to znamen&aacute;, že jedna mus&iacute; b&yacute;t převediteln&aacute; na druhou pouze pomoc&iacute; operac&iacute; posunu, ot&aacute;čen&iacute; a zrcadlen&iacute;. Děl&iacute;c&iacute; linie může samozřejmě v&eacute;st pouze po hran&aacute;ch ,,jednotkov&yacute;ch čtverečků&#39;&#39;, aby ž&aacute;dn&yacute; občan neutrpěl zraněn&iacute;.</p>

### 입력

<p>Prvn&iacute; ř&aacute;dek vstupn&iacute;ho souboru obsahuje cel&eacute; kladn&eacute; č&iacute;slo&nbsp;<var>Z</var>, za kter&yacute;m n&aacute;sleduje postupně&nbsp;<var>Z</var>zad&aacute;n&iacute;. Každ&eacute; zad&aacute;n&iacute; sest&aacute;v&aacute; ze dvou č&iacute;sel&nbsp;<var>N</var>&nbsp;a&nbsp;<var>M</var>, 2 &lt;=&nbsp;<var>N</var>&nbsp;&lt;= 20, 2 &lt;=&nbsp;<var>M</var>&nbsp;&lt;= 60, uveden&yacute;ch na stejn&eacute;m ř&aacute;dku a oddělen&yacute;ch mezerou. Prvn&iacute; č&iacute;slo (<var>N</var>) ud&aacute;v&aacute; velikost strany čtverce, druh&eacute; (<var>M</var>) je d&eacute;lka p&aacute;sky, tedy obvod každ&eacute; z polovin, kter&eacute; maj&iacute; rozdělen&iacute;m vzniknout.</p>

### 출력

<p>Pro každ&eacute; zad&aacute;n&iacute; mus&iacute; program vypsat pr&aacute;vě jeden ř&aacute;dek. Pokud nen&iacute; možn&eacute; rozdělit normohlouček na dvě stejn&eacute; č&aacute;sti se zadan&yacute;m obvodem, bude na ř&aacute;dku věta &quot;<code>Rozdeleni neni mozne.</code>&quot;. V&nbsp;ostatn&iacute;ch př&iacute;padech vytisknětě větu &quot;<code>Existuje&nbsp;</code><var>R</var><code>&nbsp;ruznych moznosti.</code>&quot;, kde&nbsp;<var>R</var>&nbsp;je počet různ&yacute;ch způsobů, jak hlouček rozdělit předepsan&yacute;m způsobem. Dva způsoby jsou považov&aacute;ny za různ&eacute;, pokud vznikl&eacute; poloviny jsou rozd&iacute;ln&eacute;, tedy pokud nelze polovinu z&nbsp;jednoho dělen&iacute; přev&eacute;st na polovinu podle druh&eacute;ho dělen&iacute; pomoc&iacute; operac&iacute; posunut&iacute;, ot&aacute;čen&iacute; a zrcadlen&iacute;.</p>