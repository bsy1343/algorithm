# [Gold III] Kuuseehe - 7165

[문제 링크](https://www.acmicpc.net/problem/7165)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 6, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

자료 구조, 트리, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Byteland Party Factory valmistub uue kuuseehte turuletoomiseks. Selle protot&uuml;&uuml;bi valmistamisel &uuml;hendati alguses kaks lampi juhtmega omavahel ja seej&auml;rel v&otilde;eti $(N - 2)$ korda uus lamp ning &uuml;hendati see juhtmega m&otilde;ne juba olemasoleva lambi k&uuml;lge. Tulemusena saadi ehe, milles on $N$ v&auml;rvilist lampi. Tehases on $K$ eri v&auml;rvi lampe.</p>

<p>Kui esimene protot&uuml;&uuml;p oli valmis, anti see &uuml;le kaunistusosakonnale. Seal otsustati, et ehte kauniduse m&otilde;&otilde;duks sobib kaht samav&auml;rvilist lampi &uuml;hendavate juhtmete arv. Seej&auml;rel vahetasid nad $M$ korda m&otilde;ne olemasoleva lambi v&auml;lja m&otilde;ne teise vastu ja tahtsid iga kord teada, milline on saadud ehte kaunidus.</p>

<p>Kirjutada programm, mis saab ette ehte algse protot&uuml;&uuml;bi ja kaunistusosakonna tehtud asenduste kirjeldused ning leiab ehte k&otilde;igi variantide kaunidused.</p>

### 입력

<p>Tekstifaili esimesel real on kolm t&auml;isarvu: ehtes olevate lampide arv $N$ ($2 \le N \le 300\,000$), kaunistusosakonnas tehtud asenduste arv $M$ ($1 \le M \le 300\,000$) ja lampide v&otilde;imalike v&auml;rvide arv $K$ ($1 \le K \le 10^9$).</p>

<p>Faili teisel real on $N$ t&auml;isarvu $A_i$ ($1 \le A_i \le K$), mis n&auml;itavad algse protot&uuml;&uuml;bi lampide v&auml;rve nende ehtesse lisamise j&auml;rjekorras.</p>

<p>Faili kolmandal real on $N - 2$ t&auml;isarvu $P_i$ ($1 \le P_i \le i + 1$), kus $P_i$ n&auml;itab, mitmenda lambi k&uuml;lge &uuml;hendati lamp number $(i + 2)$.</p>

<p>J&auml;rgmisel $M$ real on iga&uuml;hel kaks t&auml;isarvu $X_i$ ja $Y_i$ ($1 \le X_i \le N$, $1 \le Y_i \le K$), mis n&auml;itavad, et $i$. asendusel pandi lambi $X_i$ asemele lamp, mille v&auml;rv on $Y_i$.</p>

### 출력

<p>Tekstifaili v&auml;ljastada t&auml;pselt $M$ rida. Reale number $i$ v&auml;ljastada $i$. vahetuse j&auml;rgses konfiguratsioonis selliste lambipaaride arv, kus kaks samav&auml;rvilist lampi on juhtmega &uuml;hendatud.</p>