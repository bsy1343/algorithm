# [Silver V] Červotoči - 9138

[문제 링크](https://www.acmicpc.net/problem/9138)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 94, 정답: 46, 맞힌 사람: 37, 정답 비율: 44.578%

### 분류

구현, 문자열

### 문제 설명

<p>Do stolů ve &scaron;kolce se pustili červotoči a začali v&nbsp;nich vyhlod&aacute;vat chodbičky. Aby bylo možno spr&aacute;vně nad&aacute;vkovat ochrann&yacute; prostředek, je třeba zjistit, kolik dřeva již sežral nejžravěj&scaron;&iacute; červotoč (když by totiž červotoč sežral př&iacute;li&scaron; velkou d&aacute;vku ochrann&eacute;ho prostředku, mohl by zmutovat a st&aacute;t se je&scaron;tě nebezpečněj&scaron;&iacute;m). Protože každ&yacute; červotoč m&aacute; charakteristick&yacute; způsob tunelov&aacute;n&iacute;, můžeme snadno zjistit, kterou chodbičku vyhlodal kter&yacute; červotoč.</p>

### 입력

<p>Vstup se skl&aacute;d&aacute; z několika bloků. Každ&yacute; blok vyjma posledn&iacute;ho zač&iacute;n&aacute; třemi č&iacute;sly&nbsp;<var>R</var>,&nbsp;<var>S</var>&nbsp;a&nbsp;<var>C</var>, kde 1 &le;&nbsp;<var>R</var>,<var>S</var>&nbsp;&le;&nbsp;250, 1 &le;&nbsp;<var>C</var>&nbsp;&le;&nbsp;26. Posledn&iacute; blok zač&iacute;n&aacute; třemi nulami a nem&aacute; b&yacute;t d&aacute;le zpracov&aacute;v&aacute;n. V&nbsp;bloku pak n&aacute;sleduje&nbsp;<var>C</var>&nbsp;ř&aacute;dek se jm&eacute;ny červotočů. Jm&eacute;no každ&eacute;ho červotoče zač&iacute;n&aacute; velk&yacute;m p&iacute;smenem, za kter&yacute;m n&aacute;sleduje nejv&yacute;&scaron;e &scaron;edes&aacute;t mal&yacute;ch p&iacute;smen. Předpokl&aacute;dejte, že poč&aacute;tečn&iacute; p&iacute;smena jmen různ&yacute;ch červotočů jsou různ&aacute;. Za jm&eacute;ny v&nbsp;bloku n&aacute;sleduje&nbsp;<var>R</var>&nbsp;ř&aacute;dek popisuj&iacute;c&iacute;ch prožran&yacute; stůl. Na každ&eacute;m ř&aacute;dku je&nbsp;<var>S</var>&nbsp;znaků. Každ&yacute; ze znaků je buď&nbsp;<code>*</code>&nbsp;(znač&iacute;, že tato č&aacute;st stolu dosud nebyla zkonzumov&aacute;na), nebo poč&aacute;tečn&iacute; p&iacute;smeno jm&eacute;na někter&eacute;ho z&nbsp;červotočů (znač&iacute;, že červotoč, jehož jm&eacute;no zač&iacute;n&aacute; na př&iacute;slu&scaron;n&eacute; p&iacute;smeno, sežral tuto č&aacute;st stolu). Ne každ&yacute; červotoč mus&iacute; sežrat nějakou č&aacute;st stolu. Oblast vyhlodan&aacute; jedn&iacute;m červotočem je souvisl&aacute; (červotoč um&iacute; hlodat v&nbsp;osmi směrech).</p>

### 출력

<p>Na v&yacute;stup m&aacute; v&aacute;&scaron; program pro každ&yacute; blok na vstupu vypsat text &quot;<code>Nejzravejsi cervotoc je XXXX.</code>&quot;, kde&nbsp;<code>XXXX</code>&nbsp;bude nahrazeno jm&eacute;nem červotoče, kter&yacute; sežral nejv&iacute;ce č&aacute;st&iacute; stolu. Můžete předpokl&aacute;dat, že takov&yacute;to červotoč bude určen jednoznačně.</p>