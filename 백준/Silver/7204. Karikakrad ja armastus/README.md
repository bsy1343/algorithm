# [Silver V] Karikakrad ja armastus - 7204

[문제 링크](https://www.acmicpc.net/problem/7204)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 34, 맞힌 사람: 29, 정답 비율: 80.556%

### 분류

수학

### 문제 설명

<p>M-kohaliseks (M &gt; 1) meeldivusseisundite loeteluks nimetame järgmist järjendit: esikohal on seisund &ldquo;armastab&rdquo; ja järgmisel M &minus;1 kohal mingid muud meeldivusseisundid. Tüdruk tuvastab poisi suhtumise endasse talle kingitud karikakra õielehtede äratõmbamisega järgmisel viisil:</p>

<ol>
	<li>Enne esimese õielehe tõmbamist oleme seisundis &ldquo;armastab&rdquo;.</li>
	<li>Iga järgmise õielehe tõmbamise järel muutub meeldivuse seisund järgmiseks seisundiks selles loetelus.</li>
	<li>Viimasele seisundile järgmiseks seisundiks loeme seisundit &ldquo;armastab&rdquo;.</li>
	<li>Kui õies enam lehti pole, lõpetame töö selle karikakraga ja tagastame tulemusena viimase seisundi.</li>
</ol>

<p>&Uuml;ks võimalik 3-kohaline jada on &ldquo;armastab&rdquo;-&ldquo;meeldin&rdquo;-&ldquo;ükskõikne&rdquo;. Sel juhul saame näiteks viie õielehe puhul tulemuseks &ldquo;ükskõikne&rdquo;, aga seitsme puhul &ldquo;meeldin&rdquo;.</p>

<p>On teada, et tüdruk usub poisi armastust vaid siis, kui see kingib talle karikakraid ja kõik need tuvastavad seisundi &ldquo;armastab&rdquo;. Poiss soovib tüdrukut oma armastuses veenda. Selleks kingib ta tüdrukule N karikakraõit ja tahab sinna lisada võimalikult pika endadefineeritud meeldivusseisundite loetelu.</p>

<p>Leida suurim antud õite korral võimalik M väärtus, mille korral tüdruk jõuab järeldusele, et poiss teda armastab.</p>

### 입력

<p>Tekstifaili esimesel real karikakarde arv N (1 &le; N &le; 1000) ja teisel real N üksteisest tühikutega eraldatud õielehtede arvu L<sub>i</sub> (1 &le; L<sub>i</sub> &le; 100, i &isin; 1 . . . N).</p>

### 출력

<p>Tekstifaili ainsale reale väljastada üks täisarv: suurim võimalik M väärtus.</p>