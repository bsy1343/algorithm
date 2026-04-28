# [Gold II] Jada kustutamine - 29869

[문제 링크](https://www.acmicpc.net/problem/29869)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>Me k&otilde;ik tunneme funktsioone $\min$ ja $\max$, mis leiavad vastavalt v&auml;hima ja suurima hulka kuuluva v&auml;&auml;rtuse. Vaatleme n&uuml;&uuml;d funktsiooni $\text{mex}$, mis arvu\-hulgale rakendatuna tagastab minimaalse hulka mittekuuluva mittenegatiivse t&auml;isarvu (funktsiooni nimi tulebki ingliskeelsest v&auml;ljendist <em>minimal excluded</em>). N&auml;iteks $\text{mex}(\{1,2,3\}) = 0$ ja $\text{mex}(\{0,1,2,4,5\}) = 3$.</p>

<p>Magnus tutvus funktsiooni $\text{mex}$ definitsiooniga ja leiutas kohe sellel p&otilde;hineva m&auml;ngu. Selles m&auml;ngus saab m&auml;ngija $N$-elemendilise mittenegatiivsete t&auml;isarvude jada $A$ ja koostab selle p&otilde;hjal jada $B$, korrates j&auml;rgmisi samme, kuni jadas $A$ on veel elemente:</p>

<ol>
	<li>Vali positiivne t&auml;isarv $k$, mis ei &uuml;leta jada $A$ pikkust.</li>
	<li>Lisa jada $B$ l&otilde;ppu jada $A$ esimese $k$ elemendi $\text{mex}$.</li>
	<li>Kustuta jadast $A$ selle esimesed $k$ elementi.</li>
</ol>

<p>M&auml;ngija &uuml;lesanne on valida igal sammul selline $k$ v&auml;&auml;rtus, et saadud jada $B$ oleks k&otilde;igi v&otilde;imalike hulgas leksikograafiliselt maksimaalne. Tuletame meelde, et jada $x = x_1, x_2, \ldots, x_n$ on jadast $y = y_1, y_2, \ldots, y_m$ leksikograafiliselt suurem, kui</p>

<ul>
	<li>leidub selline $i$, et $i \le n$ ja $i \le m$ ning $x_1 = y_1$, $x_2 = y_2$, $\ldots$, $x_{i-1} = y_{i-1}$ ja $x_i &gt; y_i$ v&otilde;i</li>
	<li>$n &gt; m$ ja $x_1 = y_1$, $x_2 = y_2$, $\ldots$, $x_m = y_m$.</li>
</ul>

### 입력

<p>Sisendi esimesel real on jada $A$ pikkus $N$ ($1 \le N \le 500\,000$) ja teisel real $N$ t&uuml;hikutega eraldatud t&auml;isarvu: jada $A$ elemendid $A_i$ ($0 \le A_i \le N$).</p>

### 출력

<p>V&auml;ljundi esimesele reale v&auml;ljastada leitud jada $B$ pikkus $M$ ja teisele reale t&uuml;hikutega eraldatult jada $B$ elemendid $B_1, B_2, \ldots, B_M$.</p>