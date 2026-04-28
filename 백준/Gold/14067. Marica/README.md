# [Gold II] Marica - 14067

[문제 링크](https://www.acmicpc.net/problem/14067)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 167, 정답: 84, 맞힌 사람: 16, 정답 비율: 45.714%

### 분류

다이나믹 프로그래밍, 누적 합, 정렬

### 문제 설명

<p>Maričina baka ima veliki voćnjak i svakog jutra na tržnicu nosi &scaron;ljive. Marica je jutros baki nabrala n ko&scaron;ara &scaron;ljiva, ali baka se jo&scaron; nije probudila zbog sinoćnjeg tulumarenja, pa se Marica želi jo&scaron; malo poigrati. Neke će &scaron;ljive iz ko&scaron;ara pojesti, a potom ubrati jo&scaron; &scaron;ljiva iz voćnjaka.</p>

<p>Maričin je cilj da za svaki prirodan broj iz intervala [A, B] (uključivo) postoji barem jedna ko&scaron;ara koja sadrži taj broj &scaron;ljiva. Znajući trenutačni broj &scaron;ljiva u svakoj ko&scaron;ari, odredite minimalan broj operacija koje Marica mora učiniti da bi ostvarila svoj zadatak, ako je svaka od operacija jedno od sljedećeg:</p>

<ul>
	<li>pojedi &scaron;ljivu iz neke ko&scaron;are,</li>
	<li>uberi &scaron;ljivu iz voćnjaka i stavi je u neku ko&scaron;aru.</li>
</ul>

### 입력

<p>U prvom redu nalazi se prirodni broj n (n &le; 5000) &mdash; broj ko&scaron;ara. U sljedećem redu nalaze se prirodni brojevi A i B (1 &le; A &le; B &le; 10<sup>6</sup> , B &minus; A + 1 &le; n) iz teksta zadatka. U i-tom od sljedećih n redova nalazi se cijeli broj a<sub>i</sub> (1 &le; a<sub>i</sub> &le; 10<sup>6</sup> ), broj &scaron;ljiva u i-toj ko&scaron;ari.</p>

### 출력

<p>U prvi i jedini red ispi&scaron;ite traženi minimalan broj operacija.</p>