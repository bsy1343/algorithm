# [Silver IV] Mõttemeister - 7184

[문제 링크](https://www.acmicpc.net/problem/7184)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 47, 정답: 21, 맞힌 사람: 19, 정답 비율: 46.341%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>M&otilde;ttemeister on kahe m&auml;ngija lauam&auml;ng. Esimene m&auml;ngija m&otilde;tleb salajase 4-kohalise arvu ja teine hakkab seda &auml;ra arvama.</p>

<p>Igal k&auml;igul pakub arvaja 4-kohalise arvu. Esimene m&auml;ngija vastab kahe arvuga $A$ ja $B$, kus $A$ n&auml;itab, mitu &otilde;iget numbrit oli pakutud arvus, ning $B$, mitu nendest paiknesid &otilde;igel kohal.</p>

<p>Seej&auml;rel teeb arvaja uue pakkumise ning m&auml;ng j&auml;tkub, kuni arvaja arvab salajase arvu &auml;ra v&otilde;i k&auml;ikude arv &uuml;letab teatud piiri.</p>

<p>N&auml;iteks olgu salajane arv 5247. Pakkumisele 1234 oleks vastus 2 (numbrid 2 ja 4 on &otilde;iged) ja 1 (number 2 on &otilde;ige koha peal).</p>

<p>Kui pakkumises on korduvaid numbreid, siis loetakse iga numbrit &otilde;igeks ainult niimitu korda, kuimitu eksemplari on seda numbrit salajases arvus.</p>

<p>Kirjuta programm, mis etteantud pakkumiste ja vastuste p&otilde;hjal leiab k&otilde;ik v&otilde;imalikud salajase arvu v&auml;&auml;rtused.</p>

### 입력

<p>Tekstifaili on t&auml;isarv $N$ ($1 \le N \le 10\,000$). J&auml;rgmisel $N$ real on iga&uuml;hel &uuml;he k&auml;igu kirjeldus: pakutud 4-kohaline arv, selle &otilde;igete numbrite arv $A$ ($0 \le A \le 4$) ja selles &otilde;igel kohal olevate numbrite arv $B$ ($0 \le B \le A$).</p>

### 출력

<p>Tekstifaili esimesele reale v&auml;ljastada salajase arvu v&otilde;imalike v&auml;&auml;rtuste arv $M$. J&auml;rgmisele $M$ reale v&auml;ljastada salajase arvu v&otilde;imalikud v&auml;&auml;rtused kasvavas j&auml;rjekorras.</p>