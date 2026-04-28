# [Gold II] Cjelovita Cesta - 31190

[문제 링크](https://www.acmicpc.net/problem/31190)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

차분 배열 트릭

### 문제 설명

<p>U na&scaron;oj lijepoj domovini, ceste su ponos i dika njenih građana, a posebno superautocesta ma&scaron;tovitog naziva $A1$. Nažalost, mnogobrojni turisti sa svojim trabantima napunjenim jeftinim pa&scaron;tetama i limenkama pive svake godine uni&scaron;te cestu pa je treba popravljati.</p>

<p>Državni zavod za cjelovitost cesta napravio je pregled autoceste i označio sve rupe koje treba sanirati. Sanira se na sljedeći način: najprije se, počev&scaron;i od nekog mjesta prije prvog o&scaron;tećenja, cesta podijeli na segmente jednake duljine i zatim se na svaki segment na kojem ima o&scaron;tećenja po&scaron;alje jedan bager sa pripadajućom ekipom.</p>

<p>Zbog nedovoljnog broja bagera u državi, prometni stručnjaci trebaju odrediti kako podijeliti cestu na segmente unaprijed zadane duljine tako da broj segmenata s o&scaron;tećenjima bude &scaron;to manji.</p>

<p>Na cesti se nalazi $n$ rupa i svaka je zadana cijelim brojem koji predstavlja njenu udaljenost od početka ceste. Dužina svakog segmenta je unaprijed zadana prirodnim brojem $m$. Na prvih $m$ metara ceste nema o&scaron;tećenja. Cesta se podijeli na segmente tako da se odabere mjesto za početak prvog segmenta koje se mora nalaziti na jednom od prvih $m$ metara. Ako prvi segment počinje na $k$-tom metru, onda $i$-ti segment počinje na $k + (i - 1) \cdot m$ metru. Jedan bager može pokriti sve rupe od početka nekog segmenta (uključivo) do početka sljedećeg segmenta (isključivo).</p>

<p>Napi&scaron;ite program koji će odrediti minimalni broj bagera potrebnih za sanaciju autoceste i sva moguća mjesta na kojima prvi segment može početi.</p>

### 입력

<p>U prvom se retku nalaze prirodni brojevi $m$ i $n$ ($1 &le; m, n &le; 100\, 000$) iz teksta zadatka.</p>

<p>U drugom je retku $n$ prirodnih brojeva $x_1, x_2, \dots , x_n$ ($m &lt; x_1 &lt; x_2 &lt; \dots &lt; x_n &le; 2 \cdot 10^9$) koji predstavljaju pozicije svih rupa na cesti.</p>

### 출력

<p>U prvom retku ispi&scaron;ite minimalni broj bagera potrebnih za sanaciju autoceste.</p>

<p>U idućem retku ispi&scaron;ite pozicije svih mjesta na kojima prvi segment može početi. Te brojeve treba ispisati u rastućem poretku i međusobno ih odvojiti jednim razmakom.</p>