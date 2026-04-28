# [Gold III] Pikule - 25482

[문제 링크](https://www.acmicpc.net/problem/25482)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 21, 맞힌 사람: 20, 정답 비율: 50.000%

### 분류

해 구성하기, 그리디 알고리즘

### 문제 설명

<p>Svi znamo &scaron;to su pikule. One okrugle, sjajne kuglice kojima su se nekad igrala djeca. Valjda znamo. U na&scaron;em svijetu pikula, na svakoj je zapisan jedan cijeli broj i vrijedi da kada se pikula na kojoj pi&scaron;e vrijednost $Y$ zabije u onu na kojoj pi&scaron;e vrijednost $X$, pikula s vrijednosti $Y$ nestaje te se vrijednost udarene pikule promijeni iz $X$ u $X-Y$.</p>

<p>Glavni lik ovog zadatka, Dodo, složio je u niz $N$ pikula koje se nalaze na pozicijama označenima, s lijeva na desno, brojevima od $1$ do $N$. Na početku, na pikuli na poziciji i zapisan je broj $A_i$. Igra s pikulama počinje. U svakom koraku igre on odabere jednu pikulu na poziciji između $2$ i $N$ te je pogurne lijevo. Ona započne kretanje sve dok se ne zabije u neku pikulu i tada dođe do opisanog spajanja dviju pikula u jednu. Nakon $N-1$ pogurivanja ostat će samo pikula na poziciji $1$.</p>

<p>Dodo se jako voli igrati sa svojim pikulama te k tome obožava veeeeeelike brojeve i stoga ga zanima koji je najveći broj koji može ostati na posljednjoj pikuli te kojim redom treba odabirati i pogurivati pikule da se taj broj postigne.</p>

### 입력

<p>U prvom retku nalazi se prirodan broj $N$ ($1 &le; N &le; 10^5$).</p>

<p>U drugom retku nalazi se $N$ cijelih brojeva ($-10^9 &le; A_i &le; 10^9$) koji označavaju brojeve na pikulama.</p>

### 출력

<p>U prvom retku potrebno je ispisati broj koji će ostati na konačnoj pikuli.</p>

<p>U sljedećih $N-1$ redaka potrebno je ispisati redoslijed kojim će Dodo pogurivati pikule, točnije broj u $i$-tom retku označava poziciju s koje će u $i$-tom koraku biti gurnuta pikula. Na toj se poziciji već mora nalaziti pikula.</p>

### 힌트

<p>Opis prvog probnog primjera: Jedino možemo pogurnuti drugu pikulu. Time vrijednost prve pikule postaje -1 &scaron;to je i konačna najveća moguća vrijednost.</p>

<p>Opis drugog probnog primjera: Postoje dva moguća redoslijeda guranja. U redoslijedu {2, 3} prvo pogurnemo pikulu s pozicije dva nakon čega raspored postaje 2 _ 1 te na kraju pogurnemo pikulu s pozicije tri čime ostaje pikula vrijednosti 1. Drugi bolji raspored je {3, 2}. Nakon prvog pogurivanja ostaje raspored 3 0 _ te nakon posljednjeg pogurivanja ostaje pikula vrijednosti 3 &scaron;to je optimalno.</p>