# [Gold I] Margučiai - 30273

[문제 링크](https://www.acmicpc.net/problem/30273)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

자료 구조, 그리디 알고리즘, 분리 집합

### 문제 설명

<p>Velykų Zuikis turi M margučių, kuriuos jis nori įteikti N vaikų. Zuikio margučių visiems gali neužtekti, tačiau vaikai, gavę margutį, norės numarginti ir padovanoti po margutį kitiems vaikams &ndash; nesvarbu, ar margutį gavo nuo Zuikio, ar nuo kito vaiko. Dovanoti margutį vaikui galima tik jei jis dar neturi margučio. Zuikis žino, kam kiekvienas vaikas nori dovanoti margučius.</p>

<p>Panagrinėkime pavyzdį su penkiais vaikais. Paveikslėlyje rodyklės žymi, kam vaikai norėtų dovanoti margučius, patys gavę margutį:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/00e4490f-f24c-44e9-93e2-ade1f5cb8fb5/-/preview/" style="width: 204px; height: 116px;" /></p>

<p>Jeigu Zuikis padovanos margutį antrajam vaikui, &scaron;is vaikas numargins ir padovanos po margutį trečiajam ir pirmajam vaikui, o pirmasis &ndash; ketvirtajam vaikui. Ketvirtasis vaikas norėtų padovanoti margutį antrajam vaikui, bet nedovanos, kadangi &scaron;is margutį jau turi. Pastebėkime, kad nors Zuikis padovanojo tik vieną margutį, galiausiai margučius gavo net keturi vaikai.</p>

<p>Zuikis suprato, kad bendras margučius gausiančių vaikų skaičius priklauso nuo to, kuriems vaikams jis i&scaron;dalins savo margučius. Raskite, kiek daugiausiai vaikų gali gauti dovanas, jeigu Velykų Zuikis protingai i&scaron;dalins savo turimus margučius.</p>

### 입력

<p>Pirmojoje eilutėje bus pateiktas vaikų skaičius N ir Zuikio turimų margučių skaičius M.</p>

<p>Toliau bus pateikta N eilučių, apra&scaron;ančių, kam kiekvienas vaikas norėtų dovanoti margučius, pats gavęs margutį. Vaikai numeruojami nuo 1 iki N.</p>

<p>Eilutėje, atitinkančioje i-tąjį vaiką, bus įra&scaron;ytas sveikasis skaičius k, po kurio toje pačioje eilutėje bus įra&scaron;yta k sveikųjų skaičių &ndash; vaikų numerių, kuriems i-tasis vaikas, gavęs margutį, norės pats padovanoti po margutį.</p>

<p>Kiekvienam vaikui margutį dovanoti norės daugiausiai vienas vaikas. Taip pat, vaikas nenorės dovanoti margučio sau pačiam.</p>

### 출력

<p>Pirmojoje ir vienintelėje eilutėje i&scaron;veskite vieną sveikąjį skaičių &ndash; didžiausią vaikų skaičių, kurie gaus margučius.</p>

### 제한

<ul>
	<li>1 &le; N &le; 100 000</li>
	<li>1 &le; M &le; N</li>
</ul>