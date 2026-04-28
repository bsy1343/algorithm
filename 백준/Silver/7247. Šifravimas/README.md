# [Silver IV] Šifravimas - 7247

[문제 링크](https://www.acmicpc.net/problem/7247)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 30, 맞힌 사람: 25, 정답 비율: 80.645%

### 분류

브루트포스 알고리즘, 구현, 수학, 문자열

### 문제 설명

<p>Ignas ir Simonas kartu susidomėjo klasikine kriptografija ir nusprendė &scaron;ifruoti vienas kitam žinučių tekstus. Jų sutartas &scaron;ifravimo procesas toks:</p>

<ul>
	<li>Žinutėse naudoti tik &scaron;iuos simbolius ir juos sunumeruoti nuo 1 iki 29:
	<ul>
		<li>naudoti didžiąsias lotyni&scaron;kas raides: A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, sunumeruoti nuo 1 iki 26 abėcėlės tvarka;</li>
		<li>naudoti pabraukimo ženklą &bdquo; _ &ldquo; vietoje tarpo &ndash; numeris 27;</li>
		<li>naudoti kablelį &bdquo; , &ldquo; ir ta&scaron;ką &bdquo; . &ldquo; &ndash; numeriai 28 ir 29, atitinkamai.</li>
	</ul>
	</li>
	<li>Žinutę &scaron;ifruojame po simbolį:
	<ol>
		<li>Simbolio numeris keliamas kubu, tada paimama liekana dalinant i&scaron; 29 ir prie gaunamos liekanos pridedamas 1.</li>
		<li>Randame naują simbolį, kuris atitinka pirmame punkte gautą skaičių. Tai bus mūsų už&scaron;ifruotas simbolis.</li>
	</ol>
	</li>
	<li>Taip tęsiame su visais žinutės simboliais.</li>
</ul>

<p>Paprastumo delei pateiksime atitinkamą lentelę su simbolių numeriais.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/9e551a43-9d7b-4f17-b781-a2909d44f7bf/-/preview/" style="width: 459px; height: 320px;" /></p>

<p>Pavyzdžiui, tekstas &bdquo;<code>GERI_ORAI.</code>&ldquo; pagal Igno ir Simono algoritmą bus už&scaron;ifruotas kaip &bdquo;<code>YJDEVLDBEA</code>&ldquo;. Tai lengva patikrinti. Imkime pirmąją raidę <code>G</code>:</p>

<ul>
	<li>raidės <code>G</code> numeris yra 7,</li>
	<li>kurio kubas yra 7<sup>3</sup> = 343,</li>
	<li>kurio dalybos i&scaron; 29 liekana yra 24,</li>
	<li>prie kurio pridėjus 1 gausime 25,</li>
	<li>o numerį 25 turi raidė <code>Y</code>.</li>
</ul>

<p>Taigi, &scaron;ifruodami <code>G</code> gauname <code>Y</code>. Analogi&scaron;kai galime patikrinti ir kitų simbolių &scaron;ifravimą.</p>

<p>Ta&scaron;kas &bdquo; <code>.</code> &ldquo;, kurio numeris yra 29, už&scaron;ifruojamas raide <code>A</code>. 29<sup>3</sup> dalijasi i&scaron; 29 ir todėl liekana bus 0, o pridėjus 1, turėsime 1, t.y. raidę <code>A</code>.</p>

<p>Vyresnis Igno brolis pastebėjo, kad toks &scaron;ifravimo algoritmas, deja, labai lengvai &bdquo;sulaužomas&ldquo;, nes pagal &scaron;ifruotą tekstą galima greitai atstatyti pradinį, t.y. jį de&scaron;ifruoti.</p>

<p>Para&scaron;ykite programą, kuri de&scaron;ifruoja teksto eilutę, už&scaron;ifruotą pagal Igno ir Simono algoritmą.</p>

### 입력

<p>Pirmoje duomenų eilutėje pateikta &scaron;ifruoto teksto eilutė.</p>

### 출력

<p>Pateikite de&scaron;ifruoto teksto eilutę.<span style="display: none;"> </span></p>