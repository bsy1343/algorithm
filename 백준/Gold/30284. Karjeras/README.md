# [Gold V] Karjeras - 30284

[문제 링크](https://www.acmicpc.net/problem/30284)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 26, 맞힌 사람: 23, 정답 비율: 92.000%

### 분류

누적 합, 차분 배열 트릭

### 문제 설명

<p>Sklype atrasta naudingųjų i&scaron;kasenų. Planuojama sklype sumontuoti naują automatinę kasimo sistemą, ją naudoti ir sklypą paversti naudingųjų i&scaron;kasenų karjeru.</p>

<p>&Scaron;i sistema gali vienu metu i&scaron;kasti viso karjero pločio duobę, kurios pradžia yra S<sub>i</sub>, pabaiga &ndash; E<sub>i</sub> metrų nuo karjero pradžios, o gylis &ndash; H<sub>i</sub> metrų.</p>

<p>Sklypą (karjerą) galima pavaizduoti kaip dvimatį brėžinį, kuris vaizduoja karjero auk&scaron;tį vir&scaron; jūros lygio i&scaron;ilgai karjero, tiek pradiniu momentu, tiek vėliau, pradėjus naudingųjų i&scaron;kasenų kasimą.</p>

<p>Automatinė kasimo sistema dirba vykdydama kasimo komandas. Kiekviena komanda sumažins karjero auk&scaron;tį H<sub>i</sub> metrų nurodytame intervale. 1 pav. parodyta, kaip keičiasi karjero auk&scaron;tis įvykdžius dvi komandas, kurių pirma kasa intervale [0; 2], antra &ndash; [1; 3], abi i&scaron;kasa 1 metro gylio duobes. Komandų i&scaron;kasami plotai atitinkamai pažymėti žaliai (atspausdintoje nespalvotoje sąlygoje &ndash; &scaron;viesiai pilkai) ir mėlynai (nespalvotoje sąlygoje &ndash; pilkai).</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/402ae5ca-4787-4152-9621-dc4105865a4f/-/preview/" style="width: 238px; height: 207px;" /></p>

<p style="text-align: center;">1 pav.</p>

<p>Karjero savininkas žino, kokias kasimo komandas duos &scaron;iai sistemai, bet prie&scaron; pradėdamas nori sužinoti, kaip atrodys karjeras įvykdžius visas komandas.</p>

<p>Suraskite karjero auk&scaron;tį įvykdžius visas kasimo komandas.</p>

### 입력

<p>Pirmoje eilutėje pateikiami du sveikieji skaičiai: karjero ilgis N ir komandų skaičius K.</p>

<p>Antroje eilutėje pateikiama N sveikųjų skaičių A<sub>i</sub> &ndash; pradinis karjero auk&scaron;tis vir&scaron; jūros lygio i metrų nuo karjero pradžios. Pirmoji reik&scaron;mė nurodo auk&scaron;tį 0 metrų nuo karjero pradžios.</p>

<p>Toliau pateikiama K eilučių, kuriose yra po tris sveikuosius skaičius: i-tosios kasimo komandos pradžia S<sub>i</sub>, pabaiga E<sub>i</sub> ir gylis H<sub>i</sub>.</p>

### 출력

<p>I&scaron;veskite N skaičių, kurių i-tasis nurodytų, koks būtų karjero auk&scaron;tis i metrų nuo karjero pradžios įvykdžius visas komandas.</p>

<p>Galutinis auk&scaron;tis gali būti neigiamas.</p>

### 제한

<ul>
	<li>0 &le; S<sub>i</sub> &le; E<sub>i</sub> &lt; N &le; 250 000</li>
	<li>1 &le; K &le; 250 000</li>
	<li>-1 000 &le; A<sub>i</sub>, H<sub>i</sub> &le; 1 000</li>
</ul>