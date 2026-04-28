# [Platinum IV] Luckasti Likovi - 31199

[문제 링크](https://www.acmicpc.net/problem/31199)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 23, 맞힌 사람: 21, 정답 비율: 84.000%

### 분류

구현, 기하학, 많은 조건 분기, 볼록 껍질

### 문제 설명

<p>U pravokutnoj mreži podijeljenoj na jedinične kvadrate uredno je posloženo $n$ geometrijskih likova. Likovi se nalaze unutar uzastopnih jediničnih kvadrata istoga retka i to tako da se unutar svakog jediničnog kvadrata nalazi točno jedan lik. Likovi mogu biti:</p>

<ul>
	<li>Kvadrat kojem su stranice savr&scaron;eno poravnate sa stranicama jediničnih kvadrata mreže.</li>
	<li>Krug koji je upisan u jedinični kvadrat.</li>
	<li>Jednakostranični trokut kojem jedna stranica odgovara donjoj stranici jediničnog kvadrata mreže.</li>
</ul>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/1bf62b71-cb88-4bd1-ac45-bfdd6f3115a8/-/preview/" style="width: 525px; height: 125px;" /></p>

<p style="text-align: center;">Likovi iz prvog probnog primjera i njihov konveksni obris</p>

<p>Neformalno, <em>konveksni obris</em> rasporeda likova je najkraća linija koja zatvara sve likove. Formalnije, radi se o opsegu konveksne ljuske unije svih likova.</p>

<p>Za dani raspored likova, odredite duljinu njihovog konveksnog obrisa.</p>

### 입력

<p>U prvom je retku prirodan broj $n$ ($1 &le; n &le; 20$) iz teksta zadatka.</p>

<p>U sljedećem se retku nalazi riječ od $n$ znakova koja opisuje raspored likova slijeva nadesno. Svaki znak označava jedan lik i to tako da znakovi &#39;<code>S</code>&#39;, &#39;<code>C</code>&#39; i &#39;<code>T</code>&#39; redom označavaju kvadrat, krug i trokut.</p>

### 출력

<p>Ispi&scaron;ite duljinu konveksnog obrisa zadanih likova.</p>

<p>Tolerirat će se apsolutno ili relativno odstupanje od službenog rje&scaron;enja za $10^{-6}$.</p>