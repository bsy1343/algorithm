# [Gold II] Okružen - 25147

[문제 링크](https://www.acmicpc.net/problem/25147)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Mirko i Slavko igraju novu zanimljivu igru na ploči koja se sastoji od N x M redaka i stupaca te dvije figure: Mirkova figura i Slavkova nevidljiva figura. Mirkova figura na početku se nalazi u gornjem lijevom kutu ploče. Mirko ne zna točno gdje se nalazi Slavkova figura na početku, ali zna sve moguće početne pozicija te figure.</p>

<p>Prvi na potezu je Mirko. On u svome potezu može napraviti do deset koraka. Jedan korak se sastoji od pomicanja figure na neko od susjednih polja. Za dva polja kažemo da su susjedna ako imaju zajedničku stranicu. Nakon Mirka na potezu je Slavko koji svojom figurom može napraviti jedan korak ili ostati na polju na kojem se nalazi. S obzirom da je Slavkova figura nevidljiva, Mirko tijekom partije ne zna gdje se ona nalazi i koje poteze Slavko povlači. Mirkova i Slavkova figura mogu se nalaziti na istom polju. Mirko smije stati na polje koje je već posjetio samo u zadnjem koraku cijele igre, dok Slavko može posjetiti svako polje koliko god puta to želi. Mirko i Slavko izmjenjuju poteze dok jedan od njih ne pobijedi.</p>

<p>Slavku je cilj igre pobjeći svojom figurom na rub ploče, tj. Slavko pobjeđuje ako postavi svoju figuru u prvi ili posljednji red ploče ili u prvi ili posljednji stupac ploče. Mirko pobjeđuje ako svojom figurom uspije ograditi područje oko Slavkove figure. Kako Mirko može ograditi Slavkovu figuru? Kada (i ako) Mirko u zadnjem koraku stane na polje koje je već prije posjetio, tada na svakom polju na kojem se nalazio između prvog i drugog posjeta tom dvaput posjećenom polju nastaje zid, uključujući i to polje. Za Slavkovu figuru se smatra da je ograđena ako se nalazi strogo unutar Mirkovog zida.</p>

<p>Pomozi Mirku pobijediti tako &scaron;to će&scaron; napisati program koji će ispisati najmanji broj polja na kojima je potrebno izgraditi zid kako bi Mirko bio siguran da će ograditi Slavkovu figuru neovisno o Slavkovom izboru početne pozicije i njegovim potezima. U slučaju da to nije moguće napraviti ispi&scaron;i -1.</p>

### 입력

<p>U prvom redu nalaze se dva prirodna broja N i M (1 &le; N &le; 200, 1 &le; M &le; 200) koji označavaju broj redaka i broj stupaca ploče.</p>

<p>U sljedećih N redova nalazi se M znakova koji opisuju izgled ploče. Znakom točka (&lsquo;.&rsquo;) označavamo prazno polje, malim slovom x (&lsquo;x&rsquo;) označavamo moguću Slavkovu početnu poziciju.</p>

### 출력

<p>U prvi i jedini red ispi&scaron;i traženi broj iz teksta zadatka.</p>

### 힌트

<p>Poja&scaron;njenje prvog test podatka: Mirko u svom prvom potezu posjećuje polja redoslijedom navedenim na svakom polju:</p>

<pre>
01...
.234.
.9x5.
.876.
.....</pre>

<p>te u svom 10. koraku prvog poteza ponovno staje na polje označeno brojem 2. Kada ponovno stane na polje označeno brojem 2, zid nastaje na 8 polja (polja s brojevima 2 - 9).</p>

<p>Poja&scaron;njenje drugog test podatka: Mirko ne može ograditi Slavkovu figuru jer ako Slavko postavi figuru na početnu poziciju u predzadnjem redu, nakon Mirkovih 10 koraka Slavko pomiče figuru u posljednji red i pobjeđuje.</p>

<p>Poja&scaron;njenje trećeg test podatka: Jedan od mogućih načina da Mirko ogradi Slavkovu figuru s 30 zidova je da se kreće navedenim redoslijedom:</p>

<pre>
 0  1  2  3  4  .  .  .
29  .  .  .  5  6  7  .
28  .  .  .  .  .  8  9
27  .  .  x  .  .  . 10
26  .  .  .  x  .  . 11
25  .  .  x  .  .  . 12
24  .  .  .  .  .  . 13
23 22  .  .  .  .  . 14
 . 21 20 19 18 17 16 15</pre>

<p>te u 30. koraku staje na polje označeno brojem 0. Mirku je potrebno 3 poteza da bi ogradio tih 30 polja pa Slavko može napraviti 2 poteza prije nego Mirko dovr&scaron;i zid. Vidimo da se Slavko unutar ta 2 koraka sigurno nalazi unutar ograđenog područja.</p>