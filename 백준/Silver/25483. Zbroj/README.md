# [Silver IV] Zbroj - 25483

[문제 링크](https://www.acmicpc.net/problem/25483)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 43, 맞힌 사람: 19, 정답 비율: 50.000%

### 분류

수학

### 문제 설명

<p>Marin u slobodno vrijeme igra neobičnu igru. Na papir napi&scaron;e dva cijela, nenegativna broja $A$ i $B$, jedan ispod drugog, a onda ih pisano zbroji, dobiv&scaron;i tako njihov zbroj $Z$. Marin se na ovaj način voli podsjećati da i on može &scaron;to i kompjutori.</p>

<p>Jednog lijepog ožujskog dana u posjet mu je do&scaron;ao prijatelj Stjepan.</p>

<ul>
	<li>&Scaron;to to radi&scaron;? - rekao je Stjepan kada je vidio na koji način se Marin igra.</li>
	<li>Zbrajam. Vidi&scaron;, Stjepane, ja mogu &scaron;to i računalo!</li>
	<li>Može&scaron;, može&scaron;, ali nema&scaron; backup! - s tim riječima Stjepan slavodobitno zgrabi gumicu i s papira obri&scaron;e brojeve $A$ i $B$.</li>
	<li>&Scaron;to si to učinio!? Ne sjećam se koji su bili&hellip; Ali, dobro, bar mi je $Z$ ostao!</li>
</ul>

<p>Josip se u tom trenutku materijalizira iza njih.</p>

<ul>
	<li>Ali, vidi&scaron;, Marine, trag gumice ti daje do znanja koliko su imali znamenaka! Sada, kao pravi informatičar, razmisli koliko postoji različitih mogućnosti za par brojeva $A$ i $B$! - vikao je Josip.</li>
	<li>Samo malo, Josipe! Jesu li, primjerice, $(1, 2)$ i $(2, 1)$ isti parovi? - pitao je Marin, a u očima mu se vidjelo da je naprosto poludio od želje za rje&scaron;avanjem Josipove zagonetke.</li>
	<li>Naravno da jesu, Marine, i malo me vrijeđa &scaron;to me to uopće pita&scaron;.</li>
</ul>

### 입력

<p>U prvom su retku dva prirodna broja $X$ i $Y$ ($1 &le; X, Y &le; 18$), gdje je $X$ broj znamenaka broja $A$, a $Y$ broj znamenaka broja $B$.</p>

<p>U drugom je retku zbroj $Z$ ($0 &le; Z &le; 10^{18}$).</p>

### 출력

<p>U prvi i jedini redak ispi&scaron;i odgovor na Josipovu zagonetku.</p>

### 힌트

<p>Opis prvog probnog primjera: Različite mogućnosti za par brojeva $A$ i $B$ su $(1, 9)$, $(2, 8)$, $(3, 7)$, $(4, 6)$ i $(5, 5)$. Mogućnosti $(9, 1)$, $(8, 2)$, $(7, 3)$ i $(6, 4)$ ne brojimo dodatno, budući da predstavljaju iste parove.</p>

<p>Opis drugog probnog primjera: Mogućnosti su $(3, 10)$, $(2, 11)$, $(1, 12)$ i $(0, 13)$.</p>