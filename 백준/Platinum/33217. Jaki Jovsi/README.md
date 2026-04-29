# [Platinum III] Jaki Jovsi - 33217

[문제 링크](https://www.acmicpc.net/problem/33217)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

그리디 알고리즘, 다이나믹 프로그래밍

### 문제 설명

<p>Jovsi je jak dječak. Od malena je volio strojnice pa ih je često imitirao, samo iz nekog razloga nije vikao <em>trtrtrt</em> ili <em>bambambam</em>, nego <em>acacacacac</em>.</p>

<p>Gospodin Malnar je impresioniran Jovsijevom snagom, te u njemu vidi idealnog, te veoma jeftinog fizičkog radnika. Naime, Malnar često <em>ima nekog posla</em> pa se ne stigne baviti važnim stvarima poput prevođenja zadataka. Odlučio je tome stati na kraj tako što će svoje poslove delegirati jakom Jovsiju.</p>

<p>Tijekom dana, Malnar treba obaviti $n$ poslova duž ulice u kojoj se nalazi $l$ birtija, slijedno označenih brojevima od $1$ do $l$ od početka do kraja ulice. Dodatna je zanimljivost da su svake dvije susjedne birtije u ulici udaljene točno $1$ metar. Svaki se Malnarov posao svodi na skupljanje <s>gajbe</s>važnog paketa u nekoj birtiji kojeg je potrebno odnijeti do neke druge birtije.</p>

<p>Malnar unaprijed zna sve poslove koje mora obviti taj dan, a taj će popis dostaviti Jovsiju. Također mu nije bitan redoslijed kojim će poslovi biti obavljeni.</p>

<p><strong>Jovsi je jak</strong> pa može nositi proizvoljan broj važnih paketa u istom trenutku.</p>

<p><strong>Jovsi je jak i pametan</strong> pa želi sve poslove obaviti tako da ukupno prevali najmanju moguću udaljenost. Pritom mu nije važno kod koje birtije će skupiti prvi paket (jer će ga dovesti Uber), niti mu je važno kod koje birtije će ostaviti posljednji paket (jer će ga odvesti Uber).</p>

<p><strong>Jovsi je jak i pametan, ali ne zna programirati</strong> pa vas je zamolio da napišete program koji će pronaći traženu najmanju udaljenost.</p>

### 입력

<p>U prvom su retku prirodni brojevi $l$ ($1 ≤ l ≤ 10^9$) i $n$ ($1 ≤ n ≤ 10^5 $) iz teksta zadatka.</p>

<p>U $i$-tom od idućih $n$ redaka se nalaze po dva broja $a_i$ i $b_i$ ($1 ≤ a_i , b_i ≤ l$, $a_i \ne b_i$) koji označavaju da se $i$-ti Malnarov posao sastoji od skupljanja paketa u birtiji $a_i$ kojeg treba dostaviti do birtije $b_i$.</p>

### 출력

<p>U jedinom retku ispišite traženu najmanju udaljenost iz teksta zadatka.</p>

### 힌트

<p>Pojašnjenje prvog probnog primjera:</p>

<ul>
	<li>Rutu započinje u birtiji $2$ gdje skuplja prvi paket.</li>
	<li>Dolazi u birtiju $1$ gdje ostavlja paket iz birtije $2$ i skuplja novi paket.</li>
	<li>Dolazi u birtiju $3$ gdje skuplja novi paket.</li>
	<li>Dolazi u birtiju $4$ gdje ostavlja paket iz birtije $1$.</li>
	<li>Dolazi u birtiju $5$ gdje ostavlja paket iz birtije $3$.</li>
	<li>Dolazi u birtiju $6$ gdje skuplja novi paket.</li>
	<li>Dolazi u birtiju $7$ gdje ostavlja paket iz birtije $6$.</li>
	<li>Dolazi u birtiju $8$ gdje skuplja novi paket.</li>
	<li>Dolazi u birtiju $9$ gdje skuplja novi paket.</li>
	<li>Dolazi u birtiju $5$ gdje ostavlja paket iz birtije $8$.</li>
	<li>Dolazi u birtiju $4$ gdje ostavlja paket iz birtije $9$ i završava rutu.</li>
</ul>

<p>Ukupno je prevalio udaljenost od $14$ metara.</p>