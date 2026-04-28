# [Platinum II] Seif - 29981

[문제 링크](https://www.acmicpc.net/problem/29981)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 1, 맞힌 사람: 1, 정답 비율: 33.333%

### 분류

자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>Arheoloogid leidsid merre uppunud laevalt seifi, millel on v&auml;ga omap&auml;rane digitaalne lukk. Luku ekraanil on kaks &uuml;hepikkust t&auml;isarvu, mis aeg-ajalt muutuvad. Uurijad on m&auml;rganud, et ekraani oleku muutusi on kolme liiki:</p>

<ul>
	<li>kummalegi arvule lisandub paremale &uuml;ks number;</li>
	<li>m&otilde;lemal arvul kustub paremalt mingi arv numbreid;</li>
	<li>ekraanile ilmub kolmas arv ja selle k&otilde;rvale &uuml;he numbri suurune sisestusv&auml;li.</li>
</ul>

<p>Uurijatel tekkis h&uuml;potees, et seifi avamiseks tuleb sisestusv&auml;lja sisestada kahe suure arvu summast see number, mille positsiooni n&auml;itab kolmas arv. Kuna andmed ekraanil muutuvad k&auml;sitsi arvutamiseks liiga kiiresti, on n&uuml;&uuml;d vaja programmi, mis k&uuml;simustele vastaks.</p>

<p>Selle programmi p&otilde;hikomponent on teek, mis reageerib seifi ekraanil toimuvatele s&uuml;ndmustele. Sinu &uuml;lesanne ongi kirjutada teek, mille j&auml;rgnevaid funktsioone kutsutakse v&auml;lja kokku $N$ korda:</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<th>Funktsioon</th>
			<th>Kirjeldus</th>
		</tr>
		<tr>
			<td><code>void Add(int f, int s)</code></td>
			<td>Esimesele pikale arvule lisandus paremale number $f$ ja teisele number $s$.</td>
		</tr>
		<tr>
			<td><code>void Del(int k)</code></td>
			<td>M&otilde;lemast pikast arvust kadusid $k$ parempoolset numbrit. V&otilde;ib eeldada, et selle funktsiooni kasutamise hetkel on suured arvud v&auml;hemalt $k$-kohalised. On v&otilde;imalik, et sellega ei j&auml;&auml;nud neisse &uuml;ldse numbreid.</td>
		</tr>
		<tr>
			<td><code>int Get(int p)</code></td>
			<td>Ekraanile ilmus kolmas arv $p$. Funktsioon peab tagastama kahe pika arvu summas paremalt $p$. kohal oleva numbri. V&otilde;ib eeldada, et selle funktsiooni kasutamise hetkel on summa v&auml;hemalt $p$-kohaline.</td>
		</tr>
	</tbody>
</table>

<p>Testimiskeskkonnas on n&auml;itefailid, kus vajalikud funktsioonid on juba kirjeldatud ja lahendusena on vaja kirjutada ainult nende realisatsioonid. Lisaks v&otilde;ib lahenduse faili kirjutada ka oma funktsioone. Oma lahenduse oma arvutis testimiseks on ka hindamisprogrammi n&auml;ide, mille sisendi ja v&auml;ljundi kirjeldus on toodud allpool (serveris on kasutusel teine hindamisprogramm, mis kontrollib ka lahenduse tagastatud vastuste &otilde;igsust). Oma lahenduse oma arvutis kompileerimiseks ja testimiseks:</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<th>Keel</th>
			<th>Lahendus</th>
			<th>K&auml;surida</th>
		</tr>
		<tr>
			<td>C++</td>
			<td><code>seif.cpp</code></td>
			<td>
			<p><code>g++ -o main main.cpp seif.cpp</code></p>

			<p><code>./main</code></p>
			</td>
		</tr>
	</tbody>
</table>

### 입력

<p>Tekstifaili esimesel real on teegi funktsioonide v&auml;ljakutsete arv $N$ ($1 \le N \le 10^6$) ja j&auml;rgmisel $N$ real iga&uuml;hel &uuml;he v&auml;ljakutse kirjeldus:</p>

<ul>
	<li>Rida kujul <code>1</code> $F$ $S$ ($1 \le F \le 9$, $1 \le S \le 9$) t&auml;hendab kutset <code>Add(f, s)</code>.</li>
	<li>Rida kujul <code>2</code> $K$ ($1 \le K$) t&auml;hendab kutset <code>Del(k)</code>.</li>
	<li>Rida kujul <code>3</code> $P$ ($1 \le P$) t&auml;hendab kutset <code>Get(p)</code>.</li>
</ul>

### 출력

<p>Tekstifaili v&auml;ljastatakse hindamisprogrammi ja teegi vahelise suhtluse logi.</p>