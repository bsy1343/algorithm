# [Platinum I] Dražesni Doručak - 31191

[문제 링크](https://www.acmicpc.net/problem/31191)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

수학, 기하학, 이분 탐색, 선형대수학, 선분 교차 판정, 다각형의 넓이

### 문제 설명

<p>Mirko i Slavko vole jesti burek za doručak pa su tako, jednom prilikom, kupili jedan burek sa sirom i jedan s mesom kako bi se osladili. Gledajući bureke kako se vrući dime na stolu, puneći im pritom nosnice zamamnim mirisima, nisu se nikako mogli dogovoriti tko će pojesti koji burek pa su ih odlučili podijeliti tako da svako od njih dobije pola jednog i pola drugog bureka.</p>

<p>Mirko se pohvalio da će jednim ravnim potezom noža prerezati oba bureka točno na dvije povr&scaron;inom jednake polovice. Pomozite Mirku da to i napravi prije no &scaron;to se bureci sasvim ohlade.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31191.%E2%80%85Dra%C5%BEesni%E2%80%85Doru%C4%8Dak/d453435a.png" data-original-src="https://upload.acmicpc.net/ddd1d7ca-426b-4fe9-9cd3-d2a54b600826/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 202px;" /></p>

<p style="text-align: center;">Slika odgovara prvom probnom primjeru</p>

<p>Svaki od bureka ima oblik konveksnog poligona te je zadan nizom koordinata uzastopnih vrhova. Bureci leže razdvojeni na stolu, i to tako da prvi od njih u potpunosti leži lijevo od y-osi (dakle u <code>II</code> i <code>III</code> kvadrantu) dok drugi u potpunosti leži desno od y-osi (u <code>I</code> i <code>IV</code> kvadrantu).</p>

<p>Napi&scaron;ite program koji će, na temelju niza koordinata vrhova oba poligona, odrediti jednadžbu pravca po kojem je moguće povući nož tako da se svaki od poligona razdvoji na dva dijela s jednakim povr&scaron;inama.</p>

### 입력

<p>U prvom je retku prirodan broj $n$ ($3 &le; n &le; 5\, 000$), broj vrhova poligona koji predstavlja prvi burek.</p>

<p>U svakom od sljedećih $n$ redaka nalaze se po dva realna broja $x$ i $y$ ($-1\, 000 &le; x &lt; 0$, -1\, 000 &le; y &le; 1\, 000$) koji predstavljaju koordinate vrhova prvog poligona.</p>

<p>U sljedećem je retku prirodan broj $m$ ($3 &le; m &le; 5\, 000$), broj vrhova poligona koji predstavlja drugi burek.</p>

<p>U svakom od sljedećih $n$ redaka nalaze se po dva realna broja $x$ i $y$ ($0 &lt; x &le; 1\, 000$, $-1\, 000 &le; y &le; 1\, 000$) koji predstavljaju koordinate vrhova prvog poligona.</p>

<p>U oba poligona, vrhovi su zadani redom u smjeru obrnutom od kazaljke na satu. Koordinate vrhova zadane su s točno tri decimalne znamenke. Niti jedna dva susjedna brida poligona neće biti paralelna.</p>

### 출력

<p>U jedini je redak potrebno ispisati dva realna broja $a$ i $b$ takva da je $y = ax + b$ jednadžba pravca s traženim svojstvima.</p>

<p>Tolerirat će se apsolutno ili relativno odstupanje od službenog rje&scaron;enja za $10^{-3}$.</p>

<p>Možete pretpostaviti da rje&scaron;enje uvijek postoji te da je jedinstveno.</p>