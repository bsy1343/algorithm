# [Gold III] Täpilised ribad - 29876

[문제 링크](https://www.acmicpc.net/problem/29876)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 2, 맞힌 사람: 2, 정답 비율: 28.571%

### 분류

그리디 알고리즘, 누적 합

### 문제 설명

<p>Jukul on $L$ ruudust koosnev pabeririba, mille osadel ruutudel on t&auml;pid. Juku soovib l&otilde;igata riba juppideks nii, et tekiks v&otilde;imalikult palju juppe, mille pikkus on t&auml;pselt $M$ ruutu ja millel on iga&uuml;hel t&auml;pselt $N$ t&auml;ppi. Riba tohib l&otilde;igata ainult ruutude vahekohtadest.</p>

### 입력

<p>Esimesel real on t&uuml;hikutega eraldatuna algse riba pikkus $L$ ($1 \le L \le 10^{15}$), t&auml;ppidega ruutude arv $T$ ($0 \le T \le 10^5$), soovitud juppide pikkus $M$ ($1 \le M \le 10^6$) ja igal jupil soovitud t&auml;ppide arv $N$ ($0 \le N \le 10^9$). Ruudud on nummerdatud $1 \ldots L$ alustades riba otsast.</p>

<p>J&auml;rgneval $T$ real on iga&uuml;hel kaks t&auml;isarvu: &uuml;he t&auml;ppidega ruudu number ja t&auml;ppide arv sellel ruudul. T&auml;ppidega ruutude andmed on antud ruutude numbrite kasvavas j&auml;rjekorras ja neil on iga&uuml;hel $1$ kuni $1\,000$ t&auml;ppi.</p>

### 출력

<p>Ainsale reale v&auml;ljastada &uuml;ks t&auml;isarv: mitu soovitud omadustega juppi saab Juku oma ribast l&otilde;igata.</p>