# [Gold V] Přeprava materiálu - 9140

[문제 링크](https://www.acmicpc.net/problem/9140)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 268, 정답: 118, 맞힌 사람: 106, 정답 비율: 44.538%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>Při přestavbě malostransk&eacute; budovy na &scaron;kolku je třeba přev&eacute;zt mnoho materi&aacute;lu z&nbsp;jednoho m&iacute;sta na druh&eacute;. Přev&aacute;ž&iacute; se např&iacute;klad cement, p&iacute;sek nebo ocelov&eacute; pruty, ale i poněkud křehč&iacute; zbož&iacute;, jako např&iacute;klad lavice, okna nebo poč&iacute;tače. Podle typu n&aacute;kladu je samozřejmě třeba zvolit spr&aacute;vn&yacute; typ automobilu. A protože nafta je v&nbsp;dne&scaron;n&iacute; době velmi drah&aacute;, je třeba tak&eacute; projet s automobilem co nejkrat&scaron;&iacute; možnou cestou. Ačkoliv syst&eacute;m silnic nen&iacute; přehnaně hust&yacute;, je dosti komplikovan&eacute; se v&nbsp;něm vyznat, a tak se fakulta rozhodla, že si nech&aacute; napsat program, kter&yacute; j&iacute; pomůže při rozvrhov&aacute;n&iacute; tras pro jednotliv&eacute; n&aacute;klady.</p>

### 입력

<p>Na vstupu je několik bloků pro jednotliv&eacute; n&aacute;klady. Každ&yacute; blok zač&iacute;n&aacute; ř&aacute;dkem se čtyřmi č&iacute;sly <var>N</var>, <var>M</var>, <var>S</var> a <var>C</var>, kde <var>N</var> je počet v&yacute;znamn&yacute;ch m&iacute;st v&nbsp;s&iacute;ti silnic (1 &le;&nbsp;<var>N</var>&nbsp;&le;&nbsp;10&nbsp;000), <var>M</var> je počet silnic (<var>M</var>&nbsp;&le;&nbsp;50&nbsp;000), kter&eacute; mezi v&yacute;znamn&yacute;mi m&iacute;sty vedou, <var>S</var> je č&iacute;slo v&yacute;znamn&eacute;ho m&iacute;sta (m&iacute;sta č&iacute;slujeme od jedn&eacute; do <var>N</var>), odkud je n&aacute;klad vezen, a <var>C</var> je č&iacute;slo m&iacute;sta, kam se m&aacute; n&aacute;klad dopravit. Vstup je ukončen ř&aacute;dkem obsahuj&iacute;c&iacute;m čtyři nuly. Tento ř&aacute;dek nem&aacute;te d&aacute;le zpracov&aacute;vat. Pak v&nbsp;bloku n&aacute;sleduje <var>M</var> ř&aacute;dků popisuj&iacute;c&iacute; jednotliv&eacute; cesty mezi m&iacute;sty. Každ&yacute; z&nbsp;ř&aacute;dků obsahuje tři cel&aacute; č&iacute;sla <var>A</var>, <var>B</var> a <var>V</var> oddělen&aacute; mezerou. <var>A</var> je č&iacute;slo m&iacute;sta, odkud vede silnice, <var>B</var> je č&iacute;slo m&iacute;sta, kam vede silnice (silnice jsou jednosměrn&eacute;), a <var>V</var> jsou n&aacute;klady na přepravu materi&aacute;lu po t&eacute;to silnici (1 &le;&nbsp;<var>V</var>&nbsp;&le;&nbsp;1&nbsp;000). Můžete předpokl&aacute;dat, že cesta mezi poč&aacute;tečn&iacute;m a c&iacute;lov&yacute;m m&iacute;stem vždy existuje.</p>

### 출력

<p>Pro každ&yacute; blok na vstupu na v&yacute;stup vypi&scaron;te jeden ř&aacute;dek obsahuj&iacute;c&iacute; minim&aacute;ln&iacute; cenu, za kterou lze přepravit n&aacute;klad z m&iacute;sta <var>S</var> do m&iacute;sta <var>C</var>.</p>