# [Gold IV] Gnome - 9144

[문제 링크](https://www.acmicpc.net/problem/9144)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 5, 맞힌 사람: 4, 정답 비율: 26.667%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Jednou z&nbsp;nejm&eacute;ně př&iacute;jemn&yacute;ch věc&iacute; v&nbsp;životě policisty během občansk&yacute;ch nepokojů je ček&aacute;n&iacute;. Představte si několik hodin str&aacute;ven&yacute;ch v&nbsp;de&scaron;ti ček&aacute;n&iacute;m na to, kter&yacute;m směrem se pohne rozl&iacute;cen&yacute; dav. Sv&yacute;m způsobem je to hor&scaron;&iacute; než v&nbsp;ček&aacute;rně u zubaře, kde obvykle alespoň nepr&scaron;&iacute;. Proto veden&iacute; Policie rozhodlo, že v&scaron;echny policisty vybav&iacute; vodovzdorn&yacute;m hern&iacute;m automatem, kter&yacute; bude simulovat jednu z&nbsp;variant legend&aacute;rn&iacute; hry Gnome, tzv.&nbsp;<em>Same-Gnome</em>.</p>

<p>Va&scaron;&iacute;m &uacute;kolem je napsat simul&aacute;tor stejnojmenn&eacute; hry, kter&yacute; by byl dostatečně jednoduch&yacute;, aby mohl b&yacute;t implementov&aacute;n v&nbsp;přenosn&eacute; verzi poč&iacute;tače PMD-85 (takzvan&yacute;&nbsp;<em>PMD-Pilot</em>). Pravidla jsou poměrně jednoduch&aacute;. Hrac&iacute; pole se skl&aacute;d&aacute; z&nbsp;<var>N x M</var>&nbsp;pol&iacute;ček, na každ&eacute;m pol&iacute;čku je um&iacute;stěn pr&aacute;vě jeden k&aacute;men určit&eacute; barvy. C&iacute;lem hry je odstranit co nejv&iacute;ce kamenů a předev&scaron;&iacute;m z&iacute;skat přitom co nejv&iacute;ce bodů. Pravidla pro odstraňov&aacute;n&iacute; kamenů jsou n&aacute;sleduj&iacute;c&iacute;:</p>

<ul>
	<li>Lze odstranit pouze takov&yacute; k&aacute;men, kter&yacute; soused&iacute; s&nbsp;alespoň jedn&iacute;m kamenem stejn&eacute; barvy (sousedn&iacute; kameny jsou nahoře, dole, vlevo a vpravo, ale ne &scaron;ikmo).</li>
	<li>Při odstraněn&iacute; kamene je současně odstraněna cel&aacute; souvisl&aacute; oblast sousedn&iacute;ch kamenů stejn&eacute; barvy.</li>
	<li>Hrac&iacute; pole se nach&aacute;z&iacute; v gravitačn&iacute;m poli, tzn. po odstraněn&iacute; kamenů propadnou v&yacute;&scaron;e um&iacute;stěn&eacute; kameny dolů, takže zapln&iacute; vznikl&yacute; pr&aacute;zdn&yacute; prostor.</li>
	<li>Pokud po odstraněn&iacute; kamenů a př&iacute;padn&eacute;m propadnut&iacute; v&yacute;&scaron;e položen&yacute;ch kamenů vzniknou pr&aacute;zdn&eacute; sloupce, jsou sloupce napravo posunuty doleva tak, aby prazdn&eacute; sloupce zanikly.</li>
	<li>Jestliže je v&nbsp;r&aacute;mci jednoho tahu odstraněno&nbsp;<var>K</var>&nbsp;kamenů, z&iacute;sk&aacute; hr&aacute;č (<var>K</var>-2)<sup>2</sup>&nbsp;bodů.</li>
	<li>Pokud jsou během hry odstraněny popsan&yacute;m způsobem v&scaron;echny kameny, z&iacute;sk&aacute; hr&aacute;č dodatečnou pr&eacute;mii ve v&yacute;&scaron;i 1000 bodů.</li>
</ul>

### 입력

<p>Prvn&iacute; ř&aacute;dek vstupn&iacute;ho souboru obsahuje cel&eacute; kladn&eacute; č&iacute;slo&nbsp;<var>Z</var>, za kter&yacute;m n&aacute;sleduje postupně&nbsp;<var>Z</var>zad&aacute;n&iacute;. Každ&eacute; zad&aacute;n&iacute; zač&iacute;n&aacute; ř&aacute;dkem obsahuj&iacute;c&iacute;m dvě cel&aacute; č&iacute;sla&nbsp;<var>C</var>&nbsp;a&nbsp;<var>R</var>&nbsp;(1 &lt;=&nbsp;<var>R</var>&lt;150, 1 &lt;=<var>C</var>&lt;300) oddělen&aacute; mezerou, kter&aacute; ud&aacute;vaj&iacute; počet sloupců a ř&aacute;dků hrac&iacute;ho pole. Pot&eacute; n&aacute;sleduje<var>R</var>&nbsp;ř&aacute;dků popisuj&iacute;c&iacute;ch postupně ř&aacute;dky hrac&iacute;ho pole shora dolů. Na každ&eacute;m z&nbsp;těchto ř&aacute;dků je pr&aacute;vě&nbsp;<var>C</var>&nbsp;p&iacute;smen velk&eacute; abecedy, tedy znaků od&nbsp;<code>A</code>&nbsp;do&nbsp;<code>Z</code>, kter&eacute; ud&aacute;vaj&iacute; různ&eacute; barvy kamenů na dan&eacute;m ř&aacute;dku postupně zleva doprava.</p>

<p>Za popisem hrac&iacute;ho pole n&aacute;sleduje seznam tahů, kter&eacute; hr&aacute;č provedl, tedy souřadnice kamenů, kter&eacute; maj&iacute; b&yacute;t odstraněny. Nejprve je na samostatn&eacute;m ř&aacute;dku uveden počet tahů&nbsp;<var>M</var>. Pot&eacute; n&aacute;sleduje&nbsp;<var>M</var>&nbsp;ř&aacute;dků, z&nbsp;nichž každ&yacute; obsahuje dvě cel&aacute; č&iacute;sla&nbsp;<var>I</var>&nbsp;a&nbsp;<var>J</var>&nbsp;oddělen&aacute; mezerou.&nbsp;<var>I</var>&nbsp;(1 &lt;=&nbsp;<var>I</var>&lt;=&nbsp;<var>C</var>) určuje č&iacute;slo sloupce vybran&eacute;ho kamene zleva poč&iacute;naje od jedn&eacute;,&nbsp;<var>J</var>&nbsp;(1 &lt;=&nbsp;<var>J</var>&nbsp;&lt;=&nbsp;<var>R</var>) č&iacute;slo ř&aacute;dku zespoda poč&iacute;naje tak&eacute; od jedn&eacute;.</p>

### 출력

<p>Va&scaron;&iacute;m &uacute;kolem je simulovat celou hru a odstraňovat souvisl&eacute; oblasti kamenů stejn&eacute; barvy podle sekvence zadan&eacute; na vstupu. Pokud na dan&eacute; pozici nen&iacute; ž&aacute;dn&yacute; k&aacute;men nebo pokud nelze vybran&yacute; k&aacute;men odstranit, tah ignorujte a pokračujte dal&scaron;&iacute;m v&nbsp;řadě. Pro každ&eacute; zad&aacute;n&iacute; mus&iacute; program vypsat tento text:&nbsp;</p>

<pre>
&quot;<code>Game over! 
Score dosazene v teto hre je </code><var>S</var><code> bodu. 
Byli bychom radi, kdybyste si zahrali jeste jednou. 
Prejete si hrat znovu? 
Prijemnou zabavu Vam preje firma ACMTENDO.</code>&quot;, </pre>

<p>kde&nbsp;<var>S</var>&nbsp;je počet bodů z&iacute;skan&yacute; podle uveden&yacute;ch pravidel. Každ&aacute; věta je na samostatn&eacute;m ř&aacute;dku.</p>