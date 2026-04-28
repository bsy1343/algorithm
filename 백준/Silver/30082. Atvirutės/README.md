# [Silver II] Atvirutės - 30082

[문제 링크](https://www.acmicpc.net/problem/30082)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 44, 맞힌 사람: 34, 정답 비율: 100.000%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Linas turi $N$ draugų, o tarp jų &ndash;&ndash; $M$ <em>artimų</em> draugų. Nemažai i&scaron; Lino draugų tarpusavyje yra taip pat pažįstami.</p>

<p>Linas, i&scaron; anksto besiruo&scaron;damas &Scaron;v. Velykoms, nori nupie&scaron;ti po atvirutę kiekvienam i&scaron; savo artimų draugų. Tačiau Linas žino, kad jei kuris nors draugas gaus nupie&scaron;tą atvirutę, tai visi kiti draugai, kurie jį pažįsta, jam pavydės, jei patys negaus atvirutės.</p>

<p>&bdquo;Geriau jau pie&scaron;ti, negu pavydėti&ldquo;, galvoja Linas. Tad jis norėtų nupie&scaron;ti tiek atviručių, kad:</p>

<ol>
	<li>visi Lino artimi draugai gautų po atvirutę,</li>
	<li>nei vienas draugas nepavydėtų kitam.</li>
</ol>

<p>Pavyzdžiui, tarkime, kad Linas turi tris draugus &mdash; Domą, Tomą ir Vytautą, bet tik Domas yra jo artimas draugas. Jeigu Tomas ir Domas pažįstami, tai Linas norės nupie&scaron;ti atvirutę ir Tomui. Jei Tomas ir Vytautas taip pat pažįstami, tuomet Linas ir Vytautui nupie&scaron; atvirutę, kad jis nepavydėtų Tomui.</p>

<p>Jums žinomi Lino draugai, jo artimi draugai, o taip pat, kurie i&scaron; draugų pažįsta vieni kitus. Raskite, kiek i&scaron; viso atviručių turės nupie&scaron;ti Linas, kad visi jo artimi draugai gautų po atvirutę, ir nei vienas draugas nepavydėtų kitam.</p>

### 입력

<p>Pirmoje eilutėje įra&scaron;yti trys sveikieji skaičiai: Lino draugų skaičius $N$, jo artimų draugų skaičius $M$, ir draugų tarpusavio pažinčių skaičius $K$. Visi Lino draugai yra sunumeruoti nuo $1$ iki $N$.</p>

<p>Toliau seka $M$ eilučių, kuriose įra&scaron;yti Lino artimų draugų numeriai $a_i$ ($1 &le; a_i &le; N$).</p>

<p>Kitose $K$ eilučių įra&scaron;yti draugų tarpusavio ry&scaron;iai. Kiekvienoje eilutėje draugų numerių (nuo $1$ iki $N$) pora $(b_j , c_j )$, žyminti, kad &scaron;ie draugai vienas kitą pažįsta $(b_j \ne c_j )$.</p>

### 출력

<p>Pirmoje eilutėje i&scaron;veskite vieną sveikąjį skaičių: kiek i&scaron; viso atviručių turės nupie&scaron;ti Linas, kad visi jo artimi draugai gautų po atvirutę, ir nei vienas draugas nepavydėtų kitam.</p>

### 제한

<ul>
	<li>$1 &le; M &le; N &le; 1000$</li>
	<li>$0 &le; K &le; 100\,000$</li>
</ul>