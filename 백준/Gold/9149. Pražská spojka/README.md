# [Gold IV] Pražská spojka - 9149

[문제 링크](https://www.acmicpc.net/problem/9149)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 14, 맞힌 사람: 13, 정답 비율: 44.828%

### 분류

그래프 이론, 최단 경로, 플로이드–워셜

### 문제 설명

<p>Dobr&aacute; informovanost o aktu&aacute;ln&iacute; situaci je pro Policii velmi důležit&aacute;. V&nbsp;př&iacute;padě poruchy telekomunikačn&iacute;ho veden&iacute; nemaj&iacute; mezi sebou jednotliv&aacute; stanovi&scaron;tě spojen&iacute;, kter&eacute; tak mus&iacute; b&yacute;t nahrazeno pomoc&iacute; poslů. Každ&yacute; posel může vyř&iacute;dit vzkaz na dan&eacute;m m&iacute;stě a v&nbsp;dan&yacute; okamžik. Přestože poslov&eacute; použ&iacute;vaj&iacute; modern&iacute;ch dopravn&iacute;ch prostředků (bicyklů), je přeci jen při jejich pr&aacute;ci velice důležit&eacute; zn&aacute;t vzd&aacute;lenost, na kterou je třeba zpr&aacute;vu dopravit. Proto mus&iacute; posel vždy volit nejkrat&scaron;&iacute; cestu, aby dorazil do c&iacute;le sv&eacute; cesty co nejdř&iacute;ve. Kromě toho se někdy může st&aacute;t, že někter&eacute; veřejn&eacute; komunikace nen&iacute; možn&eacute; kvůli občansk&yacute;m nepokojům použ&iacute;t. V&nbsp;krajn&iacute;m př&iacute;padě se dokonce v&scaron;echna stanovi&scaron;tě rozpadnou na dvě nebo i v&iacute;ce skupin, mezi kter&yacute;mi nen&iacute; ž&aacute;dn&eacute; spojen&iacute;.</p>

<p>Policejn&iacute; složky maj&iacute; velmi propracovan&yacute; projekt infrastruktury, je vždy přesně d&aacute;no rozm&iacute;stěn&iacute; stanovi&scaron;ť v&nbsp;ter&eacute;nu a vzd&aacute;lenosti mezi nimi. Proto je možn&eacute; zmapovat vzd&aacute;lenosti mezi jednotliv&yacute;mi stanovi&scaron;ti a rozhodnout, kter&aacute; cesta je pro př&iacute;padn&eacute;ho posla nejhor&scaron;&iacute;. Podle n&iacute; se potom zji&scaron;ťuje, jak&aacute; aktu&aacute;lnost krizov&eacute;ho zpravodajstv&iacute; může b&yacute;t zaručena.</p>

### 입력

<p>Prvn&iacute; ř&aacute;dek vstupn&iacute;ho souboru obsahuje cel&eacute; kladn&eacute; č&iacute;slo&nbsp;<var>Z</var>, za kter&yacute;m n&aacute;sleduje postupně&nbsp;<var>Z</var>zad&aacute;n&iacute;. Každ&eacute; zad&aacute;n&iacute; zač&iacute;n&aacute; ř&aacute;dkem obsahuj&iacute;c&iacute;m dvě č&iacute;sla oddělen&aacute; mezerou. Jsou to po řadě počet jednotek (stanovi&scaron;ť)&nbsp;<var>J</var>, 2 &lt;=&nbsp;<var>J</var>&nbsp;&lt;= 300 a počet existuj&iacute;c&iacute;ch spojnic mezi nimi&nbsp;<var>S</var>, 0 &lt;=&nbsp;<var>S</var>&nbsp;&lt;=&nbsp;<var>J</var>.(<var>J</var>-1) / 2. D&aacute;le n&aacute;sleduje&nbsp;<var>S</var>&nbsp;ř&aacute;dků, každ&yacute; z&nbsp;nich obsahuje pr&aacute;vě tři č&iacute;sla oddělen&aacute; mezerou. Prvn&iacute; dvě č&iacute;sla ud&aacute;vaj&iacute; č&iacute;sla spojen&yacute;ch stanovi&scaron;ť (jednotky jsou č&iacute;slov&aacute;ny od jedn&eacute; do&nbsp;<var>J</var>) a třet&iacute; č&iacute;slo je d&eacute;lka spojnice mezi nimi. Je přitom možn&eacute;, aby mezi nimi existovala tak&eacute; krat&scaron;&iacute; cesta, kter&aacute; vede přes někter&eacute; jin&eacute; stanovi&scaron;tě. I takovou samozřejmě může posel využ&iacute;t. Ž&aacute;dn&aacute; dvojice stanovi&scaron;ť se v&nbsp;r&aacute;mci jednoho zad&aacute;n&iacute; nevyskytne dvakr&aacute;t.</p>

### 출력

<p>&Uacute;kolem je naj&iacute;t takovou dvojici stanovi&scaron;ť, mezi kter&yacute;mi je maxim&aacute;ln&iacute; vzd&aacute;lenost v&nbsp;př&iacute;padě použit&iacute; nejkrat&scaron;&iacute; možn&eacute; cesty. Cesta může v&eacute;st pouze po zadan&yacute;ch spojnic&iacute;ch. Pro každ&eacute; zad&aacute;n&iacute; vyp&iacute;&scaron;e program větu &quot;<code>Nejvetsi vzdalenost je&nbsp;</code><var>V</var><code>.</code>&quot;, kde&nbsp;<var>V</var>&nbsp;je d&eacute;lka nejdel&scaron;&iacute; cesty mezi dvěma stanovi&scaron;ti, mezi kter&yacute;mi nelze nal&eacute;zt cestu krat&scaron;&iacute;. Pokud by zadan&aacute; situace znamenala, že existuje alespoň jedna dvojice stanovi&scaron;ť takov&aacute;, že mezi nimi neexistuje ž&aacute;dn&eacute; spojen&iacute;, vyp&iacute;&scaron;e program m&iacute;sto toho větu &quot;<code>Bez spojeni neni veleni!</code>&quot;.</p>