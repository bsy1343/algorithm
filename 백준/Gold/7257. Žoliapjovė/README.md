# [Gold V] Žoliapjovė - 7257

[문제 링크](https://www.acmicpc.net/problem/7257)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 17, 맞힌 사람: 15, 정답 비율: 46.875%

### 분류

정렬, 이분 탐색, 누적 합

### 문제 설명

<p>Prie Martyno sodybos yra pievelė. Į &scaron;ią pievelę galima žiūrėti kaip į N centimetrų tiesę, kurioje kas centimetrą i&scaron;dygęs a<sub>i</sub> (1 &le; i &le; N) centimetrų auk&scaron;čio žolės kuok&scaron;tas.</p>

<p>Iki &scaron;iol žolė nebuvo pjaunama ir dabar po &scaron;ią pievelę vargiai i&scaron;eina pasivaik&scaron;čioti, o ką jau kalbėti apie piknikus.</p>

<p>Martynas nusipirko žoliapjovę ir ketina per M dienų nupjauti didžiąją dalį žolės. Kiekviena diena j (1 &le; j &le; M) atrodo taip:</p>

<ul>
	<li>Ryte visi dar pilnai nenupjauti žolės kuok&scaron;tai (a<sub>i</sub> &ne; 0) paauga per 1cm.</li>
	<li>Dieną Martynas pasiima žoliapjovę ir b<sub>j</sub> kartų pjaudamas pervažiuoja pievelę. Kiekvieno pjovimo metu visi nenupjauti žolės kuok&scaron;tai nupjaunami (sumažėja auk&scaron;tis) po 1cm;</li>
	<li>Po to Martynas suskaičiuoja kiek centimetrų žolės dar liko nenupjauta.</li>
</ul>

<p>Pjauti žolę Martynui yra i&scaron;ties smagu, tačiau skaičiuoti kiek žolės liks nupjauti kitomis dienomis tampa vis sunkiau ir sunkiau. Todėl Martynas pra&scaron;ys jūsų apskaičiuoti &scaron;į skaičių M kartų.</p>

<p>Sakykime, pievelės ilgis yra 4cm (N = 4) ir joje auga tokio auk&scaron;čio žolės kuok&scaron;tai:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f70f0c5e-aea0-4eca-ac7f-f9204a9da797/-/preview/" style="width: 390px; height: 179px;" /></p>

<p>Martynas dirbs M = 2 dienas. Pirmąją dieną jis pievą pervažiuos su žoliapjove b<sub>1</sub> = 2 kartus, o antrąją dieną pervažiuos b<sub>2</sub> = 1 kartą.</p>

<p>Pirmosios dienos ryte pievelė paaugs per 1cm:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/58520ba5-93bf-4eee-ae40-9f7691888e97/-/preview/" style="width: 390px; height: 179px;" /></p>

<p>Dieną Martynas pjaudamas pervažiuoja pievelę pirmą kartą:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/d180cd86-a07c-45a7-aaaf-ec128b098787/-/preview/" style="width: 390px; height: 179px;" /></p>

<p>ir antrą kartą:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/78413a9a-3390-4898-b694-9a635860ac5f/-/preview/" style="width: 390px; height: 179px;" /></p>

<p>Vakare jam lieka nupjauti 0 + 1 + 0 + 2 = 3cm žolės.</p>

<p>Antros dienos rytą žolė vėl paauga (auk&scaron;čiai ties centimetru 1 ir 3 nesikeičia, nes juose neauga žolė):</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e176f9d3-5264-4b8c-b8c2-56b479bc3dc3/-/preview/" style="width: 390px; height: 179px;" /></p>

<p>Martynas pervažiuoja su žoliapjove vieną kartą:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c3177971-b17a-4acf-80da-ea1f8f24f704/-/preview/" style="width: 390px; height: 179px;" /></p>

<p>Po to dar liks nupjauti 0 + 1 + 0 + 2 = 3cm žolės.</p>

<p>Duota pradinė pievelės būsena ir M dienų žolės pjovimo planas. Suskaičiuokite, kiek liks nenupjautos žolės kiekvienos i&scaron; M dienų vakare.</p>

### 입력

<ul>
	<li>Pirmoje eilutėje pateiktas sveikasis skaičius N &ndash; pievelės ilgis.</li>
	<li>Antrojoje eilutėje pateikta N tarpu atskirtų skaičių a<sub>i</sub> (1 &le; i &le; N) &ndash; žolės kuok&scaron;tų auk&scaron;čiai.</li>
	<li>Trečiojoje eilutėje pateiktas sveikasis skaičius M, rodantis kelias dienas Martynas pjaus žolę.</li>
	<li>Ketvirtojoje eilutėje, pateikta M tarpu atskirtų skaičių b<sub>j</sub> (1 &le; j &le; M) &ndash; &scaron;ie skaičiai nurodo kiek kartų j-ąją dieną Martynas pjaus žolę.</li>
</ul>

### 출력

<p>I&scaron;veskite M eilučių. Eilutėje k (1 &le; k &le; M) turi būti pateiktas vienas sveikasis skaičius &ndash; bendras nenupjautos žolės auk&scaron;tis centimetrais k-tosios dienos pabaigoje.</p>

### 제한

<ul>
	<li>1 &le; N, M &le; 100 000</li>
	<li>1 &le; a<sub>i</sub> &le; 1 000 000 (1 &le; i &le; N)</li>
	<li>1 &le; b<sub>j</sub> &le; 1 000 000 (1 &le; j &le; M).</li>
</ul>

### 힌트

<p>Atkreipkite dėmesį, kad skaičiavimams gali prireikti 64 bitų sveikųjų skaičių tipo long long (C/C++).</p>