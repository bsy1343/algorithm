# [Platinum I] Maksulised teelõigud - 29978

[문제 링크](https://www.acmicpc.net/problem/29978)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 1, 맞힌 사람: 1, 정답 비율: 12.500%

### 분류

그래프 이론, 그리디 알고리즘, 최단 경로

### 문제 설명

<p>Valitsusel on plaan maksustada m&otilde;ned l&otilde;igud Tallinna--Tartu maanteel. Inimesed aga kipuvad tasulisi l&otilde;ike v&otilde;imalusel v&auml;ltima, s&otilde;ites neist k&otilde;rvalteid m&ouml;&ouml;da &uuml;mber, kui nii on odavam. Sama kulu korral eelistab juht alati p&otilde;himaanteed.</p>

<p>Kohalikud elanikud aga saaks v&auml;ga kurjaks, kui nende k&uuml;la kaudu autod voorima hakkaks, ja valitsus kukuks. Nii soovib valitsus saada teemaksust v&otilde;imalikult suurt kasu, aga samas v&auml;ltida vihaseid elanikke.</p>

<p>Leida, kui suure summa ulatuses saab valitsus maksustada erinevaid teel&otilde;ike Tallinna--Tartu p&otilde;himaanteel, nii et juhil, kes alustab ja l&otilde;petab oma s&otilde;idu &uuml;ksk&otilde;ik millises p&otilde;himaantee punktis, on optimaalne s&otilde;ita ainult m&ouml;&ouml;da p&otilde;himaanteed.</p>

<p>Alguses on teada, et p&otilde;himaantee on optimaalne: selle otspunktide vahel ei leidu sellist teekonda, mis kasutaks m&otilde;nd k&otilde;rvalteed ning mille s&otilde;idukulu oleks v&auml;iksem kui kulu m&ouml;&ouml;da p&otilde;himaanteed. Samuti on teada, et iga &uuml;ksikut p&otilde;himaantee l&otilde;iku on v&otilde;imalik teisi teel&otilde;ike kasutades v&auml;ltida, seega &uuml;hegi l&otilde;igu hinda ei saa t&otilde;sta piiramatult.</p>

### 입력

<p>Tekstifaili esimesel real on neli t&auml;isarvu $K$, $R$, $T$ ja $T_p$, kus:</p>

<ul>
	<li>$K$ on kilomeetri l&auml;bimise k&uuml;tusekulu sentides ($1 \le K \le 100$),</li>
	<li>$R$ on ristmike arv teedev&otilde;rgus ($2 \le R \le 5\,000$; ristmikud on nummerdatud $0 \dots R-1$),</li>
	<li>$T$ on nendevaheliste teel&otilde;ikude arv ($2 \le T \le 15\,000$),</li>
	<li>$T_P$ on p&otilde;himaantee teel&otilde;ikude arv ($1 \le T_P \le 1\,000$).</li>
</ul>

<p>J&auml;rgmisel $T$ real on iga&uuml;hel kolm t&auml;isarvu $R_1$, $R_2$ ja $P$, mis n&auml;itavad, et ristmikke $R_1$ ja $R_2$ &uuml;hendab teel&otilde;ik pikkusega $P$ kilomeetrit ($0 &lt; P \le 5\,000$). P&otilde;himaantee l&auml;bib ristmikud $0 \dots T_P$ numbrite kasvamise j&auml;rjekorras ja selle l&otilde;igud on sisendis antud esimestena nende maanteel esinemise j&auml;rjekorras.</p>

### 출력

<p>Tekstifaili v&auml;ljastada &uuml;ks t&auml;isarv: k&otilde;igi maksustavate l&otilde;ikude koguhind.</p>