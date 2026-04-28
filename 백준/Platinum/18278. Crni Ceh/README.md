# [Platinum IV] Crni Ceh - 18278

[문제 링크](https://www.acmicpc.net/problem/18278)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 11, 맞힌 사람: 11, 정답 비율: 64.706%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>Na jednom programerskom natjecanju sudjeluje n natjecatelja. Prije natjecanja svaki je natjecatelj od gospodina Malnara dobio majicu. Neki su natjecatelji dobili žute, a neki crne majice, čime je nastalo rivalstvo između crnog i žutog tima.</p>

<p>Na početku natjecanja svi natjecatelji imaju 0 bodova te je za svakoga poznata boja njegove majice. Tijekom natjecanja dogodilo se q promjena u rezultatima. U i-toj promjeni je natjecatelj xi upravo dobio jo&scaron; di bodova.</p>

<p>Svaki natjecatelj u žutoj majici računa svoju kaznu (tzv. crni ceh) kao broj natjecatelja u crnoj majici koji u tom trenutku imaju strogo vi&scaron;e bodova od njega. Izračunajte i ispi&scaron;ite koliki je zbroj kazni natjecatelja u žutim majicama nakon svake promjene u bodovima.</p>

### 입력

<p>U prvom su retku prirodni brojevi n (1 &le; n &le; 10<sup>5</sup>) i q (1 &le; q &le; 3 &middot; 10<sup>5</sup>) iz teksta zadatka.</p>

<p>U sljedećem je retku riječ od n znakova koja opisuje boju majice svakog natjecatelja. Svaki znak u toj riječi je jedno od velikih slova C ili Z koje označava boju majice i-tog natjecatelja (crna ili žuta). Postojat će barem jedan natjecatelj sa crnom i barem jedan natjecatelj sa žutom majicom.</p>

<p>U sljedećih se q redaka nalaze po dva prirodna broja x<sub>i</sub> (1 &le; x<sub>i</sub> &le; n) i d<sub>i</sub> (1 &le; d<sub>i</sub> &le; 3 &middot; 10<sup>5</sup>).</p>

<p>Maksimalan broj bodova koje neki natjecatelj može osvojti na natjecanju je 3 &middot; 10<sup>5</sup>.</p>

### 출력

<p>U i-ti od q redaka izlaza, ispi&scaron;ite ukupan crni ceh nakon i-te promjene.</p>