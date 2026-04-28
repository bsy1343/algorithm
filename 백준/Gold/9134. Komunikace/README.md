# [Gold I] Komunikace - 9134

[문제 링크](https://www.acmicpc.net/problem/9134)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 9, 정답 비율: 90.000%

### 분류

그래프 이론, 구현, 최소 스패닝 트리

### 문제 설명

<p>Při v&yacute;chově mal&yacute;ch matfyz&aacute;čků je třeba db&aacute;t i na vz&aacute;jemnou komunikaci. Proto je nezbytn&eacute;, aby každ&eacute; dvě m&iacute;stnosti v&nbsp;matfyz&aacute;ck&eacute; &scaron;kolce byly propojeny poč&iacute;tačovou s&iacute;t&iacute;. Pro &uacute;čely t&eacute;to &uacute;lohy si budovu &scaron;kolky budeme představovat jako kv&aacute;dr maj&iacute;c&iacute;&nbsp;<var>V</var>&nbsp;pater, kde v&nbsp;každ&eacute;m patře je&nbsp;<var>R&times;S</var>&nbsp;m&iacute;stnost&iacute;. Jednotliv&eacute; m&iacute;stnosti je samozřejmě nutn&eacute; propojit s&nbsp;co nejmen&scaron;&iacute;mi n&aacute;klady. Propojen&iacute; dvou sousedn&iacute;ch m&iacute;stnost&iacute; (tzn. maj&iacute;c&iacute;ch společnou stěnu) na stejn&eacute;m patře stoj&iacute; 1000&nbsp;Kč, propojen&iacute; dvou m&iacute;stnost&iacute; nad sebou (tzn. strop jedn&eacute; m&iacute;stnosti je podlahou druh&eacute;) stoj&iacute; 2000&nbsp;Kč. Situaci nav&iacute;c komplikuje to, že někter&eacute; m&iacute;stnosti již jsou propojen&eacute;. Va&scaron;&iacute;m &uacute;kolem je vytvořit program, kter&yacute; spočte minim&aacute;ln&iacute; n&aacute;klady nutn&eacute; na dopropojov&aacute;n&iacute; m&iacute;stnost&iacute;.</p>

### 입력

<p>Vstup se skl&aacute;d&aacute; z&nbsp;několika bloků. Každ&yacute; blok popisuje budovu, pro kterou je &uacute;lohu třeba vyře&scaron;it. Blok zač&iacute;n&aacute; trojic&iacute; č&iacute;sel&nbsp;<var>V</var>,&nbsp;<var>R</var>,&nbsp;<var>S</var>&nbsp;na prvn&iacute;m ř&aacute;dku, 1 &le;&nbsp;<var>V</var>,<var>R</var>,<var>S</var>&nbsp;&le;&nbsp;63, posledn&iacute; blok vstupu zač&iacute;n&aacute; trojic&iacute; nul a nem&aacute; b&yacute;t zpracov&aacute;v&aacute;n. Pak n&aacute;sleduje popis př&iacute;zem&iacute;, popis propojen&iacute; mezi př&iacute;zem&iacute;m a prvn&iacute;m patrem, popis prvn&iacute;ho patra, popis propojen&iacute; mezi prvn&iacute;m a druh&yacute;m patrem atd. Za každ&yacute;m popisem patra (mezipatra) n&aacute;sleduje pr&aacute;zdn&yacute; ř&aacute;dek. Popis jednoho patra se skl&aacute;d&aacute; z&nbsp;2&middot;<var>R</var>-1 ř&aacute;dek, na každ&eacute; ř&aacute;dce je 2&middot;<var>C</var>-1 znaků. Na lich&yacute;ch ř&aacute;dc&iacute;ch v&nbsp;lich&yacute;ch sloupc&iacute;ch (č&iacute;slujeme od jedn&eacute;) jsou znaky&nbsp;<code>*</code>, kter&eacute; reprezentuj&iacute; m&iacute;stnosti. Mezi dvěma znaky reprezentuj&iacute;c&iacute;mi m&iacute;stnosti na ř&aacute;dce je buď znak&nbsp;<code>-</code>&nbsp;znač&iacute;c&iacute;, že m&iacute;stnosti jsou propojeny, nebo znak&nbsp;<code>.</code>&nbsp;(m&iacute;stnosti nejsou propojeny). Na sud&yacute;ch ř&aacute;dc&iacute;ch v&nbsp;sud&yacute;ch sloupc&iacute;ch je vždy znak&nbsp;<code>.</code>, v&nbsp;lich&yacute;ch sloupc&iacute;ch je buď&nbsp;<code>.</code>, nebo znak&nbsp;<code>|</code>&nbsp;znač&iacute;c&iacute;, že m&iacute;stnosti odpov&iacute;daj&iacute;c&iacute; hvězdičk&aacute;m nad a pod znakem&nbsp;<code>|</code>&nbsp;jsou propojeny. Popis propojen&iacute; mezi patry se skl&aacute;d&aacute; z&nbsp;2&middot;<var>R</var>-1 ř&aacute;dek. Na každ&eacute;m ř&aacute;dku je 2&middot;<var>C</var>-1 znaků. Na sud&yacute;ch ř&aacute;dc&iacute;ch jsou pouze znaky&nbsp;<code>.</code>. Na lich&yacute;ch ř&aacute;dc&iacute;ch v&nbsp;sud&yacute;ch sloupc&iacute;ch jsou znaky&nbsp;<code>.</code>, v&nbsp;lich&yacute;ch sloupc&iacute;ch je buď&nbsp;<code>.</code>, nebo znak&nbsp;<code>o</code>&nbsp;znač&iacute;c&iacute;, že m&iacute;stnosti na odpov&iacute;daj&iacute;c&iacute; pozici jsou propojeny linkou mezi patry.</p>

### 출력

<p>V&yacute;stup m&aacute; obsahovat pro každou budovu jeden ř&aacute;dek s textem:</p>

<p>&quot;<code>Budova je jiz dostatecne propojena.</code>&quot;,</p>

<p>pokud jsou v&scaron;echny m&iacute;stnosti v&nbsp;budově již propojeny s&iacute;t&iacute;, nebo text</p>

<p>&quot;<code>Ocekavana cena: XXXX Kc</code>&quot;,</p>

<p>kde &quot;<code>XXXX</code>&quot; znač&iacute; minim&aacute;ln&iacute; cenu, kter&aacute; je potřeba k&nbsp;propojen&iacute; v&scaron;ech m&iacute;stnost&iacute; s&iacute;t&iacute;. Při v&yacute;pisu ceny je třeba oddělit trojice č&iacute;slic uskupen&eacute; dle jejich ř&aacute;du č&aacute;rkou způsobem obvykl&yacute;m v anglosask&yacute;ch zem&iacute;ch (viz vzorov&yacute; v&yacute;stup).</p>