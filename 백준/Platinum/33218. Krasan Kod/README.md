# [Platinum II] Krasan Kod - 33218

[문제 링크](https://www.acmicpc.net/problem/33218)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 24, 정답: 5, 맞힌 사람: 5, 정답 비율: 20.833%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 너비 우선 탐색, 문자열, 이분 탐색, 해 구성하기, 해싱, z

### 문제 설명

<p>Vremena se mijenjaju. Iz perspektive gospodina Malnara, djeca pričaju nekim novim jezikom. Od stare garde, gospodin Malnar je jedini uspio odgonetnuti tajne ovog novog jezika. Shvatio je da je novi jezik predstavljen <em>kodom</em> koji svako slovo abecede mijenja nekom riječju.</p>

<p>Preciznije, svaki <em>kod</em> opisan je nizom riječi, pri čemu je svakom slovu engleske abecede dodijeljena jedna riječ. Da bismo neku riječ preveli na jezik mladeži, svako slovo potrebno je zamijeniti odgovarajućom riječi u kodu. Na primjer, ako je u kodu zapisano da se slovo <code>a</code> treba zamijeniti s riječi <code>ana</code>, a slovo <code>b</code> s riječi <code>ban</code>, tada riječ <code>baba</code> u novom jeziku glasi <code>bananabanana</code>.</p>

<p>Koliko god djeca mislila da je njihov novi jezik bolji od staroga, Malnar je brzo uočio potencijalni problem — što ako postoji neka riječ u novom jeziku čije je značenje nemoguće protumačiti? Gospodin Malnar je stoga uveo novu terminologiju: reći će da je kod <em>krasan</em> ako ne postoje dvije različite riječi u starom jeziku koje daju istu riječ prevedene na novi jezik. U suprotnome, kod naziva <em>ružnim</em>.</p>

<p>Uštedite posao gospodinu Malnaru te odredite je li dani kod krasan ili ružan.</p>

### 입력

<p>U prvom je retku prirodan broj $t$ ($1 ≤ t ≤ 10000$), broj test primjera.</p>

<p>Svaki test primjer opisan je nizom od $26$ riječi koje predstavljaju jedan kod. Svaka riječ zadana je u svom retku i sastoji se isključivo od malih slova engleske abecede.</p>

<p>Ukupna duljina svih riječi po svim test primjerima iznosi najviše $10^6$.</p>

### 출력

<p>Za svaki od $t$ test primjera ispišite u zasebni redak riječ <code>Krasan</code> ili <code>Ruzan</code> ovisno o tome je li zadani kod krasan ili ružan.</p>

### 힌트

<p>Pojašnjenje drugog probnog primjera: Riječ je o Morseovom kodu koji, zapisan u ovom obliku, nije krasan. Naime, riječi <code>a</code> te <code>et</code> obje se prevode u riječ <code>dotdash</code>.</p>