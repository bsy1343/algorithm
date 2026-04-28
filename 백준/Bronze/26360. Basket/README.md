# [Bronze III] Basket - 26360

[문제 링크](https://www.acmicpc.net/problem/26360)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 185, 정답: 155, 맞힌 사람: 143, 정답 비율: 83.140%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Perica programira simulaciju koju će ko&scaron;arka&scaron;ki suci koristiti za online učenje pravila ko&scaron;arka&scaron;ke igre. Jedna od situacija koja se pojavljuje tijekom igre opisana je na sljedeći način:</p>

<ul>
	<li>igrač ekipe koja je u napadu &scaron;utira, tj. baca loptu prema ko&scaron;u. Ako igrač pogodi ko&scaron;, sudac njegovoj ekipi dodjeljuje X poena. Ako igrač ne pogodi, ekipa ne dobija poene za taj &scaron;ut.</li>
	<li>dodatno, igrač u trenutku upućivanja lopte prema ko&scaron;u može biti nepropisno zaustavljen od strane protivničkog igrača. Ako se to dogodi, sudac prvo sačeka hoće li igrač pogoditi ko&scaron; i onda donese dodatnu odluku:
	<ul>
		<li>igrač je pogodio ko&scaron; - sudac igraču dodjeljuje jo&scaron; jedno dodatno bacanje u ko&scaron;;</li>
		<li>igrač nije pogodio ko&scaron; - sudac igraču dodijeljuje jo&scaron; X dodatnih bacanja.</li>
	</ul>
	</li>
</ul>

<p>Igrač svako dodatno bacanje može pogoditi ili proma&scaron;iti. Za svako pogođeno bacanje sudac ekipi dodjeljuje jedan poen.</p>

<p>Za testiranje simulacije, Perica je pripremio jednu probnu situaciju. Napi&scaron;i program koji će ispisati koliko je poena imala ekipa nakon odigrane situacije.</p>

### 입력

<p>U prvom je retku prirodan broj X (2 &le; X &le; 10), broj iz teksta zadatka.</p>

<p>U drugom je retku cijeli broj 0 ili 1. Nula &ndash; igrač je proma&scaron;io; jedan &ndash; igrač je pogodio &scaron;ut za X poena.</p>

<p>U trećem je retku cijeli broj 0 ili 1. Jedan &ndash; igrač je prilikom izvođenja &scaron;uta za X poena nepropisno zaustavljen; nula &ndash; igrač nije nepropisno zaustavljen.</p>

<p>Ovisno o vrijednostima u drugom i trećem retku slijedi nula, jedan ili X redaka nula ili jedinica. Jedinica označava da je igrač pogodio dodatno bacanje, a nula da igrač nije pogodio dodatno bacanje.</p>

### 출력

<p>U jedini redak ispi&scaron;i broj poena iz teksta zadatka.</p>

### 힌트

<p>Opis prvog probnog primjera: Igrač &scaron;utira za dva poena i pogađa. Sudac ekipi dodjeljuje dva poena. Igrač prilikom &scaron;uta nije nepropisno zaustavljen, sudac ne dodjeljuje dodatna bacanja.</p>

<p>Opis drugog probnog primjera: Igrač &scaron;utira za tri poena i pogađa. Sudac ekipi dodjeljuje tri poena. Igrač je prilikom &scaron;uta bio nepropisno zaustavljen. Sudac mu zbog toga dodjeljuje jedno dodatno bacanje koje on pogađa. Sudac ekipi dodjeljuje jo&scaron; jedan poen.</p>

<p>Opis trećeg probnog primjera: Igrač &scaron;utira za pet poena i proma&scaron;uje. Sudac ekipi ne dodjeljuje poene. Međutim, igrač je prilikom &scaron;uta nepropisno zaustavljen i sudac mu dodjeljuje pet dodatnih bacanja. Igrač pogađa prvo, treće i četvrto bacanje zbog čega sudac ekipi dodjeljuje tri poena.</p>