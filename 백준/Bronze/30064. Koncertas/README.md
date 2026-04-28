# [Bronze I] Koncertas - 30064

[문제 링크](https://www.acmicpc.net/problem/30064)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 62, 맞힌 사람: 48, 정답 비율: 92.308%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Muzikos mylėtojai renkasi į koncertą. I&scaron; viso koncertų salėje yra $N$ sėdimų vietų ir jos visos i&scaron;pirktos. Kiekvienas klausytojas turi po bilietą su pažymėta vieta. Laikysime, kad klausytojo numeris yra $X$, jeigu jis turi bilietą su pažymėta vieta $X$. Taigi pirmasis klausytojas turėtų sėdėti vietoje $1$, antrasis &ndash; vietoje $2$, ir taip toliau.</p>

<p>Tačiau atėję į koncertų salę klausytojai susėdo nežiūrėdami į paskirtas vietas.</p>

<p>Paskutinysis vėluodamas atbėgo pats didžiausias muzikos mylėtojas nr. $1$, kuris turėjo sėdėti vietoje $1$. Kadangi tai pati geriausia vieta, jeigu ji bus užimta, jis papra&scaron;ys ten sėdinčio klausytojo ją atlaisvinti. Tokiu atveju, &scaron;is klausytojas susigėdęs eis į sau paskirtą vietą (klausytojas $X$ eis į vietą $X$), o jeigu ji bus užimta &ndash; papra&scaron;ys ją atlaisvinti. &Scaron;itaip persėdimas tęsis tol, kol galų gale visi klausytojai vėl susės.</p>

<p>Jums žinoma, kur yra atsisėdęs kiekvienas muzikos mylėtojas bei kuri viena vieta yra laisva prie&scaron; pasirodant klausytojui nr. $14, Raskite, kiek i&scaron; viso klausytojų turės persėsti.</p>

### 입력

<p>Pirmoje eilutėje įra&scaron;ytas skaičius $N$. Antroje eilutėje įra&scaron;yta $N$ skaičių, atskirtų tarpais: tai numeriai klausytojų atsisėdusių vietose $1, 2, \dots , N$. Lygiai vienas i&scaron; &scaron;ių skaičių bus lygus $0$, kuris žymi jog &scaron;i viena vieta yra laisva.</p>

### 출력

<p>I&scaron;veskite vieną skaičių &ndash; kiek klausytojų i&scaron; viso turės persėsti, klausytojui nr. $1$ pareikalavus savo vietos.</p>

### 제한

<ul>
	<li>$1 &lt; N &le; 100 000$</li>
</ul>