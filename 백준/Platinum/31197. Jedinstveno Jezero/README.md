# [Platinum IV] Jedinstveno Jezero - 31197

[문제 링크](https://www.acmicpc.net/problem/31197)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

다이나믹 프로그래밍, 자료 구조, 정렬, 세그먼트 트리, 값 / 좌표 압축, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>Slon Mirko živi pokraj velikog jezera na kojem se nalazi $n$ lopoča. Jezero možemo zamisliti kao koordinatnu ravninu, pri čemu se lopoči nalaze u nekim točkama s cjelobrojnim koordinatama.</p>

<p>Mirko svakog dana čim se probudi obavlja svoju jutarnju gimnastiku tako da na osebujan način veselo skakuće po lopočima duž jezera. Iz samo njemu poznatih razloga, Mirko u svakom koraku može skočiti samo na one lopoče koji imaju obje koordinate veće od koordinata lopoča na kojem se trenutno nalazi. Drugim riječima, Mirko sa lopoča sa koordinatama $(x_1, y_1)$ može skočiti na lopoč sa koordinatama $(x_2, y_2)$ samo ako je $x_2 &gt; x_1$ i $y_2 &gt; y_1$. Prvi lopoč u nizu Mirko odabire proizvoljno.</p>

<p>Mirko voli jutarnju gimnastiku i želio bi da ona traje &scaron;to je dulje moguće, a jo&scaron; i svaki dan želi skakati na drugačiji način.</p>

<p>Napi&scaron;ite program koji će, za zadani raspored lopoča, odrediti duljinu najdužeg niza lopoča koji zadovoljava Mirkove uvjete. Također, zanima nas broj takvih najdužih nizova, međutim, kako taj broj može biti vrlo velik, potrebno je odrediti samo njegov ostatak pri dijeljenju s $1\,000\,000\,007$.</p>

### 입력

<p>U prvom je retku prirodan broj $n$ ($1 &le; n &le; 300\,000$) iz teksta zadatka.</p>

<p>U svakom od sljedećih $n$ redaka su dva nenegativna cijela broja $x$ i $y$ ($0 &le; x, y &le; 10^9$) koji predstavljaju koordinate jednog lopoča.</p>

<p>Niti jedna dva lopoča se neće nalaziti na istim koordinatama.</p>

### 출력

<p>U prvi redak potrebno je ispisati duljinu najdužeg niza lopoča po kojima Mirko može skakati, kako je opisano u tekstu zadatka.</p>

<p>U drugi redak potrebno je treba ispisati ostatak kojeg broj različitih najdužih nizova daje pri dijeljenju s $1\,000\,000\,007$.</p>