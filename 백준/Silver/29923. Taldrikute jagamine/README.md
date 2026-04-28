# [Silver V] Taldrikute jagamine - 29923

[문제 링크](https://www.acmicpc.net/problem/29923)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 27, 맞힌 사람: 27, 정답 비율: 87.097%

### 분류

구현, 문자열, 브루트포스 알고리즘, 시뮬레이션

### 문제 설명

<p>Juku peol on $N$ inimest, neist $M$ on tema s&otilde;brad. K&otilde;ik inimesed istuvad &uuml;mber &uuml;mmarguse laua, mille istekohad on nummerdatud p&auml;rip&auml;eva $1 \ldots N$. Kuna laud on &uuml;mmargune, on ka kohad $N$ ja $1$ k&otilde;rvuti.</p>

<p>Juku asub v&otilde;&otilde;rustajana k&uuml;lalistele taldrikuid jagama. Tal on &uuml;hes virnas $N$ taldrikut, mis on nummerdatud &uuml;lalt alla $1 \ldots N$. Juku jagab neid virnast v&otilde;ttes j&auml;rjest, liikudes &uuml;mber laua p&auml;rip&auml;eva.</p>

<p>Juku on aga taldrikute pesemisel hooletu olnud ja m&otilde;ned taldrikud on mustad. Juku tahab, et k&otilde;ik tema s&otilde;brad saaksid kindlasti puhtad taldrikud. Sellest ta ei hooli, kas teised k&uuml;lalised saavad puhtad v&otilde;i mustad taldrikud.</p>

<p>Millisest k&uuml;lalisest peaks Juku taldrikute jagamist alustama, et k&otilde;ik ta s&otilde;brad saaksid kindlasti puhtad taldrikud?</p>

### 입력

<p>Tekstifaili esimesel real on kaks t&uuml;hikuga eraldatud t&auml;isarvu: k&uuml;laliste arv $N$ ($1 \le N \le 1\,000$) ja Juku s&otilde;prade arv $M$ ($1 \le M \le N$). Teisel real on $N$ t&auml;hte, kus kohal $i$ olev t&auml;ht on &#39;<code>P</code>&#39;, kui taldrik number $i$ on puhas, v&otilde;i &#39;<code>M</code>&#39;, kui see on must. Faili kolmandal real on samuti $N$ t&auml;hte, kus kohal $i$ olev t&auml;ht on &#39;<code>S</code>&#39;, kui istekohal $i$ on Juku s&otilde;ber, v&otilde;i &#39;<code>K</code>&#39;, kui seal on muu k&uuml;laline.</p>

### 출력

<p>Tekstifaili ainsale reale v&auml;ljastada t&auml;isarv $K$, mis n&auml;itab, et kui Juku alustab taldrikute jagamist istekohast $K$, saavad k&otilde;ik tema s&otilde;brad puhtad taldrikud. Kui sobivaid alguskohti on mitu, siis v&auml;ljastada k&otilde;ige v&auml;iksem sobiv number. Kui &uuml;htki sobivat alguskohta ei leidu, siis v&auml;ljastada faili ainsale reale tekst &#39;<code>EI SAA</code>&#39;.</p>