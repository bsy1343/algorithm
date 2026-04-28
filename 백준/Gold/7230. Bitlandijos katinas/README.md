# [Gold III] Bitlandijos katinas - 7230

[문제 링크](https://www.acmicpc.net/problem/7230)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 13, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/d767db07-0fba-40c4-a155-78bf7e9fe464/-/preview/" style="width: 203px; height: 109px; float: right;" />Bitlandijoje gyvena Katinas, kuris mėgsta pradžiuginti žmones savo apsilankymu.</p>

<p>Pavasarį Katinas susirūpino Bitlandijos universiteto studentais, intensyviai besiruo&scaron;iančiais egzaminams. &Scaron;iame universitete studijuojantys studentai arba nėra alergi&scaron;ki katėms ir mielai jas paglosto, arba yra joms alergi&scaron;ki. Žinoma, Katinas nelankys alergi&scaron;kų studentų.</p>

<p>Studentai gyvena dviejuose ilguose bendrabučiuose, esančiuose skirtingose gatvės pusėse. Bendrabučiai yra vienaauk&scaron;čiai ir abu turi po N vienodų kambarėlių. Kambarėliai bendrabutyje pastatyti nuosekliai i&scaron; kairės į de&scaron;inę.</p>

<p>Katinas lanko studentus i&scaron; kairės į de&scaron;inę tokiu būdu:</p>

<ul>
	<li>Pirmiausia, Katinas i&scaron; niekur atsiranda prie bet kurio i&scaron; dviejų bendrabučių bet kurio kambario durų;</li>
	<li>Aplankęs kambaryje gyvenantį studentą, Katinas gali arba aplankyti gretimą kambarį i&scaron; de&scaron;inės (jei jame nėra alergi&scaron;ko studento), arba pereiti gatvę į kitą pusę prie bet kurio kito de&scaron;iniau esančio kambario, kuriame nėra alergi&scaron;ko studento;</li>
	<li>Lankydamas studentus Katinas gali pereiti gatvę bet kiek kartų;</li>
	<li>Taip lanko studentus kol gali;</li>
	<li>Tuomet Katinas pasinaudoja savo magi&scaron;komis galiomis ir tiesiog i&scaron;nyksta savo katini&scaron;kais keliais.</li>
</ul>

<p>Suskaičiuokite, kiek daugiausia studentų gali pradžiuginti Katinas.</p>

### 입력

<p>Pirmoje eilutėje pateiktas bendrabučio kambarėlių skaičius N. Kitose dviejose eilutėse (viena eilutė skirta vienam bendrabučiui apra&scaron;yti) yra po N raidžių, žyminčių, ar bendrabučio i-tame kambaryje gyvenantis studentas yra alergi&scaron;kas, ar ne:</p>

<ul>
	<li>K &ndash; studentas nėra alergi&scaron;kas katinams;</li>
	<li>A &ndash; studentas yra alergi&scaron;kas katinams.</li>
</ul>

### 출력

<p>I&scaron;veskite vieną skaičių &ndash; kiek daugiausiai kambarių gali aplankyti Katinas.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1 000 000</li>
</ul>