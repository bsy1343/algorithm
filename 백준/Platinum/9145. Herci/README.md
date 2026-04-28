# [Platinum IV] Herci - 9145

[문제 링크](https://www.acmicpc.net/problem/9145)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 37, 정답: 19, 맞힌 사람: 18, 정답 비율: 72.000%

### 분류

자료 구조, 문자열, 집합과 맵, 이분 매칭

### 문제 설명

<p>Policist&eacute;, stejně jako každ&yacute; norm&aacute;ln&iacute; člověk, nemohou pouze pracovat, ale mus&iacute; m&iacute;t tak&eacute; nějak&eacute; z&aacute;bavn&eacute; kon&iacute;čky. Proto založila skupina psovodů amatersk&yacute; divadeln&iacute; soubor nazvan&yacute;&nbsp;<em>Kynologick&yacute; soubor italsk&eacute;ho n&aacute;rodn&iacute;ho divadla a literatury</em>&nbsp;(<em>KSINDL</em>). Tito ochotn&iacute;ci hraj&iacute; ve&scaron;ker&aacute; představen&iacute; s&nbsp;ohromnou vervou a osobn&iacute;m nasazen&iacute;m. Bohužel v&scaron;ak do&scaron;lo k&nbsp;nepř&iacute;jemn&eacute; situaci, kdy byla značn&aacute; č&aacute;st divadeln&iacute;ho souboru povol&aacute;na na z&aacute;sah proti neuk&aacute;zněn&yacute;m demonstrantům, a to pr&aacute;vě v&nbsp;den, kdy měla b&yacute;t veřejn&aacute; premi&eacute;ra jejich nov&eacute; hry. Co se d&aacute; dělat, pr&aacute;ce je pr&aacute;ce, proto muselo j&iacute;t divadlo stranou a někteř&iacute; členov&eacute; se tak premi&eacute;ry nemohou z&uacute;častnit. Na&scaron;těst&iacute;, jako v&nbsp;každ&eacute;m spr&aacute;vn&eacute;m ochotnick&eacute;m divadle, mnoho herců um&iacute; nejen svou roli, ale tak&eacute; několik dal&scaron;&iacute;ch rol&iacute;, kter&eacute; maj&iacute; zažit&eacute; natolik, že by byli schopni je sehr&aacute;t. Bohužel v&scaron;ak nen&iacute; vždy jednoduch&eacute; naj&iacute;t přijateln&eacute; ře&scaron;en&iacute;, proto by policist&eacute; uv&iacute;tali program, kter&yacute; by zhodnotil nastalou situaci a rozhodl, zda je možn&eacute; představen&iacute; v&nbsp;dan&eacute; sestavě sehr&aacute;t.</p>

### 입력

<p>Prvn&iacute; ř&aacute;dek vstupn&iacute;ho souboru obsahuje cel&eacute; kladn&eacute; č&iacute;slo&nbsp;<var>Z</var>, za kter&yacute;m n&aacute;sleduje postupně&nbsp;<var>Z</var>zad&aacute;n&iacute;. Každ&eacute; zad&aacute;n&iacute; zač&iacute;n&aacute; ř&aacute;dkem obsahuj&iacute;c&iacute;m tři č&iacute;sla oddělen&aacute; mezerou, jsou to po řadě počet herců v&nbsp;souboru (<var>H</var>, 1 &lt;=&nbsp;<var>H</var>&nbsp;&lt;= 100), počet rol&iacute; ve hře, kter&aacute; se m&aacute; večer sehr&aacute;t (<var>R</var>, 1 &lt;=&nbsp;<var>R</var>&nbsp;&lt;= 60), a počet herců, kteř&iacute; se nemohou premi&eacute;ry &uacute;častnit ze služebn&iacute;ch důvodů (<var>A</var>, 0 &lt;=&nbsp;<var>A</var>&nbsp;&lt;=&nbsp;<var>H</var>). Pot&eacute; n&aacute;sleduje pr&aacute;vě&nbsp;<var>H</var>&nbsp;ř&aacute;dků, každ&yacute; z&nbsp;nich obsahuje jedno jm&eacute;no herce. Jm&eacute;no herce je tvořeno pouze mal&yacute;mi a velk&yacute;mi p&iacute;smeny, kter&yacute;ch je vždy minim&aacute;lně&nbsp;1 a maxim&aacute;lně&nbsp;30. Velk&aacute; a mal&aacute; p&iacute;smena se rozli&scaron;uj&iacute;. D&aacute;le n&aacute;sleduje&nbsp;<var>R</var>&nbsp;ř&aacute;dků reprezentuj&iacute;c&iacute;ch role, každ&yacute; z&nbsp;nich obsahuje jm&eacute;no jedn&eacute; role. Pro toto jm&eacute;no plat&iacute; stejn&aacute; pravidla jako pro jm&eacute;na herců.</p>

<p>Po v&yacute;pisu rol&iacute; n&aacute;sleduje seznam, kterou roli je kter&yacute; herec schopen zahr&aacute;t. Pro každ&eacute;ho herce je uvedeno jeho jm&eacute;no, d&aacute;le na stejn&eacute;m ř&aacute;dku jedna mezera, č&iacute;slo&nbsp;<var>U</var><sub><var>i</var></sub>, kter&eacute; představuje počet rol&iacute;, mezera a d&aacute;le n&aacute;sleduje&nbsp;<var>U</var><sub><var>i</var></sub>n&aacute;zvů rol&iacute; oddělen&yacute;ch mezerami. Cel&yacute; seznam pro jednoho herce je na jedin&eacute;m ř&aacute;dku, dal&scaron;&iacute; herec n&aacute;sleduje na dal&scaron;&iacute;m ř&aacute;dku. Seznam m&aacute; pr&aacute;vě&nbsp;<var>H</var>&nbsp;prvků, tedy každ&yacute; herec je zde uveden pr&aacute;vě jednou, ale nemus&iacute; to nutně b&yacute;t ve stejn&eacute;m pořad&iacute;, v&nbsp;jak&eacute;m byla zaps&aacute;na jm&eacute;na herců.</p>

<p>Za v&scaron;emi seznamy n&aacute;sleduje ve vstupn&iacute;m souboru seznam herců, kteř&iacute; nemohou hr&aacute;t. Ten je tvořen pr&aacute;vě&nbsp;<var>A</var>&nbsp;ř&aacute;dky, na každ&eacute;m je jedno jm&eacute;no herce.</p>

### 출력

<p>Program vyp&iacute;&scaron;e pr&aacute;vě jeden ř&aacute;dek pro každ&eacute; zad&aacute;n&iacute;. Jestliže je za dan&yacute;ch okolnost&iacute; možno hru sehr&aacute;t, bude na ř&aacute;dku věta &quot;<code>Premiera bude!</code>&quot;, jinak vypi&scaron;te větu &quot;<code>Zatraceni demonstranti!</code>&quot;.</p>