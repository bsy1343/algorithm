# [Silver I] Smiginis - 30283

[문제 링크](https://www.acmicpc.net/problem/30283)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 53, 정답: 11, 맞힌 사람: 11, 정답 비율: 22.000%

### 분류

누적 합

### 문제 설명

<p>Adomas vėl žaidžia smiginį. Ant sienos yra pakabintas kvadrato formos taikinys, kuris yra padalintas į 1 &times; 1 dydžio langelius. Kiekviename langelyje yra įra&scaron;ytas sveikasis skaičius ta&scaron;kų, kuriuos Adomas gautų pataikęs į tą langelį. Nepataikęs į taikinį, Adomas gautų 0 ta&scaron;kų. Kiekvienas langelis turi koordinates (X; Y ) &ndash; X yra langelio atstumas nuo kairiojo taikinio kra&scaron;to, Y &ndash; atstumas nuo vir&scaron;aus. Taikinio vir&scaron;utinis kairysis langelis yra (1; 1), apatinis de&scaron;inysis &ndash; (N; N).</p>

<p>Deja, Adomas nėra labai taiklus, todėl smigis gali pataikyti su vienoda tikimybe į bet kurį langelį, nutolusį nuo norimo langelio ne daugiau nei L langelių vertikaliai ir horizontaliai nuo nusitaikyto langelio. Tiksliau, jei Adomas taikosi į langelį (X; Y), jis gali pataikyti į bet kurį langelį (X&#39;; Y&#39;), jei |X &minus; X&#39;| &le; L ir |Y &minus; Y&#39;| &le; L. Jis nori sužinoti į kurį langelį reikia taikytis, kad vidutini&scaron;kai surinktų daugiausiai ta&scaron;kų.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/30283.%E2%80%85Smiginis/f5674d09.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/30283.%E2%80%85Smiginis/f5674d09.png" data-original-src="https://upload.acmicpc.net/a7a2a834-41e6-4fe7-98a4-1e2a2406d188/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 238px; height: 238px;" /></p>

<p style="text-align: center;">1 pav.</p>

<p>Jei Adomo taiklumas L = 1 ir jis turi 1 pavyzdyje pavaizduotą taikinį, Adomas turėtų taikytis į langelį (3; 2). Tokiu atveju, jis galės pataikyti į bet kurį langelį, kuris pavyzdyje pažymėtas žaliai, o vidutinis ta&scaron;kų skaičius, kurį surinks Adomas, bus 7/3.</p>

<p>Suraskite, į kurį langelį Adomui reikia taikytis, kad vidutini&scaron;kai surinktų daugiausiai ta&scaron;kų.</p>

### 입력

<p>Pirmoje eilutėje pateikiami du skaičiai: taikinio kra&scaron;tinės ilgis N ir didžiausias atstumas nuo norimo iki pataikyto langelio L. Toliau pateikiama N eilučių, kuriose yra po N sveikųjų skaičių T<sub>(X;Y)</sub> &ndash; tai langelyje (X; Y) įra&scaron;ytas ta&scaron;kų skaičius.</p>

### 출력

<p>I&scaron;veskite du sveikuosius skaičius X ir Y &ndash; langelio, į kurį Adomui reikia taikytis, koordinates.</p>

<p>Jei yra keli galimi atsakymai, i&scaron;veskite bet kurį.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1 000</li>
	<li>0 &le; L, T<sub>(X;Y)</sub> &le; 1 000</li>
</ul>