# [Gold III] Viršininkai - 7271

[문제 링크](https://www.acmicpc.net/problem/7271)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 22, 맞힌 사람: 12, 정답 비율: 85.714%

### 분류

자료 구조, 애드 혹, 트리, 분리 집합

### 문제 설명

<p>Bendrovėje &bdquo;Ūbr&ldquo; dirba N programuotojų. Jiems priskirti kodai &ndash; sveikieji skaičiai nuo 1 iki N. Visų darbuotojų kodai skirtingi.</p>

<p>Bendrovė vykdo M projektų. Už kiekvieną i&scaron; jų atsakingi du programuotojai ir tas, kurio kodas mažesnis, yra kito vir&scaron;ininkas. Žinoma, kad jokia darbuotojų pora nedirba prie daugiau nei vieno bendro projekto.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c1c710fd-3a8c-4887-a189-2aee0ed65371/-/preview/" style="width: 283px; height: 146px;" /></p>

<p>1 pav. &Scaron;iame pavyzdyje N = 6 ir yra vykdomi penki projektai. Antras, trečias ir &scaron;e&scaron;tas programuotojai turi po vieną vir&scaron;ininką, o ketvirtas programuotojas &ndash; du vir&scaron;ininkus.</p>

<p>&bdquo;Ūbr&ldquo; nustatė, kad programuotojai, turintys daugiau nei vieną vir&scaron;ininką, mažiau mėgaujasi darbu. Bendrovė nori persitvarkyti, kad kiekvienas darbuotojas turėtų daugiausia vieną vir&scaron;ininką. Ji tai padarys nutraukdama kai kuriuos senus ir pradėdama naujus projektus. Auk&scaron;čiau pateiktą pavyzdį būtų galima pertvarkyti panaikinus projektą 3-4 ir sukūrus naują projektą 3-5, tačiau tai &ndash; ne vienintelis būdas.</p>

<p>Raskite būdą &bdquo;Ūbr&ldquo; persitvarkyti taip, kad joks programuotojas neturėtų dviejų arba daugiau vir&scaron;ininkų. Taip pat, po pertvarkos &bdquo;Ūbr&ldquo; nori vykdyti kaip įmanoma daugiau projektų.</p>

<p>Jei yra daugiau nei vienas būdas tai padaryti, raskite tokį, kuris panaikintų kuo mažiau prie&scaron; pertvarką vykdytų projektų.</p>

<p>Jei vis dar yra keli galimi būdai, pateikite bet kurį i&scaron; jų.</p>

### 입력

<p>Pirmoje eilutėje pateikiami du skaičiai &ndash; programuotojų skaičius N ir prie&scaron; pertvarką vykdytų projektų skaičius M. Kitos M eilučių apra&scaron;o tuos projektus: kiekvienoje i&scaron; jų pateikiama po du skirtingus sveikuosius skaičius tarp 1 ir N, nurodančius, kurie du programuotojai yra atsakingi už atitinkamą projektą.</p>

### 출력

<p>Pirmoje eilutėje i&scaron;veskite tris skaičius K, P, S (privalo galioti K = M &minus; P + S):</p>

<ul>
	<li>K &ndash; skaičius projektų, kuriuos bendrovė vykdys po pertvarkos;</li>
	<li>P &ndash; skaičius projektų, kurie bus nutraukti;</li>
	<li>S &ndash; skaičius projektų, kurie bus pradėti.</li>
</ul>

<p>Tolesnėse P eilučių i&scaron;veskite po du skaičius, apibūdinančius projektus, kurie bus nutraukti.</p>

<p>Tolesnėse S eilučių i&scaron;veskite po du skaičius, apibūdinančius projektus, kurie bus pradėti.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1 000 000</li>
	<li>0 &le; M &le; 1 000 000</li>
</ul>