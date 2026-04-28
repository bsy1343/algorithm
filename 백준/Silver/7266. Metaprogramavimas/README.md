# [Silver I] Metaprogramavimas - 7266

[문제 링크](https://www.acmicpc.net/problem/7266)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 48, 정답: 9, 맞힌 사람: 9, 정답 비율: 19.565%

### 분류

많은 조건 분기, 구현, 수학

### 문제 설명

<p>Justas labai dažnai dalyvauja programavimo olimpiadose. Kadangi jis labai daug laiko praleidžia spręsdamas uždavinius, Justas užsimanė uždavinių sprendimą automatizuoti. Jis norėtų turėti programą, kuriai galėtų duoti uždavinio testus, ir ta programa jam surastų uždavinio sprendimą. Deja, Justas nežino, kaip tokią programą para&scaron;yti. Padėkite jam!</p>

<p>Justas jums duos sąra&scaron;ą testų, ir jūs turėsite surasti sprendimą, kuris teisingai i&scaron;spręstų visus tuos testus. Kiekvienas testas susideda i&scaron; dviejų skaičių &ndash; testo pradinio duomens ir testo rezultato. Visų testų pradiniai duomenys yra skirtingi.</p>

<p>Programavimo kalba, kuria Justas ra&scaron;o uždavinių sprendimus, yra labai paprasta. Programos turi vieną kintamąjį, kuriame laikomas bet kokio dydžio neneigiamas sveikasis skaičius. Programai pradedant darbą, į &scaron;į kintamąjį įra&scaron;omas testo pradinis duomuo. Pati programa susideda i&scaron; komandų sąra&scaron;o:</p>

<ul>
	<li>add n &ndash; prie kintamojo prideda n. 0 &le; n &lt; 10<sup>9</sup>.</li>
	<li>multiply n &ndash; kintamąjį padaugina i&scaron; n. 0 &le; n &lt; 10<sup>9</sup>.</li>
	<li>print &ndash; i&scaron;spausdina kintamojo reik&scaron;mę ir naujos eilutės simbolį.</li>
</ul>

<p>Pavyzdžiui, turime tokią programą:</p>

<pre>
add 5
multiply 8
print</pre>

<p>Jei pradinis duomuo būtų 1, &scaron;i programa i&scaron;spausdintų 48. Jei pradinis duomuo būtų 25, i&scaron;spausdintų 240.</p>

<p>Justas nenori, kad jo sprendimai vir&scaron;ytų laiko ribojimą, todėl jums reikia surasti mažiausiai komandų turinčią programą, kuri teisingai i&scaron;sprendžia visus Justo duotus testus.</p>

### 입력

<p>Pirmoje eilutėje yra skaičius N &ndash; uždaviniui skirtų testų skaičius. Kitose N eilučių yra po du skaičius a<sub>i</sub> ir b<sub>i</sub> &ndash; i-tojo testo pradinis duomuo ir reikiamas rezultatas. Visos ai reik&scaron;mės skirtingos.</p>

### 출력

<p>Pirmoje eilutėje i&scaron;veskite vieną skaičių K &ndash; trumpiausią tinkamą programą sudarančių komandų skaičių. Tolesnėse K eilučių i&scaron;spausdinkite programos komandas &ndash; po vieną komandą per eilutę. Jei yra kelios tokios programos, i&scaron;veskite bet kurią.</p>

<p>Jei programa, kuri galėtų i&scaron;spręsti visus testus, neegzistuoja, i&scaron;veskite -1.</p>

### 제한

<ul>
	<li>1 &le; N &le; 50</li>
	<li>0 &le; a<sub>i</sub>, b<sub>i</sub> &lt; 10<sup>9</sup></li>
</ul>