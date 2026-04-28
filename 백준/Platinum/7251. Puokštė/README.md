# [Platinum V] Puokštė - 7251

[문제 링크](https://www.acmicpc.net/problem/7251)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 1, 맞힌 사람: 1, 정답 비율: 33.333%

### 분류

(분류 없음)

### 문제 설명

<p>Robotas yra pastate, turinčiame N auk&scaron;tų. Kiekviename auk&scaron;te yra po M i&scaron; eilės įrengtų kambarių, i&scaron;dėstytų i&scaron; eilės taip, kad visi pastato kambariai sudarytų N &times; M dydžio stačiakampį. Kai kuriuose kambariuose yra po gėlę. Robotas mokysis surinkti puok&scaron;tes.</p>

<p>Kai robotas yra kuriame nors kambaryje, jis gali elgtis taip:</p>

<ul>
	<li>Jei kambarys nėra pats kairiausias, jis gali pereiti į kairesnį kambarį tame pačiame auk&scaron;te.</li>
	<li>Jei kambarys nėra pats de&scaron;iniausias, jis gali pereiti į de&scaron;inesnį kambarį tame pačiame auk&scaron;te.</li>
	<li>Jei jis nėra apatiniame auk&scaron;te, jis gali persikelti į tiesiai po dabartiniu kambariu esantį kambarį vienu auk&scaron;tu žemiau.</li>
</ul>

<p>Robotas juda tik horizontaliai arba žemyn, bet niekada nekyla auk&scaron;tyn.</p>

<p>Kai jis įeina į kambarį, kuriame yra gėlė, jis būtinai ją paima ir deda į puok&scaron;tę.</p>

<p>Visos gėlės yra skirtingos, o taip pat puok&scaron;tės i&scaron;vaizda priklauso nuo to, kokia tvarka į ją dedamos gėlės. Dvi puok&scaron;tės laikomos skirtingomis, jei jas sudaro skirtingos gėlės arba skiriasi gėlių įdėjimo į puok&scaron;tę tvarka.</p>

<p>Robotas pradeda bet kuriame vir&scaron;utinio auk&scaron;to kambaryje ir baigia bet kuriame apatinio auk&scaron;to kambaryje.</p>

<p>Be to, robotas visada pasirenka tokį mar&scaron;rutą, kad kiekviename auk&scaron;te paimtų bent po vieną gėlę.</p>

<p>Nustatykite, kiek yra skirtingų variantų, kokią puok&scaron;tę robotas gali būti surinkęs pabaigoje. Atsakymą i&scaron;veskite moduliu 10<sup>9</sup> + 7.</p>

### 입력

<p>Pirmoje eilutėje pateikiami skaičiai N ir M.</p>

<p>Tolesnėse N eilučių (viena eilutė apra&scaron;o vieną auk&scaron;tą, pradedant nuo vir&scaron;utinio) yra po M raidžių, kurių i-oji nurodo, ar i-ajame to auk&scaron;to kambaryje i&scaron; kairės yra gėlė:</p>

<ul>
	<li>O &ndash; kambaryje gėlės nėra</li>
	<li>X &ndash; kambaryje gėlė yra.</li>
</ul>

<p>Garantuojama, kad kiekviename auk&scaron;te yra bent po vieną gėlę.</p>

### 출력

<p>I&scaron;veskite, kiek yra skirtingų puok&scaron;čių, kurias gali surinkti robotas, moduliu 10<sup>9</sup> + 7.</p>

### 제한

<ul>
	<li>1 &le; N &le; 500</li>
	<li>1 &le; M &le; 300</li>
</ul>