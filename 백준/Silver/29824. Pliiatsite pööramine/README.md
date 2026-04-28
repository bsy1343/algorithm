# [Silver V] Pliiatsite pööramine - 29824

[문제 링크](https://www.acmicpc.net/problem/29824)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 52, 정답: 31, 맞힌 사람: 24, 정답 비율: 58.537%

### 분류

그리디 알고리즘, 문자열, 두 포인터

### 문제 설명

<p>Pillel on karbis &uuml;ksteise k&otilde;rval $N$ pliiatsit. Need on nummerdatud vasakult paremale $1, 2, \ldots, N$.</p>

<p>Pille tahab, et k&otilde;ik pliiatsid oleks karbis samapidi. V&otilde;ib aga juhtuda, et m&otilde;nel pliiatsil on teritatud ots &uuml;leval, m&otilde;nel all. Siis v&otilde;ib Pille &uuml;he liigutusega mingi arvu k&otilde;rvuti olevaid pliiatseid &uuml;mber p&ouml;&ouml;rata. Vajadusel v&otilde;ib ta selliseid liigutusi teha mitu t&uuml;kki.</p>

<p>Pille tahab teada, milliseid pliiatseid ta peaks p&ouml;&ouml;rama, et v&otilde;imalikult v&auml;ikese arvu liigutustega k&otilde;ik pliiatsid samapidi saada. Vajadusel v&otilde;ib m&otilde;nda pliiatsit ka mitu korda edasi-tagasi p&ouml;&ouml;rata.</p>

### 입력

<p>Sisendi esimesel real on pliiatsite arv $N$ ($1\le N\le 1\,000$). Teisel real on t&auml;pselt $N$ t&auml;hem&auml;rki. T&auml;ht \verb&#39;t&#39; t&auml;hendab, et &uuml;leval on pliiatsi terav ots, t&auml;ht \verb&#39;n&#39; aga, et &uuml;leval on n&uuml;ri ots.</p>

### 출력

<p>Esimesele reale v&auml;ljastada liigutuste arv $M$. J&auml;rgmisele $M$ reale v&auml;ljastada iga&uuml;hele $A$\verb&#39;-&#39;$B$, mis n&auml;itab, et &uuml;he liigutusega tuleks &uuml;mber p&ouml;&ouml;rata k&otilde;ik pliiatsid alates pliiatsist number $A$ ja l&otilde;petades pliiatsiga number $B$ (pliiatsid number $A$ ja $B$ m&otilde;lemad kaasa arvatud). Ei ole t&auml;htis, kas p&ouml;&ouml;ramiste l&otilde;puks on k&otilde;igil pliiatsitel teritatud otsad &uuml;leval v&otilde;i all. Oluline on ainult, et k&otilde;ik pliiatsid on samapidi. Kui v&auml;hima liigutuste arvuga p&ouml;&ouml;ramisviise on mitu, v&auml;ljastada &uuml;ksk&otilde;ik milline neist.</p>

### 힌트

<p>Siin p&ouml;&ouml;ratakse k&otilde;igepealt &uuml;mber 4. kuni 7. pliiats, tulemus on \verb&#39;tttttntttt&#39;. Siis tuleb 6. pliiats uuesti &uuml;mber p&ouml;&ouml;rata ja ongi k&otilde;ik pliiatsid samapidi. Pane t&auml;hele, et see ei ole ainus viis k&otilde;ik pliiatsid samapidi saada, kuid ei ole &uuml;htegi v&auml;iksema liigutuste arvuga viisi.</p>