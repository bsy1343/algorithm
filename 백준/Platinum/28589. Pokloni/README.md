# [Platinum IV] Pokloni - 28589

[문제 링크](https://www.acmicpc.net/problem/28589)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Svi znamo da Djed Božićnjak zimi ima pune ruke posla s poklonima iako je njihova izrada krenula jo&scaron; tijekom ljeta. Izrada poklona je stroga tajna, no uz puno nagovaranja otkrio nam je kako se pokloni zamataju.</p>

<p>Zamatanje već dugi niz godina radi $N$ strojeva poredanih tako da prvi stoji pored drugog, drugi pored trećeg, &hellip; i $N-1$-vi pored $N$-tog. Danas su dobili zadatak zamotati $M$ poklona. Svaki poklon ima svoju veličinu $A_i$, a svaki stroj ima svoj broj $D_i$ koji označuje da taj stroj može zamatati poklone koji su po veličini manji ili jednaki od $D_i$.</p>

<p>Pokloni do strojeva dolaze na jednoj pomičnoj traci koja na početku vodi poklone prema stroju $X$. U jednoj sekundi Djed može napraviti jednu od dvije akcije:</p>

<ul>
	<li>pomaknuti pomičnu traku tako da sada vodi poklone na stroj $X-1$ ili $X+1$ (ako je $X=1$ traka se može pomaknuti samo na $X+1$ ili za $X=N$ samo na $X-1$)</li>
	<li>poslati trenutni poklon $i$ u stroj $X$ koji će ga zamotati pri čemu mora vrijediti: $A_i &le; D_x$. Na početku trake se sada nalazi $i+1$ poklon.</li>
</ul>

<p>Djedovi strojevi su stari i treba im vremena da zamotaju poklon. Zato ako se na nekom stroju zamata poklon $i$, na istom se ne smije zamatati poklon $i+1$.</p>

<p>Iako automatiziran, ovaj je proces naporan i dugo traje, pa je Djed zamolio tebe da mu pomogne&scaron; odrediti koliko će minimalno vremena trajati raspodjela svih poklona po strojevima!</p>

### 입력

<p>U prvom se retku nalaze tri prirodna broja $N$, $M$, $X$ ($2 &le; N &le; 10\,000$, $1 &le; M &le; 10\,000$, $1 &le; X &le; N$), brojevi iz teksta zadatka.</p>

<p>U idućem se retku nalazi $N$ prirodnih brojeva $D_i$ ($1 &le; D_i &le; 10^9$) &ndash; maksimalna veličina poklona koji $i$-ti stroj može zamotati.</p>

<p>U idućem se retku nalazi $M$ prirodnih brojeva $A_i$ ($1 &le; A_i &le; 10^9$) &ndash; veličina $i$-tog poklona.</p>

<p>Napomena: test podaci će biti oblika da uvijek postoji barem jedno rje&scaron;enje, to jest uvijek će postojati redoslijed akcija takav da se svi pokloni mogu rasporediti.</p>

### 출력

<p>U prvi i jedini redak ispi&scaron;i koliko je minimalno sekundi potrebno da se svi pokloni rasporede po strojevima.</p>

### 힌트

<p>Opis prvog probnog primjera: Na početku traka vodi poklone prema stroju 2 koji može zamatati poklone najveće veličine 5. Trenutno je na traci poklon veličine 6, tako da prve dvije sekunde moramo traku micati do četvrtog stroja, a u trećoj ćemo ga poslati u njega. Idući poklon je veličine 5, budući da u stroju 4 traje zamatanje, moramo se vratiti do stroja 2 i u njega poslati poklon. To će trajati jo&scaron; dodatne 3 sekunde. Idući poklon je veličine 2, pomaknuti ćemo se do stroja 3 i u njega poslati taj poklon koristeći 2 sekunde. Zadnji je poklon dimenzije 8, pomaknuti ćemo se do stroja 4 i u njega poslati taj poklon koristeći 2 sekunde. Ukupno je cijeli posao trajao 10 sekundi.</p>