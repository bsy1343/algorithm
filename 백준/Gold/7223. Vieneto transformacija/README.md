# [Gold II] Vieneto transformacija - 7223

[문제 링크](https://www.acmicpc.net/problem/7223)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

수학, 그래프 이론, 자료 구조, 그래프 탐색, 집합과 맵, 최단 경로, 데이크스트라

### 문제 설명

<p><em>Numeracijos</em> karalystė labai didžiuojasi savo skaičių kokybe, tad renka mokesčius i&scaron; savo gyventojų už kiekvieną skaičiaus pakeitimą. Nepaisant to, Numeracijos gyventojai labai mėgsta transformuoti skaičius.</p>

<p>Draugų grupė <em>Vienetukai</em> mėgsta transformuoti skaičius, pradėdami nuo skaičiaus $1$. Kadangi vienetukai nėra labai turtingi, savoms reikmėms naudoja pačias pigiausias transformacijas, kurios atliekamos tik naudojant paskutinį (mažiausiai reik&scaron;minį) skaitmenį:</p>

<ul>
	<li>prie skaičiaus paskutinio skaitmens pridėti vienetą &ndash; kainuoja $1$ auksinį;</li>
	<li>skaičiaus paskutinį skaitmenį padauginti i&scaron; bet kurio skaičiaus nuo $2$ iki $9$ &ndash; kainuoja $2$ auksinius.</li>
</ul>

<p>Pavyzdžiui, naudojant &scaron;ias operacijas, skaičių $2121$ i&scaron; $1$ galima gauti tokia transformacijų seka:</p>

<ol style="list-style-type:upper-roman;">
	<li>$1$ padauginame i&scaron; $7$ &ndash; gauname $7$.</li>
	<li>$7$ padauginame i&scaron; $3$ &ndash; gauname $21$.</li>
	<li>Prie paskutinio skaitmens pridedame $1$ &ndash; gauname $22$.</li>
	<li>Paskutinį skaitmenį padauginame i&scaron; $5$ &ndash; gauname $210$.</li>
	<li>Prie paskutinio skaitmens pridedame $1$ &ndash; gauname $211$.</li>
	<li>Paskutinį skaitmenį padauginame i&scaron; $3$ &ndash; gauname $213$.</li>
	<li>Paskutinį skaitmenį padauginame i&scaron; $7$ &ndash; gauname $2121$.</li>
</ol>

<p>Tokia transformacija kainuoja $12$ auksinių. &Scaron;ią seką galime pavaizduoti schemati&scaron;kai:</p>

<p>$$ 1 \underset{1 \times 7}{\overset{2}{\Longrightarrow}} 7 \underset{7 \times 3}{\overset{2}{\Longrightarrow}} 21 \underset{1 +1}{\overset{1}{\Longrightarrow}} 22 \underset{2 \times 5}{\overset{2}{\Longrightarrow}} 210 \underset{0 + 1}{\overset{1}{\Longrightarrow}} 211 \underset{1 \times 3}{\overset{2}{\Longrightarrow}} 213 \underset{3 \times 7}{\overset{2}{\Longrightarrow}} 2121 $$</p>

<p>Skaičių $2121$ galima buvo gauti ir pigiau, sumokant tik $9$ auksinius:</p>

<p>$$ 1 \underset{1 \times 5}{\overset{2}{\Longrightarrow}} 5 \underset{5 \times 5}{\overset{2}{\Longrightarrow}} 25 \underset{5 \times 3}{\overset{2}{\Longrightarrow}} 215 \underset{5 \times 4}{\overset{2}{\Longrightarrow}} 2120 \underset{0 +1 }{\overset{1}{\Longrightarrow}} 2121 $$</p>

<p>Padėkite Vienetukams sutaupyti &ndash; raskite mažiausią kainą, už kurią Vienetukai gali gauti duotąjį skaičių $A$ i&scaron; $1$ nurodytomis transformacijomis.</p>

### 입력

<p>Pirmoje įvesties eilutėje duotas natūralusis skaičius $A$.</p>

### 출력

<p>. I&scaron;veskite vieną skaičių &ndash; mažiausią kainą, už kurią Vienetukai gali gauti duotąjį skaičių $A$ i&scaron; $1$. Jei skaičiaus $A$ nurodytomis transformacijomis gauti neįmanoma, i&scaron;veskite $-1$.</p>

### 제한

<ul>
	<li>$1 &le; A &le; 10^9$</li>
</ul>