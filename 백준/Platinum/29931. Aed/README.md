# [Platinum III] Aed - 29931

[문제 링크](https://www.acmicpc.net/problem/29931)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

정렬, 기하학, 스위핑, 선분 교차 판정

### 문제 설명

<p>Onu Uno ehitab karjamaa &uuml;mber aeda. Aed on $N$ sirgl&otilde;igust koosnev kinnine murdjoon. See t&auml;hendab, et iga j&auml;rgmine l&otilde;ik algab sealt, kus eelmine l&otilde;ppes, ja viimane l&otilde;ik l&otilde;peb esimese l&otilde;igu alguspunktis. L&otilde;igud on nummerdatud $1 \ldots N$ vastup&auml;eva. V&otilde;ib eeldada, et aial&otilde;igud omavahel ei l&otilde;iku ega puutu (v&auml;lja arvatud j&auml;rjestikuste l&otilde;ikude &uuml;hised otspunktid).</p>

<p>Kui Onu Uno on aia valmis saanud, tahab ta selle &uuml;le vaadata. Kirjuta programm, mis saab Onu Uno asukoha ja leiab, milliseid aial&otilde;ike ta seal seistes n&auml;eb. Onu Uno v&otilde;ib seista nii aia sees kui ka sellest v&auml;ljas, kuid mitte &uuml;hegi aial&otilde;iguga samal sirgel.</p>

<p>Onu Uno n&auml;eb aial&otilde;iku, kui leidub tema asukohta ja aial&otilde;igu mingit punkti &uuml;hendav sirgl&otilde;ik, mis ei l&otilde;ika ega puutu &uuml;htegi teist aial&otilde;iku. (Teisis&otilde;nu, aial&otilde;igu Unole n&auml;htav osa peab olema nullist suurema pikkusega.)</p>

### 입력

<p>Tekstifaili esimesel real on aial&otilde;ikude arv $N$ ($3 \le N \le 1\,000$). Teisel real on kaks t&uuml;hikuga eraldatud t&auml;isarvu: Onu Uno asukoha koordinaadid $X$ ja $Y$. J&auml;rgmisel $N$ real on iga&uuml;hel kaks t&uuml;hikuga eraldatud t&auml;isarvu: real $i + 2$ on aial&otilde;igu number $i$ alguspunkti koordinaadid $X_i$ ja $Y_i$. K&otilde;ik koordinaadid on t&auml;isarvud absoluutv&auml;&auml;rtusega kuni $10^5$.</p>

### 출력

<p>Tekstifaili esimesele reale v&auml;ljastada &uuml;ks t&auml;isarv: Onu Unole n&auml;htavate aial&otilde;ikude arv $M$. Teisele reale v&auml;ljastada $M$ t&uuml;hikutega eraldatud t&auml;isarvu: n&auml;htavate aial&otilde;ikude numbrid kasvavas j&auml;rjekorras.</p>