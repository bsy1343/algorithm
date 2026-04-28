# [Silver IV] Meli kalikamaka - 7202

[문제 링크](https://www.acmicpc.net/problem/7202)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 44, 맞힌 사람: 16, 정답 비율: 72.727%

### 분류

구현, 문자열

### 문제 설명

<p>Mõnedel Polüneesia saartel räägivad inimesed keelt, millel on järgmised omadused:</p>

<ul>
	<li>Sõnades ei ole kunagi korduvaid ega pikki täis- ega kaashäälikuid.</li>
	<li>Igale kaashäälikule järgneb alati üks täishäälik (&lsquo;a&rsquo;, &lsquo;e&rsquo;, &lsquo;i&rsquo;, &lsquo;o&rsquo; ja &lsquo;u&rsquo; on täishäälikud, kõik ülejäänud kaashäälikud).</li>
	<li>Keeles ei eristata &lsquo;r&rsquo;- ja &lsquo;l&rsquo;-häälikuid ega &lsquo;s&rsquo;- ja &lsquo;k&rsquo;-häälikuid.</li>
</ul>

<p>Kui polüneeslased tahavad &uml; ule võtta teiste keelte sõnu või väljendeid, muutuvad need sõnad või väljendid saarte elanikele hääldamiseks mugavamaks teatud reeglite järgi. Veidi lihtsustatud versioon nendest reeglitest on järgmine:</p>

<ul>
	<li>Kõik pikad ja ülipikad täis- ja kaashäälikud muutuvad lühikesteks. Näiteks sõna &lsquo;tee&rsquo; muutub sõnaks &lsquo;te&rsquo;, &lsquo;toooo&rsquo; muutub &lsquo;to&rsquo;-ks ja &lsquo;mokka&rsquo; muutub &lsquo;moka&rsquo;-ks.</li>
	<li>Mitmest järjestikusest täishäälikust jääb alles ainult esimene. Näiteks sõna &lsquo;tea&rsquo; muutub samuti &lsquo;te&rsquo;-ks.</li>
	<li>&Uuml;ksteisele järgnevate kaashäälikute vahele ja sõna lõpus olevate kaashäälikute järele lisatakse täishäälikud. Lihtsuse mõttes ütleme, et alati lisatakse &lsquo;a&rsquo;. Näiteks &lsquo;ahv&rsquo; muutub &lsquo;ahava&rsquo;-ks ja &lsquo;onn&rsquo; muutub &lsquo;ona&rsquo;-ks.</li>
	<li>Häälik &lsquo;r&rsquo; muutub &lsquo;l&rsquo;-ks ja &lsquo;s&rsquo; muutub &lsquo;k&rsquo;-ks. Näiteks &lsquo;kass&rsquo; muutub &lsquo;kaka&rsquo;-ks ja &lsquo;tervist&rsquo; muutub &lsquo;telavikata&rsquo;-ks.</li>
</ul>

<p>Kirjutada programm, mis &ldquo;tõlgib&rdquo; antud teksti ülaltoodud reeglite järgi polüneesia häälduseks.</p>

### 입력

<p>Tekstifaili ainsal real on väikestest ladina tähtedest a. . . z ja tühikutest koosnev tekst pikkusega 1 kuni 100 märki. Tekst ei alga ega lõpe tühikutega ning kahe sõna vahel on alati täpselt üks tühik.</p>

### 출력

<p>Tekstifaili ainsale reale väljastada sisendis antud teksti polüneesia vaste.</p>