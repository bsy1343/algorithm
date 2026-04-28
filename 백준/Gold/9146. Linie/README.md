# [Gold III] Linie - 9146

[문제 링크](https://www.acmicpc.net/problem/9146)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 4, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

브루트포스 알고리즘, 기하학

### 문제 설명

<p>Tato &uacute;loha (včetně ře&scaron;en&iacute; a testovac&iacute;ch dat) byla převzata z archivu. My jsme pouze dopsali českou legendu.</p>

<p>Policist&eacute; se při sv&eacute; pr&aacute;ci často mohou dostat i&nbsp;do velmi nebezpečn&yacute;ch situac&iacute;, zvl&aacute;&scaron;tě při podobn&yacute;ch akc&iacute;ch, jako bylo zased&aacute;n&iacute; MMF a&nbsp;SB. A&nbsp;proto, aby se při jejich pr&aacute;ci pokud možno přede&scaron;lo jak&yacute;mkoli zraněn&iacute;m, jsou Policist&eacute; vybaveni bezpečnost&iacute;mi&nbsp;<em>Směrnicemi pro Mimoř&aacute;dně Rychl&eacute; Tlačenice</em>, ve zkratce&nbsp;<em>SMRT</em>.</p>

<p>Často se st&aacute;valo, že když na policisty letěl nějak&yacute; předmět vržen&yacute; demonstranty, prvn&iacute; policista mu uhnul, ale druh&yacute;, kter&yacute; přes prvn&iacute;ho neviděl, byl zasažen. A&nbsp;proto jedna ze směrnic určen&yacute;ch pro policisty, kteř&iacute; maj&iacute; za &uacute;kol blokovat demonstrantům cestu, ř&iacute;k&aacute;, že policist&eacute; nesm&iacute; st&aacute;t v&nbsp;řad&aacute;ch, aby se nemohli st&aacute;t snadn&yacute;m c&iacute;lem pro l&eacute;taj&iacute;c&iacute; předměty velk&yacute;ch r&aacute;ž&iacute; typu dlažebn&iacute; kostky. Jak zn&aacute;mo, v&scaron;echny směrnice se mus&iacute; dodržovat. Je tedy třeba tak&eacute; toto dodržov&aacute;n&iacute; kontrolovat a&nbsp;př&iacute;padn&eacute; poru&scaron;en&iacute; k&aacute;zně okamžitě hl&aacute;sit. A&nbsp;protože vel&iacute;c&iacute; důstojn&iacute;ci nemohou b&yacute;t v&scaron;ude, potřebuje Policie n&aacute;stroj, kter&yacute; by tato poru&scaron;en&iacute; odhalil s&aacute;m. A&nbsp;to bude v&aacute;&scaron; &uacute;kol.</p>

<p>U&nbsp;každ&eacute;ho z&aacute;sahu bude př&iacute;tomna kamera, kter&aacute; bude sn&iacute;mat policejn&iacute; kordon shora tak, že bude možno každ&eacute;mu policistovi přiřadit souřadnici v&nbsp;my&scaron;len&eacute; souřadn&eacute; soustavě. Každ&yacute; policista bude tak jednoznačně identifikov&aacute;n pr&aacute;vě jedn&iacute;m p&aacute;rem cel&yacute;ch č&iacute;sel&nbsp;<var>X</var>&nbsp;a&nbsp;<var>Y</var>, kde 0 &lt;=&nbsp;<var>X</var>,&nbsp;<var>Y</var>&nbsp;&lt;= 9999. Protože rohov&eacute; pozice jsou ze strategick&eacute;ho hlediska nev&yacute;hodn&eacute;, ž&aacute;dn&yacute; policista nikdy nestoj&iacute; na souřadnici&nbsp;0, 0.</p>

<p>Va&scaron;&iacute;m &uacute;kolem je napsat program, kter&yacute; pro každ&eacute; zad&aacute;n&iacute; načte skupinu souřadnic pro kordon policistů a&nbsp;zjist&iacute;, zda někde nestoj&iacute; na jedn&eacute; př&iacute;mce v&iacute;ce než dva policist&eacute;. Vzhledem k&nbsp;tomu, že tento předpis je poměrně nov&yacute; a&nbsp;je&scaron;tě ne &uacute;plně zažit&yacute;, může se st&aacute;t, že bude existovat v&iacute;ce př&iacute;mek se třemi a&nbsp;v&iacute;ce policisty, ale vzhledem k&nbsp;jejich vysok&eacute; mor&aacute;lce a&nbsp;dobr&eacute;mu v&yacute;cviku se d&aacute; předpokl&aacute;dat, že jich v&nbsp;jedn&eacute; řadě nebude nikdy v&iacute;ce než deset.</p>

### 입력

<p>Vstup obsahuje několik zad&aacute;n&iacute;. Každ&eacute; zad&aacute;n&iacute; zač&iacute;n&aacute; na nov&eacute; ř&aacute;dce, je tvořeno souřadnicemi 3&nbsp;až 300&nbsp;bodů (včetně) a&nbsp;ukončeno p&aacute;rem nul (<code>0&nbsp;0</code>). Každ&yacute; bod je zad&aacute;n p&aacute;rem cel&yacute;ch č&iacute;sel v&nbsp;rozsahu 0 až 9999 (včetně). Jedno zad&aacute;n&iacute; může b&yacute;t rozděleno i&nbsp;na v&iacute;ce ř&aacute;dků, v&nbsp;tomto př&iacute;padě v&scaron;ak nebude nikdy rozdělen p&aacute;r souřadnic, dělen&iacute; bude vždy provedeno mezi cel&yacute;mi p&aacute;ry souřadnic. Cel&yacute; vstup bude opět ukončen jednou dal&scaron;&iacute; dvojic&iacute; nul.</p>

### 출력

<p>Na v&yacute;stupu bude věta &quot;<code>Smernice byla dodrzena.</code>&quot;, pokud neexistuje ž&aacute;dn&aacute; trojice policistů stoj&iacute;c&iacute;ch na jedn&eacute; př&iacute;mce. Jinak program vyp&iacute;&scaron;e na v&yacute;stup větu &quot;<code>Tito policiste porusuji smernici:</code>&quot; a na každ&eacute;m z dal&scaron;&iacute;ch ř&aacute;dků bude vždy v&yacute;pis v&scaron;ech policistů stoj&iacute;c&iacute;ch na jedn&eacute; př&iacute;mce. Takto mus&iacute; b&yacute;t postupně uvedeny v&scaron;echny př&iacute;mky, na kter&yacute;ch jsou tři a v&iacute;ce policistů. Souřadnice mus&iacute; b&yacute;t v r&aacute;mci jednoho ř&aacute;dku seřazeny nejprve podle&nbsp;<var>x</var>-ov&eacute; souřadnice, a v př&iacute;padě shody pak podle souřadnice&nbsp;<var>y</var>. V&scaron;echny body jsou uzavřeny v z&aacute;vork&aacute;ch a jejich složky jsou oddělen&eacute; č&aacute;rkou, bez jak&yacute;chkoli mezer. Samotn&eacute; body nejsou kromě z&aacute;vorek navz&aacute;jem nijak odděleny. Ř&aacute;dky jsou řazeny podobně jako souřadnice na ř&aacute;dc&iacute;ch, tedy podle prvn&iacute;ho bodu, a pokud ten je stejn&yacute;, pak postupně podle dal&scaron;&iacute;ch bodů. V&scaron;iměte si, že jeden policista se může vyskytovat i na v&iacute;ce ř&aacute;dc&iacute;ch. Za každ&yacute;m zad&aacute;n&iacute;m (včetně posledn&iacute;ho) vytiskněte jeden pr&aacute;zdn&yacute; ř&aacute;dek.</p>