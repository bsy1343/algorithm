# [Gold I] Algebra - 9139

[문제 링크](https://www.acmicpc.net/problem/9139)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 68, 정답: 26, 맞힌 사람: 25, 정답 비율: 62.500%

### 분류

수학, 자료 구조, 세그먼트 트리, 순열 사이클 분할

### 문제 설명

<p>Mal&iacute; matfyz&aacute;čci maj&iacute; obvykle probl&eacute;m s&nbsp;algebraick&yacute;mi strukturami. Proto si budou ve &scaron;kolce procvičovat operace s&nbsp;permutacemi. Aby ale cvičen&iacute; mělo smysl a matfyz&aacute;čci se něco naučili, byla zadefinov&aacute;na netradičn&iacute; operace, tzv.&nbsp;<em>troj&uacute;heln&iacute;kov&aacute; operace</em>. Troj&uacute;heln&iacute;kov&aacute; operace m&aacute; tři parametry&nbsp;<var>i</var>,&nbsp;<var>j</var>&nbsp;a&nbsp;<var>k</var>.&nbsp;<var>i</var>&nbsp;&ne;&nbsp;<var>j</var>,&nbsp;<var>j</var>&nbsp;&ne;&nbsp;<var>k</var>,&nbsp;<var>k</var>&nbsp;&ne;&nbsp;<var>i</var>. Při jej&iacute; aplikaci na permutaci se v&nbsp;permutaci č&iacute;slo na pozici&nbsp;<var>i</var>&nbsp;přesune na pozici&nbsp;<var>j</var>, č&iacute;slo na pozici&nbsp;<var>j</var>&nbsp;se přesune na pozici&nbsp;<var>k</var>&nbsp;a č&iacute;slo na pozici&nbsp;<var>k</var>se přesune na pozici&nbsp;<var>i</var>. &Uacute;kolem mal&yacute;ch matfyz&aacute;čků je zjistit, zda lze identickou permutaci pomoc&iacute; troj&uacute;heln&iacute;kov&eacute; operace přev&eacute;st na zadanou permutaci. Identick&aacute; permutace je takov&aacute;, kter&aacute; m&aacute; na&nbsp;<var>i</var>-t&eacute; pozici č&iacute;slo&nbsp;<var>i</var>. Vy m&aacute;te napsat program, kter&yacute; bude matfyz&aacute;čky kontrolovat.</p>

### 입력

<p>Vstup se skl&aacute;d&aacute; z&nbsp;několika bloků. Každ&yacute; blok zač&iacute;n&aacute; ř&aacute;dkem s&nbsp;počtem prvků v&nbsp;permutaci&nbsp;<var>N</var>, 3&nbsp;<img alt="&lt;=" src="https://contest.felk.cvut.cz/01prg/solved/le.gif" />&nbsp;<var>N</var>&nbsp;<img alt="&lt;=" src="https://contest.felk.cvut.cz/01prg/solved/le.gif" />&nbsp;100&nbsp;000. Vstup je ukončen ř&aacute;dkem obsahuj&iacute;c&iacute;m nulu. Tento ř&aacute;dek nem&aacute;te d&aacute;le zpracov&aacute;vat. Na druh&eacute;m ř&aacute;dku každ&eacute;ho bloku je&nbsp;<var>N</var>&nbsp;vesměs různ&yacute;ch cel&yacute;ch č&iacute;sel z intervalu 1 až&nbsp;<var>N</var>, kter&aacute; popisuj&iacute; c&iacute;lovou permutaci.</p>

### 출력

<p>Na v&yacute;stup m&aacute; v&aacute;&scaron; program pro každ&yacute; blok vypsat jeden ř&aacute;dek obsahuj&iacute;c&iacute; text &quot;<code>Permutaci lze prevest.</code>&quot;, pokud zadanou permutaci lze z&iacute;skat z&nbsp;identick&eacute; permutace pomoc&iacute; posloupnosti troj&uacute;heln&iacute;kov&yacute;ch operac&iacute;. Pokud permutaci z&iacute;skat nelze, m&aacute; ř&aacute;dek obsahovat text &quot;<code>Matfyzacci maji smulu.</code>&quot;.</p>