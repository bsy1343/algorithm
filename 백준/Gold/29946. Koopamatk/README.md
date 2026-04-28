# [Gold III] Koopamatk - 29946

[문제 링크](https://www.acmicpc.net/problem/29946)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 7, 맞힌 사람: 7, 정답 비율: 19.444%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 역추적

### 문제 설명

<p>Speleoloogia on kahtlemata &uuml;ks p&otilde;nevamaid ja seiklusrikkamaid teadusi, mida on v&otilde;imalik &uuml;ldse ette kujutada. Muidugi kaasnevad seiklustega ka ohud. Aga ega &uuml;ks p&auml;ris ohutu asi ikka seiklus ei ole ka ju... Nii v&otilde;i naa, ettevaatusabin&otilde;udele vaatamata v&otilde;ib maa all igasuguseid ootamatusi juhtuda ja vahel on teadlastel vaja koobastest v&auml;lja j&otilde;uda nii kiiresti kui v&auml;hegi v&otilde;imalik.</p>

<p>Selleks ongi tarvis kirjutada programm, mis leiaks l&uuml;hima tee m&otilde;ne v&auml;ljap&auml;&auml;suni.</p>

### 입력

<p>Faili esimesel real on koobastiku kaardi k&otilde;rgus $H$ ja laius $W$ ($1 \le H \le 100$, $1 \le W \le 100$). J&auml;rgmisel $H$ real on iga&uuml;hel t&auml;pselt $W$ m&auml;rki: koobastiku kaart, kus &#39;<code>.</code>&#39; m&auml;rgib l&auml;bip&auml;&auml;setavat kohta, &#39;<code>#</code>&#39; koopa seina ja &#39;<code>@</code>&#39; uurimisgrupi algasukohta. Punkt reas 1 v&otilde;i $H$ v&otilde;i veerus 1 v&otilde;i $W$ m&auml;rgib v&auml;ljap&auml;&auml;su. Teadlased saavad igal sammul liikuda l&auml;bip&auml;&auml;setavale naaberruudule samas reas v&otilde;i samas veerus.</p>

### 출력

<p>Faili esimesele reale v&auml;ljastada l&uuml;hima koopast v&auml;lja viiva tee pikkus ja j&auml;rgmisele $H$ reale kaart, millel see tee on m&auml;rgitud t&auml;rnidega (&#39;<code>*</code>&#39;). Kui minimaalse pikkusega teid on mitu, v&auml;ljastada &uuml;ksk&otilde;ik milline neist. Kui v&auml;ljap&auml;&auml;su ei ole, v&auml;ljastada arv $-1$ ja esialgne kaart.</p>