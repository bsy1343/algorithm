# [Gold II] Doominokivid - 29841

[문제 링크](https://www.acmicpc.net/problem/29841)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 3, 맞힌 사람: 3, 정답 비율: 25.000%

### 분류

그래프 이론

### 문제 설명

<p>Jukul on p&otilde;randal laiali hunnik doominokive. Ema k&auml;skis Jukul toa korda teha, seega n&uuml;&uuml;d peab Juku kivid karpidesse tagasi panema.</p>

<p>Igal doominokivil on kaks s&uuml;mbolit, mida &uuml;lesande tarbeks t&auml;histame positiivsete t&auml;isarvudega. Juku m&auml;letab, et kivid p&auml;rinevad kahest erinevast komplektist, kusjuures kummaski komplektis ei esinenud &uuml;htki s&uuml;mbolit mitu korda.</p>

<p>Leia, kas Jukul on v&otilde;imalik panna kivid kahte karpi nii, et kummaski karbis ei esine &uuml;htki s&uuml;mbolit mitu korda. (Juku v&otilde;is ka valesti m&auml;letada, et kivid p&auml;rinevad kahest sellisest komplektist.) Kui kivide karpidesse panemine on v&otilde;imalik, leia ka &uuml;ks viis neid karpidesse panna.</p>

### 입력

<p>Sisendi esimesel real on doominokivide arv $N$ ($2 \le N \le 2 \cdot 10^5$). J&auml;rgmisel $N$ real on iga&uuml;hel kaks t&auml;isarvu $A_i$ ja $B_i$ ($1 \le A_i, B_i \le 10^9$), mis t&auml;histavad $i$-ndal kivil olevaid s&uuml;mboleid.</p>

### 출력

<p>Esimesele reale v&auml;ljastada &quot;<code>JAH</code>&quot;, kui kivide karpidesse paigutamine on v&otilde;imalik, v&otilde;i &quot;<code>EI</code>&quot;, kui ei ole.</p>

<p>Kui kivide karpidesse paigutamine on v&otilde;imalik, v&auml;ljastada teisele reale $N$ t&auml;hest koosnev s&otilde;ne, kus $i$-s t&auml;ht on &#39;<code>A</code>&#39;, kui $i$-s kivi l&auml;heb esimesse karpi ning &#39;<code>B</code>&#39;, kui $i$-s kivi l&auml;heb teise karpi. Kui v&otilde;imalikke kivide karpidesse paigutusi on mitu, v&auml;ljastada neist <strong>t&auml;hestikulises j&auml;rjekorras esimene</strong>.</p>