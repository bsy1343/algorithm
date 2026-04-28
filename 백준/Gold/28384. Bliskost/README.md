# [Gold I] Bliskost - 28384

[문제 링크](https://www.acmicpc.net/problem/28384)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 22, 맞힌 사람: 21, 정답 비율: 38.889%

### 분류

수학, 홀짝성

### 문제 설명

<p>Jednom u proljeće, u vrijeme neobično topla sutona, pojavila su se na Patrijar&scaron;ijskim ribnjacima u M*skvi dvojica građana. Prvi nije bio nitko drugi nego urednik Mihali Aleksandrovič Berlioz, dok je drugi bio mladi pjesnik zvan Bezdomni. Svaki je sa sobom imao svoj niz slova duljine $N$...</p>

<p>Ubrzo im se priključio tajnoviti specijalist za crnu magiju, profesor Woland, te rekao.</p>

<p>- Gospodo, imate vrlo zanimljijve nizove slova, te ja odmah naoko mogu odrediti jesu li oni bliski ili ne!</p>

<p>Jednim potezom smatra se odabiranja dvaju uzastopnih slova jednog niza, te pomicanjem obaju slova ciklički prema naprijed u abecedi, primjerice pretvarajući par slova &ldquo;<code>ab</code>&ldquo; u par slova &ldquo;<code>bc</code>&ldquo; tj. par slova &ldquo;<code>qz</code>&ldquo; u par slova &ldquo;<code>ra</code>&ldquo;. Dva niza znakova smatraju se bliskima ako primjenjivanjem poteza na oba niza moguće je postići da su oni jednaki.</p>

<p>- Dakako, profesore, pričate gluposti. Problem određivanja bliskosti dvaju nizova notorno je težak.</p>

<p>- A ne, varate se Mihaile Aleksandroviču, i ja ću vam to upravo dokazati! Evo ovako, sada ću vam reći jesu li va&scaron;i nizovi bliski ili ne, te vi potom učinite $Q$ promjena na svojem nizu. Ja ću vam nakon svake promjene odrediti istinitost bliskosti va&scaron;ih nizova.</p>

<p>- Veoma hrabro profesore, uistinu, veoma hrabro... pa započnimo!</p>

### 입력

<p>U prvom su retku prirodni brojevi $N$ i $Q$, redom duljina nizova i broj promjena.</p>

<p>U drugom retku nalazi se niz znakova duljine $N$, niz koji pripada Berliozu.</p>

<p>U trećem retku nalazi se niz znakova duljine $N$, niz koji pripada Bezdomnom.</p>

<p>U $i$-tom od sljedećih $Q$ redaka nalazi se broj $p_i$ te znak $c_i$, koji označava da je u $i$-toj promjeni Berlioz promijenio $p_i$-to slovo u $c_i$.</p>

### 출력

<p>U prvi redak potrebno je ispisati &ldquo;<code>da</code>&ldquo; ako su početni nizovi bliski, odnosno &ldquo;<code>ne</code>&ldquo; ako nisu.</p>

<p>U i-tom od sljedećih $Q$ redaka potrebno je ispisati jesu li nizovi bliski nakon $i$-te promjene Berlioza.</p>

### 힌트

<p>U prvom primjeru, nakon promjene, riječi su bliske sljedećim potezima:</p>

<p><code><u>ab</u>c</code> &rarr; <code><u>bc</u>c</code> &rarr; <code><u>cd</u>c</code> &rarr; <code>d<u>ec</u></code> &rarr; <code>dfd</code></p>

<p><code><u>ce</u>d</code> &rarr; <code>dfd</code></p>