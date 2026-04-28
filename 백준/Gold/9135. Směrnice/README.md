# [Gold V] Směrnice - 9135

[문제 링크](https://www.acmicpc.net/problem/9135)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 61, 정답: 13, 맞힌 사람: 11, 정답 비율: 30.556%

### 분류

많은 조건 분기, 자료 구조, 해시를 사용한 집합과 맵, 구현, 시뮬레이션, 문자열, 집합과 맵

### 문제 설명

<p>Rekonstrukce malostransk&eacute; budovy Matematicko-fyzik&aacute;ln&iacute; fakulty si vyž&aacute;d&aacute; značn&eacute; množstv&iacute; finančn&iacute;ch prostředků. Jen financov&aacute;n&iacute; program&aacute;torů, kteř&iacute; pracuj&iacute; na zefektivněn&iacute; pr&aacute;ce děln&iacute;ků, si vyž&aacute;d&aacute; nemal&eacute; pen&iacute;ze na bagety, Coca-colu a person&aacute;l, kter&yacute; dohl&iacute;ž&iacute; na udržov&aacute;n&iacute; z&aacute;kladn&iacute;ch životn&iacute;ch funkc&iacute; těchto pracovn&iacute;ků. Raději zde ani nebudeme zmiňovat n&aacute;klady na platy skupiny kontroluj&iacute;c&iacute; efektivitu pr&aacute;ce program&aacute;torů. Proto byla vyd&aacute;na směrnice děkana SM2001/364 o kontrole pohybu finančn&iacute;ch prostředků. Tato směrnice např&iacute;klad určuje, kter&yacute; pracovn&iacute;k m&aacute; opr&aacute;vněn&iacute; uvolnit pen&iacute;ze na maltu, kter&yacute; na cihly a kter&yacute; na okna. Směrnice d&aacute;le př&iacute;sně nařizuje archivaci a střežen&iacute; ve&scaron;ker&yacute;ch &uacute;dajů o v&yacute;daj&iacute;ch fakulty, specifikuje způsob z&aacute;pisu jednotliv&yacute;ch nab&iacute;dek od dodavatelů a postup, jak pro potřeby fakulty vyb&iacute;rat dodavatele a př&iacute;padně i jejich subdodavatele.</p>

<p>Pro ilustraci si představme, že fakulta dostala nab&iacute;dky od pades&aacute;ti firem. Každ&aacute; firma potřebuje pro v&yacute;robu sv&eacute;ho produktu (př&iacute;padně sv&yacute;ch produktů) nějak&eacute; suroviny, kter&eacute; j&iacute; mohou dodat někter&eacute; jin&eacute; firmy. Přirozeně cena v&yacute;sledn&yacute;ch produktů z&aacute;vis&iacute; na cen&aacute;ch surovin, ze kter&yacute;ch je produkt vyr&aacute;běn. Nyn&iacute; je fakulta postavena před probl&eacute;m, jak z&iacute;skat někter&eacute; suroviny co nejlevněji.</p>

<p>Kromě probl&eacute;mů spojen&yacute;ch s&nbsp;rekonstrukc&iacute; budovy je tak&eacute; potřeba ře&scaron;it financov&aacute;n&iacute; běžn&eacute;ho chodu fakulty. Každ&aacute; katedra z&iacute;sk&aacute;v&aacute; kromě prostředků z celofakultn&iacute;ho rozpočtu tak&eacute; prostředky z grantů, od sponzorů apod. Tyto pen&iacute;ze pak katedry utr&aacute;cej&iacute; mimo jin&eacute; za n&aacute;kup nov&eacute;ho hardwaru a softwaru. Cel&yacute; syst&eacute;m financov&aacute;n&iacute; je tedy potřeba zpřehlednit, a proto bylo rozhodnuto vytvořit jednotn&yacute; fakultn&iacute; finančn&iacute; software pod veden&iacute;m komise, kter&aacute; byla pro tento &uacute;čel jmenov&aacute;na děkanem.</p>

<p>Když byl tento probl&eacute;m předložen analytikům placen&yacute;m fakultou, tito se zděsili a odm&iacute;tli &uacute;lohu jako neře&scaron;itelnou. Proto se nadř&iacute;zen&aacute; komise rozhodla, že od implementace t&eacute;to č&aacute;sti nař&iacute;zen&iacute; zat&iacute;m upust&iacute; a nech&aacute; naimplementovat alespoň č&aacute;st směrnice upravuj&iacute;c&iacute; spr&aacute;vu fakultn&iacute;ch kont.</p>

<p>Směrnice ř&iacute;k&aacute;, že ve&scaron;ker&eacute; operace s&nbsp;konty mus&iacute; proj&iacute;t přes speci&aacute;ln&iacute; fakultn&iacute; program, kter&yacute; v&scaron;echny informace zaznamen&aacute; a odhal&iacute; př&iacute;padn&eacute; nesrovnalosti. Naimplementovat tento program je pr&aacute;vě &uacute;kol pro v&aacute;s.</p>

### 입력

<p>Program na vstupu dostane několik ř&aacute;dků. Na každ&eacute;m ř&aacute;dku je zaps&aacute;na jedna operace v&nbsp;bance. Operace mohou b&yacute;t n&aacute;sleduj&iacute;c&iacute;:</p>

<ul>
	<li><code>ZALOZ</code>&nbsp;<em>&uacute;čet</em></li>
	<li><code>ULOZ</code>&nbsp;<em>&uacute;čet č&aacute;stka</em></li>
	<li><code>VYBER</code>&nbsp;<em>&uacute;čet č&aacute;stka</em></li>
	<li><code>PREVED</code>&nbsp;<em>&uacute;čet1 &uacute;čet2 č&aacute;stka</em></li>
	<li><code>STATISTIKA</code></li>
	<li><code>LIST</code></li>
	<li><code>RESET</code></li>
</ul>

<p><em>&uacute;čet</em>&nbsp;je desetim&iacute;stn&eacute; č&iacute;slo &uacute;čtu.&nbsp;<em>č&aacute;stka</em>&nbsp;je č&iacute;slo s&nbsp;pr&aacute;vě dvěma m&iacute;sty za desetinnou tečkou. V&nbsp;jednom okamžiku m&aacute; fakulta v&nbsp;bance nejv&yacute;&scaron;e 10&nbsp;000 &uacute;čtů.</p>

<p>Operace&nbsp;<code>ZALOZ</code>&nbsp;vytvoř&iacute; nov&yacute; &uacute;čet s&nbsp;č&iacute;slem&nbsp;<em>&uacute;čet</em>.</p>

<p>Operace&nbsp;<code>ULOZ</code>&nbsp;ulož&iacute; na &uacute;čet&nbsp;<em>&uacute;čet</em>&nbsp;č&aacute;stku&nbsp;<em>č&aacute;stka</em>.</p>

<p>Operace&nbsp;<code>VYBER</code>&nbsp;vybere z&nbsp;&uacute;čtu&nbsp;<em>&uacute;čet</em>&nbsp;č&aacute;stku&nbsp;<em>č&aacute;stka</em>.</p>

<p>Operace&nbsp;<code>PREVED</code>&nbsp;převede č&aacute;stku&nbsp;<em>č&aacute;stka</em>&nbsp;z&nbsp;&uacute;čtu&nbsp;<em>&uacute;čet1</em>&nbsp;na &uacute;čet&nbsp;<em>&uacute;čet2</em>.</p>

<p>Operace&nbsp;<code>STATISTIKA</code>&nbsp;a&nbsp;<code>LIST</code>&nbsp;pouze vyp&iacute;&scaron;&iacute; informace o &uacute;čtech v&nbsp;bance.</p>

<p>Operace&nbsp;<code>RESET</code>&nbsp;zru&scaron;&iacute; v&scaron;echny existuj&iacute;c&iacute; &uacute;čty a uvede syst&eacute;m do poč&aacute;tečn&iacute;ho stavu.</p>

### 출력

<p>Na v&yacute;stup m&aacute; operace&nbsp;<code>ZALOZ</code>&nbsp;vypsat ř&aacute;dek &quot;<code>Ucet &uacute;čet vytvoren.</code>&quot;. Pokud &uacute;čet&nbsp;<em>&uacute;čet</em>&nbsp;již existuje, m&aacute; se na v&yacute;stup vypsat text &quot;<code>Ucet &uacute;čet uz existuje.</code>&quot;.</p>

<p>Operace&nbsp;<code>ULOZ</code>&nbsp;m&aacute; vypsat ř&aacute;dek &quot;<code>Ulozeno č&aacute;stka na ucet &uacute;čet.</code>&quot;. Pokud &uacute;čet&nbsp;<em>&uacute;čet</em>neexistuje, m&aacute; se vypsat &quot;<code>Ucet &uacute;čet neexistuje.</code>&quot;.</p>

<p>Operace&nbsp;<code>VYBER</code>&nbsp;m&aacute; vypsat ř&aacute;dek &quot;<code>Vybrano č&aacute;stka z uctu &uacute;čet.</code>&quot;. Pokud &uacute;čet neexistuje, m&aacute; se vypsat &quot;<code>Ucet &uacute;čet neexistuje.</code>&quot;. Pokud na &uacute;čtu nen&iacute; dostatek peněz, m&aacute; se vypsat text &quot;<code>Nedostatek penez.</code>&quot;.</p>

<p>Operace&nbsp;<code>PREVED</code>&nbsp;m&aacute; vypsat &quot;<code>Prevedeno č&aacute;stka z uctu &uacute;čet1 na ucet &uacute;čet2.</code>&quot;, pokud je v&scaron;e vpoř&aacute;dku. Pokud neexistuje &uacute;čet&nbsp;<em>&uacute;čet1</em>, je třeba vypsat ř&aacute;dek s&nbsp;textem &quot;<code>Ucet &uacute;čet1 neexistuje.</code>&quot;. Pokud existuje&nbsp;<em>&uacute;čet1</em>, ale nen&iacute; na něm dost peněz, je třeba vypsat zpr&aacute;vu &quot;<code>Nedostatek penez.</code>&quot;. Pokud neexistuje &uacute;čet&nbsp;<em>&uacute;čet2</em>, je třeba ke v&scaron;em předchoz&iacute;m zpr&aacute;v&aacute;m vypsat text &quot;<code>Ucet &uacute;čet2 neexistuje.</code>&quot;.</p>

<p>Operace&nbsp;<code>STATISTIKA</code>&nbsp;m&aacute; vypsat text &quot;<code>Pocet uctu:&nbsp;XXXX</code>&quot;, kde&nbsp;<code>XXXX</code>&nbsp;je počet &uacute;čtů existuj&iacute;c&iacute;ch v&nbsp;bance. Na dal&scaron;&iacute;m ř&aacute;dku pak text &quot;<code>Celkem:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;YYYY</code>&quot;, kde&nbsp;<code>YYYY</code>&nbsp;je součet peněz na v&scaron;ech &uacute;čtech dohromady. Součet peněz je třeba vypsat tak, že cel&aacute; č&aacute;st součtu bude vyps&aacute;na na sedm m&iacute;st a zarovnan&aacute; doprava. Pak bude n&aacute;sledovat desetinn&aacute; tečka a desetinn&aacute; č&aacute;st součtu vypsan&aacute; na pr&aacute;vě dvě m&iacute;sta.</p>

<p>Operace&nbsp;<code>LIST</code>&nbsp;m&aacute; vypsat text &quot;<code>Pocet uctu:&nbsp;XXXX</code>&quot;, kde&nbsp;<code>XXXX</code>&nbsp;je počet &uacute;čtů v&nbsp;bance. Na dal&scaron;&iacute;ch ř&aacute;dc&iacute;ch pak n&aacute;sleduj&iacute; ř&aacute;dky obsahuj&iacute;c&iacute; informace o jednotliv&yacute;ch &uacute;čtech. Na každ&eacute;m ř&aacute;dku je informace o jednom &uacute;čtu, pořad&iacute; &uacute;čtů ve v&yacute;pisu je takov&eacute;, v&nbsp;jak&eacute;m byly &uacute;čty zakl&aacute;d&aacute;ny. Pro každ&yacute; &uacute;čet je vyps&aacute;n text ve tvaru &quot;<em>&uacute;čet č&aacute;stka</em>&quot;, kde cel&aacute; č&aacute;st č&iacute;sla&nbsp;<em>č&aacute;stka</em>&nbsp;je vyps&aacute;na na sedm m&iacute;st a zarovnan&aacute; doprava, desetinn&aacute; č&aacute;st č&iacute;sla je vyps&aacute;na na pr&aacute;vě dvě m&iacute;sta. Po v&yacute;pisech v&scaron;ech &uacute;čtů je třeba vypsat ř&aacute;dek s textem &quot;<code>Celkem:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;YYYY</code>&quot;, kde&nbsp;<code>YYYY</code>je součet peněz na v&scaron;ech &uacute;čtech. Celou č&aacute;st součtu je třeba vypsat na sedm m&iacute;st zarovnanou doprava, desetinnou č&aacute;st na pr&aacute;vě dvě m&iacute;sta.</p>

<p>Operace&nbsp;<code>RESET</code>&nbsp;m&aacute; vypsat zpr&aacute;vu &quot;<code>Reset systemu.</code>&quot;. Po proveden&iacute; v&scaron;ech operac&iacute; m&aacute; program vypsat na samostatn&yacute; ř&aacute;dek text &quot;<code>Konec.</code>&quot;. Mezi zpr&aacute;vy od dvou operac&iacute;ch je třeba vždy vložit pr&aacute;zdn&yacute; ř&aacute;dek.</p>